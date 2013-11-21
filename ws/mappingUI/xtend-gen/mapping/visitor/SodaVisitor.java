package mapping.visitor;

import org.xtext.istic.soda.soDa.Option;
import org.xtext.istic.soda.soDa.Poll;
import org.xtext.istic.soda.soDa.Question;

@SuppressWarnings("all")
public interface SodaVisitor {
  public abstract void visit(final Poll element, final Question question);
  
  public abstract void visit(final Question element, final Option options);
}
