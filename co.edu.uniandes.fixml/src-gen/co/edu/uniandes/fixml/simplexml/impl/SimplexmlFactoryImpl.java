/**
 */
package co.edu.uniandes.fixml.simplexml.impl;

import co.edu.uniandes.fixml.simplexml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplexmlFactoryImpl extends EFactoryImpl implements SimplexmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimplexmlFactory init() {
		try {
			SimplexmlFactory theSimplexmlFactory = (SimplexmlFactory)EPackage.Registry.INSTANCE.getEFactory(SimplexmlPackage.eNS_URI);
			if (theSimplexmlFactory != null) {
				return theSimplexmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimplexmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplexmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimplexmlPackage.XML_NODE: return createXMLNode();
			case SimplexmlPackage.XML_ATTRIBUTE: return createXMLAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLNode createXMLNode() {
		XMLNodeImpl xmlNode = new XMLNodeImpl();
		return xmlNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLAttribute createXMLAttribute() {
		XMLAttributeImpl xmlAttribute = new XMLAttributeImpl();
		return xmlAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplexmlPackage getSimplexmlPackage() {
		return (SimplexmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimplexmlPackage getPackage() {
		return SimplexmlPackage.eINSTANCE;
	}

} //SimplexmlFactoryImpl
