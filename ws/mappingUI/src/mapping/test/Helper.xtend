package mapping.test

import mapping.visitor.MapUiVisitorImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.xtext.istic.mapUI.MapUIStandaloneSetup
import org.xtext.istic.mapUI.mapUI.MapUI
import org.xtext.istic.soda.SoDaStandaloneSetup
import org.xtext.istic.soda.soDa.Soda
import static extension mapping.visitor.MapUIExtension.*
import static extension mapping.visitor.SodaExtension.*
import mapping.visitor.SodaVisitorImpl
import mapping.launch.Mapping
import mapping.transformation.TransfoHTML

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
		
		TransfoHTML.TransfoEnHTML(ui)
	}
}
