package co.edu.uniandes.fixml;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.standalone.EglStandaloneEngine;
import org.eclipse.epsilon.standalone.EtlStanaloneEngine;
import org.eclipse.epsilon.standalone.util.ExecutionException;
import org.eclipse.epsilon.standalone.util.ParseException;
import org.eclipse.epsilon.standalone.util.SourceLoadException;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import co.edu.uniandes.fixml.parser.FixmlHandler;
import co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage;
import co.edu.uniandes.fixml.simplexml.SimplexmlPackage;


// TODO: Auto-generated Javadoc
/**
 * The Class FixmlToObjectOriented.
 */
public class FixmlToObjectOriented {
	
	private static String OBJECT_MODEL_NAME = "objectModel";
	
	private static String filename = null; 	// args[0]
	private static String modelPath = null;	// args[1]
	private static String modelName = null;
	private static String errorMessage = "";
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	static public void main(String[] args) throws Exception {
	    
		// TODO Test that the filename is a file and modelPath is a folder
		if (args.length > 1) {
			filename = args[0];
			modelPath = args[1];
		}
		
		setupEmf();
	    
	    if (filename == null) {
	        usage();
	    } else {
	    	File file = new File(filename);
	    	if (file.isDirectory()) {
	    		System.out.println("The provided <file.xml> is not a file.");
	    		usage();
	    	}
	    	if (file.exists()) {
	    		modelName = file.getName();
	    		if (modelName.indexOf(".") > 0) {
	    			modelName = modelName.substring(0, modelName.lastIndexOf("."));
	    		}
	    		if (modelPath == null) {
	    			modelPath = file.getParentFile().getAbsolutePath();
	    	    }
	    	} else {
	    		System.err.println("The FIXML (<file.xml>) must exist.");
	    		usage();
	    	}
	    }
	    boolean result = parseFixml();
	    if (result) {
	    	EmfModel emfFixmlModel = null;
			try {
				emfFixmlModel = createFixMLModel();
			} catch (URISyntaxException uex) {
				System.err.println("Error creating the FIXML model URI. " + uex.getMessage());
				System.exit(1);
			} catch (EolModelLoadingException ex) {
				System.err.println("Error loading the FIXML model. " + ex.getMessage());
				System.exit(1);
			}
			EmfModel emfObjectModel = null;
			try {
				emfObjectModel = createObjectModel(false, true);
			} catch (URISyntaxException uex) {
				System.err.println("Error creating the Object model URI. " + uex.getMessage());
				System.exit(1);
			} catch (EolModelLoadingException eex) {
				System.err.println("Error loading the Object model. " + eex.getMessage());
				System.exit(1);
			}
			EtlStanaloneEngine etlEngine = new EtlStanaloneEngine(getResourceURI("to/object/FixmlToObject.etl"));
	    	etlEngine.getModels().add(emfObjectModel);
	    	etlEngine.getModels().add(emfFixmlModel);
			try {
				etlEngine.execute();
			} catch (ParseException pex) {
				errorMessage = "Error parsing the Fixml to Object transformation. " + pex.getMessage();
			} catch (SourceLoadException sex) {
				errorMessage = "Error loading the Source. " + sex.getMessage();
			} catch (ExecutionException eex) {
				errorMessage = "Error executing the Fixml to Object tranformation. " + eex.getMessage();
			}
			emfObjectModel.dispose();
			emfObjectModel = createObjectModel(true, false);
			EglStandaloneEngine egxEngine = new EglStandaloneEngine(getResourceURI("to/cplus/toC++.egx"));
			egxEngine.getModels().add(emfObjectModel);
			egxEngine.execute();
	    } else {
	    	System.err.println(errorMessage);
	    }
    	
	}
	
	private static void setupEmf() {
		
		SimplexmlPackage.eINSTANCE.eClass();
		SimpleObjectPackage.eINSTANCE.eClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("fixml", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	}
	
	private static boolean parseFixml() throws ParserConfigurationException, SAXException {

		boolean success = false;
    	SAXParserFactory spf = SAXParserFactory.newInstance();
	    spf.setNamespaceAware(true);
	    SAXParser saxParser = spf.newSAXParser();
	    XMLReader xmlReader = saxParser.getXMLReader();
	    FixmlHandler handler = new FixmlHandler(modelName, modelPath);
	    xmlReader.setContentHandler(handler);
	    xmlReader.setErrorHandler(new FixmlHandler.FixmlErrorHandler(System.err));
	    try {
	    	xmlReader.parse(convertToFileURL(filename));
	    } catch (FileNotFoundException ex) {
	    	// Missing DTDs
	    	errorMessage = "The xml file references a missing DTD, " + ex.getMessage();
	    } catch (SAXException saxex) {
	    	errorMessage = saxex.getMessage() + " The respective classes where not created.";
	    } catch (IOException e) {
			errorMessage  = e.getMessage();
		} finally {
			success = handler.isSuccess();
	    }
	    return success;
	}
	
	private static EmfModel createFixMLModel() throws URISyntaxException, EolModelLoadingException {
		EmfModel emfModel = new EmfModel();
    	StringProperties properties = new StringProperties();
	    properties.put(EmfModel.PROPERTY_NAME, "fixml");
	    properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
	            getResourceURI("/co/edu/uniandes/fixml/model/SimpleXML.ecore"));
	    properties.put(EmfModel.PROPERTY_MODEL_URI, 
	        getURI(modelPath + "/" + modelName + "Data.fixml"));
	    properties.put(EmfModel.PROPERTY_READONLOAD, Boolean.TRUE.toString());
	    properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, Boolean.FALSE.toString());
	    emfModel.load(properties, null);
	    return emfModel;
    	
	}
	
	private static EmfModel createObjectModel(boolean readOnLoad, boolean storeOnDispoal) 
		          throws EolModelLoadingException, URISyntaxException {
		
		EmfModel emfModel = new EmfModel();
	    StringProperties properties = new StringProperties();
	    properties.put(EmfModel.PROPERTY_NAME, OBJECT_MODEL_NAME);
	    // Metamodel URI
	    properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
	            getResourceURI("/co/edu/uniandes/fixml/model/SimpleObject.ecore"));
	    properties.put(EmfModel.PROPERTY_MODEL_URI, 
	    		getURI(modelPath + "/" + modelName + "Object.xmi"));
	    properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad);
	    properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDispoal);
	    emfModel.load(properties, null);
	    return emfModel;
	}

	private static String getResourceURI(String resource) throws URISyntaxException {
		String uri = FixmlToObjectOriented.class.getResource(resource).toURI().toString();
	    if (uri.toString().indexOf("bin") > -1) {
	      uri = uri.toString().replaceAll("bin", "src");
	    }
	    return uri;
	}
	
	protected static java.net.URI getURI(String fileName)  {
	    return java.net.URI.create(URI.createFileURI(fileName).toString());
	}
		  

	/**
	 * Convert to file url.
	 *
	 * @param filename the filename
	 * @return the string
	 */
	private static String convertToFileURL(String filename) {
        String path = new File(filename).getAbsolutePath();
        if (File.separatorChar != '/') {
            path = path.replace(File.separatorChar, '/');
        }

        if (!path.startsWith("/")) {
            path = "/" + path;
        }
        return "file:" + path;
    }

	/**
	 * Usage.
	 */
	private static void usage() {
		System.err.println("Usage: FixmlToObjectOriented <file.xml>");
	    System.err.println("       -usage or -help = this message");
	    System.exit(1);
	}

}
