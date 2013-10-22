package newPackage

import fr.irisa.triskell.idm.EcoreHelper
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
//import fr.irisa.triskell.idm.EclassAspect
import static extension fr.irisa.triskell.idm.EclassAspect.*

class HelloWorld { 

	def static void main(String[] args) {
		var e = new EcoreHelper();
		var p = e.init("metamodele/tableur.ecore");
		
		for(EClassifier c : p.EClassifiers.filter(EClass)){
			e.setIdentifier((c as EClass))
			(c as EClass).setIdentifier
		}
		println("Appel � Flat :");
		for(EClassifier c : p.EClassifiers.filter(EClass)){
			println(e.flat(c as EClass))
		}
		
		
		println("\n Appel � Short :");
		for(EClassifier c : p.EClassifiers.filter(EClass)){
			println(e.shortEuh(c as EClass, true))
		}
		
		println("\n Appel � FlatShort :");
		for(EClassifier c : p.EClassifiers.filter(EClass)){
			println(e.flatShort(c as EClass))
		}
		
		println("\nAppel � Flat avec Aspect :");
		for(EClassifier c : p.EClassifiers.filter(EClass)){
			println((c as EClass).flat)
		}
		
		println("\nAppel � Short avec Aspect :");
		for(EClassifier c : p.EClassifiers.filter(EClass)){
			println((c as EClass).shortEuh(true))
		}
		
		println("\nAppel � FlatShort avec Aspect :");
		for(EClassifier c : p.EClassifiers.filter(EClass)){
			println((c as EClass).flatShortEuh())
		}
		
	}
}
