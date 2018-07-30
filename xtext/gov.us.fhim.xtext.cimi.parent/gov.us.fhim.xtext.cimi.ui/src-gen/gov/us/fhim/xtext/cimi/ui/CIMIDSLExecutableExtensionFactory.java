/*
 * generated by Xtext 2.10.0
 */
package gov.us.fhim.xtext.cimi.ui;

import com.google.inject.Injector;
import gov.us.fhim.xtext.cimi.ui.internal.CimiActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CIMIDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CimiActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CimiActivator.getInstance().getInjector(CimiActivator.GOV_US_FHIM_XTEXT_CIMI_CIMIDSL);
	}
	
}
