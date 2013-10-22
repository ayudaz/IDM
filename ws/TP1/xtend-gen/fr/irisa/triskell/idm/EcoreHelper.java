package fr.irisa.triskell.idm;

import fr.irisa.triskell.idm.EcoreLoader;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class EcoreHelper {
  private HashMap<String,String> ids = new Function0<HashMap<String,String>>() {
    public HashMap<String,String> apply() {
      HashMap<String,String> _hashMap = new HashMap<String, String>();
      return _hashMap;
    }
  }.apply();
  
  public EPackage init(final String path) {
    EcoreLoader _ecoreLoader = new EcoreLoader();
    EcoreLoader lo = _ecoreLoader;
    return lo.loadModel(path);
  }
  
  public String flat(final EClass e) {
    String _name = e.getName();
    String _plus = (_name + "(#");
    String _name_1 = e.getName();
    String _get = this.ids.get(_name_1);
    String _plus_1 = (_plus + _get);
    String res = (_plus_1 + "): \n");
    EList<EClass> _eSuperTypes = e.getESuperTypes();
    boolean _isEmpty = _eSuperTypes.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      String _plus_2 = (res + "\t SuperClasse :");
      res = _plus_2;
    }
    EList<EClass> _eSuperTypes_1 = e.getESuperTypes();
    for (final EClass c : _eSuperTypes_1) {
      String _plus_3 = (res + "\n\t\t");
      String _flat = this.flat(c);
      String _plus_4 = (_plus_3 + _flat);
      res = _plus_4;
    }
    return res;
  }
  
  public String shortEuh(final EClass e, final boolean affichName) {
    String res = "";
    if (affichName) {
      String _name = e.getName();
      String _plus = (_name + "(#");
      String _name_1 = e.getName();
      String _get = this.ids.get(_name_1);
      String _plus_1 = (_plus + _get);
      String _plus_2 = (_plus_1 + "): \n");
      res = _plus_2;
    }
    EList<EAttribute> _eAttributes = e.getEAttributes();
    boolean _isEmpty = _eAttributes.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      String _plus_3 = (res + "\t Attributs :");
      res = _plus_3;
    }
    EList<EAttribute> _eAttributes_1 = e.getEAttributes();
    for (final EAttribute a : _eAttributes_1) {
      String _plus_4 = (res + "\n\t\t");
      String _name_2 = a.getName();
      String _plus_5 = (_plus_4 + _name_2);
      String _plus_6 = (_plus_5 + "(");
      EDataType _eAttributeType = a.getEAttributeType();
      String _name_3 = _eAttributeType.getName();
      String _plus_7 = (_plus_6 + _name_3);
      String _plus_8 = (_plus_7 + ")");
      res = _plus_8;
    }
    EList<EOperation> _eOperations = e.getEOperations();
    boolean _isEmpty_1 = _eOperations.isEmpty();
    boolean _not_1 = (!_isEmpty_1);
    if (_not_1) {
      String _plus_9 = (res + "\n\t Operations :");
      res = _plus_9;
    }
    EList<EOperation> _eOperations_1 = e.getEOperations();
    for (final EOperation o : _eOperations_1) {
      {
        String _plus_10 = (res + "\n\t\t");
        String _name_4 = o.getName();
        String _plus_11 = (_plus_10 + _name_4);
        res = _plus_11;
        EList<EParameter> _eParameters = o.getEParameters();
        for (final EParameter p : _eParameters) {
          String _plus_12 = (res + " (");
          String _name_5 = p.getName();
          String _plus_13 = (_plus_12 + _name_5);
          String _plus_14 = (_plus_13 + ":");
          EClassifier _eType = p.getEType();
          String _name_6 = _eType.getName();
          String _plus_15 = (_plus_14 + _name_6);
          String _plus_16 = (_plus_15 + ") ");
          res = _plus_16;
        }
      }
    }
    return res;
  }
  
  public String flatShort(final EClass e) {
    String _flat = this.flat(e);
    String _shortEuh = this.shortEuh(e, false);
    String res = (_flat + _shortEuh);
    return res;
  }
  
  public void setIdentifier(final EClass e) {
    String _name = e.getName();
    String _name_1 = e.getName();
    int _hashCode = _name_1.hashCode();
    String _plus = (Integer.valueOf(_hashCode) + "_");
    long _currentTimeMillis = System.currentTimeMillis();
    String _plus_1 = (_plus + Long.valueOf(_currentTimeMillis));
    this.ids.put(_name, _plus_1);
  }
}
