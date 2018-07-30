/**
 * generated by Xtext 2.10.0
 */
package gov.us.fhim.xtext.cimi.cIMIDSL.impl;

import gov.us.fhim.xtext.cimi.cIMIDSL.Archetype;
import gov.us.fhim.xtext.cimi.cIMIDSL.ArchetypeModel;
import gov.us.fhim.xtext.cimi.cIMIDSL.CIMIDSLFactory;
import gov.us.fhim.xtext.cimi.cIMIDSL.CIMIDSLPackage;
import gov.us.fhim.xtext.cimi.cIMIDSL.Description;
import gov.us.fhim.xtext.cimi.cIMIDSL.Details;
import gov.us.fhim.xtext.cimi.cIMIDSL.Languge;
import gov.us.fhim.xtext.cimi.cIMIDSL.Matches;
import gov.us.fhim.xtext.cimi.cIMIDSL.OriginalAuthor;
import gov.us.fhim.xtext.cimi.cIMIDSL.OtherDetails;
import gov.us.fhim.xtext.cimi.cIMIDSL.TermBinding;
import gov.us.fhim.xtext.cimi.cIMIDSL.TermBindings;
import gov.us.fhim.xtext.cimi.cIMIDSL.TermDefinition;
import gov.us.fhim.xtext.cimi.cIMIDSL.TermDefinitions;
import gov.us.fhim.xtext.cimi.cIMIDSL.Terminology;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CIMIDSLPackageImpl extends EPackageImpl implements CIMIDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass archetypeModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass archetypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass detailsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass otherDetailsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass originalAuthorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass langugeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matchesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass terminologyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termDefinitionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termBindingsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termBindingEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see gov.us.fhim.xtext.cimi.cIMIDSL.CIMIDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CIMIDSLPackageImpl()
  {
    super(eNS_URI, CIMIDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CIMIDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CIMIDSLPackage init()
  {
    if (isInited) return (CIMIDSLPackage)EPackage.Registry.INSTANCE.getEPackage(CIMIDSLPackage.eNS_URI);

    // Obtain or create and register package
    CIMIDSLPackageImpl theCIMIDSLPackage = (CIMIDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CIMIDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CIMIDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCIMIDSLPackage.createPackageContents();

    // Initialize created meta-data
    theCIMIDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCIMIDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CIMIDSLPackage.eNS_URI, theCIMIDSLPackage);
    return theCIMIDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArchetypeModel()
  {
    return archetypeModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchetypeModel_Elements()
  {
    return (EReference)archetypeModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArchetype()
  {
    return archetypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArchetype_Adl_version()
  {
    return (EAttribute)archetypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArchetype_Rm_release()
  {
    return (EAttribute)archetypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArchetype_Name()
  {
    return (EAttribute)archetypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchetype_Language()
  {
    return (EReference)archetypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchetype_Description()
  {
    return (EReference)archetypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchetype_Definition()
  {
    return (EReference)archetypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchetype_Terminology()
  {
    return (EReference)archetypeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescription()
  {
    return descriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDescription_OriginalAuthor()
  {
    return (EReference)descriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDescription_Details()
  {
    return (EReference)descriptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDetails()
  {
    return detailsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDetails_Name()
  {
    return (EAttribute)detailsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDetails_Language()
  {
    return (EAttribute)detailsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDetails_Use()
  {
    return (EAttribute)detailsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDetails_Copyright()
  {
    return (EAttribute)detailsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDetails_Other_details()
  {
    return (EReference)detailsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOtherDetails()
  {
    return otherDetailsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOtherDetails_Lifecycle_state()
  {
    return (EAttribute)otherDetailsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOtherDetails_Custodian_namespace()
  {
    return (EAttribute)otherDetailsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOtherDetails_Custodian_organization()
  {
    return (EAttribute)otherDetailsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOtherDetails_License()
  {
    return (EAttribute)otherDetailsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOtherDetails_Ip_acknowledgement_loinc()
  {
    return (EAttribute)otherDetailsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOtherDetails_Ip_acknowledgement_snomed()
  {
    return (EAttribute)otherDetailsEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOriginalAuthor()
  {
    return originalAuthorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOriginalAuthor_Date()
  {
    return (EAttribute)originalAuthorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOriginalAuthor_Organization()
  {
    return (EAttribute)originalAuthorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOriginalAuthor_Name()
  {
    return (EAttribute)originalAuthorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOriginalAuthor_Email()
  {
    return (EAttribute)originalAuthorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLanguge()
  {
    return langugeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLanguge_Name()
  {
    return (EAttribute)langugeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatches()
  {
    return matchesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatches_Name()
  {
    return (EAttribute)matchesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatches_Definition()
  {
    return (EAttribute)matchesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatches_Submatch()
  {
    return (EReference)matchesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatches_Value()
  {
    return (EAttribute)matchesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatches_ValueDefinition()
  {
    return (EAttribute)matchesEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerminology()
  {
    return terminologyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminology_TermDefinition()
  {
    return (EReference)terminologyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminology_TermBinding()
  {
    return (EReference)terminologyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermDefinitions()
  {
    return termDefinitionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermDefinitions_Name()
  {
    return (EAttribute)termDefinitionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTermDefinitions_Elements()
  {
    return (EReference)termDefinitionsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermBindings()
  {
    return termBindingsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermBindings_Name()
  {
    return (EAttribute)termBindingsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTermBindings_Elements()
  {
    return (EReference)termBindingsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermDefinition()
  {
    return termDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermDefinition_Name()
  {
    return (EAttribute)termDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermDefinition_Text()
  {
    return (EAttribute)termDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermDefinition_Description()
  {
    return (EAttribute)termDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermBinding()
  {
    return termBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermBinding_Name()
  {
    return (EAttribute)termBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermBinding_Binding()
  {
    return (EAttribute)termBindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CIMIDSLFactory getCIMIDSLFactory()
  {
    return (CIMIDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    archetypeModelEClass = createEClass(ARCHETYPE_MODEL);
    createEReference(archetypeModelEClass, ARCHETYPE_MODEL__ELEMENTS);

    archetypeEClass = createEClass(ARCHETYPE);
    createEAttribute(archetypeEClass, ARCHETYPE__ADL_VERSION);
    createEAttribute(archetypeEClass, ARCHETYPE__RM_RELEASE);
    createEAttribute(archetypeEClass, ARCHETYPE__NAME);
    createEReference(archetypeEClass, ARCHETYPE__LANGUAGE);
    createEReference(archetypeEClass, ARCHETYPE__DESCRIPTION);
    createEReference(archetypeEClass, ARCHETYPE__DEFINITION);
    createEReference(archetypeEClass, ARCHETYPE__TERMINOLOGY);

    descriptionEClass = createEClass(DESCRIPTION);
    createEReference(descriptionEClass, DESCRIPTION__ORIGINAL_AUTHOR);
    createEReference(descriptionEClass, DESCRIPTION__DETAILS);

    detailsEClass = createEClass(DETAILS);
    createEAttribute(detailsEClass, DETAILS__NAME);
    createEAttribute(detailsEClass, DETAILS__LANGUAGE);
    createEAttribute(detailsEClass, DETAILS__USE);
    createEAttribute(detailsEClass, DETAILS__COPYRIGHT);
    createEReference(detailsEClass, DETAILS__OTHER_DETAILS);

    otherDetailsEClass = createEClass(OTHER_DETAILS);
    createEAttribute(otherDetailsEClass, OTHER_DETAILS__LIFECYCLE_STATE);
    createEAttribute(otherDetailsEClass, OTHER_DETAILS__CUSTODIAN_NAMESPACE);
    createEAttribute(otherDetailsEClass, OTHER_DETAILS__CUSTODIAN_ORGANIZATION);
    createEAttribute(otherDetailsEClass, OTHER_DETAILS__LICENSE);
    createEAttribute(otherDetailsEClass, OTHER_DETAILS__IP_ACKNOWLEDGEMENT_LOINC);
    createEAttribute(otherDetailsEClass, OTHER_DETAILS__IP_ACKNOWLEDGEMENT_SNOMED);

    originalAuthorEClass = createEClass(ORIGINAL_AUTHOR);
    createEAttribute(originalAuthorEClass, ORIGINAL_AUTHOR__DATE);
    createEAttribute(originalAuthorEClass, ORIGINAL_AUTHOR__ORGANIZATION);
    createEAttribute(originalAuthorEClass, ORIGINAL_AUTHOR__NAME);
    createEAttribute(originalAuthorEClass, ORIGINAL_AUTHOR__EMAIL);

    langugeEClass = createEClass(LANGUGE);
    createEAttribute(langugeEClass, LANGUGE__NAME);

    matchesEClass = createEClass(MATCHES);
    createEAttribute(matchesEClass, MATCHES__NAME);
    createEAttribute(matchesEClass, MATCHES__DEFINITION);
    createEReference(matchesEClass, MATCHES__SUBMATCH);
    createEAttribute(matchesEClass, MATCHES__VALUE);
    createEAttribute(matchesEClass, MATCHES__VALUE_DEFINITION);

    terminologyEClass = createEClass(TERMINOLOGY);
    createEReference(terminologyEClass, TERMINOLOGY__TERM_DEFINITION);
    createEReference(terminologyEClass, TERMINOLOGY__TERM_BINDING);

    termDefinitionsEClass = createEClass(TERM_DEFINITIONS);
    createEAttribute(termDefinitionsEClass, TERM_DEFINITIONS__NAME);
    createEReference(termDefinitionsEClass, TERM_DEFINITIONS__ELEMENTS);

    termBindingsEClass = createEClass(TERM_BINDINGS);
    createEAttribute(termBindingsEClass, TERM_BINDINGS__NAME);
    createEReference(termBindingsEClass, TERM_BINDINGS__ELEMENTS);

    termDefinitionEClass = createEClass(TERM_DEFINITION);
    createEAttribute(termDefinitionEClass, TERM_DEFINITION__NAME);
    createEAttribute(termDefinitionEClass, TERM_DEFINITION__TEXT);
    createEAttribute(termDefinitionEClass, TERM_DEFINITION__DESCRIPTION);

    termBindingEClass = createEClass(TERM_BINDING);
    createEAttribute(termBindingEClass, TERM_BINDING__NAME);
    createEAttribute(termBindingEClass, TERM_BINDING__BINDING);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(archetypeModelEClass, ArchetypeModel.class, "ArchetypeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArchetypeModel_Elements(), this.getArchetype(), null, "elements", null, 0, -1, ArchetypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(archetypeEClass, Archetype.class, "Archetype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArchetype_Adl_version(), ecorePackage.getEString(), "adl_version", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArchetype_Rm_release(), ecorePackage.getEString(), "rm_release", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArchetype_Name(), ecorePackage.getEString(), "name", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArchetype_Language(), this.getLanguge(), null, "language", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArchetype_Description(), this.getDescription(), null, "description", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArchetype_Definition(), this.getMatches(), null, "definition", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArchetype_Terminology(), this.getTerminology(), null, "terminology", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDescription_OriginalAuthor(), this.getOriginalAuthor(), null, "originalAuthor", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDescription_Details(), this.getDetails(), null, "details", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(detailsEClass, Details.class, "Details", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDetails_Name(), ecorePackage.getEString(), "name", null, 0, 1, Details.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDetails_Language(), ecorePackage.getEString(), "language", null, 0, 1, Details.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDetails_Use(), ecorePackage.getEString(), "use", null, 0, 1, Details.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDetails_Copyright(), ecorePackage.getEString(), "copyright", null, 0, 1, Details.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDetails_Other_details(), this.getOtherDetails(), null, "other_details", null, 0, 1, Details.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(otherDetailsEClass, OtherDetails.class, "OtherDetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOtherDetails_Lifecycle_state(), ecorePackage.getEString(), "lifecycle_state", null, 0, 1, OtherDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOtherDetails_Custodian_namespace(), ecorePackage.getEString(), "custodian_namespace", null, 0, 1, OtherDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOtherDetails_Custodian_organization(), ecorePackage.getEString(), "custodian_organization", null, 0, 1, OtherDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOtherDetails_License(), ecorePackage.getEString(), "license", null, 0, 1, OtherDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOtherDetails_Ip_acknowledgement_loinc(), ecorePackage.getEString(), "ip_acknowledgement_loinc", null, 0, 1, OtherDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOtherDetails_Ip_acknowledgement_snomed(), ecorePackage.getEString(), "ip_acknowledgement_snomed", null, 0, 1, OtherDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(originalAuthorEClass, OriginalAuthor.class, "OriginalAuthor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOriginalAuthor_Date(), ecorePackage.getEString(), "date", null, 0, 1, OriginalAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOriginalAuthor_Organization(), ecorePackage.getEString(), "organization", null, 0, 1, OriginalAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOriginalAuthor_Name(), ecorePackage.getEString(), "name", null, 0, 1, OriginalAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOriginalAuthor_Email(), ecorePackage.getEString(), "email", null, 0, 1, OriginalAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(langugeEClass, Languge.class, "Languge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLanguge_Name(), ecorePackage.getEString(), "name", null, 0, 1, Languge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matchesEClass, Matches.class, "Matches", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMatches_Name(), ecorePackage.getEString(), "name", null, 0, 1, Matches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMatches_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, Matches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatches_Submatch(), this.getMatches(), null, "submatch", null, 0, -1, Matches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMatches_Value(), ecorePackage.getEString(), "value", null, 0, 1, Matches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMatches_ValueDefinition(), ecorePackage.getEString(), "valueDefinition", null, 0, 1, Matches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(terminologyEClass, Terminology.class, "Terminology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTerminology_TermDefinition(), this.getTermDefinitions(), null, "termDefinition", null, 0, 1, Terminology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTerminology_TermBinding(), this.getTermBindings(), null, "termBinding", null, 0, 1, Terminology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termDefinitionsEClass, TermDefinitions.class, "TermDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTermDefinitions_Name(), ecorePackage.getEString(), "name", null, 0, 1, TermDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTermDefinitions_Elements(), this.getTermDefinition(), null, "elements", null, 0, -1, TermDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termBindingsEClass, TermBindings.class, "TermBindings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTermBindings_Name(), ecorePackage.getEString(), "name", null, 0, 1, TermBindings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTermBindings_Elements(), this.getTermBinding(), null, "elements", null, 0, -1, TermBindings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termDefinitionEClass, TermDefinition.class, "TermDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTermDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, TermDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTermDefinition_Text(), ecorePackage.getEString(), "text", null, 0, 1, TermDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTermDefinition_Description(), ecorePackage.getEString(), "description", null, 0, 1, TermDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termBindingEClass, TermBinding.class, "TermBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTermBinding_Name(), ecorePackage.getEString(), "name", null, 0, 1, TermBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTermBinding_Binding(), ecorePackage.getEString(), "binding", null, 0, 1, TermBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //CIMIDSLPackageImpl
