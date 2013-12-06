package mapping.visitor

import MMUI.CheckBox
import MMUI.Container
import MMUI.MMUIFactory
import MMUI.SuperContainer
import MMUI.Ui
import MMUI.Widget
import java.util.HashMap
import org.xtext.istic.soda.soDa.Option
import org.xtext.istic.soda.soDa.Poll
import org.xtext.istic.soda.soDa.Question
import org.xtext.istic.soda.soDa.Soda
import MMUI.RadioButton
import MMUI.Image
import MMUI.Son

class SodaVisitorImpl implements SodaVisitor {

	public Ui ui = MMUIFactory.eINSTANCE.createUi
	private HashMap<String, String> map;

	new(HashMap<String, String> map) {
		this.map = map
	}

	override visit(Soda soda) {
		ui.body = MMUIFactory.eINSTANCE.createSuperContainer
	}

	override visit(Poll poll) {
		var body = ui.body as SuperContainer
		body.containers.add(MMUIFactory.eINSTANCE.createSuperContainer)
	}

	override visit(Question question) {
		var body = ui.body as SuperContainer
		var containerPoll = body.containers.last as SuperContainer

		var container = MMUIFactory.eINSTANCE.createContainer
		container.id = question.name
		container.label = question.query

		containerPoll.containers.add(container)
	}

	override visit(Option option) {
		var body = ui.body as SuperContainer
		var containerPoll = body.containers.last as SuperContainer
		var containerQuestion = containerPoll.containers.last as Container
	
		var Widget widget = null;
		switch map.get(option.id) {
			case "CheckBox": {
				widget = MMUIFactory.eINSTANCE.createCheckBox
				var tmp = widget as CheckBox
				tmp.reponse = option.reponse
			}
			case "RadioButton": {
				widget = MMUIFactory.eINSTANCE.createRadioButton
				var tmp = widget as RadioButton
				tmp.reponse = option.reponse
				tmp.group = containerQuestion.id
			}
			case "ImageCheck" : {
				widget = MMUIFactory.eINSTANCE.createImage
				var checkbox = MMUIFactory.eINSTANCE.createCheckBox
				checkbox.reponse = option.reponse
				var tmp = widget as Image
				tmp.widget = checkbox
			}
			case "ImageRadio" : {
				widget = MMUIFactory.eINSTANCE.createImage
				var radio = MMUIFactory.eINSTANCE.createRadioButton
				radio.reponse = option.reponse
				var tmp = widget as Image
				tmp.widget = radio
			}
			case "SonRadio" : {
				widget = MMUIFactory.eINSTANCE.createSon
				var radio = MMUIFactory.eINSTANCE.createRadioButton
				radio.reponse = option.reponse
				var tmp = widget as Son
				tmp.widget = radio
			}
			case "SonCheck" : {
				widget = MMUIFactory.eINSTANCE.createSon
				var checkbox = MMUIFactory.eINSTANCE.createCheckBox
				checkbox.reponse = option.reponse
				var tmp = widget as Son
				tmp.widget = checkbox
			}
			
			default : {
				widget = MMUIFactory.eINSTANCE.createCheckBox
				var tmp = widget as CheckBox
				tmp.reponse = option.reponse				
				}
		}

		if (widget != null)
		{
			containerQuestion.widgets.add(widget)
			System.out.println(widget.class.name)	
		}
	}
}
