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
		switch map.get(containerQuestion.id) {
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
		}

		if (widget != null)
			containerQuestion.widgets.add(widget)
	}
}
