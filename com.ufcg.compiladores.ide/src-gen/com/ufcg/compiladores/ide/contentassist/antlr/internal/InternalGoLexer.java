package com.ufcg.compiladores.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoLexer extends Lexer {
    public static final int RULE_A_TO_F=10;
    public static final int T__50=50;
    public static final int RULE_DECIMAL_DIGIT=6;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=11;
    public static final int RULE_INT=12;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int RULE_OCTAL_DIGIT=7;
    public static final int T__31=31;
    public static final int RULE_SEVEN_TO_NINE=9;
    public static final int T__32=32;
    public static final int RULE_LETTER=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_HEX_DIGIT=8;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=4;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalGoLexer() {;} 
    public InternalGoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGo.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:11:7: ( 'fallthrough' )
            // InternalGo.g:11:9: 'fallthrough'
            {
            match("fallthrough"); 


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
            // InternalGo.g:12:7: ( 'U+000A' )
            // InternalGo.g:12:9: 'U+000A'
            {
            match("U+000A"); 


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
            // InternalGo.g:13:7: ( '\\'' )
            // InternalGo.g:13:9: '\\''
            {
            match('\''); 

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
            // InternalGo.g:14:7: ( 'chan' )
            // InternalGo.g:14:9: 'chan'
            {
            match("chan"); 


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
            // InternalGo.g:15:7: ( '==' )
            // InternalGo.g:15:9: '=='
            {
            match("=="); 


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
            // InternalGo.g:16:7: ( '!=' )
            // InternalGo.g:16:9: '!='
            {
            match("!="); 


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
            // InternalGo.g:17:7: ( '<' )
            // InternalGo.g:17:9: '<'
            {
            match('<'); 

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
            // InternalGo.g:18:7: ( '<=' )
            // InternalGo.g:18:9: '<='
            {
            match("<="); 


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
            // InternalGo.g:19:7: ( '>' )
            // InternalGo.g:19:9: '>'
            {
            match('>'); 

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
            // InternalGo.g:20:7: ( '>=' )
            // InternalGo.g:20:9: '>='
            {
            match(">="); 


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
            // InternalGo.g:21:7: ( '+' )
            // InternalGo.g:21:9: '+'
            {
            match('+'); 

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
            // InternalGo.g:22:7: ( '-' )
            // InternalGo.g:22:9: '-'
            {
            match('-'); 

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
            // InternalGo.g:23:7: ( '|' )
            // InternalGo.g:23:9: '|'
            {
            match('|'); 

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
            // InternalGo.g:24:7: ( '\\u02C6' )
            // InternalGo.g:24:9: '\\u02C6'
            {
            match('\u02C6'); 

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
            // InternalGo.g:25:7: ( '*' )
            // InternalGo.g:25:9: '*'
            {
            match('*'); 

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
            // InternalGo.g:26:7: ( '/' )
            // InternalGo.g:26:9: '/'
            {
            match('/'); 

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
            // InternalGo.g:27:7: ( '%' )
            // InternalGo.g:27:9: '%'
            {
            match('%'); 

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
            // InternalGo.g:28:7: ( '<<' )
            // InternalGo.g:28:9: '<<'
            {
            match("<<"); 


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
            // InternalGo.g:29:7: ( '>>' )
            // InternalGo.g:29:9: '>>'
            {
            match(">>"); 


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
            // InternalGo.g:30:7: ( '&' )
            // InternalGo.g:30:9: '&'
            {
            match('&'); 

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
            // InternalGo.g:31:7: ( '&^' )
            // InternalGo.g:31:9: '&^'
            {
            match("&^"); 


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
            // InternalGo.g:32:7: ( '!' )
            // InternalGo.g:32:9: '!'
            {
            match('!'); 

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
            // InternalGo.g:33:7: ( '^' )
            // InternalGo.g:33:9: '^'
            {
            match('^'); 

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
            // InternalGo.g:34:7: ( '<-' )
            // InternalGo.g:34:9: '<-'
            {
            match("<-"); 


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
            // InternalGo.g:35:7: ( '++' )
            // InternalGo.g:35:9: '++'
            {
            match("++"); 


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
            // InternalGo.g:36:7: ( '--' )
            // InternalGo.g:36:9: '--'
            {
            match("--"); 


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
            // InternalGo.g:37:7: ( '.' )
            // InternalGo.g:37:9: '.'
            {
            match('.'); 

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
            // InternalGo.g:38:7: ( 'x' )
            // InternalGo.g:38:9: 'x'
            {
            match('x'); 

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
            // InternalGo.g:39:7: ( 'X' )
            // InternalGo.g:39:9: 'X'
            {
            match('X'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:40:7: ( '?' )
            // InternalGo.g:40:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:41:7: ( ',' )
            // InternalGo.g:41:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:42:7: ( 'e' )
            // InternalGo.g:42:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:43:7: ( 'E' )
            // InternalGo.g:43:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:44:7: ( 'a' )
            // InternalGo.g:44:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:45:7: ( 'b' )
            // InternalGo.g:45:9: 'b'
            {
            match('b'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:46:7: ( 'f' )
            // InternalGo.g:46:9: 'f'
            {
            match('f'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:47:7: ( 'n' )
            // InternalGo.g:47:9: 'n'
            {
            match('n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:48:7: ( 'r' )
            // InternalGo.g:48:9: 'r'
            {
            match('r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:49:7: ( 't' )
            // InternalGo.g:49:9: 't'
            {
            match('t'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:50:7: ( 'v' )
            // InternalGo.g:50:9: 'v'
            {
            match('v'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:51:7: ( '\"' )
            // InternalGo.g:51:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:52:7: ( ';' )
            // InternalGo.g:52:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:53:7: ( '(' )
            // InternalGo.g:53:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:54:7: ( ')' )
            // InternalGo.g:54:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:55:7: ( '[' )
            // InternalGo.g:55:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:56:7: ( ']' )
            // InternalGo.g:56:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:57:7: ( 'struct' )
            // InternalGo.g:57:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:58:7: ( '{' )
            // InternalGo.g:58:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:59:7: ( 'func' )
            // InternalGo.g:59:9: 'func'
            {
            match("func"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:60:7: ( '...' )
            // InternalGo.g:60:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:61:7: ( 'interface' )
            // InternalGo.g:61:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:62:7: ( '}' )
            // InternalGo.g:62:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:63:7: ( 'map' )
            // InternalGo.g:63:9: 'map'
            {
            match("map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:64:7: ( 'const' )
            // InternalGo.g:64:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:65:7: ( '=' )
            // InternalGo.g:65:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:66:7: ( 'type' )
            // InternalGo.g:66:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:67:7: ( 'var' )
            // InternalGo.g:67:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:68:7: ( ':=' )
            // InternalGo.g:68:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:69:7: ( ':' )
            // InternalGo.g:69:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:70:7: ( '||' )
            // InternalGo.g:70:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:71:7: ( '&&' )
            // InternalGo.g:71:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:72:7: ( 'if' )
            // InternalGo.g:72:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:73:7: ( 'else' )
            // InternalGo.g:73:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:74:7: ( 'switch' )
            // InternalGo.g:74:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:75:7: ( 'case' )
            // InternalGo.g:75:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:76:7: ( 'default' )
            // InternalGo.g:76:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:77:7: ( 'for' )
            // InternalGo.g:77:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:78:7: ( 'range' )
            // InternalGo.g:78:9: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:79:7: ( 'go' )
            // InternalGo.g:79:9: 'go'
            {
            match("go"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:80:7: ( 'select' )
            // InternalGo.g:80:9: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:81:7: ( 'return' )
            // InternalGo.g:81:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:82:7: ( 'break' )
            // InternalGo.g:82:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:83:7: ( 'continue' )
            // InternalGo.g:83:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:84:7: ( 'goto' )
            // InternalGo.g:84:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:85:7: ( 'defer' )
            // InternalGo.g:85:9: 'defer'
            {
            match("defer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:86:7: ( 'package' )
            // InternalGo.g:86:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:87:7: ( 'import' )
            // InternalGo.g:87:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:88:7: ( '0' )
            // InternalGo.g:88:9: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:89:7: ( 'u' )
            // InternalGo.g:89:9: 'u'
            {
            match('u'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:90:7: ( 'U' )
            // InternalGo.g:90:9: 'U'
            {
            match('U'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "RULE_OCTAL_DIGIT"
    public final void mRULE_OCTAL_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_OCTAL_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:21426:18: ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' ) )
            // InternalGo.g:21426:20: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='6') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_DIGIT"

    // $ANTLR start "RULE_DECIMAL_DIGIT"
    public final void mRULE_DECIMAL_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:21428:20: ( ( RULE_OCTAL_DIGIT | RULE_SEVEN_TO_NINE ) )
            // InternalGo.g:21428:22: ( RULE_OCTAL_DIGIT | RULE_SEVEN_TO_NINE )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_DIGIT"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_HEX_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:21430:16: ( ( RULE_DECIMAL_DIGIT | RULE_A_TO_F ) )
            // InternalGo.g:21430:18: ( RULE_DECIMAL_DIGIT | RULE_A_TO_F )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_SEVEN_TO_NINE"
    public final void mRULE_SEVEN_TO_NINE() throws RecognitionException {
        try {
            // InternalGo.g:21432:29: ( ( '7' | '8' | '9' ) )
            // InternalGo.g:21432:31: ( '7' | '8' | '9' )
            {
            if ( (input.LA(1)>='7' && input.LA(1)<='9') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEVEN_TO_NINE"

    // $ANTLR start "RULE_A_TO_F"
    public final void mRULE_A_TO_F() throws RecognitionException {
        try {
            // InternalGo.g:21434:22: ( ( 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) )
            // InternalGo.g:21434:24: ( 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_A_TO_F"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            int _type = RULE_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:21436:13: ( ( RULE_A_TO_F | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'x' | 'y' | 'z' | '_' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z' ) )
            // InternalGo.g:21436:15: ( RULE_A_TO_F | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'x' | 'y' | 'z' | '_' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='v')||(input.LA(1)>='x' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:21438:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGo.g:21438:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGo.g:21438:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGo.g:21438:11: '^'
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

            // InternalGo.g:21438:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGo.g:
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
            // InternalGo.g:21440:10: ( ( '0' .. '9' )+ )
            // InternalGo.g:21440:12: ( '0' .. '9' )+
            {
            // InternalGo.g:21440:12: ( '0' .. '9' )+
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
            	    // InternalGo.g:21440:13: '0' .. '9'
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
            // InternalGo.g:21442:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGo.g:21442:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGo.g:21442:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalGo.g:21442:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGo.g:21442:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalGo.g:21442:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:21442:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalGo.g:21442:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGo.g:21442:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalGo.g:21442:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:21442:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalGo.g:21444:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGo.g:21444:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:21444:24: ( options {greedy=false; } : . )*
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
            	    // InternalGo.g:21444:52: .
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
            // InternalGo.g:21446:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGo.g:21446:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGo.g:21446:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGo.g:21446:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalGo.g:21446:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGo.g:21446:41: ( '\\r' )? '\\n'
                    {
                    // InternalGo.g:21446:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalGo.g:21446:41: '\\r'
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
            // InternalGo.g:21448:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGo.g:21448:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGo.g:21448:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalGo.g:
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
            // InternalGo.g:21450:16: ( . )
            // InternalGo.g:21450:18: .
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
        // InternalGo.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | RULE_OCTAL_DIGIT | RULE_DECIMAL_DIGIT | RULE_HEX_DIGIT | RULE_LETTER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=91;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalGo.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalGo.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalGo.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalGo.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalGo.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalGo.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalGo.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalGo.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalGo.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalGo.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalGo.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalGo.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalGo.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalGo.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalGo.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalGo.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalGo.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalGo.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalGo.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalGo.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalGo.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalGo.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalGo.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalGo.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalGo.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalGo.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalGo.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalGo.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalGo.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalGo.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalGo.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalGo.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalGo.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalGo.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalGo.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalGo.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalGo.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalGo.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalGo.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalGo.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalGo.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalGo.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalGo.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalGo.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalGo.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalGo.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalGo.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalGo.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalGo.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalGo.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalGo.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalGo.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalGo.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalGo.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalGo.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // InternalGo.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // InternalGo.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // InternalGo.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // InternalGo.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // InternalGo.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // InternalGo.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // InternalGo.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // InternalGo.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // InternalGo.g:1:388: T__80
                {
                mT__80(); 

                }
                break;
            case 65 :
                // InternalGo.g:1:394: T__81
                {
                mT__81(); 

                }
                break;
            case 66 :
                // InternalGo.g:1:400: T__82
                {
                mT__82(); 

                }
                break;
            case 67 :
                // InternalGo.g:1:406: T__83
                {
                mT__83(); 

                }
                break;
            case 68 :
                // InternalGo.g:1:412: T__84
                {
                mT__84(); 

                }
                break;
            case 69 :
                // InternalGo.g:1:418: T__85
                {
                mT__85(); 

                }
                break;
            case 70 :
                // InternalGo.g:1:424: T__86
                {
                mT__86(); 

                }
                break;
            case 71 :
                // InternalGo.g:1:430: T__87
                {
                mT__87(); 

                }
                break;
            case 72 :
                // InternalGo.g:1:436: T__88
                {
                mT__88(); 

                }
                break;
            case 73 :
                // InternalGo.g:1:442: T__89
                {
                mT__89(); 

                }
                break;
            case 74 :
                // InternalGo.g:1:448: T__90
                {
                mT__90(); 

                }
                break;
            case 75 :
                // InternalGo.g:1:454: T__91
                {
                mT__91(); 

                }
                break;
            case 76 :
                // InternalGo.g:1:460: T__92
                {
                mT__92(); 

                }
                break;
            case 77 :
                // InternalGo.g:1:466: T__93
                {
                mT__93(); 

                }
                break;
            case 78 :
                // InternalGo.g:1:472: T__94
                {
                mT__94(); 

                }
                break;
            case 79 :
                // InternalGo.g:1:478: T__95
                {
                mT__95(); 

                }
                break;
            case 80 :
                // InternalGo.g:1:484: T__96
                {
                mT__96(); 

                }
                break;
            case 81 :
                // InternalGo.g:1:490: RULE_OCTAL_DIGIT
                {
                mRULE_OCTAL_DIGIT(); 

                }
                break;
            case 82 :
                // InternalGo.g:1:507: RULE_DECIMAL_DIGIT
                {
                mRULE_DECIMAL_DIGIT(); 

                }
                break;
            case 83 :
                // InternalGo.g:1:526: RULE_HEX_DIGIT
                {
                mRULE_HEX_DIGIT(); 

                }
                break;
            case 84 :
                // InternalGo.g:1:541: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 85 :
                // InternalGo.g:1:553: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 86 :
                // InternalGo.g:1:561: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 87 :
                // InternalGo.g:1:570: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 88 :
                // InternalGo.g:1:582: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 89 :
                // InternalGo.g:1:598: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 90 :
                // InternalGo.g:1:614: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 91 :
                // InternalGo.g:1:622: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\73\1\75\1\76\1\103\1\105\1\107\1\113\1\116\1\120\1\122\1\124\2\uffff\1\131\1\uffff\1\135\1\136\1\140\1\141\1\142\2\uffff\1\146\1\147\1\150\1\152\1\153\1\156\1\160\1\162\1\163\5\uffff\1\174\1\uffff\1\174\1\uffff\1\174\1\u0084\1\103\2\174\1\u0088\1\u008a\1\u008b\1\u008c\1\103\1\174\3\uffff\3\72\6\uffff\3\72\42\uffff\1\72\3\uffff\1\72\2\uffff\2\72\1\uffff\1\72\1\uffff\1\72\7\uffff\3\72\2\uffff\1\72\1\u009e\1\72\1\uffff\1\72\2\uffff\1\72\1\u00a3\1\72\6\uffff\2\72\1\u00a7\10\72\1\u00b1\4\72\1\uffff\1\72\1\u00b7\2\72\1\uffff\2\72\1\u00bd\1\uffff\1\u00be\2\72\1\u00c1\1\u00c2\3\72\1\u00c6\1\uffff\5\72\1\uffff\2\72\1\u00ce\2\72\2\uffff\1\u00d1\1\72\2\uffff\1\u00d3\1\u00d4\1\72\1\uffff\6\72\1\u00dc\1\uffff\2\72\1\uffff\1\72\2\uffff\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\72\1\u00e5\1\72\1\uffff\3\72\4\uffff\1\72\1\uffff\1\u00eb\1\u00ec\1\72\1\u00ee\1\72\2\uffff\1\72\1\uffff\1\u00f1\1\72\1\uffff\1\u00f3\1\uffff";
    static final String DFA12_eofS =
        "\u00f4\uffff";
    static final String DFA12_minS =
        "\1\0\1\60\1\53\1\0\1\60\2\75\1\55\1\75\1\53\1\55\1\174\2\uffff\1\52\1\uffff\1\46\1\101\1\56\2\60\2\uffff\10\60\1\0\5\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\75\11\60\3\uffff\1\154\1\156\1\162\6\uffff\1\141\1\156\1\163\42\uffff\1\163\3\uffff\1\145\2\uffff\1\156\1\164\1\uffff\1\160\1\uffff\1\162\7\uffff\1\162\1\151\1\154\2\uffff\1\164\1\60\1\160\1\uffff\1\160\2\uffff\1\146\1\60\1\143\6\uffff\1\154\1\143\1\60\1\156\1\163\2\145\1\141\1\147\1\165\1\145\1\60\1\165\1\164\2\145\1\uffff\1\157\1\60\1\141\1\157\1\uffff\1\153\1\164\1\60\1\uffff\1\60\1\164\1\151\2\60\1\153\1\145\1\162\1\60\1\uffff\3\143\2\162\1\uffff\1\165\1\162\1\60\1\141\1\150\2\uffff\1\60\1\156\2\uffff\2\60\1\156\1\uffff\1\164\1\150\1\164\1\146\1\164\1\154\1\60\1\uffff\1\147\1\162\1\uffff\1\165\2\uffff\4\60\1\141\1\60\1\164\1\uffff\1\145\1\157\1\145\4\uffff\1\143\1\uffff\2\60\1\165\1\60\1\145\2\uffff\1\147\1\uffff\1\60\1\150\1\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\2\172\1\uffff\1\172\3\75\1\76\1\53\1\55\1\174\2\uffff\1\57\1\uffff\1\136\1\172\1\56\2\172\2\uffff\10\172\1\uffff\5\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\75\3\172\1\71\1\172\2\71\2\172\3\uffff\1\154\1\156\1\162\6\uffff\1\141\1\156\1\163\42\uffff\1\163\3\uffff\1\145\2\uffff\1\156\1\164\1\uffff\1\160\1\uffff\1\162\7\uffff\1\162\1\151\1\154\2\uffff\1\164\1\172\1\160\1\uffff\1\160\2\uffff\1\146\1\172\1\143\6\uffff\1\154\1\143\1\172\1\156\1\164\2\145\1\141\1\147\1\165\1\145\1\172\1\165\1\164\2\145\1\uffff\1\157\1\172\1\145\1\157\1\uffff\1\153\1\164\1\172\1\uffff\1\172\1\164\1\151\2\172\1\153\1\145\1\162\1\172\1\uffff\3\143\2\162\1\uffff\1\165\1\162\1\172\1\141\1\150\2\uffff\1\172\1\156\2\uffff\2\172\1\156\1\uffff\1\164\1\150\1\164\1\146\1\164\1\154\1\172\1\uffff\1\147\1\162\1\uffff\1\165\2\uffff\4\172\1\141\1\172\1\164\1\uffff\1\145\1\157\1\145\4\uffff\1\143\1\uffff\2\172\1\165\1\172\1\145\2\uffff\1\147\1\uffff\1\172\1\150\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\14\uffff\1\16\1\17\1\uffff\1\21\5\uffff\1\36\1\37\11\uffff\1\52\1\53\1\54\1\55\1\56\1\uffff\1\60\1\uffff\1\64\13\uffff\1\125\1\132\1\133\3\uffff\1\125\1\44\1\2\1\120\1\3\1\127\3\uffff\1\123\1\5\1\67\1\6\1\26\1\10\1\22\1\30\1\7\1\12\1\23\1\11\1\31\1\13\1\32\1\14\1\74\1\15\1\16\1\17\1\130\1\131\1\20\1\21\1\25\1\75\1\24\1\27\1\62\1\33\1\34\1\35\1\36\1\37\1\uffff\1\40\1\41\1\42\1\uffff\1\43\1\45\2\uffff\1\46\1\uffff\1\47\1\uffff\1\50\1\51\1\52\1\53\1\54\1\55\1\56\3\uffff\1\124\1\60\3\uffff\1\64\1\uffff\1\72\1\73\3\uffff\1\116\1\126\1\117\1\121\1\122\1\132\20\uffff\1\76\4\uffff\1\105\3\uffff\1\103\11\uffff\1\71\5\uffff\1\65\5\uffff\1\61\1\4\2\uffff\1\101\1\77\3\uffff\1\70\7\uffff\1\112\2\uffff\1\66\1\uffff\1\110\1\104\7\uffff\1\113\3\uffff\1\107\1\57\1\100\1\106\1\uffff\1\115\5\uffff\1\102\1\114\1\uffff\1\111\2\uffff\1\63\1\uffff\1\1";
    static final String DFA12_specialS =
        "\1\2\2\uffff\1\1\33\uffff\1\0\u00d4\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\66\2\65\2\66\1\65\22\66\1\65\1\6\1\37\2\66\1\17\1\20\1\3\1\41\1\42\1\15\1\11\1\26\1\12\1\22\1\16\1\56\6\60\3\61\1\52\1\40\1\7\1\5\1\10\1\25\1\66\4\62\1\30\1\62\16\63\1\2\2\63\1\24\2\63\1\43\1\66\1\44\1\21\1\63\1\66\1\31\1\32\1\4\1\53\1\27\1\1\1\54\1\63\1\47\3\63\1\51\1\33\1\63\1\55\1\63\1\34\1\45\1\35\1\57\1\36\1\64\1\23\2\63\1\46\1\13\1\50\u0248\66\1\14\ufd39\66",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\1\67\15\72\1\71\5\72\1\70\5\72",
            "\1\74\4\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\0\77",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\1\102\6\72\1\100\6\72\1\101\13\72",
            "\1\104",
            "\1\106",
            "\1\112\16\uffff\1\111\1\110",
            "\1\114\1\115",
            "\1\117",
            "\1\121",
            "\1\123",
            "",
            "",
            "\1\127\4\uffff\1\130",
            "",
            "\1\134\67\uffff\1\133",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\137",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\13\72\1\145\16\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\21\72\1\151\10\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\1\154\3\72\1\155\25\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\30\72\1\157\1\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\1\161\31\72",
            "\0\77",
            "",
            "",
            "",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\4\72\1\173\16\72\1\171\2\72\1\172\3\72",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\5\72\1\177\6\72\1\u0080\1\176\14\72",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\1\u0082\31\72",
            "\1\u0083",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\4\72\1\u0085\25\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\16\72\1\u0086\13\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\1\u0087\31\72",
            "\12\u0089",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\u0089",
            "\12\u0089",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
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
            "\1\u0094",
            "",
            "",
            "",
            "\1\u0095",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "",
            "\1\u0098",
            "",
            "\1\u0099",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "",
            "\1\u009d",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u009f",
            "",
            "\1\u00a0",
            "",
            "",
            "\1\u00a1",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\23\72\1\u00a2\6\72",
            "\1\u00a4",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00a8",
            "\1\u00a9\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00b8\3\uffff\1\u00b9",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00bf",
            "\1\u00c0",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00d2",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\1\u00df",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00e4",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "",
            "",
            "",
            "\1\u00ea",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00ed",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00ef",
            "",
            "",
            "\1\u00f0",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00f2",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
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
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | RULE_OCTAL_DIGIT | RULE_DECIMAL_DIGIT | RULE_HEX_DIGIT | RULE_LETTER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_31 = input.LA(1);

                        s = -1;
                        if ( ((LA12_31>='\u0000' && LA12_31<='\uFFFF')) ) {s = 63;}

                        else s = 115;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_3 = input.LA(1);

                        s = -1;
                        if ( ((LA12_3>='\u0000' && LA12_3<='\uFFFF')) ) {s = 63;}

                        else s = 62;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='f') ) {s = 1;}

                        else if ( (LA12_0=='U') ) {s = 2;}

                        else if ( (LA12_0=='\'') ) {s = 3;}

                        else if ( (LA12_0=='c') ) {s = 4;}

                        else if ( (LA12_0=='=') ) {s = 5;}

                        else if ( (LA12_0=='!') ) {s = 6;}

                        else if ( (LA12_0=='<') ) {s = 7;}

                        else if ( (LA12_0=='>') ) {s = 8;}

                        else if ( (LA12_0=='+') ) {s = 9;}

                        else if ( (LA12_0=='-') ) {s = 10;}

                        else if ( (LA12_0=='|') ) {s = 11;}

                        else if ( (LA12_0=='\u02C6') ) {s = 12;}

                        else if ( (LA12_0=='*') ) {s = 13;}

                        else if ( (LA12_0=='/') ) {s = 14;}

                        else if ( (LA12_0=='%') ) {s = 15;}

                        else if ( (LA12_0=='&') ) {s = 16;}

                        else if ( (LA12_0=='^') ) {s = 17;}

                        else if ( (LA12_0=='.') ) {s = 18;}

                        else if ( (LA12_0=='x') ) {s = 19;}

                        else if ( (LA12_0=='X') ) {s = 20;}

                        else if ( (LA12_0=='?') ) {s = 21;}

                        else if ( (LA12_0==',') ) {s = 22;}

                        else if ( (LA12_0=='e') ) {s = 23;}

                        else if ( (LA12_0=='E') ) {s = 24;}

                        else if ( (LA12_0=='a') ) {s = 25;}

                        else if ( (LA12_0=='b') ) {s = 26;}

                        else if ( (LA12_0=='n') ) {s = 27;}

                        else if ( (LA12_0=='r') ) {s = 28;}

                        else if ( (LA12_0=='t') ) {s = 29;}

                        else if ( (LA12_0=='v') ) {s = 30;}

                        else if ( (LA12_0=='\"') ) {s = 31;}

                        else if ( (LA12_0==';') ) {s = 32;}

                        else if ( (LA12_0=='(') ) {s = 33;}

                        else if ( (LA12_0==')') ) {s = 34;}

                        else if ( (LA12_0=='[') ) {s = 35;}

                        else if ( (LA12_0==']') ) {s = 36;}

                        else if ( (LA12_0=='s') ) {s = 37;}

                        else if ( (LA12_0=='{') ) {s = 38;}

                        else if ( (LA12_0=='i') ) {s = 39;}

                        else if ( (LA12_0=='}') ) {s = 40;}

                        else if ( (LA12_0=='m') ) {s = 41;}

                        else if ( (LA12_0==':') ) {s = 42;}

                        else if ( (LA12_0=='d') ) {s = 43;}

                        else if ( (LA12_0=='g') ) {s = 44;}

                        else if ( (LA12_0=='p') ) {s = 45;}

                        else if ( (LA12_0=='0') ) {s = 46;}

                        else if ( (LA12_0=='u') ) {s = 47;}

                        else if ( ((LA12_0>='1' && LA12_0<='6')) ) {s = 48;}

                        else if ( ((LA12_0>='7' && LA12_0<='9')) ) {s = 49;}

                        else if ( ((LA12_0>='A' && LA12_0<='D')||LA12_0=='F') ) {s = 50;}

                        else if ( ((LA12_0>='G' && LA12_0<='T')||(LA12_0>='V' && LA12_0<='W')||(LA12_0>='Y' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='l')||LA12_0=='o'||LA12_0=='q'||(LA12_0>='y' && LA12_0<='z')) ) {s = 51;}

                        else if ( (LA12_0=='w') ) {s = 52;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 53;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='$')||LA12_0=='@'||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\u02C5')||(LA12_0>='\u02C7' && LA12_0<='\uFFFF')) ) {s = 54;}

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