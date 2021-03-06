/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.TypeName#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.TypeName#getTypeNameLinha <em>Type Name Linha</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getTypeName()
 * @model
 * @generated
 */
public interface TypeName extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' containment reference.
   * @see #setIdentifier(identifier)
   * @see com.ufcg.compiladores.go.GoPackage#getTypeName_Identifier()
   * @model containment="true"
   * @generated
   */
  identifier getIdentifier();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.TypeName#getIdentifier <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' containment reference.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(identifier value);

  /**
   * Returns the value of the '<em><b>Type Name Linha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Name Linha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name Linha</em>' containment reference.
   * @see #setTypeNameLinha(TypeNameLinha)
   * @see com.ufcg.compiladores.go.GoPackage#getTypeName_TypeNameLinha()
   * @model containment="true"
   * @generated
   */
  TypeNameLinha getTypeNameLinha();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.TypeName#getTypeNameLinha <em>Type Name Linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name Linha</em>' containment reference.
   * @see #getTypeNameLinha()
   * @generated
   */
  void setTypeNameLinha(TypeNameLinha value);

} // TypeName
