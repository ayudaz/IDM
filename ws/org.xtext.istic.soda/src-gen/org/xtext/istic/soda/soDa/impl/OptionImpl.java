/**
 */
package org.xtext.istic.soda.soDa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.istic.soda.soDa.Option;
import org.xtext.istic.soda.soDa.SoDaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.istic.soda.soDa.impl.OptionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.istic.soda.soDa.impl.OptionImpl#getReponse <em>Reponse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptionImpl extends MinimalEObjectImpl.Container implements Option
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

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
  protected OptionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SoDaPackage.Literals.OPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoDaPackage.OPTION__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReponse()
  {
    return reponse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReponse(String newReponse)
  {
    String oldReponse = reponse;
    reponse = newReponse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoDaPackage.OPTION__REPONSE, oldReponse, reponse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SoDaPackage.OPTION__ID:
        return getId();
      case SoDaPackage.OPTION__REPONSE:
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SoDaPackage.OPTION__ID:
        setId((String)newValue);
        return;
      case SoDaPackage.OPTION__REPONSE:
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SoDaPackage.OPTION__ID:
        setId(ID_EDEFAULT);
        return;
      case SoDaPackage.OPTION__REPONSE:
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SoDaPackage.OPTION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case SoDaPackage.OPTION__REPONSE:
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (id: ");
    result.append(id);
    result.append(", reponse: ");
    result.append(reponse);
    result.append(')');
    return result.toString();
  }

} //OptionImpl
