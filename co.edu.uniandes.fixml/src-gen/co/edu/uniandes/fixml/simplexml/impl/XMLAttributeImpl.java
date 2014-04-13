/**
 */
package co.edu.uniandes.fixml.simplexml.impl;

import co.edu.uniandes.fixml.simplexml.SimplexmlPackage;
import co.edu.uniandes.fixml.simplexml.XMLAttribute;
import co.edu.uniandes.fixml.simplexml.XMLNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.fixml.simplexml.impl.XMLAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simplexml.impl.XMLAttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simplexml.impl.XMLAttributeImpl#getXmlNode <em>Xml Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMLAttributeImpl extends MinimalEObjectImpl.Container implements XMLAttribute {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplexmlPackage.Literals.XML_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimplexmlPackage.XML_ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplexmlPackage.XML_ATTRIBUTE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLNode getXmlNode() {
		if (eContainerFeatureID() != SimplexmlPackage.XML_ATTRIBUTE__XML_NODE) return null;
		return (XMLNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlNode(XMLNode newXmlNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newXmlNode, SimplexmlPackage.XML_ATTRIBUTE__XML_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlNode(XMLNode newXmlNode) {
		if (newXmlNode != eInternalContainer() || (eContainerFeatureID() != SimplexmlPackage.XML_ATTRIBUTE__XML_NODE && newXmlNode != null)) {
			if (EcoreUtil.isAncestor(this, newXmlNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newXmlNode != null)
				msgs = ((InternalEObject)newXmlNode).eInverseAdd(this, SimplexmlPackage.XML_NODE__ATTRIBUTES, XMLNode.class, msgs);
			msgs = basicSetXmlNode(newXmlNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplexmlPackage.XML_ATTRIBUTE__XML_NODE, newXmlNode, newXmlNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplexmlPackage.XML_ATTRIBUTE__XML_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetXmlNode((XMLNode)otherEnd, msgs);
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
			case SimplexmlPackage.XML_ATTRIBUTE__XML_NODE:
				return basicSetXmlNode(null, msgs);
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
			case SimplexmlPackage.XML_ATTRIBUTE__XML_NODE:
				return eInternalContainer().eInverseRemove(this, SimplexmlPackage.XML_NODE__ATTRIBUTES, XMLNode.class, msgs);
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
			case SimplexmlPackage.XML_ATTRIBUTE__NAME:
				return getName();
			case SimplexmlPackage.XML_ATTRIBUTE__VALUE:
				return getValue();
			case SimplexmlPackage.XML_ATTRIBUTE__XML_NODE:
				return getXmlNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplexmlPackage.XML_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case SimplexmlPackage.XML_ATTRIBUTE__VALUE:
				setValue((String)newValue);
				return;
			case SimplexmlPackage.XML_ATTRIBUTE__XML_NODE:
				setXmlNode((XMLNode)newValue);
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
			case SimplexmlPackage.XML_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimplexmlPackage.XML_ATTRIBUTE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SimplexmlPackage.XML_ATTRIBUTE__XML_NODE:
				setXmlNode((XMLNode)null);
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
			case SimplexmlPackage.XML_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimplexmlPackage.XML_ATTRIBUTE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SimplexmlPackage.XML_ATTRIBUTE__XML_NODE:
				return getXmlNode() != null;
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
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //XMLAttributeImpl
