/**
 */
package MMUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MMUI.Ui#getContainers <em>Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see MMUI.MMUIPackage#getUi()
 * @model
 * @generated
 */
public interface Ui extends EObject {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' reference list.
	 * The list contents are of type {@link MMUI.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' reference list.
	 * @see MMUI.MMUIPackage#getUi_Containers()
	 * @model
	 * @generated
	 */
	EList<Container> getContainers();

} // Ui
