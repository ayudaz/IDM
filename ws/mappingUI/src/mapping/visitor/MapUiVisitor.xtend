package mapping.visitor

import org.xtext.istic.mapUI.mapUI.MapUI
import org.xtext.istic.mapUI.mapUI.Mapping

interface MapUiVisitor {
	def void visit(MapUI element)
	def void visit(Mapping element)
}