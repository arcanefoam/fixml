/**
 */
package co.edu.uniandes.fixml.simpleObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.Instance#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.Instance#getValues <em>Values</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.Instance#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends EObject {
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
	 * @see co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage#getInstance_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.fixml.simpleObject.Instance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.fixml.simpleObject.AttributeValue}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.fixml.simpleObject.AttributeValue#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage#getInstance_Values()
	 * @see co.edu.uniandes.fixml.simpleObject.AttributeValue#getInstance
	 * @model opposite="instance" containment="true" ordered="false"
	 * @generated
	 */
	EList<AttributeValue> getValues();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link co.edu.uniandes.fixml.simpleObject.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage#getInstance_Children()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Instance> getChildren();

} // Instance
