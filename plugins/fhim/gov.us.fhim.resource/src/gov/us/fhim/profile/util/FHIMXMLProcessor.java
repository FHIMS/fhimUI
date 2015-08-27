/**
 */
package gov.us.fhim.profile.util;

import gov.us.fhim.profile.FHIMPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FHIMXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIMXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		FHIMPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the FHIMResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new FHIMResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new FHIMResourceFactoryImpl());
		}
		return registrations;
	}

} // FHIMXMLProcessor
