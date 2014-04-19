/**
 */
package co.edu.uniandes.fixml.simpleObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.Attribute#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
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
	 * @see co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage#getAttribute_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.fixml.simpleObject.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link co.edu.uniandes.fixml.simpleObject.AttributeValue}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.fixml.simpleObject.AttributeValue#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage#getAttribute_Values()
	 * @see co.edu.uniandes.fixml.simpleObject.AttributeValue#getAttribute
	 * @model opposite="attribute" ordered="false"
	 * @generated
	 */
	EList<AttributeValue> getValues();

} // Attribute
