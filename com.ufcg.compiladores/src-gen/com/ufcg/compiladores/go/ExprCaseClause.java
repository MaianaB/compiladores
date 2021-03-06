/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Case Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.ExprCaseClause#getExprSwitchCase <em>Expr Switch Case</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.ExprCaseClause#getStatementList <em>Statement List</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getExprCaseClause()
 * @model
 * @generated
 */
public interface ExprCaseClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr Switch Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Switch Case</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Switch Case</em>' containment reference.
   * @see #setExprSwitchCase(ExprSwitchCase)
   * @see com.ufcg.compiladores.go.GoPackage#getExprCaseClause_ExprSwitchCase()
   * @model containment="true"
   * @generated
   */
  ExprSwitchCase getExprSwitchCase();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.ExprCaseClause#getExprSwitchCase <em>Expr Switch Case</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Switch Case</em>' containment reference.
   * @see #getExprSwitchCase()
   * @generated
   */
  void setExprSwitchCase(ExprSwitchCase value);

  /**
   * Returns the value of the '<em><b>Statement List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement List</em>' containment reference.
   * @see #setStatementList(StatementList)
   * @see com.ufcg.compiladores.go.GoPackage#getExprCaseClause_StatementList()
   * @model containment="true"
   * @generated
   */
  StatementList getStatementList();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.ExprCaseClause#getStatementList <em>Statement List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement List</em>' containment reference.
   * @see #getStatementList()
   * @generated
   */
  void setStatementList(StatementList value);

} // ExprCaseClause
