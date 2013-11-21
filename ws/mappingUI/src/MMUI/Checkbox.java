/**
 */
package MMUI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checkbox</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MMUI.Checkbox#isChecked <em>Checked</em>}</li>
 *   <li>{@link MMUI.Checkbox#getReponse <em>Reponse</em>}</li>
 * </ul>
 * </p>
 *
 * @see MMUI.MMUIPackage#getCheckbox()
 * @model
 * @generated
 */
public interface Checkbox extends Widget {
	/**
	 * Returns the value of the '<em><b>Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked</em>' attribute.
	 * @see #setChecked(boolean)
	 * @see MMUI.MMUIPackage#getCheckbox_Checked()
	 * @model required="true"
	 * @generated
	 */
	boolean isChecked();

	/**
	 * Sets the value of the '{@link MMUI.Checkbox#isChecked <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked</em>' attribute.
	 * @see #isChecked()
	 * @generated
	 */
	void setChecked(boolean value);

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
	 * @see MMUI.MMUIPackage#getCheckbox_Reponse()
	 * @model required="true"
	 * @generated
	 */
	String getReponse();

	/**
	 * Sets the value of the '{@link MMUI.Checkbox#getReponse <em>Reponse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reponse</em>' attribute.
	 * @see #getReponse()
	 * @generated
	 */
	void setReponse(String value);

} // Checkbox