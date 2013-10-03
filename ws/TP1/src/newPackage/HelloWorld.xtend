package newPackage

import fr.irisa.triskell.idm.EcoreHelper
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier

class HelloWorld { 

	def static void main(String[] args) {
		var e = new EcoreHelper();
		var p = e.init("metamodele/tableur.ecore");
		for(EClassifier c : p.EClassifiers.filter(EClass)){
			println(e.flat(c as EClass))
		}
	}
}
