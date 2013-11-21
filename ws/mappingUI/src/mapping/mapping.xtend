package mapping

import MMUI.Ui
import org.xtext.istic.mapUI.mapUI.MapUI
import org.xtext.istic.soda.soDa.Soda
import mapping.visitor.MapUiVisitorImpl
import mapping.visitor.SodaVisitorImpl
import static extension mapping.visitor.MapUIExtension
import static extension mapping.visitor.SodaExtension
import MMUI.MMUIFactory

class mapping {
// guillaume.becan@inria.fr
// https://github.com/gbecan
	def Ui transfo(Soda soda, extension MapUI mapUi) {
		var uiVisitor = new MapUiVisitorImpl();
		var sodaVisitor = new SodaVisitorImpl(); 
		
		return null;
	}

}
