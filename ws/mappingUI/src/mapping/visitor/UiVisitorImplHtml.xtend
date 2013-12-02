package mapping.visitor

import MMUI.CheckBox
import MMUI.Container
import MMUI.RadioButton
import MMUI.SuperContainer
import MMUI.Ui

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
		html = html + '<input type="checkbox" value="'+checkbox.reponse+'">' + checkbox.reponse + '</br>\n'
	}
	
	override exit(CheckBox checkbox) {
	}
	
	override entry(RadioButton radioButton) {
		html = html + '<input type="radio" name="'+radioButton.group+'" value="'+radioButton.reponse+'">' + radioButton.reponse + '</br>\n' 
	}
	
	override exit(RadioButton radioButton) {
	}
	
	
}