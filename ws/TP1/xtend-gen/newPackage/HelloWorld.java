package newPackage;

import com.google.common.collect.Iterables;
import fr.irisa.triskell.idm.EclassAspect;
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
      {
        e.setIdentifier(((EClass) c));
        EclassAspect.setIdentifier(((EClass) c));
      }
    }
    InputOutput.<String>println("Appel à Flat :");
    EList<EClassifier> _eClassifiers_1 = p.getEClassifiers();
    Iterable<EClass> _filter_1 = Iterables.<EClass>filter(_eClassifiers_1, EClass.class);
    for (final EClassifier c_1 : _filter_1) {
      String _flat = e.flat(((EClass) c_1));
      InputOutput.<String>println(_flat);
    }
    InputOutput.<String>println("\n Appel à Short :");
    EList<EClassifier> _eClassifiers_2 = p.getEClassifiers();
    Iterable<EClass> _filter_2 = Iterables.<EClass>filter(_eClassifiers_2, EClass.class);
    for (final EClassifier c_2 : _filter_2) {
      String _shortEuh = e.shortEuh(((EClass) c_2), true);
      InputOutput.<String>println(_shortEuh);
    }
    InputOutput.<String>println("\n Appel à FlatShort :");
    EList<EClassifier> _eClassifiers_3 = p.getEClassifiers();
    Iterable<EClass> _filter_3 = Iterables.<EClass>filter(_eClassifiers_3, EClass.class);
    for (final EClassifier c_3 : _filter_3) {
      String _flatShort = e.flatShort(((EClass) c_3));
      InputOutput.<String>println(_flatShort);
    }
    InputOutput.<String>println("\nAppel à Flat avec Aspect :");
    EList<EClassifier> _eClassifiers_4 = p.getEClassifiers();
    Iterable<EClass> _filter_4 = Iterables.<EClass>filter(_eClassifiers_4, EClass.class);
    for (final EClassifier c_4 : _filter_4) {
      String _flat_1 = EclassAspect.flat(((EClass) c_4));
      InputOutput.<String>println(_flat_1);
    }
    InputOutput.<String>println("\nAppel à Short avec Aspect :");
    EList<EClassifier> _eClassifiers_5 = p.getEClassifiers();
    Iterable<EClass> _filter_5 = Iterables.<EClass>filter(_eClassifiers_5, EClass.class);
    for (final EClassifier c_5 : _filter_5) {
      String _shortEuh_1 = EclassAspect.shortEuh(((EClass) c_5), true);
      InputOutput.<String>println(_shortEuh_1);
    }
    InputOutput.<String>println("\nAppel à FlatShort avec Aspect :");
    EList<EClassifier> _eClassifiers_6 = p.getEClassifiers();
    Iterable<EClass> _filter_6 = Iterables.<EClass>filter(_eClassifiers_6, EClass.class);
    for (final EClassifier c_6 : _filter_6) {
      String _flatShortEuh = EclassAspect.flatShortEuh(((EClass) c_6));
      InputOutput.<String>println(_flatShortEuh);
    }
  }
}
