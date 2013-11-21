package mapping;

import MMUI.Checkbox;
import MMUI.Container;
import MMUI.MMUIFactory;
import MMUI.Ui;
import MMUI.Widget;
import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.xtext.istic.mapUI.mapUI.MapUI;
import org.xtext.istic.mapUI.mapUI.Mapping;
import org.xtext.istic.soda.soDa.Poll;
import org.xtext.istic.soda.soDa.Question;
import org.xtext.istic.soda.soDa.Soda;

@SuppressWarnings("all")
public class mapping {
  public Ui transfo(final Soda soda, final MapUI mapUi) {
    Ui ui = MMUIFactory.eINSTANCE.createUi();
    EList<Container> _containers = ui.getContainers();
    Container _createContainer = MMUIFactory.eINSTANCE.createContainer();
    _containers.add(_createContainer);
    EList<Container> _containers_1 = ui.getContainers();
    Container _get = _containers_1.get(0);
    EList<Widget> _widgets = _get.getWidgets();
    Checkbox _createCheckbox = MMUIFactory.eINSTANCE.createCheckbox();
    _widgets.add(_createCheckbox);
    EList<Container> _containers_2 = ui.getContainers();
    Container _get_1 = _containers_2.get(0);
    EList<Widget> _widgets_1 = _get_1.getWidgets();
    Checkbox _createCheckbox_1 = MMUIFactory.eINSTANCE.createCheckbox();
    _widgets_1.add(_createCheckbox_1);
    EList<Mapping> _mappings = mapUi.getMappings();
    for (final Mapping c : _mappings) {
      {
        Container container = MMUIFactory.eINSTANCE.createContainer();
        EList<Poll> _polls = soda.getPolls();
        final Function1<Poll,Poll> _function = new Function1<Poll,Poll>() {
          public Poll apply(final Poll polo) {
            Poll _xifexpression = null;
            String _name = polo.getName();
            String _name_1 = c.getName();
            boolean _equals = _name.equals(_name_1);
            if (_equals) {
              return polo;
            }
            return _xifexpression;
          }
        };
        List<Poll> polux = ListExtensions.<Poll, Poll>map(_polls, _function);
        boolean _notEquals = (!Objects.equal(polux, null));
        if (_notEquals) {
          Poll polo = polux.get(0);
          String _name = polo.getName();
          container.setNomQuestion(_name);
          String _type = c.getType();
          final String _switchValue = _type;
          boolean _matched = false;
          if (!_matched) {
            if (Objects.equal(_switchValue,"Checkbox")) {
              _matched=true;
              EList<Question> _questions = polo.getQuestions();
              final Function1<Question,Object> _function_1 = new Function1<Question,Object>() {
                public Object apply(final Question it) {
                  return null;
                }
              };
              List<Object> question = ListExtensions.<Question, Object>map(_questions, _function_1);
            }
          }
          EList<Container> _containers_3 = ui.getContainers();
          _containers_3.add(container);
        }
      }
    }
    return ui;
  }
}
