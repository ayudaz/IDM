/**
 */
package MMUI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MMUI.SuperContainer#getContainers <em>Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see MMUI.MMUIPackage#getSuperContainer()
 * @model
 * @generated
 */
public interface SuperContainer extends AbstractContainer {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' reference list.
	 * The list contents are of type {@link MMUI.AbstractContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' reference list.
	 * @see MMUI.MMUIPackage#getSuperContainer_Containers()
	 * @model
	 * @generated
	 */
	EList<AbstractContainer> getContainers();

} // SuperContainer
