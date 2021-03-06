/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.GoPackage;
import com.ufcg.compiladores.go.InterfaceTypeName;
import com.ufcg.compiladores.go.MethodName;
import com.ufcg.compiladores.go.MethodSpec;
import com.ufcg.compiladores.go.Signature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.MethodSpecImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.MethodSpecImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.MethodSpecImpl#getInterfaceTypeName <em>Interface Type Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodSpecImpl extends MinimalEObjectImpl.Container implements MethodSpec
{
  /**
   * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodName()
   * @generated
   * @ordered
   */
  protected MethodName methodName;

  /**
   * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignature()
   * @generated
   * @ordered
   */
  protected Signature signature;

  /**
   * The cached value of the '{@link #getInterfaceTypeName() <em>Interface Type Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceTypeName()
   * @generated
   * @ordered
   */
  protected InterfaceTypeName interfaceTypeName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodSpecImpl()
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
    return GoPackage.Literals.METHOD_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodName getMethodName()
  {
    return methodName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodName(MethodName newMethodName, NotificationChain msgs)
  {
    MethodName oldMethodName = methodName;
    methodName = newMethodName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.METHOD_SPEC__METHOD_NAME, oldMethodName, newMethodName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodName(MethodName newMethodName)
  {
    if (newMethodName != methodName)
    {
      NotificationChain msgs = null;
      if (methodName != null)
        msgs = ((InternalEObject)methodName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.METHOD_SPEC__METHOD_NAME, null, msgs);
      if (newMethodName != null)
        msgs = ((InternalEObject)newMethodName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.METHOD_SPEC__METHOD_NAME, null, msgs);
      msgs = basicSetMethodName(newMethodName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.METHOD_SPEC__METHOD_NAME, newMethodName, newMethodName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signature getSignature()
  {
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSignature(Signature newSignature, NotificationChain msgs)
  {
    Signature oldSignature = signature;
    signature = newSignature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.METHOD_SPEC__SIGNATURE, oldSignature, newSignature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignature(Signature newSignature)
  {
    if (newSignature != signature)
    {
      NotificationChain msgs = null;
      if (signature != null)
        msgs = ((InternalEObject)signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.METHOD_SPEC__SIGNATURE, null, msgs);
      if (newSignature != null)
        msgs = ((InternalEObject)newSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.METHOD_SPEC__SIGNATURE, null, msgs);
      msgs = basicSetSignature(newSignature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.METHOD_SPEC__SIGNATURE, newSignature, newSignature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceTypeName getInterfaceTypeName()
  {
    return interfaceTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterfaceTypeName(InterfaceTypeName newInterfaceTypeName, NotificationChain msgs)
  {
    InterfaceTypeName oldInterfaceTypeName = interfaceTypeName;
    interfaceTypeName = newInterfaceTypeName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.METHOD_SPEC__INTERFACE_TYPE_NAME, oldInterfaceTypeName, newInterfaceTypeName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceTypeName(InterfaceTypeName newInterfaceTypeName)
  {
    if (newInterfaceTypeName != interfaceTypeName)
    {
      NotificationChain msgs = null;
      if (interfaceTypeName != null)
        msgs = ((InternalEObject)interfaceTypeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.METHOD_SPEC__INTERFACE_TYPE_NAME, null, msgs);
      if (newInterfaceTypeName != null)
        msgs = ((InternalEObject)newInterfaceTypeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.METHOD_SPEC__INTERFACE_TYPE_NAME, null, msgs);
      msgs = basicSetInterfaceTypeName(newInterfaceTypeName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.METHOD_SPEC__INTERFACE_TYPE_NAME, newInterfaceTypeName, newInterfaceTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GoPackage.METHOD_SPEC__METHOD_NAME:
        return basicSetMethodName(null, msgs);
      case GoPackage.METHOD_SPEC__SIGNATURE:
        return basicSetSignature(null, msgs);
      case GoPackage.METHOD_SPEC__INTERFACE_TYPE_NAME:
        return basicSetInterfaceTypeName(null, msgs);
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
    switch (featureID)
    {
      case GoPackage.METHOD_SPEC__METHOD_NAME:
        return getMethodName();
      case GoPackage.METHOD_SPEC__SIGNATURE:
        return getSignature();
      case GoPackage.METHOD_SPEC__INTERFACE_TYPE_NAME:
        return getInterfaceTypeName();
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
      case GoPackage.METHOD_SPEC__METHOD_NAME:
        setMethodName((MethodName)newValue);
        return;
      case GoPackage.METHOD_SPEC__SIGNATURE:
        setSignature((Signature)newValue);
        return;
      case GoPackage.METHOD_SPEC__INTERFACE_TYPE_NAME:
        setInterfaceTypeName((InterfaceTypeName)newValue);
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
      case GoPackage.METHOD_SPEC__METHOD_NAME:
        setMethodName((MethodName)null);
        return;
      case GoPackage.METHOD_SPEC__SIGNATURE:
        setSignature((Signature)null);
        return;
      case GoPackage.METHOD_SPEC__INTERFACE_TYPE_NAME:
        setInterfaceTypeName((InterfaceTypeName)null);
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
      case GoPackage.METHOD_SPEC__METHOD_NAME:
        return methodName != null;
      case GoPackage.METHOD_SPEC__SIGNATURE:
        return signature != null;
      case GoPackage.METHOD_SPEC__INTERFACE_TYPE_NAME:
        return interfaceTypeName != null;
    }
    return super.eIsSet(featureID);
  }

} //MethodSpecImpl
