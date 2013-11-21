/**
 */
package org.xtext.istic.soda.soDa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.istic.soda.soDa.Poll;
import org.xtext.istic.soda.soDa.SoDaPackage;
import org.xtext.istic.soda.soDa.Soda;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Soda</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.istic.soda.soDa.impl.SodaImpl#getPolls <em>Polls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SodaImpl extends MinimalEObjectImpl.Container implements Soda
{
  /**
	 * The cached value of the '{@link #getPolls() <em>Polls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPolls()
	 * @generated
	 * @ordered
	 */
  protected EList<Poll> polls;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SodaImpl()
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
		return SoDaPackage.Literals.SODA;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Poll> getPolls()
  {
		if (polls == null) {
			polls = new EObjectContainmentEList<Poll>(Poll.class, this, SoDaPackage.SODA__POLLS);
		}
		return polls;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case SoDaPackage.SODA__POLLS:
				return ((InternalEList<?>)getPolls()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case SoDaPackage.SODA__POLLS:
				return getPolls();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case SoDaPackage.SODA__POLLS:
				getPolls().clear();
				getPolls().addAll((Collection<? extends Poll>)newValue);
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
		switch (featureID) {
			case SoDaPackage.SODA__POLLS:
				getPolls().clear();
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
		switch (featureID) {
			case SoDaPackage.SODA__POLLS:
				return polls != null && !polls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SodaImpl
