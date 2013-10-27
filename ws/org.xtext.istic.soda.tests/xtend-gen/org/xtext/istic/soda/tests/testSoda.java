package org.xtext.istic.soda.tests;

import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.util.Files;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.istic.soda.SoDaInjectorProvider;
import org.xtext.istic.soda.soDa.Option;
import org.xtext.istic.soda.soDa.Poll;
import org.xtext.istic.soda.soDa.Question;
import org.xtext.istic.soda.soDa.Soda;

@InjectWith(SoDaInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class testSoda {
  @Inject
  private ParseHelper<Soda> parser;
  
  @Test
  public void parseSodaE1() {
    try {
      final String fichier = Files.readFileIntoString("ressources/e1.soda");
      final Soda soda = this.parser.parse(fichier);
      EList<Poll> _polls = soda.getPolls();
      final Poll poll = _polls.get(0);
      String _name = poll.getName();
      Assert.assertNull(_name);
      EList<Question> _questions = poll.getQuestions();
      final Question question = _questions.get(0);
      String _name_1 = question.getName();
      Assert.assertNull(_name_1);
      String _query = question.getQuery();
      Assert.assertEquals(_query, "Q ?");
      EList<Option> _options = question.getOptions();
      Option _get = _options.get(0);
      String _reponse = _get.getReponse();
      Assert.assertEquals(_reponse, "Oui");
      EList<Option> _options_1 = question.getOptions();
      Option _get_1 = _options_1.get(1);
      String _reponse_1 = _get_1.getReponse();
      Assert.assertEquals(_reponse_1, "Non");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseSodaE2() {
    try {
      final String fichier = Files.readFileIntoString("ressources/e2.soda");
      final Soda soda = this.parser.parse(fichier);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
