package mapping.visitor;

import MMUI.AbstractContainer;
import MMUI.CheckBox;
import MMUI.Container;
import MMUI.Image;
import MMUI.MMUIFactory;
import MMUI.RadioButton;
import MMUI.Son;
import MMUI.SuperContainer;
import MMUI.Ui;
import MMUI.Video;
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
    container.setId(_name);
    String _query = question.getQuery();
    container.setLabel(_query);
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
    String _id = option.getId();
    String _get = this.map.get(_id);
    final String _switchValue = _get;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"CheckBox")) {
        _matched=true;
        CheckBox _createCheckBox = MMUIFactory.eINSTANCE.createCheckBox();
        widget = _createCheckBox;
        CheckBox tmp = ((CheckBox) widget);
        String _reponse = option.getReponse();
        tmp.setReponse(_reponse);
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"RadioButton")) {
        _matched=true;
        RadioButton _createRadioButton = MMUIFactory.eINSTANCE.createRadioButton();
        widget = _createRadioButton;
        RadioButton tmp_1 = ((RadioButton) widget);
        String _reponse_1 = option.getReponse();
        tmp_1.setReponse(_reponse_1);
        String _id_1 = containerQuestion.getId();
        tmp_1.setGroup(_id_1);
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"ImageCheck")) {
        _matched=true;
        Image _createImage = MMUIFactory.eINSTANCE.createImage();
        widget = _createImage;
        CheckBox checkbox = MMUIFactory.eINSTANCE.createCheckBox();
        String _reponse_2 = option.getReponse();
        checkbox.setReponse(_reponse_2);
        Image tmp_2 = ((Image) widget);
        tmp_2.setWidget(checkbox);
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"ImageRadio")) {
        _matched=true;
        Image _createImage_1 = MMUIFactory.eINSTANCE.createImage();
        widget = _createImage_1;
        RadioButton radio = MMUIFactory.eINSTANCE.createRadioButton();
        String _reponse_3 = option.getReponse();
        radio.setReponse(_reponse_3);
        Image tmp_3 = ((Image) widget);
        tmp_3.setWidget(radio);
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"SonRadio")) {
        _matched=true;
        Son _createSon = MMUIFactory.eINSTANCE.createSon();
        widget = _createSon;
        RadioButton radio_1 = MMUIFactory.eINSTANCE.createRadioButton();
        String _reponse_4 = option.getReponse();
        radio_1.setReponse(_reponse_4);
        Son tmp_4 = ((Son) widget);
        tmp_4.setWidget(radio_1);
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"SonCheck")) {
        _matched=true;
        Son _createSon_1 = MMUIFactory.eINSTANCE.createSon();
        widget = _createSon_1;
        CheckBox checkbox_1 = MMUIFactory.eINSTANCE.createCheckBox();
        String _reponse_5 = option.getReponse();
        checkbox_1.setReponse(_reponse_5);
        Son tmp_5 = ((Son) widget);
        tmp_5.setWidget(checkbox_1);
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"VideoRadio")) {
        _matched=true;
        Video _createVideo = MMUIFactory.eINSTANCE.createVideo();
        widget = _createVideo;
        RadioButton radio_2 = MMUIFactory.eINSTANCE.createRadioButton();
        String _reponse_6 = option.getReponse();
        radio_2.setReponse(_reponse_6);
        Video tmp_6 = ((Video) widget);
        tmp_6.setWidget(radio_2);
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"VideoCheck")) {
        _matched=true;
        Video _createVideo_1 = MMUIFactory.eINSTANCE.createVideo();
        widget = _createVideo_1;
        CheckBox checkbox_2 = MMUIFactory.eINSTANCE.createCheckBox();
        String _reponse_7 = option.getReponse();
        checkbox_2.setReponse(_reponse_7);
        Video tmp_7 = ((Video) widget);
        tmp_7.setWidget(checkbox_2);
      }
    }
    if (!_matched) {
      {
        CheckBox _createCheckBox_1 = MMUIFactory.eINSTANCE.createCheckBox();
        widget = _createCheckBox_1;
        CheckBox tmp_8 = ((CheckBox) widget);
        String _reponse_8 = option.getReponse();
        tmp_8.setReponse(_reponse_8);
      }
    }
    boolean _notEquals = (!Objects.equal(widget, null));
    if (_notEquals) {
      EList<Widget> _widgets = containerQuestion.getWidgets();
      _widgets.add(widget);
      Class<? extends Widget> _class = widget.getClass();
      String _name = _class.getName();
      System.out.println(_name);
    }
  }
}
