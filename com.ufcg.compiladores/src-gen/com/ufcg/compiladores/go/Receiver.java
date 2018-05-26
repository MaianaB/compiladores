/**
 * generated by Xtext 2.13.0
 */
package com.ufcg.compiladores.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.Receiver#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getReceiver()
 * @model
 * @generated
 */
public interface Receiver extends MethodDecl
{
  /**
   * Returns the value of the '<em><b>Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' containment reference.
   * @see #setSignature(Signature)
   * @see com.ufcg.compiladores.go.GoPackage#getReceiver_Signature()
   * @model containment="true"
   * @generated
   */
  Signature getSignature();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.Receiver#getSignature <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' containment reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(Signature value);

} // Receiver