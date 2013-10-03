package fr.irisa.triskell.idm;

import fr.irisa.triskell.idm.EcoreLoader;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

@SuppressWarnings("all")
public class EcoreHelper {
  public EPackage init(final String path) {
    EcoreLoader _ecoreLoader = new EcoreLoader();
    EcoreLoader lo = _ecoreLoader;
    return lo.loadModel(path);
  }
  
  public String flat(final EClass e) {
    String _name = e.getName();
    String res = (_name + " : \n");
    EList<EClass> _eSuperTypes = e.getESuperTypes();
    boolean _isEmpty = _eSuperTypes.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      String _plus = (res + "\t SuperClasse :");
      res = _plus;
    }
    EList<EClass> _eSuperTypes_1 = e.getESuperTypes();
    for (final EClass c : _eSuperTypes_1) {
      String _plus_1 = (res + "\n\t\t");
      String _flat = this.flat(c);
      String _plus_2 = (_plus_1 + _flat);
      res = _plus_2;
    }
    return res;
  }
  
  public String shortEuh(final EClass e) {
    String _name = e.getName();
    String res = (_name + ": \n");
    return res;
  }
}
