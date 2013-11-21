package mapping.visitor

import mapping.visitor.SodaVisitor
import org.xtext.istic.soda.soDa.Poll
import org.xtext.istic.soda.soDa.Question
import org.xtext.istic.soda.soDa.Option
import MMUI.MMUIFactory
import MMUI.Ui
import org.xtext.istic.soda.soDa.Soda
import java.util.List
import java.util.ArrayList

class SodaVisitorImpl implements SodaVisitor {

	private static List<Ui> ui = new ArrayList<Ui>()
	private static int indice=0	

	override visit(Soda soda) {
		ui.add(MMUIFactory.eINSTANCE.createUi)
		indice = indice +1 ;
	}

	override visit(Poll poll) {
		
	}

	override visit(Question question) {
		var container = MMUIFactory.eINSTANCE.createContainer
		container.nomQuestion = question.name

		ui.containers.add(container)
		question.options.forEach [ option |
			question.visit(option)
		]
	}

	override visit(Option option) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	

}
