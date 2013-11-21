package mapping.visitor;

import MMUI.Container;
import MMUI.MMUIFactory;
import MMUI.Ui;
import mapping.visitor.SodaVisitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.istic.soda.soDa.Option;
import org.xtext.istic.soda.soDa.Poll;
import org.xtext.istic.soda.soDa.Question;

@SuppressWarnings("all")
public class SodaVisitorImpl implements SodaVisitor {
  private static Ui ui = new Function0<Ui>() {
    public Ui apply() {
      Ui _createUi = MMUIFactory.eINSTANCE.createUi();
      return _createUi;
    }
  }.apply();
  
  public void visit(final Poll element, final Question question) {
    Container container = MMUIFactory.eINSTANCE.createContainer();
    String _name = question.getName();
    container.setNomQuestion(_name);
    EList<Container> _containers = SodaVisitorImpl.ui.getContainers();
    _containers.add(container);
    EList<Option> _options = question.getOptions();
    final Procedure1<Option> _function = new Procedure1<Option>() {
      public void apply(final Option option) {
        SodaVisitorImpl.this.visit(question, option);
      }
    };
    IterableExtensions.<Option>forEach(_options, _function);
  }
  
  public void visit(final Question element, final Option options) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("TODO: auto-generated method stub");
    throw _unsupportedOperationException;
  }
}
