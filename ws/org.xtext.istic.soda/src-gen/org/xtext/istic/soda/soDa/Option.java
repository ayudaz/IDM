/**
 */
package org.xtext.istic.soda.soDa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.istic.soda.soDa.Option#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.istic.soda.soDa.Option#getReponse <em>Reponse</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.istic.soda.soDa.SoDaPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.xtext.istic.soda.soDa.SoDaPackage#getOption_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.istic.soda.soDa.Option#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Reponse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reponse</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reponse</em>' attribute.
   * @see #setReponse(String)
   * @see org.xtext.istic.soda.soDa.SoDaPackage#getOption_Reponse()
   * @model
   * @generated
   */
  String getReponse();

  /**
   * Sets the value of the '{@link org.xtext.istic.soda.soDa.Option#getReponse <em>Reponse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reponse</em>' attribute.
   * @see #getReponse()
   * @generated
   */
  void setReponse(String value);

} // Option
