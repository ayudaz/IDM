package mapping.visitor

import org.xtext.istic.mapUI.mapUI.MapUI
import org.xtext.istic.mapUI.mapUI.Mapping
import MMUI.Ui

interface MapUiVisitor {
	def Ui visit(MapUI element, Ui ui)
	def Ui visit(Mapping element, Ui ui)
}