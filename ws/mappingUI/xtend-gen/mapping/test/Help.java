package mapping.test;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.istic.mapUI.MapUIStandaloneSetup;
import org.xtext.istic.mapUI.mapUI.MapUI;
import org.xtext.istic.soda.SoDaStandaloneSetup;
import org.xtext.istic.soda.soDa.Soda;

@SuppressWarnings("all")
public class Help {
  private Soda soda;
  
  private MapUI ui;
  
  public void LoadPollAndMapUiSystem() {
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    ResourceSet resourceSet = _resourceSetImpl;
    SoDaStandaloneSetup.doSetup();
    MapUIStandaloneSetup.doSetup();
    URI _createURI = URI.createURI("../org.xtext.istic.soda.tests/ressources/e1.soda");
    Resource resourceSoda = resourceSet.getResource(_createURI, true);
    URI _createURI_1 = URI.createURI("../org.xtext.istic.mapUI.tests/ressources/e1.MapUI");
    Resource resourceUi = resourceSet.getResource(_createURI_1, true);
    EList<EObject> _contents = resourceSoda.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    this.soda = ((Soda) _head);
    EList<EObject> _contents_1 = resourceSoda.getContents();
    EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
    this.ui = ((MapUI) _head_1);
  }
  
  public void testTemplate() {
    String _plus = ("Ui {" + "Container {");
    String _plus_1 = (_plus + "Label[10,20] => q1 : Q ? {");
    String _plus_2 = (_plus_1 + "Checkbox[10,20]");
    String _plus_3 = (_plus_2 + "Label[10,20] => Oui");
    String _plus_4 = (_plus_3 + "Checkbox[10,20] ");
    String _plus_5 = (_plus_4 + "Label[10,20] => Non");
    String _plus_6 = (_plus_5 + "}");
    String _plus_7 = (_plus_6 + "}");
    String _plus_8 = (_plus_7 + "}");
    final String template = (_plus_8 + "}");
    InputOutput.<String>println(template);
  }
}
