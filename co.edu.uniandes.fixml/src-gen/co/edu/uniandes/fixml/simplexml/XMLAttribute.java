/**
 */
package co.edu.uniandes.fixml.simplexml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.fixml.simplexml.XMLAttribute#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simplexml.XMLAttribute#getValue <em>Value</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simplexml.XMLAttribute#getXmlNode <em>Xml Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.fixml.simplexml.SimplexmlPackage#getXMLAttribute()
 * @model
 * @generated
 */
public interface XMLAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see co.edu.uniandes.fixml.simplexml.SimplexmlPackage#getXMLAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.fixml.simplexml.XMLAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see co.edu.uniandes.fixml.simplexml.SimplexmlPackage#getXMLAttribute_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.fixml.simplexml.XMLAttribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Xml Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.fixml.simplexml.XMLNode#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Node</em>' container reference.
	 * @see #setXmlNode(XMLNode)
	 * @see co.edu.uniandes.fixml.simplexml.SimplexmlPackage#getXMLAttribute_XmlNode()
	 * @see co.edu.uniandes.fixml.simplexml.XMLNode#getAttributes
	 * @model opposite="attributes" transient="false"
	 * @generated
	 */
	XMLNode getXmlNode();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.fixml.simplexml.XMLAttribute#getXmlNode <em>Xml Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Node</em>' container reference.
	 * @see #getXmlNode()
	 * @generated
	 */
	void setXmlNode(XMLNode value);

} // XMLAttribute
