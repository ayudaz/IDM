package mapping.visitor

import mapping.visitor.SodaVisitor
import org.xtext.istic.soda.soDa.Poll
import org.xtext.istic.soda.soDa.Question
import org.xtext.istic.soda.soDa.Option
import MMUI.MMUIFactory
import MMUI.Ui

class SodaVisitorImpl implements SodaVisitor {
	
	private static Ui ui = MMUIFactory.eINSTANCE.createUi;

	override visit(Poll element, Question question) {
		var container = MMUIFactory.eINSTANCE.createContainer
		container.nomQuestion = question.name
		
		ui.containers.add(container)
		question.options.forEach[option | 
			question.visit(option)
		]
	}
	
	override visit(Question element, Option options) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}