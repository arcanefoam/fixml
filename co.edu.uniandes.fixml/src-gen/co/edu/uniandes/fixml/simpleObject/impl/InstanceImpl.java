/**
 */
package co.edu.uniandes.fixml.simpleObject.impl;

import co.edu.uniandes.fixml.simpleObject.AttributeValue;
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.impl.InstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.impl.InstanceImpl#getValues <em>Values</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.impl.InstanceImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simpleObject.impl.InstanceImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceImpl extends MinimalEObjectImpl.Container implements Instance {
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
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeValue> values;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleObjectPackage.Literals.INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleObjectPackage.INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentWithInverseEList<AttributeValue>(AttributeValue.class, this, SimpleObjectPackage.INSTANCE__VALUES, SimpleObjectPackage.ATTRIBUTE_VALUE__INSTANCE);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clazz getClazz() {
		if (eContainerFeatureID() != SimpleObjectPackage.INSTANCE__CLAZZ) return null;
		return (Clazz)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClazz(Clazz newClazz, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClazz, SimpleObjectPackage.INSTANCE__CLAZZ, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClazz(Clazz newClazz) {
		if (newClazz != eInternalContainer() || (eContainerFeatureID() != SimpleObjectPackage.INSTANCE__CLAZZ && newClazz != null)) {
			if (EcoreUtil.isAncestor(this, newClazz))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClazz != null)
				msgs = ((InternalEObject)newClazz).eInverseAdd(this, SimpleObjectPackage.CLAZZ__INSTANCES, Clazz.class, msgs);
			msgs = basicSetClazz(newClazz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleObjectPackage.INSTANCE__CLAZZ, newClazz, newClazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instance> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList<Instance>(Instance.class, this, SimpleObjectPackage.INSTANCE__CHILDREN);
		}
		return children;
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
			case SimpleObjectPackage.INSTANCE__VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValues()).basicAdd(otherEnd, msgs);
			case SimpleObjectPackage.INSTANCE__CLAZZ:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClazz((Clazz)otherEnd, msgs);
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
			case SimpleObjectPackage.INSTANCE__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
			case SimpleObjectPackage.INSTANCE__CLAZZ:
				return basicSetClazz(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SimpleObjectPackage.INSTANCE__CLAZZ:
				return eInternalContainer().eInverseRemove(this, SimpleObjectPackage.CLAZZ__INSTANCES, Clazz.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleObjectPackage.INSTANCE__NAME:
				return getName();
			case SimpleObjectPackage.INSTANCE__VALUES:
				return getValues();
			case SimpleObjectPackage.INSTANCE__CLAZZ:
				return getClazz();
			case SimpleObjectPackage.INSTANCE__CHILDREN:
				return getChildren();
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
			case SimpleObjectPackage.INSTANCE__NAME:
				setName((String)newValue);
				return;
			case SimpleObjectPackage.INSTANCE__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends AttributeValue>)newValue);
				return;
			case SimpleObjectPackage.INSTANCE__CLAZZ:
				setClazz((Clazz)newValue);
				return;
			case SimpleObjectPackage.INSTANCE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Instance>)newValue);
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
			case SimpleObjectPackage.INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimpleObjectPackage.INSTANCE__VALUES:
				getValues().clear();
				return;
			case SimpleObjectPackage.INSTANCE__CLAZZ:
				setClazz((Clazz)null);
				return;
			case SimpleObjectPackage.INSTANCE__CHILDREN:
				getChildren().clear();
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
			case SimpleObjectPackage.INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimpleObjectPackage.INSTANCE__VALUES:
				return values != null && !values.isEmpty();
			case SimpleObjectPackage.INSTANCE__CLAZZ:
				return getClazz() != null;
			case SimpleObjectPackage.INSTANCE__CHILDREN:
				return children != null && !children.isEmpty();
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

} //InstanceImpl
