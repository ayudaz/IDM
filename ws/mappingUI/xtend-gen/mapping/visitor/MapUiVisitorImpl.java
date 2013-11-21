package mapping.visitor;

import java.util.HashMap;
import mapping.visitor.MapUiVisitor;
import org.xtext.istic.mapUI.mapUI.MapUI;
import org.xtext.istic.mapUI.mapUI.Mapping;

@SuppressWarnings("all")
public class MapUiVisitorImpl implements MapUiVisitor {
  private static HashMap<String,String> map;
  
  public void visit(final MapUI element) {
    HashMap<String,String> _hashMap = new HashMap<String, String>();
    MapUiVisitorImpl.map = _hashMap;
  }
  
  public void visit(final Mapping element) {
    String _name = element.getName();
    String _type = element.getType();
    MapUiVisitorImpl.map.put(_name, _type);
  }
  
  public HashMap<String,String> getMap() {
    return MapUiVisitorImpl.map;
  }
}
