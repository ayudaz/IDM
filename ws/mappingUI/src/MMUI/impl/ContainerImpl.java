/**
 */
package MMUI.impl;

import MMUI.MMUIPackage;
import MMUI.Widget;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MMUI.impl.ContainerImpl#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link MMUI.impl.ContainerImpl#getId <em>Id</em>}</li>
 *   <li>{@link MMUI.impl.ContainerImpl#getNomQuestion <em>Nom Question</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements MMUI.Container {
	/**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<Widget> widgets;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomQuestion() <em>Nom Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomQuestion()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_QUESTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomQuestion() <em>Nom Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomQuestion()
	 * @generated
	 * @ordered
	 */
	protected String nomQuestion = NOM_QUESTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MMUIPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Widget> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectResolvingEList<Widget>(Widget.class, this, MMUIPackage.CONTAINER__WIDGETS);
		}
		return widgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MMUIPackage.CONTAINER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomQuestion() {
		return nomQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomQuestion(String newNomQuestion) {
		String oldNomQuestion = nomQuestion;
		nomQuestion = newNomQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MMUIPackage.CONTAINER__NOM_QUESTION, oldNomQuestion, nomQuestion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MMUIPackage.CONTAINER__WIDGETS:
				return getWidgets();
			case MMUIPackage.CONTAINER__ID:
				return getId();
			case MMUIPackage.CONTAINER__NOM_QUESTION:
				return getNomQuestion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MMUIPackage.CONTAINER__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection<? extends Widget>)newValue);
				return;
			case MMUIPackage.CONTAINER__ID:
				setId((Integer)newValue);
				return;
			case MMUIPackage.CONTAINER__NOM_QUESTION:
				setNomQuestion((String)newValue);
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
			case MMUIPackage.CONTAINER__WIDGETS:
				getWidgets().clear();
				return;
			case MMUIPackage.CONTAINER__ID:
				setId(ID_EDEFAULT);
				return;
			case MMUIPackage.CONTAINER__NOM_QUESTION:
				setNomQuestion(NOM_QUESTION_EDEFAULT);
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
			case MMUIPackage.CONTAINER__WIDGETS:
				return widgets != null && !widgets.isEmpty();
			case MMUIPackage.CONTAINER__ID:
				return id != ID_EDEFAULT;
			case MMUIPackage.CONTAINER__NOM_QUESTION:
				return NOM_QUESTION_EDEFAULT == null ? nomQuestion != null : !NOM_QUESTION_EDEFAULT.equals(nomQuestion);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", nomQuestion: ");
		result.append(nomQuestion);
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
