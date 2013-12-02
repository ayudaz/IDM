/**
 */
package MMUI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MMUI.RadioGroup#getRadioButtons <em>Radio Buttons</em>}</li>
 * </ul>
 * </p>
 *
 * @see MMUI.MMUIPackage#getRadioGroup()
 * @model
 * @generated
 */
public interface RadioGroup extends Widget {
	/**
	 * Returns the value of the '<em><b>Radio Buttons</b></em>' reference list.
	 * The list contents are of type {@link MMUI.RadioButton}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radio Buttons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radio Buttons</em>' reference list.
	 * @see MMUI.MMUIPackage#getRadioGroup_RadioButtons()
	 * @model required="true"
	 * @generated
	 */
	EList<RadioButton> getRadioButtons();

} // RadioGroup
