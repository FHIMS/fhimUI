/**
 * generated by Xtext 2.10.0
 */
package org.standardhealh.cimpl.dsl.cimpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.Doc#getHeader <em>Header</em>}</li>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.Doc#getUses <em>Uses</em>}</li>
 *   <li>{@link org.standardhealh.cimpl.dsl.cimpl.Doc#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getDoc()
 * @model
 * @generated
 */
public interface Doc extends EObject
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
   * @see #setHeader(DocHeader)
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getDoc_Header()
   * @model containment="true"
   * @generated
   */
  DocHeader getHeader();

  /**
   * Sets the value of the '{@link org.standardhealh.cimpl.dsl.cimpl.Doc#getHeader <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' containment reference.
   * @see #getHeader()
   * @generated
   */
  void setHeader(DocHeader value);

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
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getDoc_Uses()
   * @model containment="true"
   * @generated
   */
  UsesStatement getUses();

  /**
   * Sets the value of the '{@link org.standardhealh.cimpl.dsl.cimpl.Doc#getUses <em>Uses</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uses</em>' containment reference.
   * @see #getUses()
   * @generated
   */
  void setUses(UsesStatement value);

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
   * @see org.standardhealh.cimpl.dsl.cimpl.CimplPackage#getDoc_Entries()
   * @model containment="true"
   * @generated
   */
  EList<EntryElement> getEntries();

} // Doc