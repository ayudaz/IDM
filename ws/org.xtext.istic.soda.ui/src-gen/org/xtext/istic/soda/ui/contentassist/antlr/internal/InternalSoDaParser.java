package org.xtext.istic.soda.ui.contentassist.antlr.internal; 

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
import org.xtext.istic.soda.services.SoDaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSoDaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Poll'", "'{'", "'}'", "'Question'", "'options'", "'=>'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalSoDaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSoDaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSoDaParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g"; }


     
     	private SoDaGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SoDaGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSoda"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:60:1: entryRuleSoda : ruleSoda EOF ;
    public final void entryRuleSoda() throws RecognitionException {
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:61:1: ( ruleSoda EOF )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:62:1: ruleSoda EOF
            {
             before(grammarAccess.getSodaRule()); 
            pushFollow(FOLLOW_ruleSoda_in_entryRuleSoda61);
            ruleSoda();

            state._fsp--;

             after(grammarAccess.getSodaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoda68); 

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
    // $ANTLR end "entryRuleSoda"


    // $ANTLR start "ruleSoda"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:69:1: ruleSoda : ( ( rule__Soda__PollsAssignment )* ) ;
    public final void ruleSoda() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:73:2: ( ( ( rule__Soda__PollsAssignment )* ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:74:1: ( ( rule__Soda__PollsAssignment )* )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:74:1: ( ( rule__Soda__PollsAssignment )* )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:75:1: ( rule__Soda__PollsAssignment )*
            {
             before(grammarAccess.getSodaAccess().getPollsAssignment()); 
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:76:1: ( rule__Soda__PollsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:76:2: rule__Soda__PollsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Soda__PollsAssignment_in_ruleSoda94);
            	    rule__Soda__PollsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSodaAccess().getPollsAssignment()); 

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
    // $ANTLR end "ruleSoda"


    // $ANTLR start "entryRulePoll"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:88:1: entryRulePoll : rulePoll EOF ;
    public final void entryRulePoll() throws RecognitionException {
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:89:1: ( rulePoll EOF )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:90:1: rulePoll EOF
            {
             before(grammarAccess.getPollRule()); 
            pushFollow(FOLLOW_rulePoll_in_entryRulePoll122);
            rulePoll();

            state._fsp--;

             after(grammarAccess.getPollRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoll129); 

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
    // $ANTLR end "entryRulePoll"


    // $ANTLR start "rulePoll"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:97:1: rulePoll : ( ( rule__Poll__Group__0 ) ) ;
    public final void rulePoll() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:101:2: ( ( ( rule__Poll__Group__0 ) ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:102:1: ( ( rule__Poll__Group__0 ) )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:102:1: ( ( rule__Poll__Group__0 ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:103:1: ( rule__Poll__Group__0 )
            {
             before(grammarAccess.getPollAccess().getGroup()); 
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:104:1: ( rule__Poll__Group__0 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:104:2: rule__Poll__Group__0
            {
            pushFollow(FOLLOW_rule__Poll__Group__0_in_rulePoll155);
            rule__Poll__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPollAccess().getGroup()); 

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
    // $ANTLR end "rulePoll"


    // $ANTLR start "entryRuleQuestion"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:116:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:117:1: ( ruleQuestion EOF )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:118:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion182);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion189); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:125:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:129:2: ( ( ( rule__Question__Group__0 ) ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:130:1: ( ( rule__Question__Group__0 ) )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:130:1: ( ( rule__Question__Group__0 ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:131:1: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:132:1: ( rule__Question__Group__0 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:132:2: rule__Question__Group__0
            {
            pushFollow(FOLLOW_rule__Question__Group__0_in_ruleQuestion215);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleOption"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:144:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:145:1: ( ruleOption EOF )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:146:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption242);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption249); 

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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:153:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:157:2: ( ( ( rule__Option__Group__0 ) ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:158:1: ( ( rule__Option__Group__0 ) )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:158:1: ( ( rule__Option__Group__0 ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:159:1: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:160:1: ( rule__Option__Group__0 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:160:2: rule__Option__Group__0
            {
            pushFollow(FOLLOW_rule__Option__Group__0_in_ruleOption275);
            rule__Option__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getGroup()); 

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
    // $ANTLR end "ruleOption"


    // $ANTLR start "rule__Poll__Group__0"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:174:1: rule__Poll__Group__0 : rule__Poll__Group__0__Impl rule__Poll__Group__1 ;
    public final void rule__Poll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:178:1: ( rule__Poll__Group__0__Impl rule__Poll__Group__1 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:179:2: rule__Poll__Group__0__Impl rule__Poll__Group__1
            {
            pushFollow(FOLLOW_rule__Poll__Group__0__Impl_in_rule__Poll__Group__0309);
            rule__Poll__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poll__Group__1_in_rule__Poll__Group__0312);
            rule__Poll__Group__1();

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
    // $ANTLR end "rule__Poll__Group__0"


    // $ANTLR start "rule__Poll__Group__0__Impl"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:186:1: rule__Poll__Group__0__Impl : ( 'Poll' ) ;
    public final void rule__Poll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:190:1: ( ( 'Poll' ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:191:1: ( 'Poll' )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:191:1: ( 'Poll' )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:192:1: 'Poll'
            {
             before(grammarAccess.getPollAccess().getPollKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Poll__Group__0__Impl340); 
             after(grammarAccess.getPollAccess().getPollKeyword_0()); 

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
    // $ANTLR end "rule__Poll__Group__0__Impl"


    // $ANTLR start "rule__Poll__Group__1"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:205:1: rule__Poll__Group__1 : rule__Poll__Group__1__Impl rule__Poll__Group__2 ;
    public final void rule__Poll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:209:1: ( rule__Poll__Group__1__Impl rule__Poll__Group__2 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:210:2: rule__Poll__Group__1__Impl rule__Poll__Group__2
            {
            pushFollow(FOLLOW_rule__Poll__Group__1__Impl_in_rule__Poll__Group__1371);
            rule__Poll__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poll__Group__2_in_rule__Poll__Group__1374);
            rule__Poll__Group__2();

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
    // $ANTLR end "rule__Poll__Group__1"


    // $ANTLR start "rule__Poll__Group__1__Impl"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:217:1: rule__Poll__Group__1__Impl : ( ( rule__Poll__NameAssignment_1 )? ) ;
    public final void rule__Poll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:221:1: ( ( ( rule__Poll__NameAssignment_1 )? ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:222:1: ( ( rule__Poll__NameAssignment_1 )? )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:222:1: ( ( rule__Poll__NameAssignment_1 )? )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:223:1: ( rule__Poll__NameAssignment_1 )?
            {
             before(grammarAccess.getPollAccess().getNameAssignment_1()); 
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:224:1: ( rule__Poll__NameAssignment_1 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:224:2: rule__Poll__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Poll__NameAssignment_1_in_rule__Poll__Group__1__Impl401);
                    rule__Poll__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPollAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Poll__Group__1__Impl"


    // $ANTLR start "rule__Poll__Group__2"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:234:1: rule__Poll__Group__2 : rule__Poll__Group__2__Impl rule__Poll__Group__3 ;
    public final void rule__Poll__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:238:1: ( rule__Poll__Group__2__Impl rule__Poll__Group__3 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:239:2: rule__Poll__Group__2__Impl rule__Poll__Group__3
            {
            pushFollow(FOLLOW_rule__Poll__Group__2__Impl_in_rule__Poll__Group__2432);
            rule__Poll__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poll__Group__3_in_rule__Poll__Group__2435);
            rule__Poll__Group__3();

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
    // $ANTLR end "rule__Poll__Group__2"


    // $ANTLR start "rule__Poll__Group__2__Impl"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:246:1: rule__Poll__Group__2__Impl : ( '{' ) ;
    public final void rule__Poll__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:250:1: ( ( '{' ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:251:1: ( '{' )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:251:1: ( '{' )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:252:1: '{'
            {
             before(grammarAccess.getPollAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Poll__Group__2__Impl463); 
             after(grammarAccess.getPollAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Poll__Group__2__Impl"


    // $ANTLR start "rule__Poll__Group__3"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:265:1: rule__Poll__Group__3 : rule__Poll__Group__3__Impl rule__Poll__Group__4 ;
    public final void rule__Poll__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:269:1: ( rule__Poll__Group__3__Impl rule__Poll__Group__4 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:270:2: rule__Poll__Group__3__Impl rule__Poll__Group__4
            {
            pushFollow(FOLLOW_rule__Poll__Group__3__Impl_in_rule__Poll__Group__3494);
            rule__Poll__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poll__Group__4_in_rule__Poll__Group__3497);
            rule__Poll__Group__4();

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
    // $ANTLR end "rule__Poll__Group__3"


    // $ANTLR start "rule__Poll__Group__3__Impl"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:277:1: rule__Poll__Group__3__Impl : ( ( ( rule__Poll__QuestionsAssignment_3 ) ) ( ( rule__Poll__QuestionsAssignment_3 )* ) ) ;
    public final void rule__Poll__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:281:1: ( ( ( ( rule__Poll__QuestionsAssignment_3 ) ) ( ( rule__Poll__QuestionsAssignment_3 )* ) ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:282:1: ( ( ( rule__Poll__QuestionsAssignment_3 ) ) ( ( rule__Poll__QuestionsAssignment_3 )* ) )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:282:1: ( ( ( rule__Poll__QuestionsAssignment_3 ) ) ( ( rule__Poll__QuestionsAssignment_3 )* ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:283:1: ( ( rule__Poll__QuestionsAssignment_3 ) ) ( ( rule__Poll__QuestionsAssignment_3 )* )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:283:1: ( ( rule__Poll__QuestionsAssignment_3 ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:284:1: ( rule__Poll__QuestionsAssignment_3 )
            {
             before(grammarAccess.getPollAccess().getQuestionsAssignment_3()); 
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:285:1: ( rule__Poll__QuestionsAssignment_3 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:285:2: rule__Poll__QuestionsAssignment_3
            {
            pushFollow(FOLLOW_rule__Poll__QuestionsAssignment_3_in_rule__Poll__Group__3__Impl526);
            rule__Poll__QuestionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPollAccess().getQuestionsAssignment_3()); 

            }

            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:288:1: ( ( rule__Poll__QuestionsAssignment_3 )* )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:289:1: ( rule__Poll__QuestionsAssignment_3 )*
            {
             before(grammarAccess.getPollAccess().getQuestionsAssignment_3()); 
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:290:1: ( rule__Poll__QuestionsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:290:2: rule__Poll__QuestionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Poll__QuestionsAssignment_3_in_rule__Poll__Group__3__Impl538);
            	    rule__Poll__QuestionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPollAccess().getQuestionsAssignment_3()); 

            }


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
    // $ANTLR end "rule__Poll__Group__3__Impl"


    // $ANTLR start "rule__Poll__Group__4"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:301:1: rule__Poll__Group__4 : rule__Poll__Group__4__Impl ;
    public final void rule__Poll__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:305:1: ( rule__Poll__Group__4__Impl )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:306:2: rule__Poll__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Poll__Group__4__Impl_in_rule__Poll__Group__4571);
            rule__Poll__Group__4__Impl();

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
    // $ANTLR end "rule__Poll__Group__4"


    // $ANTLR start "rule__Poll__Group__4__Impl"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:312:1: rule__Poll__Group__4__Impl : ( '}' ) ;
    public final void rule__Poll__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:316:1: ( ( '}' ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:317:1: ( '}' )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:317:1: ( '}' )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:318:1: '}'
            {
             before(grammarAccess.getPollAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Poll__Group__4__Impl599); 
             after(grammarAccess.getPollAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Poll__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:341:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:345:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:346:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0640);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0643);
            rule__Question__Group__1();

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
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:353:1: rule__Question__Group__0__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:357:1: ( ( 'Question' ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:358:1: ( 'Question' )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:358:1: ( 'Question' )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:359:1: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Question__Group__0__Impl671); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 

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
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:372:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:376:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:377:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__1702);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__2_in_rule__Question__Group__1705);
            rule__Question__Group__2();

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
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:384:1: rule__Question__Group__1__Impl : ( ( rule__Question__NameAssignment_1 )? ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:388:1: ( ( ( rule__Question__NameAssignment_1 )? ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:389:1: ( ( rule__Question__NameAssignment_1 )? )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:389:1: ( ( rule__Question__NameAssignment_1 )? )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:390:1: ( rule__Question__NameAssignment_1 )?
            {
             before(grammarAccess.getQuestionAccess().getNameAssignment_1()); 
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:391:1: ( rule__Question__NameAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:391:2: rule__Question__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Question__NameAssignment_1_in_rule__Question__Group__1__Impl732);
                    rule__Question__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:401:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:405:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:406:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__2763);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__3_in_rule__Question__Group__2766);
            rule__Question__Group__3();

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
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:413:1: rule__Question__Group__2__Impl : ( '{' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:417:1: ( ( '{' ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:418:1: ( '{' )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:418:1: ( '{' )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:419:1: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Question__Group__2__Impl794); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:432:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:436:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:437:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__3825);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__4_in_rule__Question__Group__3828);
            rule__Question__Group__4();

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
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:444:1: rule__Question__Group__3__Impl : ( ( rule__Question__QueryAssignment_3 ) ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:448:1: ( ( ( rule__Question__QueryAssignment_3 ) ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:449:1: ( ( rule__Question__QueryAssignment_3 ) )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:449:1: ( ( rule__Question__QueryAssignment_3 ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:450:1: ( rule__Question__QueryAssignment_3 )
            {
             before(grammarAccess.getQuestionAccess().getQueryAssignment_3()); 
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:451:1: ( rule__Question__QueryAssignment_3 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:451:2: rule__Question__QueryAssignment_3
            {
            pushFollow(FOLLOW_rule__Question__QueryAssignment_3_in_rule__Question__Group__3__Impl855);
            rule__Question__QueryAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getQueryAssignment_3()); 

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
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:461:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:465:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:466:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__4885);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__5_in_rule__Question__Group__4888);
            rule__Question__Group__5();

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
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:473:1: rule__Question__Group__4__Impl : ( 'options' ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:477:1: ( ( 'options' ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:478:1: ( 'options' )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:478:1: ( 'options' )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:479:1: 'options'
            {
             before(grammarAccess.getQuestionAccess().getOptionsKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Question__Group__4__Impl916); 
             after(grammarAccess.getQuestionAccess().getOptionsKeyword_4()); 

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
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__5"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:492:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:496:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:497:2: rule__Question__Group__5__Impl rule__Question__Group__6
            {
            pushFollow(FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__5947);
            rule__Question__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__6_in_rule__Question__Group__5950);
            rule__Question__Group__6();

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
    // $ANTLR end "rule__Question__Group__5"


    // $ANTLR start "rule__Question__Group__5__Impl"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:504:1: rule__Question__Group__5__Impl : ( ( ( rule__Question__OptionsAssignment_5 ) ) ( ( rule__Question__OptionsAssignment_5 )* ) ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:508:1: ( ( ( ( rule__Question__OptionsAssignment_5 ) ) ( ( rule__Question__OptionsAssignment_5 )* ) ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:509:1: ( ( ( rule__Question__OptionsAssignment_5 ) ) ( ( rule__Question__OptionsAssignment_5 )* ) )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:509:1: ( ( ( rule__Question__OptionsAssignment_5 ) ) ( ( rule__Question__OptionsAssignment_5 )* ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:510:1: ( ( rule__Question__OptionsAssignment_5 ) ) ( ( rule__Question__OptionsAssignment_5 )* )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:510:1: ( ( rule__Question__OptionsAssignment_5 ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:511:1: ( rule__Question__OptionsAssignment_5 )
            {
             before(grammarAccess.getQuestionAccess().getOptionsAssignment_5()); 
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:512:1: ( rule__Question__OptionsAssignment_5 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:512:2: rule__Question__OptionsAssignment_5
            {
            pushFollow(FOLLOW_rule__Question__OptionsAssignment_5_in_rule__Question__Group__5__Impl979);
            rule__Question__OptionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getOptionsAssignment_5()); 

            }

            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:515:1: ( ( rule__Question__OptionsAssignment_5 )* )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:516:1: ( rule__Question__OptionsAssignment_5 )*
            {
             before(grammarAccess.getQuestionAccess().getOptionsAssignment_5()); 
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:517:1: ( rule__Question__OptionsAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:517:2: rule__Question__OptionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Question__OptionsAssignment_5_in_rule__Question__Group__5__Impl991);
            	    rule__Question__OptionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getOptionsAssignment_5()); 

            }


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
    // $ANTLR end "rule__Question__Group__5__Impl"


    // $ANTLR start "rule__Question__Group__6"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:528:1: rule__Question__Group__6 : rule__Question__Group__6__Impl ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:532:1: ( rule__Question__Group__6__Impl )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:533:2: rule__Question__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__61024);
            rule__Question__Group__6__Impl();

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
    // $ANTLR end "rule__Question__Group__6"


    // $ANTLR start "rule__Question__Group__6__Impl"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:539:1: rule__Question__Group__6__Impl : ( '}' ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:543:1: ( ( '}' ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:544:1: ( '}' )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:544:1: ( '}' )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:545:1: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Question__Group__6__Impl1052); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Question__Group__6__Impl"


    // $ANTLR start "rule__Option__Group__0"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:572:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:576:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:577:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__01097);
            rule__Option__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Option__Group__1_in_rule__Option__Group__01100);
            rule__Option__Group__1();

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
    // $ANTLR end "rule__Option__Group__0"


    // $ANTLR start "rule__Option__Group__0__Impl"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:584:1: rule__Option__Group__0__Impl : ( ( rule__Option__Group_0__0 )? ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:588:1: ( ( ( rule__Option__Group_0__0 )? ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:589:1: ( ( rule__Option__Group_0__0 )? )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:589:1: ( ( rule__Option__Group_0__0 )? )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:590:1: ( rule__Option__Group_0__0 )?
            {
             before(grammarAccess.getOptionAccess().getGroup_0()); 
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:591:1: ( rule__Option__Group_0__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:591:2: rule__Option__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Option__Group_0__0_in_rule__Option__Group__0__Impl1127);
                    rule__Option__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Option__Group__0__Impl"


    // $ANTLR start "rule__Option__Group__1"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:601:1: rule__Option__Group__1 : rule__Option__Group__1__Impl ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:605:1: ( rule__Option__Group__1__Impl )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:606:2: rule__Option__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__11158);
            rule__Option__Group__1__Impl();

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
    // $ANTLR end "rule__Option__Group__1"


    // $ANTLR start "rule__Option__Group__1__Impl"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:612:1: rule__Option__Group__1__Impl : ( ( rule__Option__ReponseAssignment_1 ) ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:616:1: ( ( ( rule__Option__ReponseAssignment_1 ) ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:617:1: ( ( rule__Option__ReponseAssignment_1 ) )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:617:1: ( ( rule__Option__ReponseAssignment_1 ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:618:1: ( rule__Option__ReponseAssignment_1 )
            {
             before(grammarAccess.getOptionAccess().getReponseAssignment_1()); 
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:619:1: ( rule__Option__ReponseAssignment_1 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:619:2: rule__Option__ReponseAssignment_1
            {
            pushFollow(FOLLOW_rule__Option__ReponseAssignment_1_in_rule__Option__Group__1__Impl1185);
            rule__Option__ReponseAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getReponseAssignment_1()); 

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
    // $ANTLR end "rule__Option__Group__1__Impl"


    // $ANTLR start "rule__Option__Group_0__0"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:633:1: rule__Option__Group_0__0 : rule__Option__Group_0__0__Impl rule__Option__Group_0__1 ;
    public final void rule__Option__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:637:1: ( rule__Option__Group_0__0__Impl rule__Option__Group_0__1 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:638:2: rule__Option__Group_0__0__Impl rule__Option__Group_0__1
            {
            pushFollow(FOLLOW_rule__Option__Group_0__0__Impl_in_rule__Option__Group_0__01219);
            rule__Option__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Option__Group_0__1_in_rule__Option__Group_0__01222);
            rule__Option__Group_0__1();

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
    // $ANTLR end "rule__Option__Group_0__0"


    // $ANTLR start "rule__Option__Group_0__0__Impl"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:645:1: rule__Option__Group_0__0__Impl : ( ( rule__Option__IdAssignment_0_0 ) ) ;
    public final void rule__Option__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:649:1: ( ( ( rule__Option__IdAssignment_0_0 ) ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:650:1: ( ( rule__Option__IdAssignment_0_0 ) )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:650:1: ( ( rule__Option__IdAssignment_0_0 ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:651:1: ( rule__Option__IdAssignment_0_0 )
            {
             before(grammarAccess.getOptionAccess().getIdAssignment_0_0()); 
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:652:1: ( rule__Option__IdAssignment_0_0 )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:652:2: rule__Option__IdAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Option__IdAssignment_0_0_in_rule__Option__Group_0__0__Impl1249);
            rule__Option__IdAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getIdAssignment_0_0()); 

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
    // $ANTLR end "rule__Option__Group_0__0__Impl"


    // $ANTLR start "rule__Option__Group_0__1"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:662:1: rule__Option__Group_0__1 : rule__Option__Group_0__1__Impl ;
    public final void rule__Option__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:666:1: ( rule__Option__Group_0__1__Impl )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:667:2: rule__Option__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Option__Group_0__1__Impl_in_rule__Option__Group_0__11279);
            rule__Option__Group_0__1__Impl();

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
    // $ANTLR end "rule__Option__Group_0__1"


    // $ANTLR start "rule__Option__Group_0__1__Impl"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:673:1: rule__Option__Group_0__1__Impl : ( '=>' ) ;
    public final void rule__Option__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:677:1: ( ( '=>' ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:678:1: ( '=>' )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:678:1: ( '=>' )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:679:1: '=>'
            {
             before(grammarAccess.getOptionAccess().getEqualsSignGreaterThanSignKeyword_0_1()); 
            match(input,16,FOLLOW_16_in_rule__Option__Group_0__1__Impl1307); 
             after(grammarAccess.getOptionAccess().getEqualsSignGreaterThanSignKeyword_0_1()); 

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
    // $ANTLR end "rule__Option__Group_0__1__Impl"


    // $ANTLR start "rule__Soda__PollsAssignment"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:697:1: rule__Soda__PollsAssignment : ( rulePoll ) ;
    public final void rule__Soda__PollsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:701:1: ( ( rulePoll ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:702:1: ( rulePoll )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:702:1: ( rulePoll )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:703:1: rulePoll
            {
             before(grammarAccess.getSodaAccess().getPollsPollParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePoll_in_rule__Soda__PollsAssignment1347);
            rulePoll();

            state._fsp--;

             after(grammarAccess.getSodaAccess().getPollsPollParserRuleCall_0()); 

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
    // $ANTLR end "rule__Soda__PollsAssignment"


    // $ANTLR start "rule__Poll__NameAssignment_1"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:712:1: rule__Poll__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Poll__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:716:1: ( ( RULE_ID ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:717:1: ( RULE_ID )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:717:1: ( RULE_ID )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:718:1: RULE_ID
            {
             before(grammarAccess.getPollAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Poll__NameAssignment_11378); 
             after(grammarAccess.getPollAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Poll__NameAssignment_1"


    // $ANTLR start "rule__Poll__QuestionsAssignment_3"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:727:1: rule__Poll__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Poll__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:731:1: ( ( ruleQuestion ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:732:1: ( ruleQuestion )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:732:1: ( ruleQuestion )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:733:1: ruleQuestion
            {
             before(grammarAccess.getPollAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Poll__QuestionsAssignment_31409);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getPollAccess().getQuestionsQuestionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Poll__QuestionsAssignment_3"


    // $ANTLR start "rule__Question__NameAssignment_1"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:742:1: rule__Question__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Question__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:746:1: ( ( RULE_ID ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:747:1: ( RULE_ID )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:747:1: ( RULE_ID )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:748:1: RULE_ID
            {
             before(grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Question__NameAssignment_11440); 
             after(grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Question__NameAssignment_1"


    // $ANTLR start "rule__Question__QueryAssignment_3"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:757:1: rule__Question__QueryAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Question__QueryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:761:1: ( ( RULE_STRING ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:762:1: ( RULE_STRING )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:762:1: ( RULE_STRING )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:763:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAccess().getQuerySTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Question__QueryAssignment_31471); 
             after(grammarAccess.getQuestionAccess().getQuerySTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Question__QueryAssignment_3"


    // $ANTLR start "rule__Question__OptionsAssignment_5"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:772:1: rule__Question__OptionsAssignment_5 : ( ruleOption ) ;
    public final void rule__Question__OptionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:776:1: ( ( ruleOption ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:777:1: ( ruleOption )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:777:1: ( ruleOption )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:778:1: ruleOption
            {
             before(grammarAccess.getQuestionAccess().getOptionsOptionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleOption_in_rule__Question__OptionsAssignment_51502);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getOptionsOptionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Question__OptionsAssignment_5"


    // $ANTLR start "rule__Option__IdAssignment_0_0"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:787:1: rule__Option__IdAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Option__IdAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:791:1: ( ( RULE_ID ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:792:1: ( RULE_ID )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:792:1: ( RULE_ID )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:793:1: RULE_ID
            {
             before(grammarAccess.getOptionAccess().getIdIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Option__IdAssignment_0_01533); 
             after(grammarAccess.getOptionAccess().getIdIDTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Option__IdAssignment_0_0"


    // $ANTLR start "rule__Option__ReponseAssignment_1"
    // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:802:1: rule__Option__ReponseAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Option__ReponseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:806:1: ( ( RULE_STRING ) )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:807:1: ( RULE_STRING )
            {
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:807:1: ( RULE_STRING )
            // ../org.xtext.istic.soda.ui/src-gen/org/xtext/istic/soda/ui/contentassist/antlr/internal/InternalSoDa.g:808:1: RULE_STRING
            {
             before(grammarAccess.getOptionAccess().getReponseSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Option__ReponseAssignment_11564); 
             after(grammarAccess.getOptionAccess().getReponseSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Option__ReponseAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSoda_in_entryRuleSoda61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoda68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Soda__PollsAssignment_in_ruleSoda94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rulePoll_in_entryRulePoll122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoll129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__Group__0_in_rulePoll155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0_in_ruleQuestion215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__0_in_ruleOption275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__Group__0__Impl_in_rule__Poll__Group__0309 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Poll__Group__1_in_rule__Poll__Group__0312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Poll__Group__0__Impl340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__Group__1__Impl_in_rule__Poll__Group__1371 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Poll__Group__2_in_rule__Poll__Group__1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__NameAssignment_1_in_rule__Poll__Group__1__Impl401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__Group__2__Impl_in_rule__Poll__Group__2432 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Poll__Group__3_in_rule__Poll__Group__2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Poll__Group__2__Impl463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__Group__3__Impl_in_rule__Poll__Group__3494 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Poll__Group__4_in_rule__Poll__Group__3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__QuestionsAssignment_3_in_rule__Poll__Group__3__Impl526 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Poll__QuestionsAssignment_3_in_rule__Poll__Group__3__Impl538 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Poll__Group__4__Impl_in_rule__Poll__Group__4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Poll__Group__4__Impl599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0640 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Question__Group__0__Impl671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__1702 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__NameAssignment_1_in_rule__Question__Group__1__Impl732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__2763 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Question__Group__2__Impl794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__3825 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Question__Group__4_in_rule__Question__Group__3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__QueryAssignment_3_in_rule__Question__Group__3__Impl855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__4885 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Question__Group__5_in_rule__Question__Group__4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Question__Group__4__Impl916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__5947 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Question__Group__6_in_rule__Question__Group__5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__OptionsAssignment_5_in_rule__Question__Group__5__Impl979 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Question__OptionsAssignment_5_in_rule__Question__Group__5__Impl991 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__61024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Question__Group__6__Impl1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__01097 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Option__Group__1_in_rule__Option__Group__01100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group_0__0_in_rule__Option__Group__0__Impl1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__11158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__ReponseAssignment_1_in_rule__Option__Group__1__Impl1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group_0__0__Impl_in_rule__Option__Group_0__01219 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Option__Group_0__1_in_rule__Option__Group_0__01222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__IdAssignment_0_0_in_rule__Option__Group_0__0__Impl1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group_0__1__Impl_in_rule__Option__Group_0__11279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Option__Group_0__1__Impl1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoll_in_rule__Soda__PollsAssignment1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Poll__NameAssignment_11378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Poll__QuestionsAssignment_31409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Question__NameAssignment_11440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Question__QueryAssignment_31471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Question__OptionsAssignment_51502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Option__IdAssignment_0_01533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Option__ReponseAssignment_11564 = new BitSet(new long[]{0x0000000000000002L});

}