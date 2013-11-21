/**
 */
package MMUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MMUI.Container#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link MMUI.Container#getId <em>Id</em>}</li>
 *   <li>{@link MMUI.Container#getNomQuestion <em>Nom Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see MMUI.MMUIPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' reference list.
	 * The list contents are of type {@link MMUI.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' reference list.
	 * @see MMUI.MMUIPackage#getContainer_Widgets()
	 * @model
	 * @generated
	 */
	EList<Widget> getWidgets();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see MMUI.MMUIPackage#getContainer_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MMUI.Container#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Nom Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Question</em>' attribute.
	 * @see #setNomQuestion(String)
	 * @see MMUI.MMUIPackage#getContainer_NomQuestion()
	 * @model required="true"
	 * @generated
	 */
	String getNomQuestion();

	/**
	 * Sets the value of the '{@link MMUI.Container#getNomQuestion <em>Nom Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Question</em>' attribute.
	 * @see #getNomQuestion()
	 * @generated
	 */
	void setNomQuestion(String value);

} // Container
