/**
 */
package co.edu.uniandes.fixml.simplexml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.fixml.simplexml.SimplexmlFactory
 * @model kind="package"
 * @generated
 */
public interface SimplexmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simplexml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uniandes.edu.co/0.1/SimpleXML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simplexml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplexmlPackage eINSTANCE = co.edu.uniandes.fixml.simplexml.impl.SimplexmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link co.edu.uniandes.fixml.simplexml.impl.XMLNodeImpl <em>XML Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.fixml.simplexml.impl.XMLNodeImpl
	 * @see co.edu.uniandes.fixml.simplexml.impl.SimplexmlPackageImpl#getXMLNode()
	 * @generated
	 */
	int XML_NODE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NODE__TAG = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NODE__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Subnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NODE__SUBNODES = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NODE__PARENT = 3;

	/**
	 * The number of structural features of the '<em>XML Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>XML Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.fixml.simplexml.impl.XMLAttributeImpl <em>XML Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.fixml.simplexml.impl.XMLAttributeImpl
	 * @see co.edu.uniandes.fixml.simplexml.impl.SimplexmlPackageImpl#getXMLAttribute()
	 * @generated
	 */
	int XML_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Xml Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE__XML_NODE = 2;

	/**
	 * The number of structural features of the '<em>XML Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>XML Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.fixml.simplexml.XMLNode <em>XML Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Node</em>'.
	 * @see co.edu.uniandes.fixml.simplexml.XMLNode
	 * @generated
	 */
	EClass getXMLNode();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.fixml.simplexml.XMLNode#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see co.edu.uniandes.fixml.simplexml.XMLNode#getTag()
	 * @see #getXMLNode()
	 * @generated
	 */
	EAttribute getXMLNode_Tag();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.fixml.simplexml.XMLNode#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see co.edu.uniandes.fixml.simplexml.XMLNode#getAttributes()
	 * @see #getXMLNode()
	 * @generated
	 */
	EReference getXMLNode_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.fixml.simplexml.XMLNode#getSubnodes <em>Subnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subnodes</em>'.
	 * @see co.edu.uniandes.fixml.simplexml.XMLNode#getSubnodes()
	 * @see #getXMLNode()
	 * @generated
	 */
	EReference getXMLNode_Subnodes();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.fixml.simplexml.XMLNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see co.edu.uniandes.fixml.simplexml.XMLNode#getParent()
	 * @see #getXMLNode()
	 * @generated
	 */
	EReference getXMLNode_Parent();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.fixml.simplexml.XMLAttribute <em>XML Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Attribute</em>'.
	 * @see co.edu.uniandes.fixml.simplexml.XMLAttribute
	 * @generated
	 */
	EClass getXMLAttribute();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.fixml.simplexml.XMLAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.fixml.simplexml.XMLAttribute#getName()
	 * @see #getXMLAttribute()
	 * @generated
	 */
	EAttribute getXMLAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.fixml.simplexml.XMLAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see co.edu.uniandes.fixml.simplexml.XMLAttribute#getValue()
	 * @see #getXMLAttribute()
	 * @generated
	 */
	EAttribute getXMLAttribute_Value();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.fixml.simplexml.XMLAttribute#getXmlNode <em>Xml Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Xml Node</em>'.
	 * @see co.edu.uniandes.fixml.simplexml.XMLAttribute#getXmlNode()
	 * @see #getXMLAttribute()
	 * @generated
	 */
	EReference getXMLAttribute_XmlNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimplexmlFactory getSimplexmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link co.edu.uniandes.fixml.simplexml.impl.XMLNodeImpl <em>XML Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.fixml.simplexml.impl.XMLNodeImpl
		 * @see co.edu.uniandes.fixml.simplexml.impl.SimplexmlPackageImpl#getXMLNode()
		 * @generated
		 */
		EClass XML_NODE = eINSTANCE.getXMLNode();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_NODE__TAG = eINSTANCE.getXMLNode_Tag();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_NODE__ATTRIBUTES = eINSTANCE.getXMLNode_Attributes();

		/**
		 * The meta object literal for the '<em><b>Subnodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_NODE__SUBNODES = eINSTANCE.getXMLNode_Subnodes();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_NODE__PARENT = eINSTANCE.getXMLNode_Parent();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.fixml.simplexml.impl.XMLAttributeImpl <em>XML Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.fixml.simplexml.impl.XMLAttributeImpl
		 * @see co.edu.uniandes.fixml.simplexml.impl.SimplexmlPackageImpl#getXMLAttribute()
		 * @generated
		 */
		EClass XML_ATTRIBUTE = eINSTANCE.getXMLAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ATTRIBUTE__NAME = eINSTANCE.getXMLAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ATTRIBUTE__VALUE = eINSTANCE.getXMLAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Xml Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_ATTRIBUTE__XML_NODE = eINSTANCE.getXMLAttribute_XmlNode();

	}

} //SimplexmlPackage
