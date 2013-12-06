package mapping.visitor

import MMUI.CheckBox
import MMUI.Container
import MMUI.RadioButton
import MMUI.SuperContainer
import MMUI.Ui
import MMUI.Image
import java.awt.Checkbox
import MMUI.Widget
import MMUI.Son

class UiVisitorImplHtml implements UiVisitor {
	
	public String html;
	
	new(){
		html = "";
	}
	
	override entry(Ui ui) {
		html = html + '<!doctype html> \n' +
				 		'<html lang="fr"> \n' +
				 		'<body>\n '
	}
	
	override exit(Ui ui) {
		html = html + "</body>"
	}
	
	override entry(SuperContainer superContainer) {
		html = html + '<div id="'+ superContainer.id +'">'
		if(superContainer.label != null){
			html = html + superContainer.label + '\n'
		} 
	}
	
	override exit(SuperContainer superContainer) {
		html = html + '</div>\n'
	}
	
	override entry(Container container) {
		html = html + '<form id="'+container.id+'">\n' +
				'<h3>'+container.label+'</h3>\n' +
				'<fieldset>\n'
	}
	
	override exit(Container container) {
		html = html + '</fieldset>\n'+
				'</form>\n'
	}
	
	override entry(CheckBox checkbox) {
		html = html + '<input type="checkbox" value="'+checkbox.reponse+'">' 
	}
	
	override exit(CheckBox checkbox) {
		html = html + checkbox.reponse + '</br>\n'
	}
	
	override entry(RadioButton radioButton) {
		html = html + '<input type="radio" name="'+radioButton.group+'" value="'+radioButton.reponse+'">'
	}
	
	override exit(RadioButton radioButton) {
		html = html  + radioButton.reponse + '</br>\n' 
	}
	
	override entry(Image image) {
		this.entry(image.widget)
		html = html +  '<img src="' + image.widget.reponse +'" height="42" width="42"></br> \n'
	}
	
	override exit(Image image) {
		
	}
	
	override entry(Son son) {
		this.entry(son.widget)
		html = html + '<audio controls> <source src="' + son.widget.reponse +'" /></audio>'
	}
	
	override exit(Son son) {		
	}
	
	def entry(Widget widget)
	{
		if(widget instanceof CheckBox){
				var check = widget as CheckBox
				entry(check)
			}
			else if(widget instanceof RadioButton){
				var radioButton = widget as RadioButton
				entry(radioButton)
			} else if(widget instanceof Image){
				var image = widget as Image
				entry(image)				
			}
	}
	
	
	
}