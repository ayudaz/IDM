package mapping.launch;

import MMUI.Ui;
import java.util.HashMap;
import mapping.visitor.MapUIExtension;
import mapping.visitor.MapUiVisitorImpl;
import mapping.visitor.SodaExtension;
import mapping.visitor.SodaVisitorImpl;
import mapping.visitor.UiExtension;
import mapping.visitor.UiVisitorImplHtml;
import org.xtext.istic.mapUI.mapUI.MapUI;
import org.xtext.istic.soda.soDa.Soda;

@SuppressWarnings("all")
public class Mapping {
  public Ui transfo(final Soda soda, final MapUI mapUi) {
    MapUiVisitorImpl _mapUiVisitorImpl = new MapUiVisitorImpl();
    MapUiVisitorImpl mapUiVisitor = _mapUiVisitorImpl;
    MapUIExtension.accept(mapUi, mapUiVisitor);
    HashMap<String,String> _map = mapUiVisitor.getMap();
    SodaVisitorImpl _sodaVisitorImpl = new SodaVisitorImpl(_map);
    SodaVisitorImpl sodaVisitor = _sodaVisitorImpl;
    SodaExtension.accept(soda, sodaVisitor);
    return sodaVisitor.ui;
  }
  
  public String generation(final Ui ui) {
    UiVisitorImplHtml _uiVisitorImplHtml = new UiVisitorImplHtml();
    UiVisitorImplHtml htmlUiVisiteur = _uiVisitorImplHtml;
    UiExtension.accept(ui, htmlUiVisiteur);
    return htmlUiVisiteur.html;
  }
}
