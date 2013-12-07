package mapping.visitor;

import MMUI.CheckBox;
import MMUI.Container;
import MMUI.Image;
import MMUI.RadioButton;
import MMUI.Son;
import MMUI.SuperContainer;
import MMUI.Ui;
import MMUI.Video;
import mapping.visitor.UiVisitor;

@SuppressWarnings("all")
public class UiVisitorImplGWT implements UiVisitor {
  public StringBuilder gwt;
  
  private String tmpContainer;
  
  private String panel;
  
  private String pan;
  
  private int nbPanel;
  
  private int nbPan;
  
  private int nbCheckBox;
  
  private int nbRadioButton;
  
  public UiVisitorImplGWT() {
    StringBuilder _stringBuilder = new StringBuilder(
      "package org.xtext.istic.testGWT.client;\r\n\r\n\t\t\t\timport com.google.gwt.core.client.EntryPoint;\r\n\t\t\t\timport com.google.gwt.user.client.ui.Label;\r\n\t\t\t\timport com.google.gwt.user.client.ui.RadioButton;\r\n\t\t\t\timport com.google.gwt.user.client.ui.RootPanel;\r\n\t\t\t\timport com.google.gwt.user.client.ui.VerticalPanel;");
    this.gwt = _stringBuilder;
  }
  
  public void entry(final Ui ui) {
    this.gwt.append(
      "public class Formulaire implements EntryPoint { \r\n\t\t\t\t\t\tpublic void onModuleLoad() {\r\n\t\t\t\t\t\t");
  }
  
  public void exit(final Ui ui) {
    this.gwt.append("} }");
  }
  
  public void entry(final SuperContainer superContainer) {
  }
  
  public void exit(final SuperContainer superContainer) {
  }
  
  public void entry(final Container container) {
    String _plus = ("TitledPanel pan" + Integer.valueOf(this.nbPan));
    String _plus_1 = (_plus + " = new TitledPanel(\"");
    String _label = container.getLabel();
    String _plus_2 = (_plus_1 + _label);
    String _plus_3 = (_plus_2 + "\");\r\n\t\t\t\t\tVerticalPanel panel");
    String _plus_4 = (_plus_3 + Integer.valueOf(this.nbPanel));
    String _plus_5 = (_plus_4 + " = new VerticalPanel();");
    this.gwt.append(_plus_5);
    String _plus_6 = ("panel" + Integer.valueOf(this.nbPanel));
    this.panel = _plus_6;
    String _plus_7 = ("pan" + Integer.valueOf(this.nbPan));
    this.pan = _plus_7;
  }
  
  public void exit(final Container container) {
    String _plus = ("pan" + Integer.valueOf(this.nbPan));
    String _plus_1 = (_plus + ".setContent(panel");
    String _plus_2 = (_plus_1 + Integer.valueOf(this.nbPanel));
    String _plus_3 = (_plus_2 + ");");
    String _plus_4 = (_plus_3 + 
      "RootPanel.get().add(pan");
    String _plus_5 = (_plus_4 + Integer.valueOf(this.nbPan));
    String _plus_6 = (_plus_5 + ");");
    this.gwt.append(_plus_6);
    int _plus_7 = (this.nbPanel + 1);
    this.nbPanel = _plus_7;
    int _plus_8 = (this.nbPan + 1);
    this.nbPan = _plus_8;
  }
  
  public void entry(final CheckBox checkbox) {
  }
  
  public void exit(final CheckBox checkbox) {
  }
  
  public void entry(final RadioButton radioButton) {
    String _plus = ("RadioButton rb" + Integer.valueOf(this.nbRadioButton));
    String _plus_1 = (_plus + " = new RadioButton(\"");
    String _group = radioButton.getGroup();
    String _plus_2 = (_plus_1 + _group);
    String _plus_3 = (_plus_2 + "\", \"");
    String _reponse = radioButton.getReponse();
    String _plus_4 = (_plus_3 + _reponse);
    String _plus_5 = (_plus_4 + "\");");
    this.gwt.append(_plus_5);
    String _plus_6 = ("panel" + Integer.valueOf(this.nbPanel));
    String _plus_7 = (_plus_6 + ".add(rb");
    String _plus_8 = (_plus_7 + Integer.valueOf(this.nbRadioButton));
    String _plus_9 = (_plus_8 + ");");
    this.gwt.append(_plus_9);
    int _plus_10 = (this.nbRadioButton + 1);
    this.nbRadioButton = _plus_10;
  }
  
  public void exit(final RadioButton radioButton) {
  }
  
  public void entry(final Image image) {
  }
  
  public void exit(final Image image) {
  }
  
  public void entry(final Son son) {
  }
  
  public void exit(final Son son) {
  }
  
  public void entry(final Video video) {
  }
  
  public void exit(final Video video) {
  }
}
