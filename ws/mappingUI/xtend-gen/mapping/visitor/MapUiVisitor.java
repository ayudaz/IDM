package mapping.visitor;

import org.xtext.istic.mapUI.mapUI.MapUI;
import org.xtext.istic.mapUI.mapUI.Mapping;

@SuppressWarnings("all")
public interface MapUiVisitor {
  public abstract void visit(final MapUI element);
  
  public abstract void visit(final Mapping element);
}
