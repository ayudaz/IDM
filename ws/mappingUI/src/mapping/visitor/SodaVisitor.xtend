package mapping.visitor

import org.xtext.istic.soda.soDa.Poll
import org.xtext.istic.soda.soDa.Question
import org.xtext.istic.soda.soDa.Option
import MMUI.Ui

public interface SodaVisitor {
	def void visit(Poll element, Question question)
	def void visit(Question element, Option options)	
}