package org.istic.idm.gwt.client;

				import com.google.gwt.core.client.EntryPoint;
				import com.google.gwt.user.client.ui.Label;
				import com.google.gwt.user.client.ui.RadioButton;
				import com.google.gwt.user.client.ui.CheckBox;
				import com.google.gwt.user.client.ui.RootPanel;
				import com.google.gwt.user.client.ui.VerticalPanel;
				import com.google.gwt.user.client.ui.HorizontalPanel;
				import com.google.gwt.user.client.ui.Image;public class FormulaireGWT implements EntryPoint { 
						public void onModuleLoad() {
						TitledPanel pan0 = new TitledPanel("Q ?");
					VerticalPanel panel0 = new VerticalPanel();RadioButton rb0 = new RadioButton("q1","");rb0.setText( "Oui" );panel0.add(rb0);RadioButton rb1 = new RadioButton("q1","");rb1.setText( "Non" );panel0.add(rb1);pan0.setContent(panel0);RootPanel.get().add(pan0);TitledPanel pan1 = new TitledPanel("Q2 ?");
					VerticalPanel panel1 = new VerticalPanel();CheckBox cb0 = new CheckBox();cb0.setText("Oui");panel1.add(cb0);CheckBox cb1 = new CheckBox();cb1.setText("Non");panel1.add(cb1);CheckBox cb2 = new CheckBox();HorizontalPanel hpanel0 = new HorizontalPanel();hpanel0.add( cb2 );Image img0 = new Image();img0.setUrl("http://www.google.com/images/logo.gif");hpanel0.add( img0 );panel1.add( hpanel0);pan1.setContent(panel1);RootPanel.get().add(pan1);} }