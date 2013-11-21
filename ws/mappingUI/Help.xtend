package MMUI

import java.io.File
import java.io.IOException
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.xtext.istic.mapUI.MapUIStandaloneSetup
import org.xtext.istic.soda.SoDaStandaloneSetup
import org.xtext.istic.soda.soDa.Soda

class Help {

	def void testSavingAndLoadingUIModels() {

		// Create model
		var ui = MMUIFactory.eINSTANCE.createUi
		ui.containers.add(MMUIFactory.eINSTANCE.createContainer)
		ui.containers.get(0).widgets.add(MMUIFactory.eINSTANCE.createCheckbox)
		ui.containers.get(0).widgets.add(MMUIFactory.eINSTANCE.createCheckbox)

		// Create a resource set.
		var ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Get the URI of the model file.
		var URI fileURI = URI.createFileURI(new File("myUI.xmi").getAbsolutePath());

		// Create a resource for this file.
		var Resource resource = resourceSet.createResource(fileURI);

		// Add the book and writer objects to the contents.
		resource.getContents().add(ui);
		resource.getContents().add(MMUIFactory.eINSTANCE.createUi);

		// Save the contents of the resource to the file system.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
		}

		// Load model
		var loadedModel = resourceSet.getResource(fileURI, true)
		var Ui loadedUI = loadedModel.contents.head as Ui
		println(loadedUI.containers.get(0).widgets.size)

	}

	
	def void testParsingPollSystem() {

		// Create a resource set.
		var ResourceSet resourceSet = new ResourceSetImpl();

		SoDaStandaloneSetup.doSetup
		var resource = resourceSet.getResource(URI.createURI("../org.xtext.istic.soda.tests/ressources/e1.soda"), true)
		var ps = resource.contents.head as Soda
		println(ps.polls.size)
	}

	
	def void testParsingMapping() {

		// Create a resource set.
		var ResourceSet resourceSet = new ResourceSetImpl();

		MapUIStandaloneSetup.doSetup
		var resource = resourceSet.getResource(URI.createURI("../org.xtext.istic.mapUI.tests/ressources/e1.MapUI"), true)
		var mappings = resource.contents.head as Ui
		println(mappings.containers.head.id)
		println(mappings.containers.head.widgets.get(0).width)
		println(mappings.containers.head.widgets.get(0).length)
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
