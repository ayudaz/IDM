package org.xtext.istic.testGWT.client;

				import com.google.gwt.core.client.EntryPoint;
				import com.google.gwt.user.client.ui.Label;
				import com.google.gwt.user.client.ui.RadioButton;
				import com.google.gwt.user.client.ui.RootPanel;
				import com.google.gwt.user.client.ui.VerticalPanel;public class Formulaire implements EntryPoint { 
						public void onModuleLoad() {
						TitledPanel pan0 = new TitledPanel("Q ?");
					VerticalPanel panel0 = new VerticalPanel();RadioButton rb0 = new RadioButton("q1", "Oui");panel0.add(rb0);RadioButton rb1 = new RadioButton("q1", "Non");panel0.add(rb1);pan0.setContent(panel0);RootPanel.get().add(pan0);} }