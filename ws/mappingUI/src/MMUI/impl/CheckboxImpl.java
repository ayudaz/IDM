/**
 */
package MMUI.impl;

import MMUI.CheckBox;
import MMUI.MMUIPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MMUI.impl.CheckBoxImpl#isChecked <em>Checked</em>}</li>
 *   <li>{@link MMUI.impl.CheckBoxImpl#getReponse <em>Reponse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckBoxImpl extends WidgetImpl implements CheckBox {
	/**
	 * The default value of the '{@link #isChecked() <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChecked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChecked() <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChecked()
	 * @generated
	 * @ordered
	 */
	protected boolean checked = CHECKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getReponse() <em>Reponse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReponse()
	 * @generated
	 * @ordered
	 */
	protected static final String REPONSE_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MMUIPackage.Literals.CHECK_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChecked() {
		return checked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecked(boolean newChecked) {
		boolean oldChecked = checked;
		checked = newChecked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MMUIPackage.CHECK_BOX__CHECKED, oldChecked, checked));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MMUIPackage.CHECK_BOX__REPONSE, oldReponse, reponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MMUIPackage.CHECK_BOX__CHECKED:
				return isChecked();
			case MMUIPackage.CHECK_BOX__REPONSE:
				return getReponse();
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
			case MMUIPackage.CHECK_BOX__CHECKED:
				setChecked((Boolean)newValue);
				return;
			case MMUIPackage.CHECK_BOX__REPONSE:
				setReponse((String)newValue);
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
			case MMUIPackage.CHECK_BOX__CHECKED:
				setChecked(CHECKED_EDEFAULT);
				return;
			case MMUIPackage.CHECK_BOX__REPONSE:
				setReponse(REPONSE_EDEFAULT);
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
			case MMUIPackage.CHECK_BOX__CHECKED:
				return checked != CHECKED_EDEFAULT;
			case MMUIPackage.CHECK_BOX__REPONSE:
				return REPONSE_EDEFAULT == null ? reponse != null : !REPONSE_EDEFAULT.equals(reponse);
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
		result.append(" (checked: ");
		result.append(checked);
		result.append(", reponse: ");
		result.append(reponse);
		result.append(')');
		return result.toString();
	}

} //CheckBoxImpl
