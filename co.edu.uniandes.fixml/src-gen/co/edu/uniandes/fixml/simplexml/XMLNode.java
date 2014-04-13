/**
 */
package co.edu.uniandes.fixml.simplexml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.fixml.simplexml.XMLNode#getTag <em>Tag</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simplexml.XMLNode#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simplexml.XMLNode#getSubnodes <em>Subnodes</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simplexml.XMLNode#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.fixml.simplexml.SimplexmlPackage#getXMLNode()
 * @model
 * @generated
 */
public interface XMLNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see co.edu.uniandes.fixml.simplexml.SimplexmlPackage#getXMLNode_Tag()
	 * @model
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.fixml.simplexml.XMLNode#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.fixml.simplexml.XMLAttribute}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.fixml.simplexml.XMLAttribute#getXmlNode <em>Xml Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see co.edu.uniandes.fixml.simplexml.SimplexmlPackage#getXMLNode_Attributes()
	 * @see co.edu.uniandes.fixml.simplexml.XMLAttribute#getXmlNode
	 * @model opposite="xmlNode" containment="true"
	 * @generated
	 */
	EList<XMLAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Subnodes</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.fixml.simplexml.XMLNode}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.fixml.simplexml.XMLNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnodes</em>' containment reference list.
	 * @see co.edu.uniandes.fixml.simplexml.SimplexmlPackage#getXMLNode_Subnodes()
	 * @see co.edu.uniandes.fixml.simplexml.XMLNode#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<XMLNode> getSubnodes();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.fixml.simplexml.XMLNode#getSubnodes <em>Subnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(XMLNode)
	 * @see co.edu.uniandes.fixml.simplexml.SimplexmlPackage#getXMLNode_Parent()
	 * @see co.edu.uniandes.fixml.simplexml.XMLNode#getSubnodes
	 * @model opposite="subnodes" transient="false"
	 * @generated
	 */
	XMLNode getParent();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.fixml.simplexml.XMLNode#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(XMLNode value);

} // XMLNode
