package mapping.transformation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class TransfoHTML {
  public static void writeFileObject(final String append) {
    File _file = new File("./titi.html");
    File file = _file;
    try {
      FileWriter _fileWriter = new FileWriter(file, false);
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
