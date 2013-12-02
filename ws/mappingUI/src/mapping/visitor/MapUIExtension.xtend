package mapping.visitor

import org.xtext.istic.mapUI.mapUI.MapUI
import org.xtext.istic.mapUI.mapUI.Mapping

static class MapUIExtension {
	
	def static void accept(MapUI mapUI, MapUiVisitor visitor){
		visitor.visit(mapUI)
		for(Mapping m : mapUI.mappings){
			m.accept(visitor)
		}
		
	}
	
	def static void accept(Mapping mapping, MapUiVisitor visitor){
		visitor.visit(mapping)		
	}
}