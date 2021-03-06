/**
 * generated by Xtext 2.12.0
 */
package org.standardhealh.cimpl.dsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.standardhealh.cimpl.dsl.CimplRuntimeModule;
import org.standardhealh.cimpl.dsl.CimplStandaloneSetup;
import org.standardhealh.cimpl.dsl.ide.CimplIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class CimplIdeSetup extends CimplStandaloneSetup {
  @Override
  public Injector createInjector() {
    CimplRuntimeModule _cimplRuntimeModule = new CimplRuntimeModule();
    CimplIdeModule _cimplIdeModule = new CimplIdeModule();
    return Guice.createInjector(Modules2.mixin(_cimplRuntimeModule, _cimplIdeModule));
  }
}
