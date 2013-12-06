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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CheckBox'", "'RadioButton'", "'ImageCheck'", "'ImageRadio'", "'SonCheck'", "'SonRadio'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
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

                if ( (LA1_0==RULE_ID) ) {
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


    // $ANTLR start "entryRuleImage"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:144:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:145:1: ( ruleImage EOF )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:146:1: ruleImage EOF
            {
             before(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage242);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getImageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage249); 

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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:153:1: ruleImage : ( ( rule__Image__Alternatives ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:157:2: ( ( ( rule__Image__Alternatives ) ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:158:1: ( ( rule__Image__Alternatives ) )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:158:1: ( ( rule__Image__Alternatives ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:159:1: ( rule__Image__Alternatives )
            {
             before(grammarAccess.getImageAccess().getAlternatives()); 
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:160:1: ( rule__Image__Alternatives )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:160:2: rule__Image__Alternatives
            {
            pushFollow(FOLLOW_rule__Image__Alternatives_in_ruleImage275);
            rule__Image__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getAlternatives()); 

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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleCheckBox"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:172:1: entryRuleCheckBox : ruleCheckBox EOF ;
    public final void entryRuleCheckBox() throws RecognitionException {
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:173:1: ( ruleCheckBox EOF )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:174:1: ruleCheckBox EOF
            {
             before(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_ruleCheckBox_in_entryRuleCheckBox302);
            ruleCheckBox();

            state._fsp--;

             after(grammarAccess.getCheckBoxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckBox309); 

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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:181:1: ruleCheckBox : ( 'CheckBox' ) ;
    public final void ruleCheckBox() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:185:2: ( ( 'CheckBox' ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:186:1: ( 'CheckBox' )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:186:1: ( 'CheckBox' )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:187:1: 'CheckBox'
            {
             before(grammarAccess.getCheckBoxAccess().getCheckBoxKeyword()); 
            match(input,11,FOLLOW_11_in_ruleCheckBox336); 
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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:202:1: entryRuleRadioButton : ruleRadioButton EOF ;
    public final void entryRuleRadioButton() throws RecognitionException {
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:203:1: ( ruleRadioButton EOF )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:204:1: ruleRadioButton EOF
            {
             before(grammarAccess.getRadioButtonRule()); 
            pushFollow(FOLLOW_ruleRadioButton_in_entryRuleRadioButton364);
            ruleRadioButton();

            state._fsp--;

             after(grammarAccess.getRadioButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioButton371); 

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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:211:1: ruleRadioButton : ( 'RadioButton' ) ;
    public final void ruleRadioButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:215:2: ( ( 'RadioButton' ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:216:1: ( 'RadioButton' )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:216:1: ( 'RadioButton' )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:217:1: 'RadioButton'
            {
             before(grammarAccess.getRadioButtonAccess().getRadioButtonKeyword()); 
            match(input,12,FOLLOW_12_in_ruleRadioButton398); 
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


    // $ANTLR start "entryRuleSon"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:232:1: entryRuleSon : ruleSon EOF ;
    public final void entryRuleSon() throws RecognitionException {
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:233:1: ( ruleSon EOF )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:234:1: ruleSon EOF
            {
             before(grammarAccess.getSonRule()); 
            pushFollow(FOLLOW_ruleSon_in_entryRuleSon426);
            ruleSon();

            state._fsp--;

             after(grammarAccess.getSonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSon433); 

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
    // $ANTLR end "entryRuleSon"


    // $ANTLR start "ruleSon"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:241:1: ruleSon : ( ( rule__Son__Alternatives ) ) ;
    public final void ruleSon() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:245:2: ( ( ( rule__Son__Alternatives ) ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:246:1: ( ( rule__Son__Alternatives ) )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:246:1: ( ( rule__Son__Alternatives ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:247:1: ( rule__Son__Alternatives )
            {
             before(grammarAccess.getSonAccess().getAlternatives()); 
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:248:1: ( rule__Son__Alternatives )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:248:2: rule__Son__Alternatives
            {
            pushFollow(FOLLOW_rule__Son__Alternatives_in_ruleSon459);
            rule__Son__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSonAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSon"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:260:1: rule__Type__Alternatives : ( ( ruleCheckBox ) | ( ruleRadioButton ) | ( ruleImage ) | ( ruleSon ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:264:1: ( ( ruleCheckBox ) | ( ruleRadioButton ) | ( ruleImage ) | ( ruleSon ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
            case 16:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:265:1: ( ruleCheckBox )
                    {
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:265:1: ( ruleCheckBox )
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:266:1: ruleCheckBox
                    {
                     before(grammarAccess.getTypeAccess().getCheckBoxParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCheckBox_in_rule__Type__Alternatives495);
                    ruleCheckBox();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getCheckBoxParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:271:6: ( ruleRadioButton )
                    {
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:271:6: ( ruleRadioButton )
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:272:1: ruleRadioButton
                    {
                     before(grammarAccess.getTypeAccess().getRadioButtonParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRadioButton_in_rule__Type__Alternatives512);
                    ruleRadioButton();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRadioButtonParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:277:6: ( ruleImage )
                    {
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:277:6: ( ruleImage )
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:278:1: ruleImage
                    {
                     before(grammarAccess.getTypeAccess().getImageParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleImage_in_rule__Type__Alternatives529);
                    ruleImage();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getImageParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:283:6: ( ruleSon )
                    {
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:283:6: ( ruleSon )
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:284:1: ruleSon
                    {
                     before(grammarAccess.getTypeAccess().getSonParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSon_in_rule__Type__Alternatives546);
                    ruleSon();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSonParserRuleCall_3()); 

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


    // $ANTLR start "rule__Image__Alternatives"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:294:1: rule__Image__Alternatives : ( ( 'ImageCheck' ) | ( 'ImageRadio' ) );
    public final void rule__Image__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:298:1: ( ( 'ImageCheck' ) | ( 'ImageRadio' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:299:1: ( 'ImageCheck' )
                    {
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:299:1: ( 'ImageCheck' )
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:300:1: 'ImageCheck'
                    {
                     before(grammarAccess.getImageAccess().getImageCheckKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__Image__Alternatives579); 
                     after(grammarAccess.getImageAccess().getImageCheckKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:307:6: ( 'ImageRadio' )
                    {
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:307:6: ( 'ImageRadio' )
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:308:1: 'ImageRadio'
                    {
                     before(grammarAccess.getImageAccess().getImageRadioKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__Image__Alternatives599); 
                     after(grammarAccess.getImageAccess().getImageRadioKeyword_1()); 

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
    // $ANTLR end "rule__Image__Alternatives"


    // $ANTLR start "rule__Son__Alternatives"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:320:1: rule__Son__Alternatives : ( ( 'SonCheck' ) | ( 'SonRadio' ) );
    public final void rule__Son__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:324:1: ( ( 'SonCheck' ) | ( 'SonRadio' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:325:1: ( 'SonCheck' )
                    {
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:325:1: ( 'SonCheck' )
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:326:1: 'SonCheck'
                    {
                     before(grammarAccess.getSonAccess().getSonCheckKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__Son__Alternatives634); 
                     after(grammarAccess.getSonAccess().getSonCheckKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:333:6: ( 'SonRadio' )
                    {
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:333:6: ( 'SonRadio' )
                    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:334:1: 'SonRadio'
                    {
                     before(grammarAccess.getSonAccess().getSonRadioKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__Son__Alternatives654); 
                     after(grammarAccess.getSonAccess().getSonRadioKeyword_1()); 

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
    // $ANTLR end "rule__Son__Alternatives"


    // $ANTLR start "rule__Mapping__Group__0"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:348:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:352:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:353:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__0686);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__0689);
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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:360:1: rule__Mapping__Group__0__Impl : ( ( rule__Mapping__NameAssignment_0 ) ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:364:1: ( ( ( rule__Mapping__NameAssignment_0 ) ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:365:1: ( ( rule__Mapping__NameAssignment_0 ) )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:365:1: ( ( rule__Mapping__NameAssignment_0 ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:366:1: ( rule__Mapping__NameAssignment_0 )
            {
             before(grammarAccess.getMappingAccess().getNameAssignment_0()); 
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:367:1: ( rule__Mapping__NameAssignment_0 )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:367:2: rule__Mapping__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Mapping__NameAssignment_0_in_rule__Mapping__Group__0__Impl716);
            rule__Mapping__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getNameAssignment_0()); 

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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:377:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:381:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:382:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__1746);
            rule__Mapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__1749);
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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:389:1: rule__Mapping__Group__1__Impl : ( ':' ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:393:1: ( ( ':' ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:394:1: ( ':' )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:394:1: ( ':' )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:395:1: ':'
            {
             before(grammarAccess.getMappingAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Mapping__Group__1__Impl777); 
             after(grammarAccess.getMappingAccess().getColonKeyword_1()); 

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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:408:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:412:1: ( rule__Mapping__Group__2__Impl )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:413:2: rule__Mapping__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__2808);
            rule__Mapping__Group__2__Impl();

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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:419:1: rule__Mapping__Group__2__Impl : ( ( rule__Mapping__TypeAssignment_2 ) ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:423:1: ( ( ( rule__Mapping__TypeAssignment_2 ) ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:424:1: ( ( rule__Mapping__TypeAssignment_2 ) )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:424:1: ( ( rule__Mapping__TypeAssignment_2 ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:425:1: ( rule__Mapping__TypeAssignment_2 )
            {
             before(grammarAccess.getMappingAccess().getTypeAssignment_2()); 
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:426:1: ( rule__Mapping__TypeAssignment_2 )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:426:2: rule__Mapping__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Mapping__TypeAssignment_2_in_rule__Mapping__Group__2__Impl835);
            rule__Mapping__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getTypeAssignment_2()); 

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


    // $ANTLR start "rule__MapUI__MappingsAssignment"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:443:1: rule__MapUI__MappingsAssignment : ( ruleMapping ) ;
    public final void rule__MapUI__MappingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:447:1: ( ( ruleMapping ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:448:1: ( ruleMapping )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:448:1: ( ruleMapping )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:449:1: ruleMapping
            {
             before(grammarAccess.getMapUIAccess().getMappingsMappingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__MapUI__MappingsAssignment876);
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


    // $ANTLR start "rule__Mapping__NameAssignment_0"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:458:1: rule__Mapping__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Mapping__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:462:1: ( ( RULE_ID ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:463:1: ( RULE_ID )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:463:1: ( RULE_ID )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:464:1: RULE_ID
            {
             before(grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mapping__NameAssignment_0907); 
             after(grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Mapping__NameAssignment_0"


    // $ANTLR start "rule__Mapping__TypeAssignment_2"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:473:1: rule__Mapping__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Mapping__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:477:1: ( ( ruleType ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:478:1: ( ruleType )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:478:1: ( ruleType )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:479:1: ruleType
            {
             before(grammarAccess.getMappingAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Mapping__TypeAssignment_2938);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getTypeTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Mapping__TypeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMapUI_in_entryRuleMapUI61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapUI68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapUI__MappingsAssignment_in_ruleMapUI94 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0_in_ruleMapping155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Alternatives_in_ruleImage275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_entryRuleCheckBox302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckBox309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCheckBox336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_entryRuleRadioButton364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioButton371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleRadioButton398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSon_in_entryRuleSon426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSon433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Son__Alternatives_in_ruleSon459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_rule__Type__Alternatives495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_rule__Type__Alternatives512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_rule__Type__Alternatives529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSon_in_rule__Type__Alternatives546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Image__Alternatives579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Image__Alternatives599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Son__Alternatives634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Son__Alternatives654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__0686 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__0689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__NameAssignment_0_in_rule__Mapping__Group__0__Impl716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__1746 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Mapping__Group__1__Impl777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__TypeAssignment_2_in_rule__Mapping__Group__2__Impl835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__MapUI__MappingsAssignment876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mapping__NameAssignment_0907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Mapping__TypeAssignment_2938 = new BitSet(new long[]{0x0000000000000002L});

}