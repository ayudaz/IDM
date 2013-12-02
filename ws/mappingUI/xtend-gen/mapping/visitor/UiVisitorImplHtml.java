package mapping.visitor;

import MMUI.CheckBox;
import MMUI.Container;
import MMUI.RadioButton;
import MMUI.SuperContainer;
import MMUI.Ui;
import com.google.common.base.Objects;
import mapping.visitor.UiVisitor;

@SuppressWarnings("all")
public class UiVisitorImplHtml implements UiVisitor {
  public String html;
  
  public UiVisitorImplHtml() {
    this.html = "";
  }
  
  public void entry(final Ui ui) {
    String _plus = (this.html + "<!doctype html> \n");
    String _plus_1 = (_plus + 
      "<html lang=\"fr\"> \n");
    String _plus_2 = (_plus_1 + 
      "<body>\n ");
    this.html = _plus_2;
  }
  
  public void exit(final Ui ui) {
    String _plus = (this.html + "</body>");
    this.html = _plus;
  }
  
  public void entry(final SuperContainer superContainer) {
    String _plus = (this.html + "<div id=\"");
    String _id = superContainer.getId();
    String _plus_1 = (_plus + _id);
    String _plus_2 = (_plus_1 + "\">");
    this.html = _plus_2;
    String _label = superContainer.getLabel();
    boolean _notEquals = (!Objects.equal(_label, null));
    if (_notEquals) {
      String _label_1 = superContainer.getLabel();
      String _plus_3 = (this.html + _label_1);
      String _plus_4 = (_plus_3 + "\n");
      this.html = _plus_4;
    }
  }
  
  public void exit(final SuperContainer superContainer) {
    String _plus = (this.html + "</div>\n");
    this.html = _plus;
  }
  
  public void entry(final Container container) {
    String _plus = (this.html + "<form id=\"");
    String _id = container.getId();
    String _plus_1 = (_plus + _id);
    String _plus_2 = (_plus_1 + "\">\n");
    String _plus_3 = (_plus_2 + 
      "<h3>");
    String _label = container.getLabel();
    String _plus_4 = (_plus_3 + _label);
    String _plus_5 = (_plus_4 + "</h3>\n");
    String _plus_6 = (_plus_5 + 
      "<fieldset>\n");
    this.html = _plus_6;
  }
  
  public void exit(final Container container) {
    String _plus = (this.html + "</fieldset>\n");
    String _plus_1 = (_plus + 
      "</form>\n");
    this.html = _plus_1;
  }
  
  public void entry(final CheckBox checkbox) {
    String _plus = (this.html + "<input type=\"checkbox\" value=\"");
    String _reponse = checkbox.getReponse();
    String _plus_1 = (_plus + _reponse);
    String _plus_2 = (_plus_1 + "\">");
    String _reponse_1 = checkbox.getReponse();
    String _plus_3 = (_plus_2 + _reponse_1);
    String _plus_4 = (_plus_3 + "</br>\n");
    this.html = _plus_4;
  }
  
  public void exit(final CheckBox checkbox) {
  }
  
  public void entry(final RadioButton radioButton) {
    String _plus = (this.html + "<input type=\"radio\" name=\"");
    String _group = radioButton.getGroup();
    String _plus_1 = (_plus + _group);
    String _plus_2 = (_plus_1 + "\" value=\"");
    String _reponse = radioButton.getReponse();
    String _plus_3 = (_plus_2 + _reponse);
    String _plus_4 = (_plus_3 + "\">");
    String _reponse_1 = radioButton.getReponse();
    String _plus_5 = (_plus_4 + _reponse_1);
    String _plus_6 = (_plus_5 + "</br>\n");
    this.html = _plus_6;
  }
  
  public void exit(final RadioButton radioButton) {
  }
}
