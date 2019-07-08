/**
 * generated by Xtext 2.12.0
 */
package org.standardhealh.cimpl.dsl.cimpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.Profile#getHeader <em>Header</em>}</li>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.Profile#getDescription <em>Description</em>}</li>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.Profile#getUses <em>Uses</em>}</li>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.Profile#getCodeSystems <em>Code Systems</em>}</li>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.Profile#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.Profile#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getProfile()
 * @model
 * @generated
 */
public interface Profile extends EObject
{
  /**
   * Returns the value of the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header</em>' containment reference.
   * @see #setHeader(Header)
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getProfile_Header()
   * @model containment="true"
   * @generated
   */
  Header getHeader();

  /**
   * Sets the value of the '{@link org.standardhealh.cimpl.dsl.cimpl.Profile#getHeader <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' containment reference.
   * @see #getHeader()
   * @generated
   */
  void setHeader(Header value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(Description)
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getProfile_Description()
   * @model containment="true"
   * @generated
   */
  Description getDescription();

  /**
   * Sets the value of the '{@link org.standardhealh.cimpl.dsl.cimpl.Profile#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(Description value);

  /**
   * Returns the value of the '<em><b>Uses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uses</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uses</em>' containment reference.
   * @see #setUses(UsesStatement)
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getProfile_Uses()
   * @model containment="true"
   * @generated
   */
  UsesStatement getUses();

  /**
   * Sets the value of the '{@link org.standardhealh.cimpl.dsl.cimpl.Profile#getUses <em>Uses</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uses</em>' containment reference.
   * @see #getUses()
   * @generated
   */
  void setUses(UsesStatement value);

  /**
   * Returns the value of the '<em><b>Code Systems</b></em>' containment reference list.
   * The list contents are of type {@link org.standardhealh.cimpl.dsl.cimpl.CodeSystem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code Systems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code Systems</em>' containment reference list.
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getProfile_CodeSystems()
   * @model containment="true"
   * @generated
   */
  EList<CodeSystem> getCodeSystems();

  /**
   * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
   * The list contents are of type {@link org.standardhealh.cimpl.dsl.cimpl.EntryElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' containment reference list.
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getProfile_Entries()
   * @model containment="true"
   * @generated
   */
  EList<EntryElement> getEntries();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.standardhealh.cimpl.dsl.cimpl.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getProfile_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

} // Profile