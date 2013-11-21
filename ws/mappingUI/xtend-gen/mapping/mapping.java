package mapping;

import MMUI.Ui;
import mapping.visitor.MapUiVisitorImpl;
import mapping.visitor.SodaVisitorImpl;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.istic.mapUI.mapUI.MapUI;
import org.xtext.istic.soda.soDa.Soda;

@SuppressWarnings("all")
public class mapping {
  public Ui transfo(final Soda soda, @Extension final MapUI mapUi) {
    MapUiVisitorImpl _mapUiVisitorImpl = new MapUiVisitorImpl();
    MapUiVisitorImpl uiVisitor = _mapUiVisitorImpl;
    SodaVisitorImpl _sodaVisitorImpl = new SodaVisitorImpl();
    SodaVisitorImpl sodaVisitor = _sodaVisitorImpl;
    return null;
  }
}
