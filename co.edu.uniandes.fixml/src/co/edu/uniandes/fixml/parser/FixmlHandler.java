package co.edu.uniandes.fixml.parser;

import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.xml.sax.Attributes;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import co.edu.uniandes.fixml.simplexml.XMLAttribute;
import co.edu.uniandes.fixml.simplexml.XMLNode;
import co.edu.uniandes.fixml.simplexml.impl.SimplexmlFactoryImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class FixmlHandler.
 */
public class FixmlHandler extends DefaultHandler {
	
	/** The model path. */
	private String modelPath = null;
	
	/** The model name. */
	private String modelName = null;
	
	/** The fixml tag. */
	private static String FIXML_TAG = "FIXML";
	
	/** The resource. */
	private Resource resource;
	
	/** The simplexml factory. */
	private SimplexmlFactoryImpl simplexmlFactory;
	
	/** The parent node. */
	private XMLNode parentNode;
	
	
    /** The success. */
    private boolean success;
		
	/**
	 * The Class FixmlErrorHandler.
	 */
	public static class FixmlErrorHandler implements ErrorHandler {
	    
    	/** The out. */
    	private PrintStream out;

	    /**
    	 * Instantiates a new fixml error handler.
    	 *
    	 * @param out the out
    	 */
    	public FixmlErrorHandler(PrintStream out) {
	        this.out = out;
	    }
    	
		/**
    	 * Gets the parses the exception info.
    	 *
    	 * @param spe the spe
    	 * @return the parses the exception info
    	 */
    	private String getParseExceptionInfo(SAXParseException spe) {
	        String systemId = spe.getSystemId();

	        if (systemId == null) {
	            systemId = "null";
	        }

	        String info = "URI=" + systemId + " Line=" 
	            + spe.getLineNumber() + ": " + spe.getMessage();
	        return info;
	    }

	    /* (non-Javadoc)
    	 * @see org.xml.sax.ErrorHandler#warning(org.xml.sax.SAXParseException)
    	 */
    	public void warning(SAXParseException spe) throws SAXException {
	        out.println("Warning: " + getParseExceptionInfo(spe));
	    }
	        
	    /* (non-Javadoc)
    	 * @see org.xml.sax.ErrorHandler#error(org.xml.sax.SAXParseException)
    	 */
    	public void error(SAXParseException spe) throws SAXException {
	        String message = "Error: " + getParseExceptionInfo(spe);
	        out.println(message);
	        
	    }

	    /* (non-Javadoc)
    	 * @see org.xml.sax.ErrorHandler#fatalError(org.xml.sax.SAXParseException)
    	 */
    	public void fatalError(SAXParseException spe) throws SAXException {
	        String message = "Fatal Error: " + getParseExceptionInfo(spe);
	        throw new SAXException(message);
	    }
	}
	
	/**
	 * Instantiates a new fixml handler.
	 *
	 * @param modelName the model name
	 * @param modelPath the model path
	 */
	public FixmlHandler(String modelName, String modelPath) {
		super();
		this.modelName = modelName;
		this.modelPath = modelPath;
		this.simplexmlFactory = new SimplexmlFactoryImpl();
		this.success = false;
	}
	
	/**
	 * Checks if is error.
	 *
	 * @return true, if is error
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Gets the resource.
	 *
	 * @return the resource
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * Sets the resource.
	 *
	 * @param resource the new resource
	 */
	public void setResource(Resource resource) {
		this.resource = resource;
	}


	/* (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#startDocument()
	 */
	@Override
	public void startDocument () throws SAXException {
		System.out.println("Parsing " + modelName);
		ResourceSet rs = new ResourceSetImpl();
		URI uri = URI.createFileURI(modelPath + "\\" + modelName + "Data.fixml"); 
		resource = rs.createResource(uri);
		
	}
	
	XMLNode currentNode;
	
	/* (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	@Override
	public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
		
		if (!localName.equals(FIXML_TAG)) {
			currentNode = simplexmlFactory.createXMLNode();
			currentNode.setTag(localName);
			for (int i=0; i < atts.getLength(); i++) {
				XMLAttribute sa = simplexmlFactory.createXMLAttribute();
				sa.setName(atts.getLocalName(i));
				sa.setValue(atts.getValue(i));
				sa.setXmlNode(currentNode);
			}
			if (parentNode == null) {
				resource.getContents().add(currentNode);
				currentNode.setParent(null);
			} else {
				currentNode.setParent(parentNode);
			}
			parentNode = currentNode;
		}
	}
	
	/* (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#endElement(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void endElement (String namespaceURI, String name, String qName) throws SAXException {
		
		if ( currentNode != null ) {
			currentNode = currentNode.getParent();
		}
		parentNode = currentNode;
		
	}

	/* (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#endDocument()
	 */
	public void endDocument () {

		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.success = true;
		System.out.println("End document");
	}

}
