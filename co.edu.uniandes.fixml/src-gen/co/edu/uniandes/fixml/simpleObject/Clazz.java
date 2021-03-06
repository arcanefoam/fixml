/**
 */
package co.edu.uniandes.fixml.simpleObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clazz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.Clazz#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.Clazz#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.Clazz#getInstances <em>Instances</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.Clazz#getClazzes <em>Clazzes</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage#getClazz()
 * @model
 * @generated
 */
public interface Clazz extends EObject {
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
	 * @see co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage#getClazz_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.fixml.simpleObject.Clazz#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.fixml.simpleObject.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage#getClazz_Attributes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.fixml.simpleObject.Instance}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.fixml.simpleObject.Instance#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage#getClazz_Instances()
	 * @see co.edu.uniandes.fixml.simpleObject.Instance#getClazz
	 * @model opposite="clazz" containment="true" ordered="false"
	 * @generated
	 */
	EList<Instance> getInstances();

	/**
	 * Returns the value of the '<em><b>Clazzes</b></em>' reference list.
	 * The list contents are of type {@link co.edu.uniandes.fixml.simpleObject.Clazz}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clazzes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazzes</em>' reference list.
	 * @see co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage#getClazz_Clazzes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Clazz> getClazzes();

} // Clazz
