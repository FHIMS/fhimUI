package org.standardhealh.cimpl.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCimplLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_BASEDON=6;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalCimplLexer() {;} 
    public InternalCimplLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCimplLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCimpl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:11:7: ( ' ' )
            // InternalCimpl.g:11:9: ' '
            {
            match(' '); 

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
            // InternalCimpl.g:12:7: ( '/' )
            // InternalCimpl.g:12:9: '/'
            {
            match('/'); 

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
            // InternalCimpl.g:13:7: ( ';' )
            // InternalCimpl.g:13:9: ';'
            {
            match(';'); 

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
            // InternalCimpl.g:14:7: ( ',' )
            // InternalCimpl.g:14:9: ','
            {
            match(','); 

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
            // InternalCimpl.g:15:7: ( '!' )
            // InternalCimpl.g:15:9: '!'
            {
            match('!'); 

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
            // InternalCimpl.g:16:7: ( '\\u00A7' )
            // InternalCimpl.g:16:9: '\\u00A7'
            {
            match('\u00A7'); 

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
            // InternalCimpl.g:17:7: ( '%' )
            // InternalCimpl.g:17:9: '%'
            {
            match('%'); 

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
            // InternalCimpl.g:18:7: ( '&' )
            // InternalCimpl.g:18:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:19:7: ( '(' )
            // InternalCimpl.g:19:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:20:7: ( ')' )
            // InternalCimpl.g:20:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:21:7: ( '?' )
            // InternalCimpl.g:21:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:22:7: ( '*' )
            // InternalCimpl.g:22:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:23:7: ( '+' )
            // InternalCimpl.g:23:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:24:7: ( '.' )
            // InternalCimpl.g:24:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:25:7: ( '-' )
            // InternalCimpl.g:25:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:26:7: ( '|' )
            // InternalCimpl.g:26:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:27:7: ( '[' )
            // InternalCimpl.g:27:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:28:7: ( ']' )
            // InternalCimpl.g:28:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:29:7: ( 'Description:' )
            // InternalCimpl.g:29:9: 'Description:'
            {
            match("Description:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:30:7: ( '\\r' )
            // InternalCimpl.g:30:9: '\\r'
            {
            match('\r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:31:7: ( 'Grammar:\\tDataElement' )
            // InternalCimpl.g:31:9: 'Grammar:\\tDataElement'
            {
            match("Grammar:\tDataElement"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:32:7: ( '\\r\\n' )
            // InternalCimpl.g:32:9: '\\r\\n'
            {
            match("\r\n"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:33:7: ( 'Namespace:' )
            // InternalCimpl.g:33:9: 'Namespace:'
            {
            match("Namespace:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:34:7: ( 'Uses:' )
            // InternalCimpl.g:34:9: 'Uses:'
            {
            match("Uses:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:35:7: ( 'CodeSystem:' )
            // InternalCimpl.g:35:9: 'CodeSystem:'
            {
            match("CodeSystem:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:36:7: ( '\\r\\nEntryElement:' )
            // InternalCimpl.g:36:9: '\\r\\nEntryElement:'
            {
            match("\r\nEntryElement:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:37:7: ( 'Concept:' )
            // InternalCimpl.g:37:9: 'Concept:'
            {
            match("Concept:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:38:7: ( 'Based on:' )
            // InternalCimpl.g:38:9: 'Based on:'
            {
            match("Based on:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:39:7: ( 'includes' )
            // InternalCimpl.g:39:9: 'includes'
            {
            match("includes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:40:7: ( '..' )
            // InternalCimpl.g:40:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:41:7: ( '\\r\\nElement:' )
            // InternalCimpl.g:41:9: '\\r\\nElement:'
            {
            match("\r\nElement:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:42:7: ( 'Value:' )
            // InternalCimpl.g:42:9: 'Value:'
            {
            match("Value:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:43:7: ( 'CodeableConcept from' )
            // InternalCimpl.g:43:9: 'CodeableConcept from'
            {
            match("CodeableConcept from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:44:7: ( 'Quantity with units' )
            // InternalCimpl.g:44:9: 'Quantity with units'
            {
            match("Quantity with units"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "RULE_BASEDON"
    public final void mRULE_BASEDON() throws RecognitionException {
        try {
            int _type = RULE_BASEDON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:3246:14: ( 'Based on' )
            // InternalCimpl.g:3246:16: 'Based on'
            {
            match("Based on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BASEDON"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCimpl.g:3248:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCimpl.g:3248:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCimpl.g:3248:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCimpl.g:3248:11: '^'
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

            // InternalCimpl.g:3248:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCimpl.g:
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
            // InternalCimpl.g:3250:10: ( ( '0' .. '9' )+ )
            // InternalCimpl.g:3250:12: ( '0' .. '9' )+
            {
            // InternalCimpl.g:3250:12: ( '0' .. '9' )+
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
            	    // InternalCimpl.g:3250:13: '0' .. '9'
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
            // InternalCimpl.g:3252:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCimpl.g:3252:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCimpl.g:3252:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalCimpl.g:3252:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCimpl.g:3252:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalCimpl.g:3252:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCimpl.g:3252:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalCimpl.g:3252:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCimpl.g:3252:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalCimpl.g:3252:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCimpl.g:3252:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalCimpl.g:3254:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCimpl.g:3254:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCimpl.g:3254:24: ( options {greedy=false; } : . )*
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
            	    // InternalCimpl.g:3254:52: .
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
            // InternalCimpl.g:3256:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCimpl.g:3256:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCimpl.g:3256:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCimpl.g:3256:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalCimpl.g:3256:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCimpl.g:3256:41: ( '\\r' )? '\\n'
                    {
                    // InternalCimpl.g:3256:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalCimpl.g:3256:41: '\\r'
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
            // InternalCimpl.g:3258:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCimpl.g:3258:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCimpl.g:3258:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalCimpl.g:
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
            // InternalCimpl.g:3260:16: ( . )
            // InternalCimpl.g:3260:18: .
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
        // InternalCimpl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_BASEDON | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=42;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalCimpl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalCimpl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalCimpl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalCimpl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalCimpl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalCimpl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalCimpl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalCimpl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalCimpl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalCimpl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalCimpl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalCimpl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalCimpl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalCimpl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalCimpl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalCimpl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalCimpl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalCimpl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalCimpl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalCimpl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalCimpl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalCimpl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalCimpl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalCimpl.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalCimpl.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalCimpl.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalCimpl.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalCimpl.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalCimpl.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalCimpl.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalCimpl.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalCimpl.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalCimpl.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalCimpl.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalCimpl.g:1:214: RULE_BASEDON
                {
                mRULE_BASEDON(); 

                }
                break;
            case 36 :
                // InternalCimpl.g:1:227: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // InternalCimpl.g:1:235: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // InternalCimpl.g:1:244: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // InternalCimpl.g:1:256: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // InternalCimpl.g:1:272: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // InternalCimpl.g:1:288: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // InternalCimpl.g:1:296: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\44\1\50\13\uffff\1\65\4\uffff\1\73\1\75\10\73\1\43\2\uffff\2\43\30\uffff\1\73\1\uffff\1\112\1\uffff\10\73\2\uffff\1\73\2\uffff\12\73\2\uffff\14\73\1\uffff\15\73\1\uffff\1\73\1\uffff\7\73\1\uffff\3\73\1\uffff\3\73\1\uffff\1\u008c\1\u008d\5\73\4\uffff\1\73\1\uffff\3\73\1\uffff\1\73\1\uffff\4\73\1\uffff";
    static final String DFA12_eofS =
        "\u009c\uffff";
    static final String DFA12_minS =
        "\1\0\1\11\1\52\13\uffff\1\56\4\uffff\1\145\1\11\1\162\1\141\1\163\1\157\1\141\1\156\1\141\1\165\1\101\2\uffff\2\0\30\uffff\1\163\1\uffff\1\11\1\uffff\1\141\1\155\1\145\1\144\1\163\1\143\1\154\1\141\2\uffff\1\143\1\154\1\uffff\1\155\1\145\1\163\1\145\1\143\1\145\1\154\1\165\1\156\1\162\2\uffff\1\155\1\163\1\72\1\123\1\145\1\144\1\165\1\145\1\164\1\151\1\141\1\160\1\uffff\1\171\1\142\1\160\1\40\1\144\1\72\1\151\1\160\1\162\1\141\1\163\1\154\1\164\1\157\1\145\1\uffff\2\164\1\72\1\143\1\164\1\145\1\72\1\156\1\163\1\171\1\151\1\uffff\2\145\1\103\1\uffff\1\72\1\60\1\40\1\157\1\72\1\155\1\157\4\uffff\1\156\1\uffff\1\72\1\156\1\72\1\uffff\1\143\1\uffff\1\145\1\160\1\164\1\40\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\40\1\57\13\uffff\1\56\4\uffff\1\145\1\40\1\162\1\141\1\163\1\157\1\141\1\156\1\141\1\165\1\172\2\uffff\2\uffff\30\uffff\1\163\1\uffff\1\105\1\uffff\1\141\1\155\1\145\1\156\1\163\1\143\1\154\1\141\2\uffff\1\143\1\156\1\uffff\1\155\1\145\1\163\1\145\1\143\1\145\1\154\1\165\1\156\1\162\2\uffff\1\155\1\163\1\72\1\141\1\145\1\144\1\165\1\145\1\164\1\151\1\141\1\160\1\uffff\1\171\1\142\1\160\1\40\1\144\1\72\1\151\1\160\1\162\1\141\1\163\1\154\1\164\1\157\1\145\1\uffff\2\164\1\72\1\143\1\164\1\145\1\72\1\156\1\163\1\171\1\151\1\uffff\2\145\1\103\1\uffff\1\72\1\172\1\40\1\157\1\72\1\155\1\157\4\uffff\1\156\1\uffff\1\72\1\156\1\72\1\uffff\1\143\1\uffff\1\145\1\160\1\164\1\40\1\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff\1\17\1\20\1\21\1\22\13\uffff\1\44\1\45\2\uffff\1\51\1\52\1\1\1\51\1\47\1\50\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\36\1\16\1\17\1\20\1\21\1\22\1\uffff\1\44\1\uffff\1\24\10\uffff\1\45\1\46\2\uffff\1\26\12\uffff\1\32\1\37\14\uffff\1\30\17\uffff\1\40\13\uffff\1\25\3\uffff\1\33\7\uffff\1\34\1\43\1\35\1\42\1\uffff\1\27\3\uffff\1\31\1\uffff\1\23\4\uffff\1\41";
    static final String DFA12_specialS =
        "\1\1\37\uffff\1\0\1\2\172\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\43\2\42\2\43\1\24\22\43\1\1\1\5\1\40\2\43\1\7\1\10\1\41\1\11\1\12\1\14\1\15\1\4\1\17\1\16\1\2\12\37\1\43\1\3\3\43\1\13\1\43\1\36\1\31\1\30\1\23\2\36\1\25\6\36\1\26\2\36\1\34\3\36\1\27\1\33\4\36\1\21\1\43\1\22\1\35\1\36\1\43\10\36\1\32\21\36\1\43\1\20\52\43\1\6\uff58\43",
            "\2\45\2\uffff\1\45\22\uffff\1\45",
            "\1\46\4\uffff\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "",
            "",
            "",
            "",
            "\1\72",
            "\1\45\1\74\2\uffff\1\45\22\uffff\1\45",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\0\107",
            "\0\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\110",
            "",
            "\2\45\2\uffff\1\45\22\uffff\1\45\44\uffff\1\111",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116\11\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "",
            "\1\124",
            "\1\126\1\uffff\1\125",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144\15\uffff\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\u008b",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "",
            "",
            "",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_BASEDON | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_32 = input.LA(1);

                        s = -1;
                        if ( ((LA12_32>='\u0000' && LA12_32<='\uFFFF')) ) {s = 71;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0==' ') ) {s = 1;}

                        else if ( (LA12_0=='/') ) {s = 2;}

                        else if ( (LA12_0==';') ) {s = 3;}

                        else if ( (LA12_0==',') ) {s = 4;}

                        else if ( (LA12_0=='!') ) {s = 5;}

                        else if ( (LA12_0=='\u00A7') ) {s = 6;}

                        else if ( (LA12_0=='%') ) {s = 7;}

                        else if ( (LA12_0=='&') ) {s = 8;}

                        else if ( (LA12_0=='(') ) {s = 9;}

                        else if ( (LA12_0==')') ) {s = 10;}

                        else if ( (LA12_0=='?') ) {s = 11;}

                        else if ( (LA12_0=='*') ) {s = 12;}

                        else if ( (LA12_0=='+') ) {s = 13;}

                        else if ( (LA12_0=='.') ) {s = 14;}

                        else if ( (LA12_0=='-') ) {s = 15;}

                        else if ( (LA12_0=='|') ) {s = 16;}

                        else if ( (LA12_0=='[') ) {s = 17;}

                        else if ( (LA12_0==']') ) {s = 18;}

                        else if ( (LA12_0=='D') ) {s = 19;}

                        else if ( (LA12_0=='\r') ) {s = 20;}

                        else if ( (LA12_0=='G') ) {s = 21;}

                        else if ( (LA12_0=='N') ) {s = 22;}

                        else if ( (LA12_0=='U') ) {s = 23;}

                        else if ( (LA12_0=='C') ) {s = 24;}

                        else if ( (LA12_0=='B') ) {s = 25;}

                        else if ( (LA12_0=='i') ) {s = 26;}

                        else if ( (LA12_0=='V') ) {s = 27;}

                        else if ( (LA12_0=='Q') ) {s = 28;}

                        else if ( (LA12_0=='^') ) {s = 29;}

                        else if ( (LA12_0=='A'||(LA12_0>='E' && LA12_0<='F')||(LA12_0>='H' && LA12_0<='M')||(LA12_0>='O' && LA12_0<='P')||(LA12_0>='R' && LA12_0<='T')||(LA12_0>='W' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='z')) ) {s = 30;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 31;}

                        else if ( (LA12_0=='\"') ) {s = 32;}

                        else if ( (LA12_0=='\'') ) {s = 33;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')) ) {s = 34;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='$')||LA12_0==':'||(LA12_0>='<' && LA12_0<='>')||LA12_0=='@'||LA12_0=='\\'||LA12_0=='`'||LA12_0=='{'||(LA12_0>='}' && LA12_0<='\u00A6')||(LA12_0>='\u00A8' && LA12_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_33 = input.LA(1);

                        s = -1;
                        if ( ((LA12_33>='\u0000' && LA12_33<='\uFFFF')) ) {s = 71;}

                        else s = 35;

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