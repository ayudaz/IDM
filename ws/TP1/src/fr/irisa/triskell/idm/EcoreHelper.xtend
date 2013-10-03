package fr.irisa.triskell.idm

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

class EcoreHelper {
	
	def EPackage init(String path){
		var lo = new EcoreLoader()
		return lo.loadModel(path)
		
	}
	
	def String flat(EClass e) {
		var res = e.name + " : \n"
		if(!e.ESuperTypes.empty)
			res = res + "\t SuperClasse :"
		for(EClass c : e.ESuperTypes){
			res = res + "\n\t\t" + flat(c)
		}
		return res
	}
	
	def String shortEuh(EClass e){
		var res = e.name + ": \n"
		
		
		
		return res		
	}
}