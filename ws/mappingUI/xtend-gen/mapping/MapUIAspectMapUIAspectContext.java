package mapping;

import java.util.Map;
import mapping.MapUIAspectMapUIAspectProperties;
import org.xtext.istic.mapUI.mapUI.MapUI;

@SuppressWarnings("all")
public class MapUIAspectMapUIAspectContext {
  public final static MapUIAspectMapUIAspectContext INSTANCE = new MapUIAspectMapUIAspectContext();
  
  public static MapUIAspectMapUIAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<MapUI,MapUIAspectMapUIAspectProperties> map = new java.util.HashMap<MapUI, mapping.MapUIAspectMapUIAspectProperties>();
  
  public Map<MapUI,MapUIAspectMapUIAspectProperties> getMap() {
    return map;
  }
}
