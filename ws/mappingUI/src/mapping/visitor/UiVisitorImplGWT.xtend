package mapping.visitor

import MMUI.Ui
import MMUI.SuperContainer
import MMUI.Container
import MMUI.CheckBox
import MMUI.RadioButton
import MMUI.Image
import MMUI.Son
import MMUI.Video
import MMUI.Widget

class UiVisitorImplGWT implements UiVisitor {
	public StringBuilder gwt;
	
	private String rb = 'rb'
	private String cb = 'cb'
	private String sPan = 'pan'
	private String sPanel = 'panel'
	private String sImage = 'img'
	private String sHpanel = 'hpanel'
	private String sAudio = 'audio'
	private String sVideo = 'sVideo'
	
	
	private String tmpContainer
	private String panel
	private String pan
	private String image
	private String horizontalPan
	private String current
	private String sizeImg = '"100px","10em"'
	
	private int nbHorizontalPan
	private int nbImage
	private int nbPanel
	private int nbPan
	private int nbCheckBox
	private int nbRadioButton
	private int nbSon	
	private int nbVideo
	


	new() {
		gwt = new StringBuilder(
			"package org.istic.idm.gwt.client;
				import com.google.gwt.media.client.Video;	
				import com.google.gwt.media.client.Audio;
				import com.google.gwt.core.client.EntryPoint;
				import com.google.gwt.user.client.ui.Label;
				import com.google.gwt.user.client.ui.RadioButton;
				import com.google.gwt.user.client.ui.CheckBox;
				import com.google.gwt.user.client.ui.RootPanel;
				import com.google.gwt.user.client.ui.VerticalPanel;
				import com.google.gwt.user.client.ui.HorizontalPanel;
				import com.google.gwt.user.client.ui.Image;")
	}

	override entry(Ui ui) {
		gwt.append(
			"public class FormulaireGWT implements EntryPoint { 
						public void onModuleLoad() {
						")

	}

	override exit(Ui ui) {
		gwt.append("}

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
			    }}")
	}

	override entry(SuperContainer superContainer) {
		//rien pr le moment
	}

	override exit(SuperContainer superContainer) {
		//rien pr le moment
	}

	override entry(Container container) {

		gwt.append(
			"TitledPanel "+ sPan + nbPan + " = new TitledPanel(\"" + container.label + "\");
					VerticalPanel " + sPanel + nbPanel + " = new VerticalPanel();")

		panel = sPanel + nbPanel
		pan = sPan + nbPan
	}

	override exit(Container container) {
		gwt.append(
			sPan + nbPan + ".setContent(" +sPanel + nbPanel + ");" +
			 "RootPanel.get().add(" +sPan + nbPan + ");"
		)
		nbPanel = nbPanel + 1
		nbPan = nbPan + 1;
	}

	override entry(CheckBox checkbox) {
		current = cb+nbCheckBox
		gwt.append('CheckBox '+cb+nbCheckBox+' = new CheckBox();')
		
	}

	override exit(CheckBox checkbox) {
		gwt.append(cb+nbCheckBox+'.setText("'+ checkbox.reponse+'");')
		gwt.append(sPanel+nbPanel+'.add('+cb+nbCheckBox+');')
		nbCheckBox  = nbCheckBox+1;
	}

	override entry(RadioButton radioButton) {
		current = rb+nbRadioButton
		gwt.append('RadioButton '+rb+nbRadioButton+' = new RadioButton("'+radioButton.group+'","");')
		 
	}

	override exit(RadioButton radioButton) {
		gwt.append(rb+nbRadioButton+'.setText( "'+radioButton.reponse+'" );')
		gwt.append(sPanel+nbPanel+'.add('+rb+nbRadioButton+');')
		nbRadioButton  = nbRadioButton+1; 
	}

	override entry(Image image) {
		this.entry(image.widget)
		//on créer un horizontal panel pour mettre la checkbox ou le radiobouton
		gwt.append( 'HorizontalPanel '+sHpanel+nbHorizontalPan+' = new HorizontalPanel();')
        gwt.append(sHpanel+nbHorizontalPan+'.add( '+current + ' );')
		//puis l'image
		gwt.append('Image '+sImage+nbImage+' = new Image();')
		gwt.append(sImage+nbImage+'.setUrl("'+image.widget.reponse+'");')
		gwt.append(sHpanel+nbHorizontalPan+'.add('+sImage+nbImage+ ' );')	
		gwt.append(sPanel+nbPanel+'.add( '+sHpanel+nbHorizontalPan+');')
		gwt.append(sImage+nbImage+'.setSize('+sizeImg+');')
	}

	override exit(Image image) {
		nbHorizontalPan = nbHorizontalPan +1
		nbImage = nbImage+1
	}

	override entry(Son son) {
		this.entry(son.widget)
		//on créer un horizontal panel pour mettre la checkbox ou le radiobouton
		gwt.append( 'HorizontalPanel '+sHpanel+nbHorizontalPan+' = new HorizontalPanel();')
        gwt.append(sHpanel+nbHorizontalPan+'.add( '+current + ' );')
		
     	//puis le son
		gwt.append('Audio '+sAudio+nbSon+' = createAudio( "'+son.widget.reponse+'" );')
		gwt.append(sHpanel+nbHorizontalPan+'.add( audio'+nbSon+ ' );')	
		gwt.append(sPanel+nbPanel+'.add( '+sHpanel+nbHorizontalPan+');')
	}

	override exit(Son son) {
		nbHorizontalPan = nbHorizontalPan +1
		nbSon = nbSon+1
	}

	override entry(Video video) {
		this.entry(video.widget)
		//on créer un horizontal panel pour mettre la checkbox ou le radiobouton
		gwt.append( 'HorizontalPanel '+sHpanel+nbHorizontalPan+' = new HorizontalPanel();')
        gwt.append(sHpanel+nbHorizontalPan+'.add( '+current + ' );')
		
     	//puis la vidéo
		gwt.append('Video '+sVideo+nbVideo+' = createVideo( "'+video.widget.reponse+'" );')
		gwt.append(sHpanel+nbHorizontalPan+'.add( '+sVideo+nbVideo+ ' );')	
		gwt.append(sPanel+nbPanel+'.add( '+sHpanel+nbHorizontalPan+');')
	}

	override exit(Video video) {
		nbHorizontalPan = nbHorizontalPan +1
		nbVideo = nbVideo +1 
	}

	def entry(Widget widget)
	{
		if(widget instanceof CheckBox){
				var check = widget as CheckBox
				entry(check)
				nbCheckBox=nbCheckBox+1
			}
			else if(widget instanceof RadioButton){
				var radioButton = widget as RadioButton
				entry(radioButton)
				nbRadioButton=nbRadioButton+1
			} else if(widget instanceof Image){
				var image = widget as Image
				entry(image)				
			}
	}
}
