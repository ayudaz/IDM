package mapping.visitor

import MMUI.Ui
import MMUI.SuperContainer
import MMUI.Container
import MMUI.CheckBox
import MMUI.RadioButton
import MMUI.Image
import MMUI.Son
import MMUI.Video

class UiVisitorImplGWT implements UiVisitor {
	public StringBuilder gwt;
	private String tmpContainer
	private String panel
	private String pan
	private int nbPanel
	private int nbPan
	private int nbCheckBox
	private int nbRadioButton

	new() {
		gwt = new StringBuilder(
			"package org.xtext.istic.testGWT.client;

				import com.google.gwt.core.client.EntryPoint;
				import com.google.gwt.user.client.ui.Label;
				import com.google.gwt.user.client.ui.RadioButton;
				import com.google.gwt.user.client.ui.RootPanel;
				import com.google.gwt.user.client.ui.VerticalPanel;")
	}

	override entry(Ui ui) {
		gwt.append(
			"public class Formulaire implements EntryPoint { 
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
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override exit(CheckBox checkbox) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override entry(RadioButton radioButton) {
		gwt.append('RadioButton rb'+nbRadioButton+' = new RadioButton("'+radioButton.group+'", "'+radioButton.reponse+'");')
		gwt.append('panel'+nbPanel+'.add(rb'+nbRadioButton+');')
		nbRadioButton  = nbRadioButton+1;  
	}

	override exit(RadioButton radioButton) {
		
	}

	override entry(Image image) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override exit(Image image) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
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

}
