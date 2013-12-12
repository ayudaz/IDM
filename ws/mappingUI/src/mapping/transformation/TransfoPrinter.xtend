package mapping.transformation;

import java.io.File
import java.io.FileWriter

public class TransfoPrinter {

	def static writeHTMLFileObject(String append) {
		var file = new File("./titi.html")
		try {
			var fw = new FileWriter(file, false);
			fw.write(append);
			System.out.println(append);
			fw.close();
		} catch (Exception e) {
		}
	}

	def static writeGWTFileObject(String append) {
		var file = new File("./formulaire.java");
		var TitledPanel = new File("./TitledPanel.java");
		try {
			var fw = new FileWriter(file, false);
			fw.write(append);
			System.out.println(append);
			fw.close();

			fw = new FileWriter(TitledPanel, false);
			fw.write(
				"\r\n\t\t\t\tpackage com.google.gwt.example.stockwatcher.client;\r\n\r\n\t\t\t\timport com.google.gwt.user.client.DOM;\r\n\t\t\t\timport com.google.gwt.user.client.Element;\r\n\t\t\t\timport com.google.gwt.user.client.ui.Widget;\r\n\t\t\t\t\r\n\t\t\t\tpublic class TitledPanel extends Widget {\r\n\t\t\t\tprivate Element legend;\r\n\t\t\t\tprivate Widget content = null;\r\n\t\t\t\t\r\n\t\t\t\tpublic TitledPanel() {\r\n\t\t\t\t\tElement fieldset = DOM.createFieldSet();\r\n\t\t\t\t\tlegend = DOM.createLegend();\r\n\t\t\t\t\tDOM.appendChild(fieldset, legend);\r\n\t\t\t\t\tsetElement(fieldset);\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tpublic TitledPanel(String title) {\r\n\t\t\t\t\tthis();\r\n\t\t\t\t\tsetTitle(title);\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\t@Override\r\n\t\t\t\tpublic String getTitle() {\r\n\t\t\t\t\treturn DOM.getInnerHTML(legend);\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\t@Override\r\n\t\t\t\tpublic void setTitle(String html) {\r\n\t\t\t\t\tDOM.setInnerHTML(legend, html);\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tpublic Widget getContent() {\r\n\t\t\t\t\treturn content;\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tpublic void setContent(Widget content) {\r\n\t\t\t\t\tif (this.content != null) {\r\n\t\t\t\t\t\tDOM.removeChild(getElement(), this.content.getElement());\r\n\t\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\t\tthis.content = content;\r\n\t\t\t\t\r\n\t\t\t\t\tDOM.appendChild(getElement(), content.getElement());\r\n\t\t\t\t}\r\n\t\t\t\t}");
			fw.close();
		} catch (Exception e) {
		}
	}

	def static writeAndroidFileObject(String append) {
		var file = new File("./android.xml");
		try {
			var fw = new FileWriter(file, false);
			fw.write(append);
			System.out.println(append);
			fw.close();
		} catch (Exception e) {
		}
	}

}
