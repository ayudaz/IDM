package mapping.launch

import MMUI.Ui
import org.xtext.istic.mapUI.mapUI.MapUI
import org.xtext.istic.soda.soDa.Soda
import mapping.visitor.MapUiVisitorImpl
import mapping.visitor.SodaVisitorImpl
import static extension mapping.visitor.MapUIExtension.*
import static extension mapping.visitor.SodaExtension.*


static class Mapping {
// guillaume.becan@inria.fr
// https://github.com/gbecan
	def Ui transfo(extension Soda soda, extension MapUI mapUi) {
		var uiVisitor = new MapUiVisitorImpl();		
		mapUi.accept(uiVisitor)				
		var sodaVisitor = new SodaVisitorImpl(uiVisitor.map); 
		soda.accept(sodaVisitor)		
		return sodaVisitor.ui
	}
	
	
	
	

}
