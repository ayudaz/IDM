package mapping.visitor;

import mapping.visitor.SodaVisitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.istic.soda.soDa.Option;
import org.xtext.istic.soda.soDa.Poll;
import org.xtext.istic.soda.soDa.Question;

@SuppressWarnings("all")
public class SodaExtension {
  public void accept(final Poll poll, final SodaVisitor visiteur) {
    visiteur.visit(poll);
    EList<Question> _questions = poll.getQuestions();
    final Procedure1<Question> _function = new Procedure1<Question>() {
      public void apply(final Question question) {
        SodaExtension.this.accept(question, visiteur);
      }
    };
    IterableExtensions.<Question>forEach(_questions, _function);
  }
  
  public void accept(final Question question, final SodaVisitor visiteur) {
    visiteur.visit(question);
    EList<Option> _options = question.getOptions();
    final Procedure1<Option> _function = new Procedure1<Option>() {
      public void apply(final Option option) {
        SodaExtension.this.accept(option, visiteur);
      }
    };
    IterableExtensions.<Option>forEach(_options, _function);
  }
  
  public void accept(final Option option, final SodaVisitor visiteur) {
    visiteur.visit(option);
  }
}
