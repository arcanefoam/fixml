package co.edu.uniandes.fixml;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.standalone.EtlStanaloneEngine;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

import java.io.File;
import java.io.FileNotFoundException;




import java.net.URISyntaxException;
import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import co.edu.uniandes.fixml.parser.FixmlHandler;
import co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage;
import co.edu.uniandes.fixml.simplexml.SimplexmlPackage;


// TODO: Auto-generated Javadoc
/**
 * The Class FixmlToObjectOriented.
 */
public class FixmlToObjectOriented {
	
	private static String OBJECT_MODEL_NAME = "object";
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	static public void main(String[] args) throws Exception {
	    
		String filename = null; 	// args[0]
		String modelPath = null;	// args[1]
		String modelName = null;
		
		// TODO Test that the filename is a file and modelPath is a folder
		if (args.length > 1) {
			filename = args[0];
			modelPath = args[1];
		}
		
		ResourceSet rs = setupEmf();
	    
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
    	SAXParserFactory spf = SAXParserFactory.newInstance();
	    spf.setNamespaceAware(true);
	    SAXParser saxParser = spf.newSAXParser();
	    XMLReader xmlReader = saxParser.getXMLReader();
	    FixmlHandler handler = new FixmlHandler(modelName, modelPath, rs);
	    xmlReader.setContentHandler(handler);
	    xmlReader.setErrorHandler(new FixmlHandler.FixmlErrorHandler(System.err));
	    try {
	    	xmlReader.parse(convertToFileURL(filename));
	    } catch (FileNotFoundException ex) {
	    	// Missing DTDs
	    	System.err.println("The xml file references a missing DTD, " + ex.getMessage());
	    } catch (SAXException saxex) {
	    	System.err.println(saxex.getMessage() + " The respective classes where not created.");
	    } finally {
	    	Resource fixmlModel = handler.getResource();
	    	EmfModel emfFixmlModel = new EmfModel();
	    	StringProperties properties = new StringProperties();
		    properties.put(EmfModel.PROPERTY_NAME, "fixml");
		    properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
		            getResourceURI("/co/edu/uniandes/fixml/model/SimpleXML.ecore"));
		    properties.put(EmfModel.PROPERTY_MODEL_URI, 
		        getURI(modelPath + "/" + modelName + ".fixml"));
		    properties.put(EmfModel.PROPERTY_READONLOAD, Boolean.TRUE.toString());
		    properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, Boolean.FALSE.toString());
		    emfFixmlModel.load(properties, null);
	    	
	    	
	    	//emfFixmlModel.setResource(fixmlModel);
	    	//emfFixmlModel.setName("fixml");
	    	//emfFixmlModel.setMetamodelFile(getResourceURI("/co/edu/uniandes/fixml/model/SimpleXML.ecore"));


	    	//emfFixmlModel.getResourceSet() .getPackageRegistry().
	    	EmfModel emfObjectModel = createObjectModel(modelPath, modelName);
	    	EtlStanaloneEngine etlEngine = new EtlStanaloneEngine(getResourceURI("to/object/FixmlToObject.etl"));
	    	etlEngine.getModels().add(emfObjectModel);
	    	etlEngine.getModels().add(emfFixmlModel);
	    	etlEngine.execute();
	    }
	}
	
	private static ResourceSet setupEmf() {
		
		SimplexmlPackage.eINSTANCE.eClass();
		SimpleObjectPackage.eINSTANCE.eClass();
		
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("fixml", new XMIResourceFactoryImpl());
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		return rs;
	}
	
	private static EmfModel createObjectModel(String modelPath, String modelName) 
		          throws EolModelLoadingException, URISyntaxException {
		
		EmfModel emfModel = new EmfModel();
	    StringProperties properties = new StringProperties();
	    properties.put(EmfModel.PROPERTY_NAME, OBJECT_MODEL_NAME);
	    // Metamodel URI
	    properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
	            getResourceURI("/co/edu/uniandes/fixml/model/SimpleObject.ecore"));
	    properties.put(EmfModel.PROPERTY_MODEL_URI, 
	        getURI(modelPath + "/" + modelName + "Object.xmi"));
	    properties.put(EmfModel.PROPERTY_READONLOAD, Boolean.FALSE.toString());
	    properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, Boolean.TRUE.toString());
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
