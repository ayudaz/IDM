package org.xtext.istic.mapUI.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMapUILexer extends Lexer {
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

    public InternalMapUILexer() {;} 
    public InternalMapUILexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMapUILexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:11:7: ( ':' )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:11:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:12:7: ( 'VideoCheck' )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:12:9: 'VideoCheck'
            {
            match("VideoCheck"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:13:7: ( 'VideoRadio' )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:13:9: 'VideoRadio'
            {
            match("VideoRadio"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:14:7: ( 'ImageCheck' )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:14:9: 'ImageCheck'
            {
            match("ImageCheck"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:15:7: ( 'ImageRadio' )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:15:9: 'ImageRadio'
            {
            match("ImageRadio"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:16:7: ( 'CheckBox' )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:16:9: 'CheckBox'
            {
            match("CheckBox"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:17:7: ( 'RadioButton' )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:17:9: 'RadioButton'
            {
            match("RadioButton"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:18:7: ( 'SonCheck' )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:18:9: 'SonCheck'
            {
            match("SonCheck"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:19:7: ( 'SonRadio' )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:19:9: 'SonRadio'
            {
            match("SonRadio"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:402:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:402:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:402:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:402:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:402:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:404:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:404:12: ( '0' .. '9' )+
            {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:404:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:404:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:406:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:406:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:406:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:406:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:406:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:406:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:406:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:406:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:406:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:406:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:406:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:408:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:408:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:408:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:408:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:410:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:410:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:410:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:410:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:410:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:410:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:410:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:410:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:412:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:412:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:412:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:414:16: ( . )
            // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:414:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=16;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:1:64: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 11 :
                // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:1:72: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 12 :
                // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:1:81: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:1:93: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 14 :
                // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:1:109: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:1:125: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // ../org.xtext.istic.mapUI/src-gen/org/xtext/istic/mapUI/parser/antlr/internal/InternalMapUI.g:1:133: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\2\uffff\5\21\1\16\2\uffff\3\16\3\uffff\1\21\1\uffff\4\21\5\uffff"+
        "\45\21\1\110\1\21\1\112\1\113\4\21\1\uffff\1\21\2\uffff\1\121\1"+
        "\122\1\123\1\124\1\21\4\uffff\1\126\1\uffff";
    static final String DFA12_eofS =
        "\127\uffff";
    static final String DFA12_minS =
        "\1\0\1\uffff\1\151\1\155\1\150\1\141\1\157\1\101\2\uffff\2\0\1"+
        "\52\3\uffff\1\144\1\uffff\1\141\1\145\1\144\1\156\5\uffff\1\145"+
        "\1\147\1\143\1\151\1\103\1\157\1\145\1\153\1\157\1\150\1\141\2\103"+
        "\2\102\1\145\1\144\1\150\1\141\1\150\1\141\1\157\1\165\1\143\1\151"+
        "\1\145\1\144\1\145\1\144\1\170\1\164\1\153\1\157\1\143\1\151\1\143"+
        "\1\151\1\60\1\164\2\60\1\153\1\157\1\153\1\157\1\uffff\1\157\2\uffff"+
        "\4\60\1\156\4\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\uffff\1\151\1\155\1\150\1\141\1\157\1\172\2\uffff\2"+
        "\uffff\1\57\3\uffff\1\144\1\uffff\1\141\1\145\1\144\1\156\5\uffff"+
        "\1\145\1\147\1\143\1\151\1\122\1\157\1\145\1\153\1\157\1\150\1\141"+
        "\2\122\2\102\1\145\1\144\1\150\1\141\1\150\1\141\1\157\1\165\1\143"+
        "\1\151\1\145\1\144\1\145\1\144\1\170\1\164\1\153\1\157\1\143\1\151"+
        "\1\143\1\151\1\172\1\164\2\172\1\153\1\157\1\153\1\157\1\uffff\1"+
        "\157\2\uffff\4\172\1\156\4\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\6\uffff\1\12\1\13\3\uffff\1\17\1\20\1\1\1\uffff\1"+
        "\12\4\uffff\1\13\1\14\1\15\1\16\1\17\55\uffff\1\6\1\uffff\1\10\1"+
        "\11\5\uffff\1\2\1\3\1\4\1\5\1\uffff\1\7";
    static final String DFA12_specialS =
        "\1\1\11\uffff\1\2\1\0\113\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\16\2\15\2\16\1\15\22\16\1\15\1\16\1\12\4\16\1\13\7\16\1"+
            "\14\12\11\1\1\6\16\2\10\1\4\5\10\1\3\10\10\1\5\1\6\2\10\1\2"+
            "\4\10\3\16\1\7\1\10\1\16\32\10\uff85\16",
            "",
            "\1\20",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            "\0\27",
            "\0\27",
            "\1\30\4\uffff\1\31",
            "",
            "",
            "",
            "\1\33",
            "",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44\16\uffff\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54\16\uffff\1\55",
            "\1\56\16\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\111",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\125",
            "",
            "",
            "",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_11 = input.LA(1);

                        s = -1;
                        if ( ((LA12_11>='\u0000' && LA12_11<='\uFFFF')) ) {s = 23;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0==':') ) {s = 1;}

                        else if ( (LA12_0=='V') ) {s = 2;}

                        else if ( (LA12_0=='I') ) {s = 3;}

                        else if ( (LA12_0=='C') ) {s = 4;}

                        else if ( (LA12_0=='R') ) {s = 5;}

                        else if ( (LA12_0=='S') ) {s = 6;}

                        else if ( (LA12_0=='^') ) {s = 7;}

                        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='D' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='Q')||(LA12_0>='T' && LA12_0<='U')||(LA12_0>='W' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 8;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 9;}

                        else if ( (LA12_0=='\"') ) {s = 10;}

                        else if ( (LA12_0=='\'') ) {s = 11;}

                        else if ( (LA12_0=='/') ) {s = 12;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 13;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_10 = input.LA(1);

                        s = -1;
                        if ( ((LA12_10>='\u0000' && LA12_10<='\uFFFF')) ) {s = 23;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}