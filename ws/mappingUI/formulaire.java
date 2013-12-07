package org.istic.idm.gwt.client;
				import com.google.gwt.media.client.Video;	
				import com.google.gwt.media.client.Audio;
				import com.google.gwt.core.client.EntryPoint;
				import com.google.gwt.user.client.ui.Label;
				import com.google.gwt.user.client.ui.RadioButton;
				import com.google.gwt.user.client.ui.CheckBox;
				import com.google.gwt.user.client.ui.RootPanel;
				import com.google.gwt.user.client.ui.VerticalPanel;
				import com.google.gwt.user.client.ui.HorizontalPanel;
				import com.google.gwt.user.client.ui.Image;public class FormulaireGWT implements EntryPoint { 
						public void onModuleLoad() {
						TitledPanel pan0 = new TitledPanel("Q1 ?");
					VerticalPanel panel0 = new VerticalPanel();RadioButton rb0 = new RadioButton("q1","");rb0.setText( "Oui" );panel0.add(rb0);RadioButton rb1 = new RadioButton("q1","");rb1.setText( "Non" );panel0.add(rb1);pan0.setContent(panel0);RootPanel.get().add(pan0);TitledPanel pan1 = new TitledPanel("Q2 ?");
					VerticalPanel panel1 = new VerticalPanel();CheckBox cb0 = new CheckBox();cb0.setText("Oui2");panel1.add(cb0);CheckBox cb1 = new CheckBox();cb1.setText("Non2");panel1.add(cb1);CheckBox cb2 = new CheckBox();cb2.setText("NSPP");panel1.add(cb2);pan1.setContent(panel1);RootPanel.get().add(pan1);TitledPanel pan2 = new TitledPanel("Q3 ?");
					VerticalPanel panel2 = new VerticalPanel();CheckBox cb3 = new CheckBox();HorizontalPanel hpanel0 = new HorizontalPanel();hpanel0.add( cb3 );Image img0 = new Image();img0.setUrl("https://upload.wikimedia.org/wikipedia/commons/8/85/Smiley.svg");hpanel0.add( img0 );panel2.add( hpanel0);img0.setSize("100px","10em");RadioButton rb2 = new RadioButton("null","");HorizontalPanel hpanel1 = new HorizontalPanel();hpanel1.add( rb2 );Image img1 = new Image();img1.setUrl("http://www.crystalxp.net/forum/mesimages/327855/smiley%20clin%20d'%C5%93il.png");hpanel1.add( img1 );panel2.add( hpanel1);img1.setSize("100px","10em");CheckBox cb4 = new CheckBox();HorizontalPanel hpanel2 = new HorizontalPanel();hpanel2.add( cb4 );Audio audio0 = createAudio( "boulette.mp3" );hpanel2.add( audio0 );panel2.add( hpanel2);RadioButton rb3 = new RadioButton("null","");HorizontalPanel hpanel3 = new HorizontalPanel();hpanel3.add( rb3 );Video video0 = createVideo( "Vietcong.ogv" );hpanel3.add( video0 );panel2.add( hpanel3);pan2.setContent(panel2);RootPanel.get().add(pan2);}

			 public static Audio createAudio(String url)
			    {
			        Audio audio = Audio.createIfSupported();
			        if(audio==null)
			            return null;
			        
			        audio.setSrc( url );
			       
			        audio.setControls( true );
			        return audio;        
			        
			    } 

			 public static Video createVideo( String url )
			    {
			        Video video = Video.createIfSupported();
			        if ( video == null )
			            return null;
			
			        video.setSrc( url );
			
			        video.setControls( true );
			        return video;
			    }}