/**
 */
package org.xtext.istic.soda.soDa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poll</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.istic.soda.soDa.Poll#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.istic.soda.soDa.Poll#getQuestions <em>Questions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.istic.soda.soDa.SoDaPackage#getPoll()
 * @model
 * @generated
 */
public interface Poll extends EObject
{
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
   * @see org.xtext.istic.soda.soDa.SoDaPackage#getPoll_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.istic.soda.soDa.Poll#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.istic.soda.soDa.Question}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Questions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Questions</em>' containment reference list.
   * @see org.xtext.istic.soda.soDa.SoDaPackage#getPoll_Questions()
   * @model containment="true"
   * @generated
   */
  EList<Question> getQuestions();

} // Poll
