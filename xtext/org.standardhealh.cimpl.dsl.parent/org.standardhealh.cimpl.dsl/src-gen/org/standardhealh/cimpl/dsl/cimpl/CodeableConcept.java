/**
 * generated by Xtext 2.12.0
 */
package org.standardhealh.cimpl.dsl.cimpl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Codeable Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.CodeableConcept#getValueSetURL <em>Value Set URL</em>}</li>
 * </ul>
 *
 * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getCodeableConcept()
 * @model
 * @generated
 */
public interface CodeableConcept extends Value
{
  /**
   * Returns the value of the '<em><b>Value Set URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Set URL</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Set URL</em>' attribute.
   * @see #setValueSetURL(String)
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getCodeableConcept_ValueSetURL()
   * @model
   * @generated
   */
  String getValueSetURL();

  /**
   * Sets the value of the '{@link org.standardhealh.cimpl.dsl.cimpl.CodeableConcept#getValueSetURL <em>Value Set URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Set URL</em>' attribute.
   * @see #getValueSetURL()
   * @generated
   */
  void setValueSetURL(String value);

} // CodeableConcept
