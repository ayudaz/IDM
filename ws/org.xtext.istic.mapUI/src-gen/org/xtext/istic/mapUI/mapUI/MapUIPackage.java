/**
 */
package org.xtext.istic.mapUI.mapUI;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.istic.mapUI.mapUI.MapUIFactory
 * @model kind="package"
 * @generated
 */
public interface MapUIPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "mapUI";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.xtext.org/istic/mapUI/MapUI";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "mapUI";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  MapUIPackage eINSTANCE = org.xtext.istic.mapUI.mapUI.impl.MapUIPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.xtext.istic.mapUI.mapUI.impl.MapUIImpl <em>Map UI</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.istic.mapUI.mapUI.impl.MapUIImpl
	 * @see org.xtext.istic.mapUI.mapUI.impl.MapUIPackageImpl#getMapUI()
	 * @generated
	 */
  int MAP_UI = 0;

  /**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_UI__MAPPINGS = 0;

  /**
	 * The number of structural features of the '<em>Map UI</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_UI_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.xtext.istic.mapUI.mapUI.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.istic.mapUI.mapUI.impl.MappingImpl
	 * @see org.xtext.istic.mapUI.mapUI.impl.MapUIPackageImpl#getMapping()
	 * @generated
	 */
  int MAPPING = 1;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPPING__NAME = 0;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPPING__TYPE = 1;

  /**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPPING_FEATURE_COUNT = 2;


  /**
	 * Returns the meta object for class '{@link org.xtext.istic.mapUI.mapUI.MapUI <em>Map UI</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map UI</em>'.
	 * @see org.xtext.istic.mapUI.mapUI.MapUI
	 * @generated
	 */
  EClass getMapUI();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.istic.mapUI.mapUI.MapUI#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see org.xtext.istic.mapUI.mapUI.MapUI#getMappings()
	 * @see #getMapUI()
	 * @generated
	 */
  EReference getMapUI_Mappings();

  /**
	 * Returns the meta object for class '{@link org.xtext.istic.mapUI.mapUI.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see org.xtext.istic.mapUI.mapUI.Mapping
	 * @generated
	 */
  EClass getMapping();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.istic.mapUI.mapUI.Mapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.istic.mapUI.mapUI.Mapping#getName()
	 * @see #getMapping()
	 * @generated
	 */
  EAttribute getMapping_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.istic.mapUI.mapUI.Mapping#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.xtext.istic.mapUI.mapUI.Mapping#getType()
	 * @see #getMapping()
	 * @generated
	 */
  EAttribute getMapping_Type();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  MapUIFactory getMapUIFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.xtext.istic.mapUI.mapUI.impl.MapUIImpl <em>Map UI</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.istic.mapUI.mapUI.impl.MapUIImpl
		 * @see org.xtext.istic.mapUI.mapUI.impl.MapUIPackageImpl#getMapUI()
		 * @generated
		 */
    EClass MAP_UI = eINSTANCE.getMapUI();

    /**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MAP_UI__MAPPINGS = eINSTANCE.getMapUI_Mappings();

    /**
		 * The meta object literal for the '{@link org.xtext.istic.mapUI.mapUI.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.istic.mapUI.mapUI.impl.MappingImpl
		 * @see org.xtext.istic.mapUI.mapUI.impl.MapUIPackageImpl#getMapping()
		 * @generated
		 */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MAPPING__NAME = eINSTANCE.getMapping_Name();

    /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MAPPING__TYPE = eINSTANCE.getMapping_Type();

  }

} //MapUIPackage
