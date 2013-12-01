package mapping.transformation

import MMUI.AbstractContainer
import MMUI.Checkbox
import MMUI.Container
import MMUI.SuperContainer
import MMUI.Ui
import MMUI.Widget
import java.io.File
import java.io.FileWriter
import java.io.IOException

static class TransfoHTML {
	
	def static String TransfoEnHTML(Ui ui)
	{
		var result = 	'<!doctype html> \n' +
				 		'<html lang="fr"> \n' +
				 		'<body>\n '
		
			var body = ui.body as SuperContainer
			var tousLesForm = body.containers.get(0) as SuperContainer
			result =  result + "<form id='"+ body.id +"'> \n"
			for(AbstractContainer c : tousLesForm.containers)
			{
				var f = c as Container
				result = result + '<label>' + f.label + '</label>\n'
				for(Widget wid : f.widgets)
				{
					if(wid instanceof Checkbox)
					{
						var check = wid as Checkbox
						result = result + "<input type=\"checkbox\">" + check.reponse + "<br>\n"
					}
				}
			}		
			result =  result + "</form> \n"
		
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