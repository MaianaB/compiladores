/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.Expression;
import com.ufcg.compiladores.go.FieldName;
import com.ufcg.compiladores.go.GoPackage;
import com.ufcg.compiladores.go.Key;
import com.ufcg.compiladores.go.LiteralValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.KeyImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.KeyImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.KeyImpl#getLiteralValue <em>Literal Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyImpl extends MinimalEObjectImpl.Container implements Key
{
  /**
   * The cached value of the '{@link #getFieldName() <em>Field Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldName()
   * @generated
   * @ordered
   */
  protected FieldName fieldName;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getLiteralValue() <em>Literal Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteralValue()
   * @generated
   * @ordered
   */
  protected LiteralValue literalValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KeyImpl()
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
    return GoPackage.Literals.KEY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldName getFieldName()
  {
    return fieldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFieldName(FieldName newFieldName, NotificationChain msgs)
  {
    FieldName oldFieldName = fieldName;
    fieldName = newFieldName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.KEY__FIELD_NAME, oldFieldName, newFieldName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldName(FieldName newFieldName)
  {
    if (newFieldName != fieldName)
    {
      NotificationChain msgs = null;
      if (fieldName != null)
        msgs = ((InternalEObject)fieldName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.KEY__FIELD_NAME, null, msgs);
      if (newFieldName != null)
        msgs = ((InternalEObject)newFieldName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.KEY__FIELD_NAME, null, msgs);
      msgs = basicSetFieldName(newFieldName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.KEY__FIELD_NAME, newFieldName, newFieldName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.KEY__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.KEY__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.KEY__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.KEY__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralValue getLiteralValue()
  {
    return literalValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLiteralValue(LiteralValue newLiteralValue, NotificationChain msgs)
  {
    LiteralValue oldLiteralValue = literalValue;
    literalValue = newLiteralValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.KEY__LITERAL_VALUE, oldLiteralValue, newLiteralValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteralValue(LiteralValue newLiteralValue)
  {
    if (newLiteralValue != literalValue)
    {
      NotificationChain msgs = null;
      if (literalValue != null)
        msgs = ((InternalEObject)literalValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.KEY__LITERAL_VALUE, null, msgs);
      if (newLiteralValue != null)
        msgs = ((InternalEObject)newLiteralValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.KEY__LITERAL_VALUE, null, msgs);
      msgs = basicSetLiteralValue(newLiteralValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.KEY__LITERAL_VALUE, newLiteralValue, newLiteralValue));
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
      case GoPackage.KEY__FIELD_NAME:
        return basicSetFieldName(null, msgs);
      case GoPackage.KEY__EXPRESSION:
        return basicSetExpression(null, msgs);
      case GoPackage.KEY__LITERAL_VALUE:
        return basicSetLiteralValue(null, msgs);
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
      case GoPackage.KEY__FIELD_NAME:
        return getFieldName();
      case GoPackage.KEY__EXPRESSION:
        return getExpression();
      case GoPackage.KEY__LITERAL_VALUE:
        return getLiteralValue();
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
      case GoPackage.KEY__FIELD_NAME:
        setFieldName((FieldName)newValue);
        return;
      case GoPackage.KEY__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case GoPackage.KEY__LITERAL_VALUE:
        setLiteralValue((LiteralValue)newValue);
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
      case GoPackage.KEY__FIELD_NAME:
        setFieldName((FieldName)null);
        return;
      case GoPackage.KEY__EXPRESSION:
        setExpression((Expression)null);
        return;
      case GoPackage.KEY__LITERAL_VALUE:
        setLiteralValue((LiteralValue)null);
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
      case GoPackage.KEY__FIELD_NAME:
        return fieldName != null;
      case GoPackage.KEY__EXPRESSION:
        return expression != null;
      case GoPackage.KEY__LITERAL_VALUE:
        return literalValue != null;
    }
    return super.eIsSet(featureID);
  }

} //KeyImpl
