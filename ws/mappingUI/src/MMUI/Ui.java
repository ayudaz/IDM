/**
 */
package MMUI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MMUI.Ui#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see MMUI.MMUIPackage#getUi()
 * @model
 * @generated
 */
public interface Ui extends EObject {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(AbstractContainer)
	 * @see MMUI.MMUIPackage#getUi_Body()
	 * @model required="true"
	 * @generated
	 */
	AbstractContainer getBody();

	/**
	 * Sets the value of the '{@link MMUI.Ui#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(AbstractContainer value);

} // Ui
