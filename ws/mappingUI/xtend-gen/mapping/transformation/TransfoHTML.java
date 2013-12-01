package mapping.transformation;

import MMUI.AbstractContainer;
import MMUI.Container;
import MMUI.SuperContainer;
import MMUI.Ui;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class TransfoHTML {
  public static String TransfoEnHTML(final Ui ui) {
    String _plus = ("<!doctype html>" + 
      "<html lang=\"fr\">");
    String result = (_plus + 
      "<body>");
    AbstractContainer _body = ui.getBody();
    SuperContainer body = ((SuperContainer) _body);
    String _id = body.getId();
    String _plus_1 = ("<form id=" + _id);
    String formHtml = (_plus_1 + ">");
    EList<AbstractContainer> _containers = body.getContainers();
    final Procedure1<AbstractContainer> _function = new Procedure1<AbstractContainer>() {
      public void apply(final AbstractContainer q) {
        Container question = ((Container) q);
      }
    };
    IterableExtensions.<AbstractContainer>forEach(_containers, _function);
    result.concat("</body>");
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
