package mapping.visitor;

import MMUI.AbstractContainer;
import MMUI.Checkbox;
import MMUI.Container;
import MMUI.MMUIFactory;
import MMUI.SuperContainer;
import MMUI.Ui;
import MMUI.Widget;
import com.google.common.base.Objects;
import java.util.HashMap;
import mapping.visitor.SodaVisitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.istic.soda.soDa.Option;
import org.xtext.istic.soda.soDa.Poll;
import org.xtext.istic.soda.soDa.Question;
import org.xtext.istic.soda.soDa.Soda;

@SuppressWarnings("all")
public class SodaVisitorImpl implements SodaVisitor {
  public Ui ui = new Function0<Ui>() {
    public Ui apply() {
      Ui _createUi = MMUIFactory.eINSTANCE.createUi();
      return _createUi;
    }
  }.apply();
  
  private HashMap<String,String> map;
  
  public SodaVisitorImpl(final HashMap<String,String> map) {
    this.map = map;
  }
  
  public void visit(final Soda soda) {
    SuperContainer _createSuperContainer = MMUIFactory.eINSTANCE.createSuperContainer();
    this.ui.setBody(_createSuperContainer);
  }
  
  public void visit(final Poll poll) {
    AbstractContainer _body = this.ui.getBody();
    SuperContainer body = ((SuperContainer) _body);
    EList<AbstractContainer> _containers = body.getContainers();
    SuperContainer _createSuperContainer = MMUIFactory.eINSTANCE.createSuperContainer();
    _containers.add(_createSuperContainer);
  }
  
  public void visit(final Question question) {
    AbstractContainer _body = this.ui.getBody();
    SuperContainer body = ((SuperContainer) _body);
    EList<AbstractContainer> _containers = body.getContainers();
    AbstractContainer _last = IterableExtensions.<AbstractContainer>last(_containers);
    SuperContainer containerPoll = ((SuperContainer) _last);
    Container container = MMUIFactory.eINSTANCE.createContainer();
    String _name = question.getName();
    container.setNomQuestion(_name);
    EList<AbstractContainer> _containers_1 = containerPoll.getContainers();
    _containers_1.add(container);
  }
  
  public void visit(final Option option) {
    AbstractContainer _body = this.ui.getBody();
    SuperContainer body = ((SuperContainer) _body);
    EList<AbstractContainer> _containers = body.getContainers();
    AbstractContainer _last = IterableExtensions.<AbstractContainer>last(_containers);
    SuperContainer containerPoll = ((SuperContainer) _last);
    EList<AbstractContainer> _containers_1 = containerPoll.getContainers();
    AbstractContainer _last_1 = IterableExtensions.<AbstractContainer>last(_containers_1);
    Container containerQuestion = ((Container) _last_1);
    Widget widget = null;
    String _nomQuestion = containerQuestion.getNomQuestion();
    String _get = this.map.get(_nomQuestion);
    final String _switchValue = _get;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"Checkbox")) {
        _matched=true;
        Checkbox _createCheckbox = MMUIFactory.eINSTANCE.createCheckbox();
        widget = _createCheckbox;
      }
    }
    boolean _notEquals = (!Objects.equal(widget, null));
    if (_notEquals) {
      EList<Widget> _widgets = containerQuestion.getWidgets();
      _widgets.add(widget);
    }
  }
}
