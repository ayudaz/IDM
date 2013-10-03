package newPackage;

import com.google.common.collect.Iterables;
import fr.irisa.triskell.idm.EcoreHelper;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class HelloWorld {
  public static void main(final String[] args) {
    EcoreHelper _ecoreHelper = new EcoreHelper();
    EcoreHelper e = _ecoreHelper;
    EPackage p = e.init("metamodele/tableur.ecore");
    EList<EClassifier> _eClassifiers = p.getEClassifiers();
    Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
    for (final EClassifier c : _filter) {
      String _flat = e.flat(((EClass) c));
      InputOutput.<String>println(_flat);
    }
  }
}
