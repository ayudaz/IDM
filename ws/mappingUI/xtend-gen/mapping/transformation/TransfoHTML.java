package mapping.transformation;

import MMUI.AbstractContainer;
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
    String _plus = ("<!doctype html> \n" + 
      "<html lang=\"fr\"> \n");
    String result = (_plus + 
      "<body>\n ");
    AbstractContainer _body = ui.getBody();
    SuperContainer body = ((SuperContainer) _body);
    String _id = body.getId();
    String _plus_1 = ("<form id=\'" + _id);
    String formHtml = (_plus_1 + "\'> \n");
    EList<AbstractContainer> _containers = body.getContainers();
    final Procedure1<AbstractContainer> _function = new Procedure1<AbstractContainer>() {
      public void apply(final AbstractContainer q) {
        AbstractContainer Aquestion = ((AbstractContainer) q);
      }
    };
    IterableExtensions.<AbstractContainer>forEach(_containers, _function);
    String _plus_2 = (result + formHtml);
    result = _plus_2;
    String _plus_3 = (result + "</body>");
    result = _plus_3;
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
