/**
 */
package org.xtext.istic.soda.soDa;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.istic.soda.soDa.SoDaPackage
 * @generated
 */
public interface SoDaFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  SoDaFactory eINSTANCE = org.xtext.istic.soda.soDa.impl.SoDaFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Soda</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Soda</em>'.
	 * @generated
	 */
  Soda createSoda();

  /**
	 * Returns a new object of class '<em>Poll</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poll</em>'.
	 * @generated
	 */
  Poll createPoll();

  /**
	 * Returns a new object of class '<em>Question</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question</em>'.
	 * @generated
	 */
  Question createQuestion();

  /**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
  Option createOption();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  SoDaPackage getSoDaPackage();

} //SoDaFactory
