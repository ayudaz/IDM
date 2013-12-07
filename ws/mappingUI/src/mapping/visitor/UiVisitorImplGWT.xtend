package mapping.visitor

import MMUI.Ui
import MMUI.SuperContainer
import MMUI.Container
import MMUI.CheckBox
import MMUI.RadioButton
import MMUI.Image
import MMUI.Son
import MMUI.Video
import MMUI.Widget

class UiVisitorImplGWT implements UiVisitor {
	public StringBuilder gwt;
	
	private String rb = 'rb'
	private String cb = 'cb'
	
	private String tmpContainer
	private String panel
	private String pan
	private String image
	private String horizontalPan
	private String current
	private String sizeImg = '"100px","10em"'
	
	private int nbHorizontalPan
	private int nbImage
	private int nbPanel
	private int nbPan
	private int nbCheckBox
	private int nbRadioButton

	new() {
		gwt = new StringBuilder(
			"package org.istic.idm.gwt.client;

				import com.google.gwt.core.client.EntryPoint;
				import com.google.gwt.user.client.ui.Label;
				import com.google.gwt.user.client.ui.RadioButton;
				import com.google.gwt.user.client.ui.CheckBox;
				import com.google.gwt.user.client.ui.RootPanel;
				import com.google.gwt.user.client.ui.VerticalPanel;
				import com.google.gwt.user.client.ui.HorizontalPanel;
				import com.google.gwt.user.client.ui.Image;")
	}

	override entry(Ui ui) {
		gwt.append(
			"public class FormulaireGWT implements EntryPoint { 
						public void onModuleLoad() {
						")

	}

	override exit(Ui ui) {
		gwt.append("} }")
	}

	override entry(SuperContainer superContainer) {
		//rien pr le moment
	}

	override exit(SuperContainer superContainer) {
		//rien pr le moment
	}

	override entry(Container container) {

		gwt.append(
			"TitledPanel pan" + nbPan + " = new TitledPanel(\"" + container.label + "\");
					VerticalPanel panel" + nbPanel + " = new VerticalPanel();")

		panel = "panel" + nbPanel
		pan = "pan" + nbPan
	}

	override exit(Container container) {
		gwt.append(
			"pan" + nbPan + ".setContent(panel" + nbPanel + ");" +
			 "RootPanel.get().add(pan" + nbPan + ");"
		)
		nbPanel = nbPanel + 1
		nbPan = nbPan + 1;
	}

	override entry(CheckBox checkbox) {
		current = cb+nbCheckBox
		gwt.append('CheckBox '+cb+nbCheckBox+' = new CheckBox();')
		
	}

	override exit(CheckBox checkbox) {
		gwt.append(cb+nbCheckBox+'.setText("'+ checkbox.reponse+'");')
		gwt.append('panel'+nbPanel+'.add('+cb+nbCheckBox+');')
		nbCheckBox  = nbCheckBox+1;
	}

	override entry(RadioButton radioButton) {
		current = rb+nbRadioButton
		gwt.append('RadioButton '+rb+nbRadioButton+' = new RadioButton("'+radioButton.group+'","");')
		 
	}

	override exit(RadioButton radioButton) {
		gwt.append(rb+nbRadioButton+'.setText( "'+radioButton.reponse+'" );')
		gwt.append('panel'+nbPanel+'.add('+rb+nbRadioButton+');')
		nbRadioButton  = nbRadioButton+1; 
	}

	override entry(Image image) {
		this.entry(image.widget)
		//on créer un horizontal panel pour mettre la checkbox
		gwt.append( 'HorizontalPanel hpanel'+nbHorizontalPan+' = new HorizontalPanel();')
        gwt.append('hpanel'+nbHorizontalPan+'.add( '+current + ' );')
		//puis l'image
		gwt.append('Image img'+nbImage+' = new Image();')
		gwt.append('img'+nbImage+'.setUrl("'+image.widget.reponse+'");')
		gwt.append('hpanel'+nbHorizontalPan+'.add( img'+nbImage+ ' );')	
		gwt.append('panel'+nbPanel+'.add( hpanel'+nbHorizontalPan+');')
		gwt.append('img'+nbImage+'.setSize('+sizeImg+');')
	}

	override exit(Image image) {
		nbHorizontalPan = nbHorizontalPan +1
		nbImage = nbImage+1
	}

	override entry(Son son) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override exit(Son son) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override entry(Video video) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override exit(Video video) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
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
