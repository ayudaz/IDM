package org.xtext.istic.mapUI.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.istic.mapUI.services.MapUIGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMapUIParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CheckBox'", "'RadioButton'", "'Question '", "':'"
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
    public String getGrammarFileName() { return "../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g"; }


     
     	private MapUIGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MapUIGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleMapUI"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:60:1: entryRuleMapUI : ruleMapUI EOF ;
    public final void entryRuleMapUI() throws RecognitionException {
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:61:1: ( ruleMapUI EOF )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:62:1: ruleMapUI EOF
            {
             before(grammarAccess.getMapUIRule()); 
            pushFollow(FOLLOW_ruleMapUI_in_entryRuleMapUI61);
            ruleMapUI();

            state._fsp--;

             after(grammarAccess.getMapUIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapUI68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapUI"


    // $ANTLR start "ruleMapUI"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:69:1: ruleMapUI : ( ( rule__MapUI__MappingsAssignment )* ) ;
    public final void ruleMapUI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:73:2: ( ( ( rule__MapUI__MappingsAssignment )* ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:74:1: ( ( rule__MapUI__MappingsAssignment )* )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:74:1: ( ( rule__MapUI__MappingsAssignment )* )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:75:1: ( rule__MapUI__MappingsAssignment )*
            {
             before(grammarAccess.getMapUIAccess().getMappingsAssignment()); 
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:76:1: ( rule__MapUI__MappingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:76:2: rule__MapUI__MappingsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__MapUI__MappingsAssignment_in_ruleMapUI94);
            	    rule__MapUI__MappingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMapUIAccess().getMappingsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapUI"


    // $ANTLR start "entryRuleMapping"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:88:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:89:1: ( ruleMapping EOF )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:90:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping122);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:97:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:101:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:102:1: ( ( rule__Mapping__Group__0 ) )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:102:1: ( ( rule__Mapping__Group__0 ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:103:1: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:104:1: ( rule__Mapping__Group__0 )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:104:2: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0_in_ruleMapping155);
            rule__Mapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:116:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:117:1: ( ruleType EOF )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:118:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType182);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:125:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:129:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:130:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:130:1: ( ( rule__Type__Alternatives ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:131:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:132:1: ( rule__Type__Alternatives )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:132:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType215);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleCheckBox"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:144:1: entryRuleCheckBox : ruleCheckBox EOF ;
    public final void entryRuleCheckBox() throws RecognitionException {
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:145:1: ( ruleCheckBox EOF )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:146:1: ruleCheckBox EOF
            {
             before(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_ruleCheckBox_in_entryRuleCheckBox242);
            ruleCheckBox();

            state._fsp--;

             after(grammarAccess.getCheckBoxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckBox249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheckBox"


    // $ANTLR start "ruleCheckBox"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:153:1: ruleCheckBox : ( 'CheckBox' ) ;
    public final void ruleCheckBox() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:157:2: ( ( 'CheckBox' ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:158:1: ( 'CheckBox' )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:158:1: ( 'CheckBox' )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:159:1: 'CheckBox'
            {
             before(grammarAccess.getCheckBoxAccess().getCheckBoxKeyword()); 
            match(input,11,FOLLOW_11_in_ruleCheckBox276); 
             after(grammarAccess.getCheckBoxAccess().getCheckBoxKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckBox"


    // $ANTLR start "entryRuleRadioButton"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:174:1: entryRuleRadioButton : ruleRadioButton EOF ;
    public final void entryRuleRadioButton() throws RecognitionException {
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:175:1: ( ruleRadioButton EOF )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:176:1: ruleRadioButton EOF
            {
             before(grammarAccess.getRadioButtonRule()); 
            pushFollow(FOLLOW_ruleRadioButton_in_entryRuleRadioButton304);
            ruleRadioButton();

            state._fsp--;

             after(grammarAccess.getRadioButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioButton311); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRadioButton"


    // $ANTLR start "ruleRadioButton"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:183:1: ruleRadioButton : ( 'RadioButton' ) ;
    public final void ruleRadioButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:187:2: ( ( 'RadioButton' ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:188:1: ( 'RadioButton' )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:188:1: ( 'RadioButton' )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:189:1: 'RadioButton'
            {
             before(grammarAccess.getRadioButtonAccess().getRadioButtonKeyword()); 
            match(input,12,FOLLOW_12_in_ruleRadioButton338); 
             after(grammarAccess.getRadioButtonAccess().getRadioButtonKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRadioButton"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:204:1: rule__Type__Alternatives : ( ( ruleCheckBox ) | ( ruleRadioButton ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:208:1: ( ( ruleCheckBox ) | ( ruleRadioButton ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:209:1: ( ruleCheckBox )
                    {
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:209:1: ( ruleCheckBox )
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:210:1: ruleCheckBox
                    {
                     before(grammarAccess.getTypeAccess().getCheckBoxParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCheckBox_in_rule__Type__Alternatives375);
                    ruleCheckBox();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getCheckBoxParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:215:6: ( ruleRadioButton )
                    {
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:215:6: ( ruleRadioButton )
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:216:1: ruleRadioButton
                    {
                     before(grammarAccess.getTypeAccess().getRadioButtonParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRadioButton_in_rule__Type__Alternatives392);
                    ruleRadioButton();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRadioButtonParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Mapping__Group__0"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:228:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:232:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:233:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__0422);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__0425);
            rule__Mapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0"


    // $ANTLR start "rule__Mapping__Group__0__Impl"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:240:1: rule__Mapping__Group__0__Impl : ( 'Question ' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:244:1: ( ( 'Question ' ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:245:1: ( 'Question ' )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:245:1: ( 'Question ' )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:246:1: 'Question '
            {
             before(grammarAccess.getMappingAccess().getQuestionKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Mapping__Group__0__Impl453); 
             after(grammarAccess.getMappingAccess().getQuestionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0__Impl"


    // $ANTLR start "rule__Mapping__Group__1"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:259:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:263:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:264:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__1484);
            rule__Mapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__1487);
            rule__Mapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1"


    // $ANTLR start "rule__Mapping__Group__1__Impl"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:271:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__NameAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:275:1: ( ( ( rule__Mapping__NameAssignment_1 ) ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:276:1: ( ( rule__Mapping__NameAssignment_1 ) )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:276:1: ( ( rule__Mapping__NameAssignment_1 ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:277:1: ( rule__Mapping__NameAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getNameAssignment_1()); 
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:278:1: ( rule__Mapping__NameAssignment_1 )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:278:2: rule__Mapping__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Mapping__NameAssignment_1_in_rule__Mapping__Group__1__Impl514);
            rule__Mapping__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1__Impl"


    // $ANTLR start "rule__Mapping__Group__2"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:288:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:292:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:293:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
            {
            pushFollow(FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__2544);
            rule__Mapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__3_in_rule__Mapping__Group__2547);
            rule__Mapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2"


    // $ANTLR start "rule__Mapping__Group__2__Impl"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:300:1: rule__Mapping__Group__2__Impl : ( ':' ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:304:1: ( ( ':' ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:305:1: ( ':' )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:305:1: ( ':' )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:306:1: ':'
            {
             before(grammarAccess.getMappingAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Mapping__Group__2__Impl575); 
             after(grammarAccess.getMappingAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2__Impl"


    // $ANTLR start "rule__Mapping__Group__3"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:319:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:323:1: ( rule__Mapping__Group__3__Impl )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:324:2: rule__Mapping__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group__3__Impl_in_rule__Mapping__Group__3606);
            rule__Mapping__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__3"


    // $ANTLR start "rule__Mapping__Group__3__Impl"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:330:1: rule__Mapping__Group__3__Impl : ( ( rule__Mapping__TypeAssignment_3 ) ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:334:1: ( ( ( rule__Mapping__TypeAssignment_3 ) ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:335:1: ( ( rule__Mapping__TypeAssignment_3 ) )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:335:1: ( ( rule__Mapping__TypeAssignment_3 ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:336:1: ( rule__Mapping__TypeAssignment_3 )
            {
             before(grammarAccess.getMappingAccess().getTypeAssignment_3()); 
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:337:1: ( rule__Mapping__TypeAssignment_3 )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:337:2: rule__Mapping__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Mapping__TypeAssignment_3_in_rule__Mapping__Group__3__Impl633);
            rule__Mapping__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__3__Impl"


    // $ANTLR start "rule__MapUI__MappingsAssignment"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:356:1: rule__MapUI__MappingsAssignment : ( ruleMapping ) ;
    public final void rule__MapUI__MappingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:360:1: ( ( ruleMapping ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:361:1: ( ruleMapping )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:361:1: ( ruleMapping )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:362:1: ruleMapping
            {
             before(grammarAccess.getMapUIAccess().getMappingsMappingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__MapUI__MappingsAssignment676);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMapUIAccess().getMappingsMappingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapUI__MappingsAssignment"


    // $ANTLR start "rule__Mapping__NameAssignment_1"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:371:1: rule__Mapping__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mapping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:375:1: ( ( RULE_ID ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:376:1: ( RULE_ID )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:376:1: ( RULE_ID )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:377:1: RULE_ID
            {
             before(grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mapping__NameAssignment_1707); 
             after(grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__NameAssignment_1"


    // $ANTLR start "rule__Mapping__TypeAssignment_3"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:386:1: rule__Mapping__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Mapping__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:390:1: ( ( ruleType ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:391:1: ( ruleType )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:391:1: ( ruleType )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:392:1: ruleType
            {
             before(grammarAccess.getMappingAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Mapping__TypeAssignment_3738);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__TypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMapUI_in_entryRuleMapUI61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapUI68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapUI__MappingsAssignment_in_ruleMapUI94 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0_in_ruleMapping155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_entryRuleCheckBox242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckBox249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCheckBox276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_entryRuleRadioButton304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioButton311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleRadioButton338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_rule__Type__Alternatives375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_rule__Type__Alternatives392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__0422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__0425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Mapping__Group__0__Impl453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__1484 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__NameAssignment_1_in_rule__Mapping__Group__1__Impl514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__2544 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Mapping__Group__3_in_rule__Mapping__Group__2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Mapping__Group__2__Impl575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__3__Impl_in_rule__Mapping__Group__3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__TypeAssignment_3_in_rule__Mapping__Group__3__Impl633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__MapUI__MappingsAssignment676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mapping__NameAssignment_1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Mapping__TypeAssignment_3738 = new BitSet(new long[]{0x0000000000000002L});

}