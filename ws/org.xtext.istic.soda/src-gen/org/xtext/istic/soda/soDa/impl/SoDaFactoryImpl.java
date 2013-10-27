/**
 */
package org.xtext.istic.soda.soDa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.istic.soda.soDa.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoDaFactoryImpl extends EFactoryImpl implements SoDaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SoDaFactory init()
  {
    try
    {
      SoDaFactory theSoDaFactory = (SoDaFactory)EPackage.Registry.INSTANCE.getEFactory(SoDaPackage.eNS_URI);
      if (theSoDaFactory != null)
      {
        return theSoDaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SoDaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoDaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SoDaPackage.SODA: return createSoda();
      case SoDaPackage.POLL: return createPoll();
      case SoDaPackage.QUESTION: return createQuestion();
      case SoDaPackage.OPTION: return createOption();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Soda createSoda()
  {
    SodaImpl soda = new SodaImpl();
    return soda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Poll createPoll()
  {
    PollImpl poll = new PollImpl();
    return poll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Question createQuestion()
  {
    QuestionImpl question = new QuestionImpl();
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Option createOption()
  {
    OptionImpl option = new OptionImpl();
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoDaPackage getSoDaPackage()
  {
    return (SoDaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SoDaPackage getPackage()
  {
    return SoDaPackage.eINSTANCE;
  }

} //SoDaFactoryImpl
