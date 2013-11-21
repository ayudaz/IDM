package mapping 

import org.xtext.istic.mapUI.mapUI.MapUI
import org.xtext.istic.soda.soDa.Soda
import MMUI.Ui
import MMUI.MMUIFactory
import MMUI.Container
import org.xtext.istic.mapUI.mapUI.Mapping
import org.xtext.istic.soda.soDa.Poll

class mapping {
// guillaume.becan@inria.fr
// https://github.com/gbecan
	def Ui transfo(Soda soda, MapUI mapUi) {

		// Create model
		var ui = MMUIFactory.eINSTANCE.createUi
		ui.containers.add(MMUIFactory.eINSTANCE.createContainer)
		ui.containers.get(0).widgets.add(MMUIFactory.eINSTANCE.createCheckbox)
		ui.containers.get(0).widgets.add(MMUIFactory.eINSTANCE.createCheckbox)

		for (Mapping c : mapUi.mappings) {
			var container = MMUIFactory.eINSTANCE.createContainer
			
			var polux = soda.polls.map [ polo |
				if (polo.name.equals(c.name))
					return polo
			]

			if (polux != null) {
				var polo = polux.get(0)
				container.setNomQuestion(polo.name)
				
				switch c.type {
					case "Checkbox": {
						var question = polo.questions.map[]
					}
				}
				
				ui.containers.add(container)
			}		

			
		}

		return ui;
	}

}
