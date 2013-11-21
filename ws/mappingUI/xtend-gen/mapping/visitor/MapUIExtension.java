package mapping.visitor;

import MMUI.Ui;
import mapping.visitor.MapUiVisitor;
import org.eclipse.emf.common.util.EList;
import org.xtext.istic.mapUI.mapUI.MapUI;
import org.xtext.istic.mapUI.mapUI.Mapping;

@SuppressWarnings("all")
public class MapUIExtension {
  public void accept(final MapUI mapUI, final MapUiVisitor visitor, final Ui ui) {
    visitor.visit(mapUI, ui);
    EList<Mapping> _mappings = mapUI.getMappings();
    for (final Mapping m : _mappings) {
      this.accept(m, visitor, ui);
    }
  }
  
  public void accept(final Mapping mapping, final MapUiVisitor visitor, final Ui ui) {
    visitor.visit(mapping, ui);
  }
}
