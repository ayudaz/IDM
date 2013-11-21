package mapping.visitor

import org.xtext.istic.mapUI.mapUI.MapUI
import mapping.visitor.MapUiVisitor
import MMUI.Ui
import org.xtext.istic.mapUI.mapUI.Mapping

class MapUIExtension {
	
	def void accept(MapUI mapUI, MapUiVisitor visitor){
		visitor.visit(mapUI)
		for(Mapping m : mapUI.mappings){
			m.accept(visitor)
		}
	}
	
	def void accept(Mapping mapping, MapUiVisitor visitor){
		visitor.visit(mapping)
	}
}