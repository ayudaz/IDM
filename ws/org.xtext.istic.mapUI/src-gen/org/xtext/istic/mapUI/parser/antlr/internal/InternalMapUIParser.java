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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Question '", "':'", "'Checkbox'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
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
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:180:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Checkbox_0= ruleCheckbox ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Checkbox_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:183:28: (this_Checkbox_0= ruleCheckbox )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:185:5: this_Checkbox_0= ruleCheckbox
            {
             
                    newCompositeNode(grammarAccess.getTypeAccess().getCheckboxParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleCheckbox_in_ruleType362);
            this_Checkbox_0=ruleCheckbox();

            state._fsp--;


            		current.merge(this_Checkbox_0);
                
             
                    afterParserOrEnumRuleCall();
                

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


    // $ANTLR start "entryRuleCheckbox"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:203:1: entryRuleCheckbox returns [String current=null] : iv_ruleCheckbox= ruleCheckbox EOF ;
    public final String entryRuleCheckbox() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCheckbox = null;


        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:204:2: (iv_ruleCheckbox= ruleCheckbox EOF )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:205:2: iv_ruleCheckbox= ruleCheckbox EOF
            {
             newCompositeNode(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_ruleCheckbox_in_entryRuleCheckbox407);
            iv_ruleCheckbox=ruleCheckbox();

            state._fsp--;

             current =iv_ruleCheckbox.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckbox418); 

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
    // $ANTLR end "entryRuleCheckbox"


    // $ANTLR start "ruleCheckbox"
    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:212:1: ruleCheckbox returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Checkbox' ;
    public final AntlrDatatypeRuleToken ruleCheckbox() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:215:28: (kw= 'Checkbox' )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:217:2: kw= 'Checkbox'
            {
            kw=(Token)match(input,13,FOLLOW_13_in_ruleCheckbox455); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCheckboxAccess().getCheckboxKeyword()); 
                

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
    // $ANTLR end "ruleCheckbox"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMapUI_in_entryRuleMapUI75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapUI85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleMapUI130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMapping213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapping230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMapping247 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleType_in_ruleMapping268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_ruleType362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_entryRuleCheckbox407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckbox418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleCheckbox455 = new BitSet(new long[]{0x0000000000000002L});

}