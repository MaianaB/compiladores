/**
 * generated by Xtext 2.13.0
 */
package com.ufcg.compiladores.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.Type#getTypeLit <em>Type Lit</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.Type#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getType()
 * @model
 * @generated
 */
public interface Type extends FieldDecl, Result, ParameterDecl, ConstSpec, AliasDecl, TypeDef, VarSpec, TypeAssertion, Arguments, ReceiverType, Conversion
{
  /**
   * Returns the value of the '<em><b>Type Lit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Lit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Lit</em>' containment reference.
   * @see #setTypeLit(TypeLit)
   * @see com.ufcg.compiladores.go.GoPackage#getType_TypeLit()
   * @model containment="true"
   * @generated
   */
  TypeLit getTypeLit();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.Type#getTypeLit <em>Type Lit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Lit</em>' containment reference.
   * @see #getTypeLit()
   * @generated
   */
  void setTypeLit(TypeLit value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see com.ufcg.compiladores.go.GoPackage#getType_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.Type#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Type