package mapping.visitor;

import MMUI.MMUIFactory;
import MMUI.Ui;
import mapping.visitor.MapUiVisitor;
import org.xtext.istic.mapUI.mapUI.MapUI;
import org.xtext.istic.mapUI.mapUI.Mapping;

@SuppressWarnings("all")
public class MapUiVisitorImpl implements MapUiVisitor {
  public void visit(final MapUI element, final Ui ui) {
  }
  
  public void visit(final Mapping element, final Ui ui) {
    MMUIFactory.eINSTANCE.createContainer();
  }
}
