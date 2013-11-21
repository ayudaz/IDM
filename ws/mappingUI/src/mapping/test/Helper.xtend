package mapping.test

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.xtext.istic.soda.SoDaStandaloneSetup
import org.xtext.istic.mapUI.MapUIStandaloneSetup
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.xtext.istic.mapUI.mapUI.MapUI
import org.xtext.istic.soda.soDa.Soda

class Help {

	private Soda soda
	private MapUI ui
	
	def void LoadPollAndMapUiSystem() {

		// Create a resource set.
		var ResourceSet resourceSet = new ResourceSetImpl();
		SoDaStandaloneSetup.doSetup
		MapUIStandaloneSetup.doSetup
		var resourceSoda = resourceSet.getResource(URI.createURI("../org.xtext.istic.soda.tests/ressources/e1.soda"), true)
		var resourceUi = resourceSet.getResource(URI.createURI("../org.xtext.istic.mapUI.tests/ressources/e1.MapUI"), true)
		soda = resourceSoda.contents.head as Soda
		ui = resourceSoda.contents.head as MapUI		
	}


	def void testTemplate() {
		val template = "Ui {" 
		+ "Container {"
		+ "Label[10,20] => q1 : Q ? {"
		+ "Checkbox[10,20]"
		+ "Label[10,20] => Oui"
		+ "Checkbox[10,20] "
		+ "Label[10,20] => Non"
		+ "}"
		+ "}"
		+ "}"
		+ "}"
		println(template)
	}
}
