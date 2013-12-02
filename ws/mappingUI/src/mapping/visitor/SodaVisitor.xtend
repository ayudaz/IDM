package mapping.visitor

import org.xtext.istic.soda.soDa.Option
import org.xtext.istic.soda.soDa.Poll
import org.xtext.istic.soda.soDa.Question
import org.xtext.istic.soda.soDa.Soda

public interface SodaVisitor {
	def void visit(Soda soda)
	def void visit(Poll poll)
	def void visit(Question question)
	def void visit(Option option)	
}