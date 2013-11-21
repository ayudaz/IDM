package mapping.visitor

import org.xtext.istic.soda.soDa.Poll
import mapping.visitor.SodaVisitor
import org.xtext.istic.soda.soDa.Question
import org.xtext.istic.soda.soDa.Option
import org.xtext.istic.soda.soDa.Soda

static class SodaExtension {
		
		
	def static void accept(Soda soda, SodaVisitor visiteur)
	{
		visiteur.visit(soda)
		soda.polls.forEach[ poll |
			poll.accept(visiteur)
		]
	}
	
	def static void accept(Poll poll, SodaVisitor visiteur)
	{
		visiteur.visit(poll)
		poll.questions.forEach[question |
			question.accept(visiteur)
		]
	}
	
	def static void accept(Question question, SodaVisitor visiteur)
	{
		visiteur.visit(question)
		question.options.forEach[option |
			option.accept(visiteur)
		]
	}
	
	def static void accept(Option option, SodaVisitor visiteur)
	{
		visiteur.visit(option)
	}
}