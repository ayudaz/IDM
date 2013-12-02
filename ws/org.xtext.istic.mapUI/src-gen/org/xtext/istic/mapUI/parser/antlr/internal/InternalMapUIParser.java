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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Question '", "':'", "'CheckBox'", "'RadioButton'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
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

                if ( (LA1_0==11) ) {
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
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:115:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'Question ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:118:28: ( (otherlv_0= 'Question ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:119:1: (otherlv_0= 'Question ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:119:1: (otherlv_0= 'Question ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:119:3: otherlv_0= 'Question ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleMapping213); 

                	newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getQuestionKeyword_0());
                
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapping230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMappingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMapping247); 

                	newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getColonKeyword_2());
                
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:145:1: ( (lv_type_3_0= ruleType ) )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:146:1: (lv_type_3_0= ruleType )
            {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:146:1: (lv_type_3_0= ruleType )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:147:3: lv_type_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getMappingAccess().getTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleMapping268);
            lv_type_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMappingRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
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
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:171:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:172:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:173:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType305);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType316); 

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
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:180:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CheckBox_0= ruleCheckBox | this_RadioButton_1= ruleRadioButton ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CheckBox_0 = null;

        AntlrDatatypeRuleToken this_RadioButton_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:183:28: ( (this_CheckBox_0= ruleCheckBox | this_RadioButton_1= ruleRadioButton ) )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:184:1: (this_CheckBox_0= ruleCheckBox | this_RadioButton_1= ruleRadioButton )
            {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:184:1: (this_CheckBox_0= ruleCheckBox | this_RadioButton_1= ruleRadioButton )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:185:5: this_CheckBox_0= ruleCheckBox
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getCheckBoxParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCheckBox_in_ruleType363);
                    this_CheckBox_0=ruleCheckBox();

                    state._fsp--;


                    		current.merge(this_CheckBox_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:197:5: this_RadioButton_1= ruleRadioButton
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRadioButtonParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRadioButton_in_ruleType396);
                    this_RadioButton_1=ruleRadioButton();

                    state._fsp--;


                    		current.merge(this_RadioButton_1);
                        
                     
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


    // $ANTLR start "entryRuleCheckBox"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:215:1: entryRuleCheckBox returns [String current=null] : iv_ruleCheckBox= ruleCheckBox EOF ;
    public final String entryRuleCheckBox() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCheckBox = null;


        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:216:2: (iv_ruleCheckBox= ruleCheckBox EOF )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:217:2: iv_ruleCheckBox= ruleCheckBox EOF
            {
             newCompositeNode(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_ruleCheckBox_in_entryRuleCheckBox442);
            iv_ruleCheckBox=ruleCheckBox();

            state._fsp--;

             current =iv_ruleCheckBox.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckBox453); 

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
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:224:1: ruleCheckBox returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CheckBox' ;
    public final AntlrDatatypeRuleToken ruleCheckBox() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:227:28: (kw= 'CheckBox' )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:229:2: kw= 'CheckBox'
            {
            kw=(Token)match(input,13,FOLLOW_13_in_ruleCheckBox490); 

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
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:242:1: entryRuleRadioButton returns [String current=null] : iv_ruleRadioButton= ruleRadioButton EOF ;
    public final String entryRuleRadioButton() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRadioButton = null;


        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:243:2: (iv_ruleRadioButton= ruleRadioButton EOF )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:244:2: iv_ruleRadioButton= ruleRadioButton EOF
            {
             newCompositeNode(grammarAccess.getRadioButtonRule()); 
            pushFollow(FOLLOW_ruleRadioButton_in_entryRuleRadioButton530);
            iv_ruleRadioButton=ruleRadioButton();

            state._fsp--;

             current =iv_ruleRadioButton.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioButton541); 

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
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:251:1: ruleRadioButton returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'RadioButton' ;
    public final AntlrDatatypeRuleToken ruleRadioButton() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:254:28: (kw= 'RadioButton' )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:256:2: kw= 'RadioButton'
            {
            kw=(Token)match(input,14,FOLLOW_14_in_ruleRadioButton578); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMapUI_in_entryRuleMapUI75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapUI85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleMapUI130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMapping213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapping230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMapping247 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleType_in_ruleMapping268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_ruleType363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_ruleType396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_entryRuleCheckBox442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckBox453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleCheckBox490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_entryRuleRadioButton530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioButton541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleRadioButton578 = new BitSet(new long[]{0x0000000000000002L});

}