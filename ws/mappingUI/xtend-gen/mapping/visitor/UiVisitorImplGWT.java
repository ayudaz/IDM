package mapping.visitor;

import MMUI.CheckBox;
import MMUI.Container;
import MMUI.Image;
import MMUI.RadioButton;
import MMUI.Son;
import MMUI.SuperContainer;
import MMUI.Ui;
import MMUI.Video;
import MMUI.Widget;
import mapping.visitor.UiVisitor;

@SuppressWarnings("all")
public class UiVisitorImplGWT implements UiVisitor {
  public StringBuilder gwt;
  
  private String rb = "rb";
  
  private String cb = "cb";
  
  private String tmpContainer;
  
  private String panel;
  
  private String pan;
  
  private String image;
  
  private String horizontalPan;
  
  private String current;
  
  private String sizeImg = "\"100px\",\"10em\"";
  
  private int nbHorizontalPan;
  
  private int nbImage;
  
  private int nbPanel;
  
  private int nbPan;
  
  private int nbCheckBox;
  
  private int nbRadioButton;
  
  private int nbSon;
  
  private int nbVideo;
  
  public UiVisitorImplGWT() {
    StringBuilder _stringBuilder = new StringBuilder(
      "package org.istic.idm.gwt.client;\r\n\t\t\t\timport com.google.gwt.media.client.Video;\t\r\n\t\t\t\timport com.google.gwt.media.client.Audio;\r\n\t\t\t\timport com.google.gwt.core.client.EntryPoint;\r\n\t\t\t\timport com.google.gwt.user.client.ui.Label;\r\n\t\t\t\timport com.google.gwt.user.client.ui.RadioButton;\r\n\t\t\t\timport com.google.gwt.user.client.ui.CheckBox;\r\n\t\t\t\timport com.google.gwt.user.client.ui.RootPanel;\r\n\t\t\t\timport com.google.gwt.user.client.ui.VerticalPanel;\r\n\t\t\t\timport com.google.gwt.user.client.ui.HorizontalPanel;\r\n\t\t\t\timport com.google.gwt.user.client.ui.Image;");
    this.gwt = _stringBuilder;
  }
  
  public void entry(final Ui ui) {
    this.gwt.append(
      "public class FormulaireGWT implements EntryPoint { \r\n\t\t\t\t\t\tpublic void onModuleLoad() {\r\n\t\t\t\t\t\t");
  }
  
  public void exit(final Ui ui) {
    this.gwt.append("}\r\n\r\n\t\t\t public static Audio createAudio(String url)\r\n\t\t\t    {\r\n\t\t\t        Audio audio = Audio.createIfSupported();\r\n\t\t\t        if(audio==null)\r\n\t\t\t            return null;\r\n\t\t\t        \r\n\t\t\t        audio.setSrc( url );\r\n\t\t\t       \r\n\t\t\t        audio.setControls( true );\r\n\t\t\t        return audio;        \r\n\t\t\t        \r\n\t\t\t    } \r\n\r\n\t\t\t public static Video createVideo( String url )\r\n\t\t\t    {\r\n\t\t\t        Video video = Video.createIfSupported();\r\n\t\t\t        if ( video == null )\r\n\t\t\t            return null;\r\n\t\t\t\r\n\t\t\t        video.setSrc( url );\r\n\t\t\t\r\n\t\t\t        video.setControls( true );\r\n\t\t\t        return video;\r\n\t\t\t    }}");
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
    String _plus = (this.cb + Integer.valueOf(this.nbCheckBox));
    this.current = _plus;
    String _plus_1 = ("CheckBox " + this.cb);
    String _plus_2 = (_plus_1 + Integer.valueOf(this.nbCheckBox));
    String _plus_3 = (_plus_2 + " = new CheckBox();");
    this.gwt.append(_plus_3);
  }
  
  public void exit(final CheckBox checkbox) {
    String _plus = (this.cb + Integer.valueOf(this.nbCheckBox));
    String _plus_1 = (_plus + ".setText(\"");
    String _reponse = checkbox.getReponse();
    String _plus_2 = (_plus_1 + _reponse);
    String _plus_3 = (_plus_2 + "\");");
    this.gwt.append(_plus_3);
    String _plus_4 = ("panel" + Integer.valueOf(this.nbPanel));
    String _plus_5 = (_plus_4 + ".add(");
    String _plus_6 = (_plus_5 + this.cb);
    String _plus_7 = (_plus_6 + Integer.valueOf(this.nbCheckBox));
    String _plus_8 = (_plus_7 + ");");
    this.gwt.append(_plus_8);
    int _plus_9 = (this.nbCheckBox + 1);
    this.nbCheckBox = _plus_9;
  }
  
  public void entry(final RadioButton radioButton) {
    String _plus = (this.rb + Integer.valueOf(this.nbRadioButton));
    this.current = _plus;
    String _plus_1 = ("RadioButton " + this.rb);
    String _plus_2 = (_plus_1 + Integer.valueOf(this.nbRadioButton));
    String _plus_3 = (_plus_2 + " = new RadioButton(\"");
    String _group = radioButton.getGroup();
    String _plus_4 = (_plus_3 + _group);
    String _plus_5 = (_plus_4 + "\",\"\");");
    this.gwt.append(_plus_5);
  }
  
  public void exit(final RadioButton radioButton) {
    String _plus = (this.rb + Integer.valueOf(this.nbRadioButton));
    String _plus_1 = (_plus + ".setText( \"");
    String _reponse = radioButton.getReponse();
    String _plus_2 = (_plus_1 + _reponse);
    String _plus_3 = (_plus_2 + "\" );");
    this.gwt.append(_plus_3);
    String _plus_4 = ("panel" + Integer.valueOf(this.nbPanel));
    String _plus_5 = (_plus_4 + ".add(");
    String _plus_6 = (_plus_5 + this.rb);
    String _plus_7 = (_plus_6 + Integer.valueOf(this.nbRadioButton));
    String _plus_8 = (_plus_7 + ");");
    this.gwt.append(_plus_8);
    int _plus_9 = (this.nbRadioButton + 1);
    this.nbRadioButton = _plus_9;
  }
  
  public void entry(final Image image) {
    Widget _widget = image.getWidget();
    this.entry(_widget);
    String _plus = ("HorizontalPanel hpanel" + Integer.valueOf(this.nbHorizontalPan));
    String _plus_1 = (_plus + " = new HorizontalPanel();");
    this.gwt.append(_plus_1);
    String _plus_2 = ("hpanel" + Integer.valueOf(this.nbHorizontalPan));
    String _plus_3 = (_plus_2 + ".add( ");
    String _plus_4 = (_plus_3 + this.current);
    String _plus_5 = (_plus_4 + " );");
    this.gwt.append(_plus_5);
    String _plus_6 = ("Image img" + Integer.valueOf(this.nbImage));
    String _plus_7 = (_plus_6 + " = new Image();");
    this.gwt.append(_plus_7);
    String _plus_8 = ("img" + Integer.valueOf(this.nbImage));
    String _plus_9 = (_plus_8 + ".setUrl(\"");
    Widget _widget_1 = image.getWidget();
    String _reponse = _widget_1.getReponse();
    String _plus_10 = (_plus_9 + _reponse);
    String _plus_11 = (_plus_10 + "\");");
    this.gwt.append(_plus_11);
    String _plus_12 = ("hpanel" + Integer.valueOf(this.nbHorizontalPan));
    String _plus_13 = (_plus_12 + ".add( img");
    String _plus_14 = (_plus_13 + Integer.valueOf(this.nbImage));
    String _plus_15 = (_plus_14 + " );");
    this.gwt.append(_plus_15);
    String _plus_16 = ("panel" + Integer.valueOf(this.nbPanel));
    String _plus_17 = (_plus_16 + ".add( hpanel");
    String _plus_18 = (_plus_17 + Integer.valueOf(this.nbHorizontalPan));
    String _plus_19 = (_plus_18 + ");");
    this.gwt.append(_plus_19);
    String _plus_20 = ("img" + Integer.valueOf(this.nbImage));
    String _plus_21 = (_plus_20 + ".setSize(");
    String _plus_22 = (_plus_21 + this.sizeImg);
    String _plus_23 = (_plus_22 + ");");
    this.gwt.append(_plus_23);
  }
  
  public void exit(final Image image) {
    int _plus = (this.nbHorizontalPan + 1);
    this.nbHorizontalPan = _plus;
    int _plus_1 = (this.nbImage + 1);
    this.nbImage = _plus_1;
  }
  
  public void entry(final Son son) {
    Widget _widget = son.getWidget();
    this.entry(_widget);
    String _plus = ("HorizontalPanel hpanel" + Integer.valueOf(this.nbHorizontalPan));
    String _plus_1 = (_plus + " = new HorizontalPanel();");
    this.gwt.append(_plus_1);
    String _plus_2 = ("hpanel" + Integer.valueOf(this.nbHorizontalPan));
    String _plus_3 = (_plus_2 + ".add( ");
    String _plus_4 = (_plus_3 + this.current);
    String _plus_5 = (_plus_4 + " );");
    this.gwt.append(_plus_5);
    String _plus_6 = ("Audio audio" + Integer.valueOf(this.nbSon));
    String _plus_7 = (_plus_6 + " = createAudio( \"");
    Widget _widget_1 = son.getWidget();
    String _reponse = _widget_1.getReponse();
    String _plus_8 = (_plus_7 + _reponse);
    String _plus_9 = (_plus_8 + "\" );");
    this.gwt.append(_plus_9);
    String _plus_10 = ("hpanel" + Integer.valueOf(this.nbHorizontalPan));
    String _plus_11 = (_plus_10 + ".add( audio");
    String _plus_12 = (_plus_11 + Integer.valueOf(this.nbSon));
    String _plus_13 = (_plus_12 + " );");
    this.gwt.append(_plus_13);
    String _plus_14 = ("panel" + Integer.valueOf(this.nbPanel));
    String _plus_15 = (_plus_14 + ".add( hpanel");
    String _plus_16 = (_plus_15 + Integer.valueOf(this.nbHorizontalPan));
    String _plus_17 = (_plus_16 + ");");
    this.gwt.append(_plus_17);
  }
  
  public void exit(final Son son) {
    int _plus = (this.nbHorizontalPan + 1);
    this.nbHorizontalPan = _plus;
    int _plus_1 = (this.nbSon + 1);
    this.nbSon = _plus_1;
  }
  
  public void entry(final Video video) {
    Widget _widget = video.getWidget();
    this.entry(_widget);
    String _plus = ("HorizontalPanel hpanel" + Integer.valueOf(this.nbHorizontalPan));
    String _plus_1 = (_plus + " = new HorizontalPanel();");
    this.gwt.append(_plus_1);
    String _plus_2 = ("hpanel" + Integer.valueOf(this.nbHorizontalPan));
    String _plus_3 = (_plus_2 + ".add( ");
    String _plus_4 = (_plus_3 + this.current);
    String _plus_5 = (_plus_4 + " );");
    this.gwt.append(_plus_5);
    String _plus_6 = ("Video video" + Integer.valueOf(this.nbVideo));
    String _plus_7 = (_plus_6 + " = createVideo( \"");
    Widget _widget_1 = video.getWidget();
    String _reponse = _widget_1.getReponse();
    String _plus_8 = (_plus_7 + _reponse);
    String _plus_9 = (_plus_8 + "\" );");
    this.gwt.append(_plus_9);
    String _plus_10 = ("hpanel" + Integer.valueOf(this.nbHorizontalPan));
    String _plus_11 = (_plus_10 + ".add( video");
    String _plus_12 = (_plus_11 + Integer.valueOf(this.nbVideo));
    String _plus_13 = (_plus_12 + " );");
    this.gwt.append(_plus_13);
    String _plus_14 = ("panel" + Integer.valueOf(this.nbPanel));
    String _plus_15 = (_plus_14 + ".add( hpanel");
    String _plus_16 = (_plus_15 + Integer.valueOf(this.nbHorizontalPan));
    String _plus_17 = (_plus_16 + ");");
    this.gwt.append(_plus_17);
  }
  
  public void exit(final Video video) {
    int _plus = (this.nbHorizontalPan + 1);
    this.nbHorizontalPan = _plus;
    int _plus_1 = (this.nbVideo + 1);
    this.nbVideo = _plus_1;
  }
  
  public Integer entry(final Widget widget) {
    int _xifexpression = (int) 0;
    if ((widget instanceof CheckBox)) {
      int _xblockexpression = (int) 0;
      {
        CheckBox check = ((CheckBox) widget);
        this.entry(check);
        int _plus = (this.nbCheckBox + 1);
        int _nbCheckBox = this.nbCheckBox = _plus;
        _xblockexpression = (_nbCheckBox);
      }
      _xifexpression = _xblockexpression;
    } else {
      int _xifexpression_1 = (int) 0;
      if ((widget instanceof RadioButton)) {
        int _xblockexpression_1 = (int) 0;
        {
          RadioButton radioButton = ((RadioButton) widget);
          this.entry(radioButton);
          int _plus = (this.nbRadioButton + 1);
          int _nbRadioButton = this.nbRadioButton = _plus;
          _xblockexpression_1 = (_nbRadioButton);
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        if ((widget instanceof Image)) {
          Image image = ((Image) widget);
          this.entry(image);
        }
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}
