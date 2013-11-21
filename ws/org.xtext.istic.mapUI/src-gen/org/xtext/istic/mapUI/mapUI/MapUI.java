/**
 */
package org.xtext.istic.mapUI.mapUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.istic.mapUI.mapUI.MapUI#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.istic.mapUI.mapUI.MapUIPackage#getMapUI()
 * @model
 * @generated
 */
public interface MapUI extends EObject
{
  /**
   * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.istic.mapUI.mapUI.Mapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappings</em>' containment reference list.
   * @see org.xtext.istic.mapUI.mapUI.MapUIPackage#getMapUI_Mappings()
   * @model containment="true"
   * @generated
   */
  EList<Mapping> getMappings();

} // MapUI
