package mapping.test;

import MMUI.Ui;
import mapping.launch.Mapping;
import mapping.transformation.TransfoHTML;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.istic.mapUI.MapUIStandaloneSetup;
import org.xtext.istic.mapUI.mapUI.MapUI;
import org.xtext.istic.soda.SoDaStandaloneSetup;
import org.xtext.istic.soda.soDa.Soda;

@SuppressWarnings("all")
public class Help {
  public static void main(final String[] args) {
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    ResourceSet resourceSet = _resourceSetImpl;
    SoDaStandaloneSetup.doSetup();
    MapUIStandaloneSetup.doSetup();
    URI _createURI = URI.createURI("../org.xtext.istic.soda.tests/ressources/e1.soda");
    Resource resourceSoda = resourceSet.getResource(_createURI, true);
    URI _createURI_1 = URI.createURI("../org.xtext.istic.mapUI.tests/ressources/e1.MapUI");
    Resource resourceMapUi = resourceSet.getResource(_createURI_1, true);
    EList<EObject> _contents = resourceSoda.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Soda soda = ((Soda) _head);
    EList<EObject> _contents_1 = resourceMapUi.getContents();
    EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
    MapUI mapUi = ((MapUI) _head_1);
    Mapping _mapping = new Mapping();
    Mapping mapping = _mapping;
    Ui ui = mapping.transfo(soda, mapUi);
    String html = mapping.generation(ui);
    TransfoHTML.writeFileObject(html);
  }
}
