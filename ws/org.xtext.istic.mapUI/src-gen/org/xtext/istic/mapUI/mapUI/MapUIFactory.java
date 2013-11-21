/**
 */
package org.xtext.istic.mapUI.mapUI;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.istic.mapUI.mapUI.MapUIPackage
 * @generated
 */
public interface MapUIFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MapUIFactory eINSTANCE = org.xtext.istic.mapUI.mapUI.impl.MapUIFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Map UI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map UI</em>'.
   * @generated
   */
  MapUI createMapUI();

  /**
   * Returns a new object of class '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping</em>'.
   * @generated
   */
  Mapping createMapping();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MapUIPackage getMapUIPackage();

} //MapUIFactory
