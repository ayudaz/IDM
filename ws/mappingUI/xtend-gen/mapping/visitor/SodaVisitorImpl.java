package mapping.visitor;

import MMUI.MMUIFactory;
import MMUI.Ui;
import java.util.ArrayList;
import java.util.List;
import mapping.visitor.SodaVisitor;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.xtext.istic.soda.soDa.Option;
import org.xtext.istic.soda.soDa.Poll;
import org.xtext.istic.soda.soDa.Question;
import org.xtext.istic.soda.soDa.Soda;

@SuppressWarnings("all")
public class SodaVisitorImpl implements SodaVisitor {
  private static List<Ui> ui = new Function0<List<Ui>>() {
    public List<Ui> apply() {
      ArrayList<Ui> _arrayList = new ArrayList<Ui>();
      return _arrayList;
    }
  }.apply();
  
  private static int indice = 0;
  
  public void visit(final Soda soda) {
    Ui _createUi = MMUIFactory.eINSTANCE.createUi();
    SodaVisitorImpl.ui.add(_createUi);
    int _plus = (SodaVisitorImpl.indice + 1);
    SodaVisitorImpl.indice = _plus;
  }
  
  public void visit(final Poll poll) {
  }
  
  public void visit(final Question question) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method containers is undefined for the type SodaVisitorImpl"
      + "\nInvalid number of arguments. The method visit(Question) is not applicable for the arguments (Question,Option)"
      + "\nadd cannot be resolved");
  }
  
  public void visit(final Option option) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("TODO: auto-generated method stub");
    throw _unsupportedOperationException;
  }
}
