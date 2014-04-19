/**
 */
package co.edu.uniandes.fixml.simpleObject.impl;

import co.edu.uniandes.fixml.simpleObject.Attribute;
import co.edu.uniandes.fixml.simpleObject.Clazz;
import co.edu.uniandes.fixml.simpleObject.Instance;
import co.edu.uniandes.fixml.simpleObject.SimpleObjectPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clazz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.impl.ClazzImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.impl.ClazzImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.impl.ClazzImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.impl.ClazzImpl#getClazzes <em>Clazzes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClazzImpl extends MinimalEObjectImpl.Container implements Clazz {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> instances;

	/**
	 * The cached value of the '{@link #getClazzes() <em>Clazzes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazzes()
	 * @generated
	 * @ordered
	 */
	protected EList<Clazz> clazzes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClazzImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleObjectPackage.Literals.CLAZZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleObjectPackage.CLAZZ__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, SimpleObjectPackage.CLAZZ__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentWithInverseEList<Instance>(Instance.class, this, SimpleObjectPackage.CLAZZ__INSTANCES, SimpleObjectPackage.INSTANCE__CLAZZ);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clazz> getClazzes() {
		if (clazzes == null) {
			clazzes = new EObjectResolvingEList<Clazz>(Clazz.class, this, SimpleObjectPackage.CLAZZ__CLAZZES);
		}
		return clazzes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleObjectPackage.CLAZZ__INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleObjectPackage.CLAZZ__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case SimpleObjectPackage.CLAZZ__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleObjectPackage.CLAZZ__NAME:
				return getName();
			case SimpleObjectPackage.CLAZZ__ATTRIBUTES:
				return getAttributes();
			case SimpleObjectPackage.CLAZZ__INSTANCES:
				return getInstances();
			case SimpleObjectPackage.CLAZZ__CLAZZES:
				return getClazzes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimpleObjectPackage.CLAZZ__NAME:
				setName((String)newValue);
				return;
			case SimpleObjectPackage.CLAZZ__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case SimpleObjectPackage.CLAZZ__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends Instance>)newValue);
				return;
			case SimpleObjectPackage.CLAZZ__CLAZZES:
				getClazzes().clear();
				getClazzes().addAll((Collection<? extends Clazz>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimpleObjectPackage.CLAZZ__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimpleObjectPackage.CLAZZ__ATTRIBUTES:
				getAttributes().clear();
				return;
			case SimpleObjectPackage.CLAZZ__INSTANCES:
				getInstances().clear();
				return;
			case SimpleObjectPackage.CLAZZ__CLAZZES:
				getClazzes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimpleObjectPackage.CLAZZ__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimpleObjectPackage.CLAZZ__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case SimpleObjectPackage.CLAZZ__INSTANCES:
				return instances != null && !instances.isEmpty();
			case SimpleObjectPackage.CLAZZ__CLAZZES:
				return clazzes != null && !clazzes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClazzImpl
