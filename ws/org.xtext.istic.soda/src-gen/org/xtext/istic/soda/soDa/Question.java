/**
 */
package org.xtext.istic.soda.soDa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.istic.soda.soDa.Question#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.istic.soda.soDa.Question#getQuery <em>Query</em>}</li>
 *   <li>{@link org.xtext.istic.soda.soDa.Question#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.istic.soda.soDa.SoDaPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject
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
	 * @see org.xtext.istic.soda.soDa.SoDaPackage#getQuestion_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.istic.soda.soDa.Question#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see org.xtext.istic.soda.soDa.SoDaPackage#getQuestion_Query()
	 * @model
	 * @generated
	 */
  String getQuery();

  /**
	 * Sets the value of the '{@link org.xtext.istic.soda.soDa.Question#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
  void setQuery(String value);

  /**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.istic.soda.soDa.Option}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see org.xtext.istic.soda.soDa.SoDaPackage#getQuestion_Options()
	 * @model containment="true"
	 * @generated
	 */
  EList<Option> getOptions();

} // Question
