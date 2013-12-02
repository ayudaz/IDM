package mapping.transformation

import java.io.File
import java.io.FileWriter
import java.io.IOException

static class TransfoHTML {

	
	def static writeFileObject(String append) {
        
        var file = new File("./titi.html");
        try {
            var fw = new FileWriter(file, false);
            fw.write(append);
            System.out.println(append)
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}