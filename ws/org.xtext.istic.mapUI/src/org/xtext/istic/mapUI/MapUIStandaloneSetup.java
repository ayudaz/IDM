/*
* generated by Xtext
*/
package org.xtext.istic.mapUI;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MapUIStandaloneSetup extends MapUIStandaloneSetupGenerated{

	public static void doSetup() {
		new MapUIStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

