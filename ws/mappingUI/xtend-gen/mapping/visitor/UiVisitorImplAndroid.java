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
import com.google.common.base.Objects;
import mapping.visitor.UiVisitor;

@SuppressWarnings("all")
public class UiVisitorImplAndroid implements UiVisitor {
  public String android;
  
  public UiVisitorImplAndroid() {
    this.android = "";
  }
  
  public void entry(final Ui ui) {
    String _plus = (this.android + "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n\t\t\t\t<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n\t\t\t\t    xmlns:tools=\"http://schemas.android.com/tools\"\n\t\t\t\t    android:layout_width=\"match_parent\"\n\t\t\t\t    android:layout_height=\"match_parent\"\n\t\t\t\t    android:paddingBottom=\"@dimen/activity_vertical_margin\"\n\t\t\t\t    android:paddingLeft=\"@dimen/activity_horizontal_margin\"\n\t\t\t\t    android:paddingRight=\"@dimen/activity_horizontal_margin\"\n\t\t\t\t    android:paddingTop=\"@dimen/activity_vertical_margin\"\n\t\t\t\t    android:orientation=\"vertical\">");
    this.android = _plus;
  }
  
  public void exit(final Ui ui) {
    String _plus = (this.android + "</LinearLayout>");
    this.android = _plus;
  }
  
  public void entry(final SuperContainer superContainer) {
    String _plus = (this.android + " <LinearLayout\n\t\t\t\t\t        android:layout_width=\"match_parent\"\n\t\t\t\t\t        android:layout_height=\"wrap_content\"\n\t\t\t\t\t        android:orientation=\"vertical\"\n\t\t\t\t\t\t\tandroid:id=\"@+id/");
    String _id = superContainer.getId();
    String _plus_1 = (_plus + _id);
    String _plus_2 = (_plus_1 + "\" >");
    this.android = _plus_2;
    String _label = superContainer.getLabel();
    boolean _notEquals = (!Objects.equal(_label, null));
    if (_notEquals) {
      String _plus_3 = (this.android + "<TextView\n\t\t\t\t            android:layout_width=\"wrap_content\"\n\t\t\t\t            android:layout_height=\"wrap_content\"\n\t\t\t\t            android:text=\"");
      String _label_1 = superContainer.getLabel();
      String _plus_4 = (_plus_3 + _label_1);
      String _plus_5 = (_plus_4 + "\"\n\t\t\t\t            android:textAppearance=\"?android:attr/textAppearanceLarge\" />");
      this.android = _plus_5;
    }
  }
  
  public void exit(final SuperContainer superContainer) {
    String _plus = (this.android + "</LinearLayout>");
    this.android = _plus;
  }
  
  public void entry(final Container container) {
    String _plus = (this.android + "<TextView\n\t\t\t\t            android:layout_width=\"wrap_content\"\n\t\t\t\t            android:layout_height=\"wrap_content\"\n\t\t\t\t            android:id=\"@+id/");
    String _id = container.getId();
    String _plus_1 = (_plus + _id);
    String _plus_2 = (_plus_1 + "\"\n\t\t\t\t\t\t\tandroid:text=\"");
    String _label = container.getLabel();
    String _plus_3 = (_plus_2 + _label);
    String _plus_4 = (_plus_3 + "\"\n\t\t\t\t            android:textAppearance=\"?android:attr/textAppearanceLarge\" />");
    this.android = _plus_4;
  }
  
  public void exit(final Container container) {
    this.android = this.android;
  }
  
  public void entry(final CheckBox checkbox) {
    String _plus = (this.android + " <CheckBox\n            android:id=\"@+id/checkBox1\"\n            android:layout_width=\"wrap_content\"\n            android:layout_height=\"wrap_content\"\n            android:text=\"");
    String _reponse = checkbox.getReponse();
    String _plus_1 = (_plus + _reponse);
    String _plus_2 = (_plus_1 + "\" />");
    this.android = _plus_2;
  }
  
  public void exit(final CheckBox checkbox) {
    this.android = this.android;
  }
  
  public void entry(final RadioButton radioButton) {
    String _plus = (this.android + "<RadioButton\n            android:layout_width=\"wrap_content\"\n            android:layout_height=\"wrap_content\"\n            android:text=\"");
    String _reponse = radioButton.getReponse();
    String _plus_1 = (_plus + _reponse);
    String _plus_2 = (_plus_1 + "\" />");
    this.android = _plus_2;
  }
  
  public void exit(final RadioButton radioButton) {
    this.android = this.android;
  }
  
  public void entry(final Image image) {
    Widget _widget = image.getWidget();
    this.entry(_widget);
    String _plus = (this.android + "<ImageView\n\t\t\t            android:layout_width=\"wrap_content\"\n\t\t\t            android:layout_height=\"wrap_content\"\n\t\t\t            android:src=\"@drawable/");
    Widget _widget_1 = image.getWidget();
    String _reponse = _widget_1.getReponse();
    String _plus_1 = (_plus + _reponse);
    String _plus_2 = (_plus_1 + "\" />");
    this.android = _plus_2;
  }
  
  public void exit(final Image image) {
  }
  
  public void entry(final Son son) {
    Widget _widget = son.getWidget();
    this.entry(_widget);
    String _plus = (this.android + "<TextView\n\t\t\t\t            android:layout_width=\"wrap_content\"\n\t\t\t\t            android:layout_height=\"wrap_content\"\n\t\t\t\t\t\t\tandroid:text=\"Not implemented\" />");
    this.android = _plus;
  }
  
  public void exit(final Son son) {
  }
  
  public void entry(final Video video) {
    Widget _widget = video.getWidget();
    this.entry(_widget);
    String _plus = (this.android + "<TextView\n\t\t\t\t            android:layout_width=\"wrap_content\"\n\t\t\t\t            android:layout_height=\"wrap_content\"\n\t\t\t\t\t\t\tandroid:text=\"Not implemented\" />");
    this.android = _plus;
  }
  
  public void exit(final Video video) {
  }
  
  public void entry(final Widget widget) {
    if ((widget instanceof CheckBox)) {
      CheckBox check = ((CheckBox) widget);
      this.entry(check);
    } else {
      if ((widget instanceof RadioButton)) {
        RadioButton radioButton = ((RadioButton) widget);
        this.entry(radioButton);
      } else {
        if ((widget instanceof Image)) {
          Image image = ((Image) widget);
          this.entry(image);
        }
      }
    }
  }
}
