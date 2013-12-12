package mapping.transformation;

import java.io.File;
import java.io.FileWriter;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class TransfoPrinter {
  public static Object writeHTMLFileObject(final String append) {
    Object _xblockexpression = null;
    {
      File _file = new File("./titi.html");
      File file = _file;
      Object _xtrycatchfinallyexpression = null;
      try {
        FileWriter _fileWriter = new FileWriter(file, false);
        FileWriter fw = _fileWriter;
        fw.write(append);
        System.out.println(append);
        fw.close();
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          _xtrycatchfinallyexpression = null;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = (_xtrycatchfinallyexpression);
    }
    return _xblockexpression;
  }
  
  public static Object writeGWTFileObject(final String append) {
    Object _xblockexpression = null;
    {
      File _file = new File("./formulaire.java");
      File file = _file;
      File _file_1 = new File("./TitledPanel.java");
      File TitledPanel = _file_1;
      Object _xtrycatchfinallyexpression = null;
      try {
        FileWriter _fileWriter = new FileWriter(file, false);
        FileWriter fw = _fileWriter;
        fw.write(append);
        System.out.println(append);
        fw.close();
        FileWriter _fileWriter_1 = new FileWriter(TitledPanel, false);
        fw = _fileWriter_1;
        fw.write(
          "\r\n\t\t\t\tpackage com.google.gwt.example.stockwatcher.client;\r\n\r\n\t\t\t\timport com.google.gwt.user.client.DOM;\r\n\t\t\t\timport com.google.gwt.user.client.Element;\r\n\t\t\t\timport com.google.gwt.user.client.ui.Widget;\r\n\t\t\t\t\r\n\t\t\t\tpublic class TitledPanel extends Widget {\r\n\t\t\t\tprivate Element legend;\r\n\t\t\t\tprivate Widget content = null;\r\n\t\t\t\t\r\n\t\t\t\tpublic TitledPanel() {\r\n\t\t\t\t\tElement fieldset = DOM.createFieldSet();\r\n\t\t\t\t\tlegend = DOM.createLegend();\r\n\t\t\t\t\tDOM.appendChild(fieldset, legend);\r\n\t\t\t\t\tsetElement(fieldset);\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tpublic TitledPanel(String title) {\r\n\t\t\t\t\tthis();\r\n\t\t\t\t\tsetTitle(title);\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\t@Override\r\n\t\t\t\tpublic String getTitle() {\r\n\t\t\t\t\treturn DOM.getInnerHTML(legend);\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\t@Override\r\n\t\t\t\tpublic void setTitle(String html) {\r\n\t\t\t\t\tDOM.setInnerHTML(legend, html);\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tpublic Widget getContent() {\r\n\t\t\t\t\treturn content;\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tpublic void setContent(Widget content) {\r\n\t\t\t\t\tif (this.content != null) {\r\n\t\t\t\t\t\tDOM.removeChild(getElement(), this.content.getElement());\r\n\t\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\t\tthis.content = content;\r\n\t\t\t\t\r\n\t\t\t\t\tDOM.appendChild(getElement(), content.getElement());\r\n\t\t\t\t}\r\n\t\t\t\t}");
        fw.close();
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          _xtrycatchfinallyexpression = null;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = (_xtrycatchfinallyexpression);
    }
    return _xblockexpression;
  }
  
  public static Object writeAndroidFileObject(final String append) {
    Object _xblockexpression = null;
    {
      File _file = new File("./android.xml");
      File file = _file;
      Object _xtrycatchfinallyexpression = null;
      try {
        FileWriter _fileWriter = new FileWriter(file, false);
        FileWriter fw = _fileWriter;
        fw.write(append);
        System.out.println(append);
        fw.close();
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          _xtrycatchfinallyexpression = null;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = (_xtrycatchfinallyexpression);
    }
    return _xblockexpression;
  }
}
