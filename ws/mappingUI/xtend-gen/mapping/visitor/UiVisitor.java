package mapping.visitor;

import MMUI.CheckBox;
import MMUI.Container;
import MMUI.RadioButton;
import MMUI.SuperContainer;
import MMUI.Ui;

@SuppressWarnings("all")
public interface UiVisitor {
  public abstract void entry(final Ui ui);
  
  public abstract void exit(final Ui ui);
  
  public abstract void entry(final SuperContainer superContainer);
  
  public abstract void exit(final SuperContainer superContainer);
  
  public abstract void entry(final Container container);
  
  public abstract void exit(final Container container);
  
  public abstract void entry(final CheckBox checkbox);
  
  public abstract void exit(final CheckBox checkbox);
  
  public abstract void entry(final RadioButton radioButton);
  
  public abstract void exit(final RadioButton radioButton);
}
