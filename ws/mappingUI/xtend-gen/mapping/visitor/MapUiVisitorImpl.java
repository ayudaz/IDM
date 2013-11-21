package mapping.visitor;

import java.util.HashMap;
import mapping.visitor.MapUiVisitor;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.xtext.istic.mapUI.mapUI.MapUI;
import org.xtext.istic.mapUI.mapUI.Mapping;

@SuppressWarnings("all")
public class MapUiVisitorImpl implements MapUiVisitor {
  private static HashMap<String,String> map = new Function0<HashMap<String,String>>() {
    public HashMap<String,String> apply() {
      HashMap<String,String> _hashMap = new HashMap<String, String>();
      return _hashMap;
    }
  }.apply();
  
  public void visit(final MapUI element) {
  }
  
  public void visit(final Mapping element) {
    String _name = element.getName();
    String _type = element.getType();
    MapUiVisitorImpl.map.put(_name, _type);
  }
}
