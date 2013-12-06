package org.xtext.istic.mapUI.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.istic.mapUI.services.MapUIGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMapUIParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'VideoCheck'", "'VideoRadio'", "'ImageCheck'", "'ImageRadio'", "'CheckBox'", "'RadioButton'", "'SonCheck'", "'SonRadio'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMapUIParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMapUIParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMapUIParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g"; }



     	private MapUIGrammarAccess grammarAccess;
     	
        public InternalMapUIParser(TokenStream input, MapUIGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MapUI";	
       	}
       	
       	@Override
       	protected MapUIGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMapUI"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:67:1: entryRuleMapUI returns [EObject current=null] : iv_ruleMapUI= ruleMapUI EOF ;
    public final EObject entryRuleMapUI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapUI = null;


        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:68:2: (iv_ruleMapUI= ruleMapUI EOF )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:69:2: iv_ruleMapUI= ruleMapUI EOF
            {
             newCompositeNode(grammarAccess.getMapUIRule()); 
            pushFollow(FOLLOW_ruleMapUI_in_entryRuleMapUI75);
            iv_ruleMapUI=ruleMapUI();

            state._fsp--;

             current =iv_ruleMapUI; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapUI85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapUI"


    // $ANTLR start "ruleMapUI"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:76:1: ruleMapUI returns [EObject current=null] : ( (lv_Mappings_0_0= ruleMapping ) )* ;
    public final EObject ruleMapUI() throws RecognitionException {
        EObject current = null;

        EObject lv_Mappings_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:79:28: ( ( (lv_Mappings_0_0= ruleMapping ) )* )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:80:1: ( (lv_Mappings_0_0= ruleMapping ) )*
            {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:80:1: ( (lv_Mappings_0_0= ruleMapping ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:81:1: (lv_Mappings_0_0= ruleMapping )
            	    {
            	    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:81:1: (lv_Mappings_0_0= ruleMapping )
            	    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:82:3: lv_Mappings_0_0= ruleMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMapUIAccess().getMappingsMappingParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMapping_in_ruleMapUI130);
            	    lv_Mappings_0_0=ruleMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMapUIRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Mappings",
            	            		lv_Mappings_0_0, 
            	            		"Mapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapUI"


    // $ANTLR start "entryRuleMapping"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:106:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:107:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:108:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping166);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:115:1: ruleMapping returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:118:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:119:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:119:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:119:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:119:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:120:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:120:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:121:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapping218); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMappingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleMapping235); 

                	newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getColonKeyword_1());
                
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:141:1: ( (lv_type_2_0= ruleType ) )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:142:1: (lv_type_2_0= ruleType )
            {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:142:1: (lv_type_2_0= ruleType )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:143:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getMappingAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleMapping256);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMappingRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:167:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:168:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:169:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType293);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType304); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:176:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CheckBox_0= ruleCheckBox | this_RadioButton_1= ruleRadioButton | this_Image_2= ruleImage | this_Son_3= ruleSon | this_Video_4= ruleVideo ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CheckBox_0 = null;

        AntlrDatatypeRuleToken this_RadioButton_1 = null;

        AntlrDatatypeRuleToken this_Image_2 = null;

        AntlrDatatypeRuleToken this_Son_3 = null;

        AntlrDatatypeRuleToken this_Video_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:179:28: ( (this_CheckBox_0= ruleCheckBox | this_RadioButton_1= ruleRadioButton | this_Image_2= ruleImage | this_Son_3= ruleSon | this_Video_4= ruleVideo ) )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:180:1: (this_CheckBox_0= ruleCheckBox | this_RadioButton_1= ruleRadioButton | this_Image_2= ruleImage | this_Son_3= ruleSon | this_Video_4= ruleVideo )
            {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:180:1: (this_CheckBox_0= ruleCheckBox | this_RadioButton_1= ruleRadioButton | this_Image_2= ruleImage | this_Son_3= ruleSon | this_Video_4= ruleVideo )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 14:
            case 15:
                {
                alt2=3;
                }
                break;
            case 18:
            case 19:
                {
                alt2=4;
                }
                break;
            case 12:
            case 13:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:181:5: this_CheckBox_0= ruleCheckBox
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getCheckBoxParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCheckBox_in_ruleType351);
                    this_CheckBox_0=ruleCheckBox();

                    state._fsp--;


                    		current.merge(this_CheckBox_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:193:5: this_RadioButton_1= ruleRadioButton
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRadioButtonParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRadioButton_in_ruleType384);
                    this_RadioButton_1=ruleRadioButton();

                    state._fsp--;


                    		current.merge(this_RadioButton_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:205:5: this_Image_2= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getImageParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImage_in_ruleType417);
                    this_Image_2=ruleImage();

                    state._fsp--;


                    		current.merge(this_Image_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:217:5: this_Son_3= ruleSon
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSonParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSon_in_ruleType450);
                    this_Son_3=ruleSon();

                    state._fsp--;


                    		current.merge(this_Son_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:229:5: this_Video_4= ruleVideo
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getVideoParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleVideo_in_ruleType483);
                    this_Video_4=ruleVideo();

                    state._fsp--;


                    		current.merge(this_Video_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVideo"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:247:1: entryRuleVideo returns [String current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final String entryRuleVideo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVideo = null;


        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:248:2: (iv_ruleVideo= ruleVideo EOF )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:249:2: iv_ruleVideo= ruleVideo EOF
            {
             newCompositeNode(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_ruleVideo_in_entryRuleVideo529);
            iv_ruleVideo=ruleVideo();

            state._fsp--;

             current =iv_ruleVideo.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideo540); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:256:1: ruleVideo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'VideoCheck' | kw= 'VideoRadio' ) ;
    public final AntlrDatatypeRuleToken ruleVideo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:259:28: ( (kw= 'VideoCheck' | kw= 'VideoRadio' ) )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:260:1: (kw= 'VideoCheck' | kw= 'VideoRadio' )
            {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:260:1: (kw= 'VideoCheck' | kw= 'VideoRadio' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:261:2: kw= 'VideoCheck'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleVideo578); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVideoAccess().getVideoCheckKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:268:2: kw= 'VideoRadio'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleVideo597); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVideoAccess().getVideoRadioKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleImage"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:281:1: entryRuleImage returns [String current=null] : iv_ruleImage= ruleImage EOF ;
    public final String entryRuleImage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImage = null;


        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:282:2: (iv_ruleImage= ruleImage EOF )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:283:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage638);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage649); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:290:1: ruleImage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ImageCheck' | kw= 'ImageRadio' ) ;
    public final AntlrDatatypeRuleToken ruleImage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:293:28: ( (kw= 'ImageCheck' | kw= 'ImageRadio' ) )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:294:1: (kw= 'ImageCheck' | kw= 'ImageRadio' )
            {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:294:1: (kw= 'ImageCheck' | kw= 'ImageRadio' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:295:2: kw= 'ImageCheck'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleImage687); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getImageAccess().getImageCheckKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:302:2: kw= 'ImageRadio'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleImage706); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getImageAccess().getImageRadioKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleCheckBox"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:315:1: entryRuleCheckBox returns [String current=null] : iv_ruleCheckBox= ruleCheckBox EOF ;
    public final String entryRuleCheckBox() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCheckBox = null;


        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:316:2: (iv_ruleCheckBox= ruleCheckBox EOF )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:317:2: iv_ruleCheckBox= ruleCheckBox EOF
            {
             newCompositeNode(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_ruleCheckBox_in_entryRuleCheckBox747);
            iv_ruleCheckBox=ruleCheckBox();

            state._fsp--;

             current =iv_ruleCheckBox.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckBox758); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckBox"


    // $ANTLR start "ruleCheckBox"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:324:1: ruleCheckBox returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CheckBox' ;
    public final AntlrDatatypeRuleToken ruleCheckBox() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:327:28: (kw= 'CheckBox' )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:329:2: kw= 'CheckBox'
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleCheckBox795); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCheckBoxAccess().getCheckBoxKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckBox"


    // $ANTLR start "entryRuleRadioButton"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:342:1: entryRuleRadioButton returns [String current=null] : iv_ruleRadioButton= ruleRadioButton EOF ;
    public final String entryRuleRadioButton() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRadioButton = null;


        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:343:2: (iv_ruleRadioButton= ruleRadioButton EOF )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:344:2: iv_ruleRadioButton= ruleRadioButton EOF
            {
             newCompositeNode(grammarAccess.getRadioButtonRule()); 
            pushFollow(FOLLOW_ruleRadioButton_in_entryRuleRadioButton835);
            iv_ruleRadioButton=ruleRadioButton();

            state._fsp--;

             current =iv_ruleRadioButton.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioButton846); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRadioButton"


    // $ANTLR start "ruleRadioButton"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:351:1: ruleRadioButton returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'RadioButton' ;
    public final AntlrDatatypeRuleToken ruleRadioButton() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:354:28: (kw= 'RadioButton' )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:356:2: kw= 'RadioButton'
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleRadioButton883); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRadioButtonAccess().getRadioButtonKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRadioButton"


    // $ANTLR start "entryRuleSon"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:369:1: entryRuleSon returns [String current=null] : iv_ruleSon= ruleSon EOF ;
    public final String entryRuleSon() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSon = null;


        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:370:2: (iv_ruleSon= ruleSon EOF )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:371:2: iv_ruleSon= ruleSon EOF
            {
             newCompositeNode(grammarAccess.getSonRule()); 
            pushFollow(FOLLOW_ruleSon_in_entryRuleSon923);
            iv_ruleSon=ruleSon();

            state._fsp--;

             current =iv_ruleSon.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSon934); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSon"


    // $ANTLR start "ruleSon"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:378:1: ruleSon returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'SonCheck' | kw= 'SonRadio' ) ;
    public final AntlrDatatypeRuleToken ruleSon() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:381:28: ( (kw= 'SonCheck' | kw= 'SonRadio' ) )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:382:1: (kw= 'SonCheck' | kw= 'SonRadio' )
            {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:382:1: (kw= 'SonCheck' | kw= 'SonRadio' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:383:2: kw= 'SonCheck'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleSon972); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSonAccess().getSonCheckKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:390:2: kw= 'SonRadio'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleSon991); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSonAccess().getSonRadioKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSon"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMapUI_in_entryRuleMapUI75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapUI85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleMapUI130 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapping218 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleMapping235 = new BitSet(new long[]{0x00000000000FF000L});
    public static final BitSet FOLLOW_ruleType_in_ruleMapping256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_ruleType351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_ruleType384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_ruleType417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSon_in_ruleType450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideo_in_ruleType483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideo_in_entryRuleVideo529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideo540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleVideo578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleVideo597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImage687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImage706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_entryRuleCheckBox747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckBox758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleCheckBox795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_entryRuleRadioButton835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioButton846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRadioButton883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSon_in_entryRuleSon923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSon934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSon972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSon991 = new BitSet(new long[]{0x0000000000000002L});

}