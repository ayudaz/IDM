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
import MMUI.impl.ContainerImpl
import MMUI.impl.SuperContainerImpl
import MMUI.AbstractContainer

static class TransfoHTML {
	
	def static String TransfoEnHTML(Ui ui)
	{
		var result = 	'<!doctype html> \n' +
				 		'<html lang="fr"> \n' +
				 		'<body>\n '
		
			var body = ui.body as SuperContainer
			
			
			var formHtml = "<form id='"+ body.id +"'> \n"
			body.containers.forEach[ q |
				var Aquestion = q as AbstractContainer	
				
			]
		
		result = result  + formHtml
		result = result + "</body>"
		writeFileObject(result);
		return ""
	}
	
	def static writeFileObject(String append) {
        
        var file = new File("./titi.html");
        try {
            var fw = new FileWriter(file, true);
            fw.write(append);
            System.out.println(append)
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}