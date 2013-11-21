package mapping.visitor

import org.xtext.istic.mapUI.mapUI.MapUI
import org.xtext.istic.mapUI.mapUI.Mapping
import MMUI.Ui

interface MapUiVisitor {
	def void visit(MapUI element, Ui ui)
	def void visit(Mapping element, Ui ui)
}