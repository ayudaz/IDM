/**
 */
package MMUI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MMUI.RadioButton#getReponse <em>Reponse</em>}</li>
 *   <li>{@link MMUI.RadioButton#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see MMUI.MMUIPackage#getRadioButton()
 * @model
 * @generated
 */
public interface RadioButton extends Widget {
	/**
	 * Returns the value of the '<em><b>Reponse</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reponse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reponse</em>' attribute.
	 * @see #setReponse(String)
	 * @see MMUI.MMUIPackage#getRadioButton_Reponse()
	 * @model default="" required="true"
	 * @generated
	 */
	String getReponse();

	/**
	 * Sets the value of the '{@link MMUI.RadioButton#getReponse <em>Reponse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reponse</em>' attribute.
	 * @see #getReponse()
	 * @generated
	 */
	void setReponse(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see MMUI.MMUIPackage#getRadioButton_Group()
	 * @model required="true"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link MMUI.RadioButton#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

} // RadioButton
