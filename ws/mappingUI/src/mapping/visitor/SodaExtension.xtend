package mapping.visitor

import org.xtext.istic.soda.soDa.Poll
import mapping.visitor.SodaVisitor
import org.xtext.istic.soda.soDa.Question
import org.xtext.istic.soda.soDa.Option

class SodaExtension {	
	def accept(Poll poll, SodaVisitor visiteur)
	{
		visiteur.visit(poll)
		poll.questions.forEach[question |
			question.accept(visiteur)
		]
	}
	
	def accept(Question question, SodaVisitor visiteur)
	{
		visiteur.visit(question)
		question.options.forEach[option |
			option.accept(visiteur)
		]
	}
	
	def accept(Option option, SodaVisitor visiteur)
	{
		visiteur.visit(option)
	}
}