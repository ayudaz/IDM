package mapping.visitor

import mapping.visitor.MapUiVisitor
import org.xtext.istic.mapUI.mapUI.MapUI
import MMUI.Ui
import org.xtext.istic.mapUI.mapUI.Mapping
import MMUI.MMUIFactory
import java.util.HashMap

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