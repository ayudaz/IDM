/*
* generated by Xtext
*/
package org.xtext.istic.soda;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SoDaStandaloneSetup extends SoDaStandaloneSetupGenerated{

	public static void doSetup() {
		new SoDaStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
