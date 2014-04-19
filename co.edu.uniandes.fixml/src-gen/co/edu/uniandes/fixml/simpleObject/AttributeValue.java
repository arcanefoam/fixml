/**
 */
package co.edu.uniandes.fixml.simpleObject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.AttributeValue#getText <em>Text</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.AttributeValue#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.AttributeValue#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage#getAttributeValue()
 * @model
 * @generated
 */
public interface AttributeValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage#getAttributeValue_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.fixml.simpleObject.AttributeValue#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.fixml.simpleObject.Attribute#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage#getAttributeValue_Attribute()
	 * @see co.edu.uniandes.fixml.simpleObject.Attribute#getValues
	 * @model opposite="values" required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.fixml.simpleObject.AttributeValue#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.fixml.simpleObject.Instance#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' container reference.
	 * @see #setInstance(Instance)
	 * @see co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage#getAttributeValue_Instance()
	 * @see co.edu.uniandes.fixml.simpleObject.Instance#getValues
	 * @model opposite="values" required="true" transient="false"
	 * @generated
	 */
	Instance getInstance();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.fixml.simpleObject.AttributeValue#getInstance <em>Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' container reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(Instance value);

} // AttributeValue
