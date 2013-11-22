package mapping.launch

import MMUI.Ui
import org.xtext.istic.mapUI.mapUI.MapUI
import org.xtext.istic.soda.soDa.Soda
import mapping.visitor.MapUiVisitorImpl
import mapping.visitor.SodaVisitorImpl
import static extension mapping.visitor.MapUIExtension.*
import static extension mapping.visitor.SodaExtension.*


class Mapping {
// guillaume.becan@inria.fr
// https://github.com/gbecan
	def Ui transfo(Soda soda, MapUI mapUi) {
		var mapUiVisitor = new MapUiVisitorImpl();		
		mapUi.accept(mapUiVisitor)				
		var sodaVisitor = new SodaVisitorImpl(mapUiVisitor.map); 
		soda.accept(sodaVisitor)		
		return sodaVisitor.ui
	}
	
	def String generation(Ui ui) {
		
	}
	
	
	
	

}
