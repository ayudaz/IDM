package fr.irisa.triskell.idm

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EParameter
import java.util.HashMap

class EcoreHelper {
	private HashMap<String, String> ids = new HashMap;
	
	def EPackage init(String path){
		var lo = new EcoreLoader()
		return lo.loadModel(path)		
	}
	
	def String flat(EClass e) {
		var res = e.name + "(#"+ids.get(e.name)+"): \n"
		if(!e.ESuperTypes.empty)
			res = res + "\t SuperClasse :"
		for(EClass c : e.ESuperTypes){
			res = res + "\n\t\t" + flat(c)
		}
		return res
	}
	
	def String shortEuh(EClass e, boolean affichName){
		var res = ''
		
		if(affichName)
			res = e.name + "(#"+ids.get(e.name)+"): \n"
		
		if(!e.EAttributes.empty)
			res = res + "\t Attributs :"
		for(EAttribute a : e.EAttributes){
			res = res + "\n\t\t" + a.name + "("+a.EAttributeType.name+")";
		}
		if(!e.EOperations.empty)
			res = res + "\n\t Operations :"
		for(EOperation o : e.EOperations){
			res = res + "\n\t\t" + o.name;
			
			for(EParameter p : o.EParameters){
				res = res + " ("+p.name+":"+p.EType.name+") ";
			}
		}
		
		return res		
	}
			
	def String flatShort(EClass e){
		var res = flat(e) + shortEuh(e, false)
		
		return res		
	}
	
	def void setIdentifier(EClass e){
		ids.put(e.name, e.name.hashCode + "_" + System.currentTimeMillis);
	}
	
}