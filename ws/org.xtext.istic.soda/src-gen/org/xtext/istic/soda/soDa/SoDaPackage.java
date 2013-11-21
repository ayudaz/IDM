/**
 */
package org.xtext.istic.soda.soDa;

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
 * @see org.xtext.istic.soda.soDa.SoDaFactory
 * @model kind="package"
 * @generated
 */
public interface SoDaPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "soDa";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.xtext.org/istic/soda/SoDa";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "soDa";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  SoDaPackage eINSTANCE = org.xtext.istic.soda.soDa.impl.SoDaPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.xtext.istic.soda.soDa.impl.SodaImpl <em>Soda</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.istic.soda.soDa.impl.SodaImpl
	 * @see org.xtext.istic.soda.soDa.impl.SoDaPackageImpl#getSoda()
	 * @generated
	 */
  int SODA = 0;

  /**
	 * The feature id for the '<em><b>Polls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SODA__POLLS = 0;

  /**
	 * The number of structural features of the '<em>Soda</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SODA_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.xtext.istic.soda.soDa.impl.PollImpl <em>Poll</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.istic.soda.soDa.impl.PollImpl
	 * @see org.xtext.istic.soda.soDa.impl.SoDaPackageImpl#getPoll()
	 * @generated
	 */
  int POLL = 1;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POLL__NAME = 0;

  /**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POLL__QUESTIONS = 1;

  /**
	 * The number of structural features of the '<em>Poll</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POLL_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.xtext.istic.soda.soDa.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.istic.soda.soDa.impl.QuestionImpl
	 * @see org.xtext.istic.soda.soDa.impl.SoDaPackageImpl#getQuestion()
	 * @generated
	 */
  int QUESTION = 2;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int QUESTION__NAME = 0;

  /**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int QUESTION__QUERY = 1;

  /**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int QUESTION__OPTIONS = 2;

  /**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int QUESTION_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link org.xtext.istic.soda.soDa.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.istic.soda.soDa.impl.OptionImpl
	 * @see org.xtext.istic.soda.soDa.impl.SoDaPackageImpl#getOption()
	 * @generated
	 */
  int OPTION = 3;

  /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPTION__ID = 0;

  /**
	 * The feature id for the '<em><b>Reponse</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPTION__REPONSE = 1;

  /**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPTION_FEATURE_COUNT = 2;


  /**
	 * Returns the meta object for class '{@link org.xtext.istic.soda.soDa.Soda <em>Soda</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soda</em>'.
	 * @see org.xtext.istic.soda.soDa.Soda
	 * @generated
	 */
  EClass getSoda();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.istic.soda.soDa.Soda#getPolls <em>Polls</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polls</em>'.
	 * @see org.xtext.istic.soda.soDa.Soda#getPolls()
	 * @see #getSoda()
	 * @generated
	 */
  EReference getSoda_Polls();

  /**
	 * Returns the meta object for class '{@link org.xtext.istic.soda.soDa.Poll <em>Poll</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poll</em>'.
	 * @see org.xtext.istic.soda.soDa.Poll
	 * @generated
	 */
  EClass getPoll();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.istic.soda.soDa.Poll#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.istic.soda.soDa.Poll#getName()
	 * @see #getPoll()
	 * @generated
	 */
  EAttribute getPoll_Name();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.istic.soda.soDa.Poll#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see org.xtext.istic.soda.soDa.Poll#getQuestions()
	 * @see #getPoll()
	 * @generated
	 */
  EReference getPoll_Questions();

  /**
	 * Returns the meta object for class '{@link org.xtext.istic.soda.soDa.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see org.xtext.istic.soda.soDa.Question
	 * @generated
	 */
  EClass getQuestion();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.istic.soda.soDa.Question#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.istic.soda.soDa.Question#getName()
	 * @see #getQuestion()
	 * @generated
	 */
  EAttribute getQuestion_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.istic.soda.soDa.Question#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.xtext.istic.soda.soDa.Question#getQuery()
	 * @see #getQuestion()
	 * @generated
	 */
  EAttribute getQuestion_Query();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.istic.soda.soDa.Question#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org.xtext.istic.soda.soDa.Question#getOptions()
	 * @see #getQuestion()
	 * @generated
	 */
  EReference getQuestion_Options();

  /**
	 * Returns the meta object for class '{@link org.xtext.istic.soda.soDa.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see org.xtext.istic.soda.soDa.Option
	 * @generated
	 */
  EClass getOption();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.istic.soda.soDa.Option#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.xtext.istic.soda.soDa.Option#getId()
	 * @see #getOption()
	 * @generated
	 */
  EAttribute getOption_Id();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.istic.soda.soDa.Option#getReponse <em>Reponse</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reponse</em>'.
	 * @see org.xtext.istic.soda.soDa.Option#getReponse()
	 * @see #getOption()
	 * @generated
	 */
  EAttribute getOption_Reponse();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  SoDaFactory getSoDaFactory();

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
		 * The meta object literal for the '{@link org.xtext.istic.soda.soDa.impl.SodaImpl <em>Soda</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.istic.soda.soDa.impl.SodaImpl
		 * @see org.xtext.istic.soda.soDa.impl.SoDaPackageImpl#getSoda()
		 * @generated
		 */
    EClass SODA = eINSTANCE.getSoda();

    /**
		 * The meta object literal for the '<em><b>Polls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SODA__POLLS = eINSTANCE.getSoda_Polls();

    /**
		 * The meta object literal for the '{@link org.xtext.istic.soda.soDa.impl.PollImpl <em>Poll</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.istic.soda.soDa.impl.PollImpl
		 * @see org.xtext.istic.soda.soDa.impl.SoDaPackageImpl#getPoll()
		 * @generated
		 */
    EClass POLL = eINSTANCE.getPoll();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute POLL__NAME = eINSTANCE.getPoll_Name();

    /**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference POLL__QUESTIONS = eINSTANCE.getPoll_Questions();

    /**
		 * The meta object literal for the '{@link org.xtext.istic.soda.soDa.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.istic.soda.soDa.impl.QuestionImpl
		 * @see org.xtext.istic.soda.soDa.impl.SoDaPackageImpl#getQuestion()
		 * @generated
		 */
    EClass QUESTION = eINSTANCE.getQuestion();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

    /**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute QUESTION__QUERY = eINSTANCE.getQuestion_Query();

    /**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference QUESTION__OPTIONS = eINSTANCE.getQuestion_Options();

    /**
		 * The meta object literal for the '{@link org.xtext.istic.soda.soDa.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.istic.soda.soDa.impl.OptionImpl
		 * @see org.xtext.istic.soda.soDa.impl.SoDaPackageImpl#getOption()
		 * @generated
		 */
    EClass OPTION = eINSTANCE.getOption();

    /**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute OPTION__ID = eINSTANCE.getOption_Id();

    /**
		 * The meta object literal for the '<em><b>Reponse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute OPTION__REPONSE = eINSTANCE.getOption_Reponse();

  }

} //SoDaPackage
