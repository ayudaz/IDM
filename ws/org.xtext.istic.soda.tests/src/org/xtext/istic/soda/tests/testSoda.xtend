package org.xtext.istic.soda.tests

import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.xtext.istic.soda.SoDaInjectorProvider
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.util.ParseHelper
import javax.inject.Inject
import static org.junit.Assert.*
import org.junit.Test
import org.xtext.istic.soda.soDa.Soda
import org.eclipse.xtext.util.Files

@InjectWith(SoDaInjectorProvider)
@RunWith(XtextRunner)
class testSoda {
	
	@Inject
	ParseHelper<Soda> parser
	
	@Test
	def void parseSodaE1() {
		val fichier = Files.readFileIntoString("ressources/e1.soda")
		val soda = parser.parse(fichier)
		val poll = soda.polls.get(0)
		assertNull(poll.name)
		val question = poll.questions.get(0)
		assertNull(question.name)
		assertEquals(question.query, "Q ?")
		assertEquals(question.options.get(0).reponse, "Oui")
		assertEquals(question.options.get(1).reponse, "Non")
	}
	
	@Test
	def void parseSodaE2() {
		val fichier = Files.readFileIntoString("ressources/e2.soda")
		val soda = parser.parse(fichier)
		
	}
}