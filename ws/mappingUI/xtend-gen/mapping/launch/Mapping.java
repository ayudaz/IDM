package mapping.launch;

import MMUI.Ui;
import java.util.HashMap;
import mapping.visitor.MapUIExtension;
import mapping.visitor.MapUiVisitorImpl;
import mapping.visitor.SodaExtension;
import mapping.visitor.SodaVisitorImpl;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.istic.mapUI.mapUI.MapUI;
import org.xtext.istic.soda.soDa.Soda;

@SuppressWarnings("all")
public class Mapping {
  public Ui transfo(@Extension final Soda soda, @Extension final MapUI mapUi) {
    MapUiVisitorImpl _mapUiVisitorImpl = new MapUiVisitorImpl();
    MapUiVisitorImpl uiVisitor = _mapUiVisitorImpl;
    MapUIExtension.accept(mapUi, uiVisitor);
    HashMap<String,String> _map = uiVisitor.getMap();
    SodaVisitorImpl _sodaVisitorImpl = new SodaVisitorImpl(_map);
    SodaVisitorImpl sodaVisitor = _sodaVisitorImpl;
    SodaExtension.accept(soda, sodaVisitor);
    return sodaVisitor.ui;
  }
}
