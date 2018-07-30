/**
 * generated by Xtext 2.10.0
 */
package gov.us.fhim.xtext.cimi.cIMIDSL.util;

import gov.us.fhim.xtext.cimi.cIMIDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gov.us.fhim.xtext.cimi.cIMIDSL.CIMIDSLPackage
 * @generated
 */
public class CIMIDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CIMIDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CIMIDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CIMIDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CIMIDSLSwitch<Adapter> modelSwitch =
    new CIMIDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseArchetypeModel(ArchetypeModel object)
      {
        return createArchetypeModelAdapter();
      }
      @Override
      public Adapter caseArchetype(Archetype object)
      {
        return createArchetypeAdapter();
      }
      @Override
      public Adapter caseDescription(Description object)
      {
        return createDescriptionAdapter();
      }
      @Override
      public Adapter caseDetails(Details object)
      {
        return createDetailsAdapter();
      }
      @Override
      public Adapter caseOtherDetails(OtherDetails object)
      {
        return createOtherDetailsAdapter();
      }
      @Override
      public Adapter caseOriginalAuthor(OriginalAuthor object)
      {
        return createOriginalAuthorAdapter();
      }
      @Override
      public Adapter caseLanguge(Languge object)
      {
        return createLangugeAdapter();
      }
      @Override
      public Adapter caseMatches(Matches object)
      {
        return createMatchesAdapter();
      }
      @Override
      public Adapter caseTerminology(Terminology object)
      {
        return createTerminologyAdapter();
      }
      @Override
      public Adapter caseTermDefinitions(TermDefinitions object)
      {
        return createTermDefinitionsAdapter();
      }
      @Override
      public Adapter caseTermBindings(TermBindings object)
      {
        return createTermBindingsAdapter();
      }
      @Override
      public Adapter caseTermDefinition(TermDefinition object)
      {
        return createTermDefinitionAdapter();
      }
      @Override
      public Adapter caseTermBinding(TermBinding object)
      {
        return createTermBindingAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link gov.us.fhim.xtext.cimi.cIMIDSL.ArchetypeModel <em>Archetype Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gov.us.fhim.xtext.cimi.cIMIDSL.ArchetypeModel
   * @generated
   */
  public Adapter createArchetypeModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gov.us.fhim.xtext.cimi.cIMIDSL.Archetype <em>Archetype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gov.us.fhim.xtext.cimi.cIMIDSL.Archetype
   * @generated
   */
  public Adapter createArchetypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gov.us.fhim.xtext.cimi.cIMIDSL.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gov.us.fhim.xtext.cimi.cIMIDSL.Description
   * @generated
   */
  public Adapter createDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gov.us.fhim.xtext.cimi.cIMIDSL.Details <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gov.us.fhim.xtext.cimi.cIMIDSL.Details
   * @generated
   */
  public Adapter createDetailsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gov.us.fhim.xtext.cimi.cIMIDSL.OtherDetails <em>Other Details</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gov.us.fhim.xtext.cimi.cIMIDSL.OtherDetails
   * @generated
   */
  public Adapter createOtherDetailsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gov.us.fhim.xtext.cimi.cIMIDSL.OriginalAuthor <em>Original Author</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gov.us.fhim.xtext.cimi.cIMIDSL.OriginalAuthor
   * @generated
   */
  public Adapter createOriginalAuthorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gov.us.fhim.xtext.cimi.cIMIDSL.Languge <em>Languge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gov.us.fhim.xtext.cimi.cIMIDSL.Languge
   * @generated
   */
  public Adapter createLangugeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gov.us.fhim.xtext.cimi.cIMIDSL.Matches <em>Matches</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gov.us.fhim.xtext.cimi.cIMIDSL.Matches
   * @generated
   */
  public Adapter createMatchesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gov.us.fhim.xtext.cimi.cIMIDSL.Terminology <em>Terminology</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gov.us.fhim.xtext.cimi.cIMIDSL.Terminology
   * @generated
   */
  public Adapter createTerminologyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gov.us.fhim.xtext.cimi.cIMIDSL.TermDefinitions <em>Term Definitions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gov.us.fhim.xtext.cimi.cIMIDSL.TermDefinitions
   * @generated
   */
  public Adapter createTermDefinitionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gov.us.fhim.xtext.cimi.cIMIDSL.TermBindings <em>Term Bindings</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gov.us.fhim.xtext.cimi.cIMIDSL.TermBindings
   * @generated
   */
  public Adapter createTermBindingsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gov.us.fhim.xtext.cimi.cIMIDSL.TermDefinition <em>Term Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gov.us.fhim.xtext.cimi.cIMIDSL.TermDefinition
   * @generated
   */
  public Adapter createTermDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gov.us.fhim.xtext.cimi.cIMIDSL.TermBinding <em>Term Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gov.us.fhim.xtext.cimi.cIMIDSL.TermBinding
   * @generated
   */
  public Adapter createTermBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CIMIDSLAdapterFactory
