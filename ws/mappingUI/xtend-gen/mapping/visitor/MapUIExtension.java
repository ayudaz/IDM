package mapping.visitor;

import mapping.visitor.MapUiVisitor;
import org.eclipse.emf.common.util.EList;
import org.xtext.istic.mapUI.mapUI.MapUI;
import org.xtext.istic.mapUI.mapUI.Mapping;

@SuppressWarnings("all")
public class MapUIExtension {
  public void accept(final MapUI mapUI, final MapUiVisitor visitor) {
    visitor.visit(mapUI);
    EList<Mapping> _mappings = mapUI.getMappings();
    for (final Mapping m : _mappings) {
      this.accept(m, visitor);
    }
  }
  
  public void accept(final Mapping mapping, final MapUiVisitor visitor) {
    visitor.visit(mapping);
  }
}
