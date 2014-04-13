/**
 */
package co.edu.uniandes.fixml.simplexml.impl;

import co.edu.uniandes.fixml.simplexml.SimplexmlPackage;
import co.edu.uniandes.fixml.simplexml.XMLAttribute;
import co.edu.uniandes.fixml.simplexml.XMLNode;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.fixml.simplexml.impl.XMLNodeImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simplexml.impl.XMLNodeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simplexml.impl.XMLNodeImpl#getSubnodes <em>Subnodes</em>}</li>
 *   <li>{@link co.edu.uniandes.fixml.simplexml.impl.XMLNodeImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMLNodeImpl extends MinimalEObjectImpl.Container implements XMLNode {
	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<XMLAttribute> attributes;

	/**
	 * The cached value of the '{@link #getSubnodes() <em>Subnodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnodes()
	 * @generated
	 * @ordered
	 */
	protected EList<XMLNode> subnodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplexmlPackage.Literals.XML_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplexmlPackage.XML_NODE__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XMLAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentWithInverseEList<XMLAttribute>(XMLAttribute.class, this, SimplexmlPackage.XML_NODE__ATTRIBUTES, SimplexmlPackage.XML_ATTRIBUTE__XML_NODE);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XMLNode> getSubnodes() {
		if (subnodes == null) {
			subnodes = new EObjectContainmentWithInverseEList<XMLNode>(XMLNode.class, this, SimplexmlPackage.XML_NODE__SUBNODES, SimplexmlPackage.XML_NODE__PARENT);
		}
		return subnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLNode getParent() {
		if (eContainerFeatureID() != SimplexmlPackage.XML_NODE__PARENT) return null;
		return (XMLNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(XMLNode newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, SimplexmlPackage.XML_NODE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(XMLNode newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != SimplexmlPackage.XML_NODE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, SimplexmlPackage.XML_NODE__SUBNODES, XMLNode.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplexmlPackage.XML_NODE__PARENT, newParent, newParent));
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
			case SimplexmlPackage.XML_NODE__ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
			case SimplexmlPackage.XML_NODE__SUBNODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubnodes()).basicAdd(otherEnd, msgs);
			case SimplexmlPackage.XML_NODE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((XMLNode)otherEnd, msgs);
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
			case SimplexmlPackage.XML_NODE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case SimplexmlPackage.XML_NODE__SUBNODES:
				return ((InternalEList<?>)getSubnodes()).basicRemove(otherEnd, msgs);
			case SimplexmlPackage.XML_NODE__PARENT:
				return basicSetParent(null, msgs);
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
			case SimplexmlPackage.XML_NODE__PARENT:
				return eInternalContainer().eInverseRemove(this, SimplexmlPackage.XML_NODE__SUBNODES, XMLNode.class, msgs);
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
			case SimplexmlPackage.XML_NODE__TAG:
				return getTag();
			case SimplexmlPackage.XML_NODE__ATTRIBUTES:
				return getAttributes();
			case SimplexmlPackage.XML_NODE__SUBNODES:
				return getSubnodes();
			case SimplexmlPackage.XML_NODE__PARENT:
				return getParent();
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
			case SimplexmlPackage.XML_NODE__TAG:
				setTag((String)newValue);
				return;
			case SimplexmlPackage.XML_NODE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends XMLAttribute>)newValue);
				return;
			case SimplexmlPackage.XML_NODE__SUBNODES:
				getSubnodes().clear();
				getSubnodes().addAll((Collection<? extends XMLNode>)newValue);
				return;
			case SimplexmlPackage.XML_NODE__PARENT:
				setParent((XMLNode)newValue);
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
			case SimplexmlPackage.XML_NODE__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case SimplexmlPackage.XML_NODE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case SimplexmlPackage.XML_NODE__SUBNODES:
				getSubnodes().clear();
				return;
			case SimplexmlPackage.XML_NODE__PARENT:
				setParent((XMLNode)null);
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
			case SimplexmlPackage.XML_NODE__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case SimplexmlPackage.XML_NODE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case SimplexmlPackage.XML_NODE__SUBNODES:
				return subnodes != null && !subnodes.isEmpty();
			case SimplexmlPackage.XML_NODE__PARENT:
				return getParent() != null;
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
		result.append(" (tag: ");
		result.append(tag);
		result.append(')');
		return result.toString();
	}

} //XMLNodeImpl
