package co.edu.uniandes.fixml;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.epsilon.egl.EglTemplate;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.exceptions.EglRuntimeException;
import org.eclipse.epsilon.egl.util.FileUtil;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;

// TODO: Auto-generated Javadoc
/**
 * The Class TemplateRunnable.
 */
public class TemplateRunnable extends Thread {

	/** The Constant LOOP_CLASS. */
	private static final String LOOP_CLASS = "Clazz";
	
	/** The Constant TEMPLATE_VAR. */
	private static final String TEMPLATE_VAR = "clazz";
	
	/** The output dir. */
	private String 	outputDir;
	
	/** The source model. */
	private EmfModel sourceModel;
	
	/** The template. */
	private String template;
	
	/** The extension. */
	private String extension;
	
	
	/**
	 * Instantiates a new template runnable.
	 *
	 * @param outputDir the output dir
	 * @param sourceModel the source model
	 * @param template the template
	 * @param extension the extension
	 */
	public TemplateRunnable(String outputDir, EmfModel sourceModel,
			String template, String extension) {
		super();
		this.outputDir = outputDir;
		this.sourceModel = sourceModel;
		this.template = template;
		this.extension = extension;
	}



	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		EglTemplateFactory eglTF = new EglTemplateFactory();
		//eglTF.setRoot(getURI(modelPath + "/cSharp/"));
		eglTF.getContext().getModelRepository().addModel(sourceModel);
		EglTemplate temp = null;
		try {
			temp = eglTF.load(template);
		} catch (EglRuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			for (EObject c : sourceModel.getAllOfType(LOOP_CLASS)) {
				temp.populate(TEMPLATE_VAR, c);
				EStructuralFeature name = c.eClass().getEStructuralFeature("name");
				StringBuffer sb = new  StringBuffer(temp.process());
				FileUtil.write(outputDir + c.eGet(name) + extension, sb.toString());						
			}
		} catch (EolModelElementTypeNotFoundException | EglRuntimeException
				| IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}
