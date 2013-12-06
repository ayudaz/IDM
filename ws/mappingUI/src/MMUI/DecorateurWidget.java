/**
 */
package MMUI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decorateur Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MMUI.DecorateurWidget#getWidget <em>Widget</em>}</li>
 * </ul>
 * </p>
 *
 * @see MMUI.MMUIPackage#getDecorateurWidget()
 * @model abstract="true"
 * @generated
 */
public interface DecorateurWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Widget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widget</em>' reference.
	 * @see #setWidget(Widget)
	 * @see MMUI.MMUIPackage#getDecorateurWidget_Widget()
	 * @model required="true"
	 * @generated
	 */
	Widget getWidget();

	/**
	 * Sets the value of the '{@link MMUI.DecorateurWidget#getWidget <em>Widget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widget</em>' reference.
	 * @see #getWidget()
	 * @generated
	 */
	void setWidget(Widget value);

} // DecorateurWidget
