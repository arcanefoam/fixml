package co.edu.uniandes.fixml;

import org.eclipse.emf.ecore.resource.Resource;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import co.edu.uniandes.fixml.parser.FixmlHandler;


// TODO: Auto-generated Javadoc
/**
 * The Class FixmlToObjectOriented.
 */
public class FixmlToObjectOriented {
	
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
	    FixmlHandler handler = new FixmlHandler(modelName, modelPath);
	    xmlReader.setContentHandler(handler);
	    xmlReader.setErrorHandler(new FixmlHandler.FixmlErrorHandler(System.err));
	    try {
	    	xmlReader.parse(convertToFileURL(filename));
	    } catch (FileNotFoundException ex) {
	    	// Missing DTDs
	    	System.err.println("The xml file references a missing DTD, " + ex.getMessage());
	    } catch (SAXException saxex) {
	    	System.err.println(saxex.getMessage() + " The respective classes where not created.");
	    }
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
