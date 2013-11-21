package mapping.visitor;

import MMUI.Ui;
import org.xtext.istic.mapUI.mapUI.MapUI;
import org.xtext.istic.mapUI.mapUI.Mapping;

@SuppressWarnings("all")
public interface MapUiVisitor {
  public abstract Ui visit(final MapUI element, final Ui ui);
  
  public abstract Ui visit(final Mapping element, final Ui ui);
}
