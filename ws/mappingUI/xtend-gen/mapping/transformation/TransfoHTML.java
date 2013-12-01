package mapping.transformation;

import MMUI.AbstractContainer;
import MMUI.Checkbox;
import MMUI.Container;
import MMUI.SuperContainer;
import MMUI.Ui;
import MMUI.Widget;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class TransfoHTML {
  public static String TransfoEnHTML(final Ui ui) {
    String _plus = ("<!doctype html> \n" + 
      "<html lang=\"fr\"> \n");
    String result = (_plus + 
      "<body>\n ");
    AbstractContainer _body = ui.getBody();
    SuperContainer body = ((SuperContainer) _body);
    EList<AbstractContainer> _containers = body.getContainers();
    AbstractContainer _get = _containers.get(0);
    SuperContainer tousLesForm = ((SuperContainer) _get);
    String _plus_1 = (result + "<form id=\'");
    String _id = body.getId();
    String _plus_2 = (_plus_1 + _id);
    String _plus_3 = (_plus_2 + "\'> \n");
    result = _plus_3;
    EList<AbstractContainer> _containers_1 = tousLesForm.getContainers();
    for (final AbstractContainer c : _containers_1) {
      {
        Container f = ((Container) c);
        String _plus_4 = (result + "<label>");
        String _label = f.getLabel();
        String _plus_5 = (_plus_4 + _label);
        String _plus_6 = (_plus_5 + "</label>\n");
        result = _plus_6;
        EList<Widget> _widgets = f.getWidgets();
        for (final Widget wid : _widgets) {
          if ((wid instanceof Checkbox)) {
            Checkbox check = ((Checkbox) wid);
            String _plus_7 = (result + "<input type=\"checkbox\">");
            String _reponse = check.getReponse();
            String _plus_8 = (_plus_7 + _reponse);
            String _plus_9 = (_plus_8 + "<br>\n");
            result = _plus_9;
          }
        }
      }
    }
    String _plus_4 = (result + "</form> \n");
    result = _plus_4;
    String _plus_5 = (result + "</body>");
    result = _plus_5;
    TransfoHTML.writeFileObject(result);
    return "";
  }
  
  public static void writeFileObject(final String append) {
    File _file = new File("./titi.html");
    File file = _file;
    try {
      FileWriter _fileWriter = new FileWriter(file, true);
      FileWriter fw = _fileWriter;
      fw.write(append);
      System.out.println(append);
      fw.close();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
