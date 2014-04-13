/**
 */
package co.edu.uniandes.fixml.simplexml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.fixml.simplexml.SimplexmlPackage
 * @generated
 */
public interface SimplexmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplexmlFactory eINSTANCE = co.edu.uniandes.fixml.simplexml.impl.SimplexmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>XML Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Node</em>'.
	 * @generated
	 */
	XMLNode createXMLNode();

	/**
	 * Returns a new object of class '<em>XML Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Attribute</em>'.
	 * @generated
	 */
	XMLAttribute createXMLAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimplexmlPackage getSimplexmlPackage();

} //SimplexmlFactory
