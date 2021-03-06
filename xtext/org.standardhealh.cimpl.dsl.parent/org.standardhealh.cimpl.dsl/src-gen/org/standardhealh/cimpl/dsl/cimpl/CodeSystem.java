/**
 * generated by Xtext 2.12.0
 */
package org.standardhealh.cimpl.dsl.cimpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.CodeSystem#getNamespace <em>Namespace</em>}</li>
 * </ul>
 *
 * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getCodeSystem()
 * @model
 * @generated
 */
public interface CodeSystem extends EObject
{
  /**
   * Returns the value of the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace</em>' attribute.
   * @see #setNamespace(String)
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getCodeSystem_Namespace()
   * @model
   * @generated
   */
  String getNamespace();

  /**
   * Sets the value of the '{@link org.standardhealh.cimpl.dsl.cimpl.CodeSystem#getNamespace <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace</em>' attribute.
   * @see #getNamespace()
   * @generated
   */
  void setNamespace(String value);

} // CodeSystem
