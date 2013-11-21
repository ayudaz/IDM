package mapping.visitor

import org.xtext.istic.mapUI.mapUI.MapUI
import mapping.visitor.MapUiVisitor
import MMUI.Ui
import org.xtext.istic.mapUI.mapUI.Mapping

class MapUIExtension {
	
	def void accept(MapUI mapUI, MapUiVisitor visitor, Ui ui){
		visitor.visit(mapUI, ui)
		for(Mapping m : mapUI.mappings){
			m.accept(visitor, ui)
		}
	}
	
	def void accept(Mapping mapping, MapUiVisitor visitor, Ui ui){
		visitor.visit(mapping, ui)
	}
}