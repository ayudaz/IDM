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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Checkbox'", "'Question '", "':'"
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

                if ( (LA1_0==12) ) {
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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:125:1: ruleType : ( ruleCheckbox ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:129:2: ( ( ruleCheckbox ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:130:1: ( ruleCheckbox )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:130:1: ( ruleCheckbox )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:131:1: ruleCheckbox
            {
             before(grammarAccess.getTypeAccess().getCheckboxParserRuleCall()); 
            pushFollow(FOLLOW_ruleCheckbox_in_ruleType215);
            ruleCheckbox();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getCheckboxParserRuleCall()); 

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


    // $ANTLR start "entryRuleCheckbox"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:144:1: entryRuleCheckbox : ruleCheckbox EOF ;
    public final void entryRuleCheckbox() throws RecognitionException {
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:145:1: ( ruleCheckbox EOF )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:146:1: ruleCheckbox EOF
            {
             before(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_ruleCheckbox_in_entryRuleCheckbox241);
            ruleCheckbox();

            state._fsp--;

             after(grammarAccess.getCheckboxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckbox248); 

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
    // $ANTLR end "entryRuleCheckbox"


    // $ANTLR start "ruleCheckbox"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:153:1: ruleCheckbox : ( 'Checkbox' ) ;
    public final void ruleCheckbox() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:157:2: ( ( 'Checkbox' ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:158:1: ( 'Checkbox' )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:158:1: ( 'Checkbox' )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:159:1: 'Checkbox'
            {
             before(grammarAccess.getCheckboxAccess().getCheckboxKeyword()); 
            match(input,11,FOLLOW_11_in_ruleCheckbox275); 
             after(grammarAccess.getCheckboxAccess().getCheckboxKeyword()); 

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
    // $ANTLR end "ruleCheckbox"


    // $ANTLR start "rule__Mapping__Group__0"
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:176:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:180:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:181:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__0310);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__0313);
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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:188:1: rule__Mapping__Group__0__Impl : ( 'Question ' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:192:1: ( ( 'Question ' ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:193:1: ( 'Question ' )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:193:1: ( 'Question ' )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:194:1: 'Question '
            {
             before(grammarAccess.getMappingAccess().getQuestionKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Mapping__Group__0__Impl341); 
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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:207:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:211:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:212:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__1372);
            rule__Mapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__1375);
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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:219:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__NameAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:223:1: ( ( ( rule__Mapping__NameAssignment_1 ) ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:224:1: ( ( rule__Mapping__NameAssignment_1 ) )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:224:1: ( ( rule__Mapping__NameAssignment_1 ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:225:1: ( rule__Mapping__NameAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getNameAssignment_1()); 
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:226:1: ( rule__Mapping__NameAssignment_1 )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:226:2: rule__Mapping__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Mapping__NameAssignment_1_in_rule__Mapping__Group__1__Impl402);
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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:236:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:240:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:241:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
            {
            pushFollow(FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__2432);
            rule__Mapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__3_in_rule__Mapping__Group__2435);
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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:248:1: rule__Mapping__Group__2__Impl : ( ':' ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:252:1: ( ( ':' ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:253:1: ( ':' )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:253:1: ( ':' )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:254:1: ':'
            {
             before(grammarAccess.getMappingAccess().getColonKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Mapping__Group__2__Impl463); 
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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:267:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:271:1: ( rule__Mapping__Group__3__Impl )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:272:2: rule__Mapping__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group__3__Impl_in_rule__Mapping__Group__3494);
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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:278:1: rule__Mapping__Group__3__Impl : ( ( rule__Mapping__TypeAssignment_3 ) ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:282:1: ( ( ( rule__Mapping__TypeAssignment_3 ) ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:283:1: ( ( rule__Mapping__TypeAssignment_3 ) )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:283:1: ( ( rule__Mapping__TypeAssignment_3 ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:284:1: ( rule__Mapping__TypeAssignment_3 )
            {
             before(grammarAccess.getMappingAccess().getTypeAssignment_3()); 
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:285:1: ( rule__Mapping__TypeAssignment_3 )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:285:2: rule__Mapping__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Mapping__TypeAssignment_3_in_rule__Mapping__Group__3__Impl521);
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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:304:1: rule__MapUI__MappingsAssignment : ( ruleMapping ) ;
    public final void rule__MapUI__MappingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:308:1: ( ( ruleMapping ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:309:1: ( ruleMapping )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:309:1: ( ruleMapping )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:310:1: ruleMapping
            {
             before(grammarAccess.getMapUIAccess().getMappingsMappingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__MapUI__MappingsAssignment564);
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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:319:1: rule__Mapping__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mapping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:323:1: ( ( RULE_ID ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:324:1: ( RULE_ID )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:324:1: ( RULE_ID )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:325:1: RULE_ID
            {
             before(grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mapping__NameAssignment_1595); 
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
    // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:334:1: rule__Mapping__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Mapping__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:338:1: ( ( ruleType ) )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:339:1: ( ruleType )
            {
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:339:1: ( ruleType )
            // ../org.xtext.istic.mapUI.ui/src-gen/org/xtext/istic/mapUI/ui/contentassist/antlr/internal/InternalMapUI.g:340:1: ruleType
            {
             before(grammarAccess.getMappingAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Mapping__TypeAssignment_3626);
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
    public static final BitSet FOLLOW_rule__MapUI__MappingsAssignment_in_ruleMapUI94 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0_in_ruleMapping155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_ruleType215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_entryRuleCheckbox241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckbox248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCheckbox275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__0310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__0313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Mapping__Group__0__Impl341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__1372 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__NameAssignment_1_in_rule__Mapping__Group__1__Impl402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__2432 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Mapping__Group__3_in_rule__Mapping__Group__2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Mapping__Group__2__Impl463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__3__Impl_in_rule__Mapping__Group__3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__TypeAssignment_3_in_rule__Mapping__Group__3__Impl521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__MapUI__MappingsAssignment564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mapping__NameAssignment_1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Mapping__TypeAssignment_3626 = new BitSet(new long[]{0x0000000000000002L});

}