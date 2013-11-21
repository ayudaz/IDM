package mapping.visitor;

import mapping.visitor.MapUiVisitor;

@SuppressWarnings("all")
public interface MapUiElement {
  public abstract void accept(final MapUiVisitor v);
}
