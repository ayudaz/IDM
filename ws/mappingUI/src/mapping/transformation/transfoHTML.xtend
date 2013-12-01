package mapping.transformation

import java.util.Collection
import MMUI.Ui
import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.util.List
import MMUI.SuperContainer
import MMUI.Container
import org.eclipse.emf.common.command.AbstractCommand.NonDirtying

static class TransfoHTML {
	
	def static String TransfoEnHTML(Ui ui)
	{
		var result = 	"<!doctype html>" +
				 		"<html lang=\"fr\">" +
				 		"<body>"
		
			var body = ui.body as SuperContainer
			
			
			var formHtml = "<form id="+ body.id +">"
			body.containers.forEach[ q |
				var question = q as Container				
				
			]
			
		
		result.concat("</body>")
		writeFileObject(result);
		return ""
	}
	
	def static writeFileObject(String append) {
        
        var file = new File("./titi.html");
        try {
            var fw = new FileWriter(file, true);
            fw.write(append);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}