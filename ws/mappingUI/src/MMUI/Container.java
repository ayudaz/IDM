/**
 */
package MMUI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MMUI.Container#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @see MMUI.MMUIPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends AbstractContainer {
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

} // Container
