package mapping.test

import mapping.launch.Mapping
import mapping.transformation.TransfoHTML
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.xtext.istic.mapUI.MapUIStandaloneSetup
import org.xtext.istic.mapUI.mapUI.MapUI
import org.xtext.istic.soda.SoDaStandaloneSetup
import org.xtext.istic.soda.soDa.Soda

class Help {

	
	def static void main(String[] args) {

		// Create a resource set.
		var ResourceSet resourceSet = new ResourceSetImpl();
		SoDaStandaloneSetup.doSetup
		MapUIStandaloneSetup.doSetup
		var resourceSoda = resourceSet.getResource(URI.createURI("../org.xtext.istic.soda.tests/ressources/e1.soda"), true)
		var resourceMapUi = resourceSet.getResource(URI.createURI("../org.xtext.istic.mapUI.tests/ressources/e1.MapUI"), true)
		
		var soda = resourceSoda.contents.head as Soda
		var mapUi = resourceMapUi.contents.head as MapUI
		
		var mapping = new Mapping
		var ui = mapping.transfo(soda, mapUi)
		var html = mapping.generation(ui)
		TransfoHTML.writeFileObject(html)
	}
}
