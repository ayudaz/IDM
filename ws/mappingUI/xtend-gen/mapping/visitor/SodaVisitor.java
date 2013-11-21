package mapping.visitor;

import org.xtext.istic.soda.soDa.Option;
import org.xtext.istic.soda.soDa.Poll;
import org.xtext.istic.soda.soDa.Question;
import org.xtext.istic.soda.soDa.Soda;

@SuppressWarnings("all")
public interface SodaVisitor {
  public abstract void visit(final Soda soda);
  
  public abstract void visit(final Poll poll);
  
  public abstract void visit(final Question question);
  
  public abstract void visit(final Option option);
}
