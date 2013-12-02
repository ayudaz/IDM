package mapping.visitor;

import MMUI.AbstractContainer;
import MMUI.CheckBox;
import MMUI.Container;
import MMUI.RadioButton;
import MMUI.SuperContainer;
import MMUI.Ui;
import MMUI.Widget;
import mapping.visitor.UiVisitor;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class UiExtension {
  public static void accept(final Ui ui, final UiVisitor visitor) {
    visitor.entry(ui);
    AbstractContainer _body = ui.getBody();
    SuperContainer body = ((SuperContainer) _body);
    UiExtension.accept(body, visitor);
    visitor.exit(ui);
  }
  
  public static void accept(final SuperContainer superContainer, final UiVisitor visitor) {
    visitor.entry(superContainer);
    EList<AbstractContainer> _containers = superContainer.getContainers();
    for (final AbstractContainer ac : _containers) {
      if ((ac instanceof SuperContainer)) {
        SuperContainer sc = ((SuperContainer) ac);
        UiExtension.accept(sc, visitor);
      } else {
        if ((ac instanceof Container)) {
          Container c = ((Container) ac);
          UiExtension.accept(c, visitor);
        }
      }
    }
    visitor.exit(superContainer);
  }
  
  public static void accept(final Container container, final UiVisitor visitor) {
    visitor.entry(container);
    EList<Widget> _widgets = container.getWidgets();
    for (final Widget widget : _widgets) {
      if ((widget instanceof CheckBox)) {
        CheckBox check = ((CheckBox) widget);
        UiExtension.accept(check, visitor);
      } else {
        if ((widget instanceof RadioButton)) {
          RadioButton radioButton = ((RadioButton) widget);
          UiExtension.accept(radioButton, visitor);
        }
      }
    }
    visitor.exit(container);
  }
  
  public static void accept(final CheckBox checkbox, final UiVisitor visitor) {
    visitor.entry(checkbox);
    visitor.exit(checkbox);
  }
  
  public static void accept(final RadioButton radioButton, final UiVisitor visitor) {
    visitor.entry(radioButton);
    visitor.exit(radioButton);
  }
}
