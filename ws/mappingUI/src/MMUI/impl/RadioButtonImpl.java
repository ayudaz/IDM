/**
 */
package MMUI.impl;

import MMUI.MMUIPackage;
import MMUI.RadioButton;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radio Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MMUI.impl.RadioButtonImpl#getReponse <em>Reponse</em>}</li>
 *   <li>{@link MMUI.impl.RadioButtonImpl#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadioButtonImpl extends WidgetImpl implements RadioButton {
	/**
	 * The default value of the '{@link #getReponse() <em>Reponse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReponse()
	 * @generated
	 * @ordered
	 */
	protected static final String REPONSE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getReponse() <em>Reponse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReponse()
	 * @generated
	 * @ordered
	 */
	protected String reponse = REPONSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadioButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MMUIPackage.Literals.RADIO_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReponse() {
		return reponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReponse(String newReponse) {
		String oldReponse = reponse;
		reponse = newReponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MMUIPackage.RADIO_BUTTON__REPONSE, oldReponse, reponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MMUIPackage.RADIO_BUTTON__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MMUIPackage.RADIO_BUTTON__REPONSE:
				return getReponse();
			case MMUIPackage.RADIO_BUTTON__GROUP:
				return getGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MMUIPackage.RADIO_BUTTON__REPONSE:
				setReponse((String)newValue);
				return;
			case MMUIPackage.RADIO_BUTTON__GROUP:
				setGroup((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MMUIPackage.RADIO_BUTTON__REPONSE:
				setReponse(REPONSE_EDEFAULT);
				return;
			case MMUIPackage.RADIO_BUTTON__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MMUIPackage.RADIO_BUTTON__REPONSE:
				return REPONSE_EDEFAULT == null ? reponse != null : !REPONSE_EDEFAULT.equals(reponse);
			case MMUIPackage.RADIO_BUTTON__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (reponse: ");
		result.append(reponse);
		result.append(", group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //RadioButtonImpl
