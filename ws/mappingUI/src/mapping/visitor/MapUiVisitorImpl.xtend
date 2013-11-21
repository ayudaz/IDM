package mapping.visitor

import mapping.visitor.MapUiVisitor
import org.xtext.istic.mapUI.mapUI.MapUI
import MMUI.Ui
import org.xtext.istic.mapUI.mapUI.Mapping
import MMUI.MMUIFactory

class MapUiVisitorImpl implements MapUiVisitor {
	
	override visit(MapUI element, Ui ui) {
		
	}
	
	override visit(Mapping element, Ui ui) {
		MMUIFactory.eINSTANCE.createContainer
	}
	
}