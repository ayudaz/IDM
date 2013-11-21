package mapping;

import mapping.visitor.SodaVisitor;
import org.xtext.istic.soda.soDa.Poll;

@SuppressWarnings("all")
public class SodaExtension {
  public Object accept(final Poll poll, final SodaVisitor visiteur) {
    return null;
  }
}
