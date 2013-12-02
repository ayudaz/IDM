package mapping.visitor

import java.util.HashMap
import org.xtext.istic.mapUI.mapUI.MapUI
import org.xtext.istic.mapUI.mapUI.Mapping

class MapUiVisitorImpl implements MapUiVisitor {
	
	private static HashMap<String, String> map
	
	override visit(MapUI element) {
		map = new HashMap();
	}
	
	override visit(Mapping element) {
		map.put(element.name,element.type)
	}
	
	def HashMap<String, String> getMap() {
		return map
	}
	
}