/**
 */
package MMUI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MMUI.CheckBox#isChecked <em>Checked</em>}</li>
 * </ul>
 * </p>
 *
 * @see MMUI.MMUIPackage#getCheckBox()
 * @model
 * @generated
 */
public interface CheckBox extends Widget {
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
	 * @see MMUI.MMUIPackage#getCheckBox_Checked()
	 * @model required="true"
	 * @generated
	 */
	boolean isChecked();

	/**
	 * Sets the value of the '{@link MMUI.CheckBox#isChecked <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked</em>' attribute.
	 * @see #isChecked()
	 * @generated
	 */
	void setChecked(boolean value);

} // CheckBox
