package com.ufcg.compiladores.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.ufcg.compiladores.services.GoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LETTER", "RULE_DECIMAL_DIGIT", "RULE_OCTAL_DIGIT", "RULE_HEX_DIGIT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'", "'('", "')'", "'['", "']'", "'struct'", "'{'", "';'", "'*'", "'func'", "','", "'...'", "'interface'", "'}'", "'map'", "'chan'", "'<-'", "'const'", "'='", "'type'", "'var'", "'.'", "':'", "'fa'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'|'", "'\\u02C6'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'&^'", "'^'", "'ola'", "'carai'", "'0'", "'x'", "'X'", "'\\''", "'\"'", "'?'", "'U+000A'", "'e'", "'E'", "'u'", "'U'", "'a'", "'b'", "'f'", "'n'", "'r'", "'t'", "'v'"
    };
    public static final int T__50=50;
    public static final int RULE_DECIMAL_DIGIT=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int RULE_OCTAL_DIGIT=7;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
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

    // delegates
    // delegators


        public InternalGoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGo.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private GoGrammarAccess grammarAccess;

        public InternalGoParser(TokenStream input, GoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected GoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalGo.g:70:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGo.g:70:46: (iv_ruleModel= ruleModel EOF )
            // InternalGo.g:71:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGo.g:77:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalGo.g:83:2: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // InternalGo.g:84:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // InternalGo.g:84:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGo.g:85:3: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // InternalGo.g:85:3: (lv_greetings_0_0= ruleGreeting )
            	    // InternalGo.g:86:4: lv_greetings_0_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"greetings",
            	      					lv_greetings_0_0,
            	      					"com.ufcg.compiladores.Go.Greeting");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // InternalGo.g:106:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // InternalGo.g:106:49: (iv_ruleGreeting= ruleGreeting EOF )
            // InternalGo.g:107:2: iv_ruleGreeting= ruleGreeting EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreetingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreeting; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalGo.g:113:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGo.g:119:2: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) )
            // InternalGo.g:120:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            {
            // InternalGo.g:120:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            // InternalGo.g:121:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
              		
            }
            // InternalGo.g:125:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:126:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:126:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:127:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGreetingRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleType"
    // InternalGo.g:151:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalGo.g:151:45: (iv_ruleType= ruleType EOF )
            // InternalGo.g:152:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGo.g:158:1: ruleType returns [EObject current=null] : ( ruleTypeName | ( (lv_TypeLit_1_0= ruleTypeLit ) ) | (otherlv_2= '(' this_Type_3= ruleType otherlv_4= ')' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_TypeLit_1_0 = null;

        EObject this_Type_3 = null;



        	enterRule();

        try {
            // InternalGo.g:164:2: ( ( ruleTypeName | ( (lv_TypeLit_1_0= ruleTypeLit ) ) | (otherlv_2= '(' this_Type_3= ruleType otherlv_4= ')' ) ) )
            // InternalGo.g:165:2: ( ruleTypeName | ( (lv_TypeLit_1_0= ruleTypeLit ) ) | (otherlv_2= '(' this_Type_3= ruleType otherlv_4= ')' ) )
            {
            // InternalGo.g:165:2: ( ruleTypeName | ( (lv_TypeLit_1_0= ruleTypeLit ) ) | (otherlv_2= '(' this_Type_3= ruleType otherlv_4= ')' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_LETTER:
            case 60:
                {
                alt2=1;
                }
                break;
            case 19:
            case 21:
            case 24:
            case 25:
            case 28:
            case 30:
            case 31:
            case 32:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGo.g:166:3: ruleTypeName
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getTypeNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruleTypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:177:3: ( (lv_TypeLit_1_0= ruleTypeLit ) )
                    {
                    // InternalGo.g:177:3: ( (lv_TypeLit_1_0= ruleTypeLit ) )
                    // InternalGo.g:178:4: (lv_TypeLit_1_0= ruleTypeLit )
                    {
                    // InternalGo.g:178:4: (lv_TypeLit_1_0= ruleTypeLit )
                    // InternalGo.g:179:5: lv_TypeLit_1_0= ruleTypeLit
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeAccess().getTypeLitTypeLitParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_TypeLit_1_0=ruleTypeLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeRule());
                      					}
                      					set(
                      						current,
                      						"TypeLit",
                      						lv_TypeLit_1_0,
                      						"com.ufcg.compiladores.Go.TypeLit");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:197:3: (otherlv_2= '(' this_Type_3= ruleType otherlv_4= ')' )
                    {
                    // InternalGo.g:197:3: (otherlv_2= '(' this_Type_3= ruleType otherlv_4= ')' )
                    // InternalGo.g:198:4: otherlv_2= '(' this_Type_3= ruleType otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeAccess().getTypeParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_7);
                    this_Type_3=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Type_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeName"
    // InternalGo.g:222:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // InternalGo.g:222:48: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalGo.g:223:2: iv_ruleTypeName= ruleTypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // InternalGo.g:229:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifier_0= ruleidentifier | this_QualifiedIdent_1= ruleQualifiedIdent ) ;
    public final AntlrDatatypeRuleToken ruleTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_identifier_0 = null;

        AntlrDatatypeRuleToken this_QualifiedIdent_1 = null;



        	enterRule();

        try {
            // InternalGo.g:235:2: ( (this_identifier_0= ruleidentifier | this_QualifiedIdent_1= ruleQualifiedIdent ) )
            // InternalGo.g:236:2: (this_identifier_0= ruleidentifier | this_QualifiedIdent_1= ruleQualifiedIdent )
            {
            // InternalGo.g:236:2: (this_identifier_0= ruleidentifier | this_QualifiedIdent_1= ruleQualifiedIdent )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_LETTER) ) {
                alt3=1;
            }
            else if ( (LA3_0==60) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGo.g:237:3: this_identifier_0= ruleidentifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeNameAccess().getIdentifierParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_identifier_0=ruleidentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_identifier_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:248:3: this_QualifiedIdent_1= ruleQualifiedIdent
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeNameAccess().getQualifiedIdentParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_QualifiedIdent_1=ruleQualifiedIdent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_QualifiedIdent_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleTypeLit"
    // InternalGo.g:262:1: entryRuleTypeLit returns [EObject current=null] : iv_ruleTypeLit= ruleTypeLit EOF ;
    public final EObject entryRuleTypeLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLit = null;


        try {
            // InternalGo.g:262:48: (iv_ruleTypeLit= ruleTypeLit EOF )
            // InternalGo.g:263:2: iv_ruleTypeLit= ruleTypeLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeLit=ruleTypeLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeLit"


    // $ANTLR start "ruleTypeLit"
    // InternalGo.g:269:1: ruleTypeLit returns [EObject current=null] : (this_ArrayType_0= ruleArrayType | this_StructType_1= ruleStructType | this_PointerType_2= rulePointerType | this_FunctionType_3= ruleFunctionType | this_InterfaceType_4= ruleInterfaceType | this_SliceType_5= ruleSliceType | this_MapType_6= ruleMapType | this_ChannelType_7= ruleChannelType ) ;
    public final EObject ruleTypeLit() throws RecognitionException {
        EObject current = null;

        EObject this_ArrayType_0 = null;

        EObject this_StructType_1 = null;

        EObject this_PointerType_2 = null;

        EObject this_FunctionType_3 = null;

        EObject this_InterfaceType_4 = null;

        EObject this_SliceType_5 = null;

        EObject this_MapType_6 = null;

        EObject this_ChannelType_7 = null;



        	enterRule();

        try {
            // InternalGo.g:275:2: ( (this_ArrayType_0= ruleArrayType | this_StructType_1= ruleStructType | this_PointerType_2= rulePointerType | this_FunctionType_3= ruleFunctionType | this_InterfaceType_4= ruleInterfaceType | this_SliceType_5= ruleSliceType | this_MapType_6= ruleMapType | this_ChannelType_7= ruleChannelType ) )
            // InternalGo.g:276:2: (this_ArrayType_0= ruleArrayType | this_StructType_1= ruleStructType | this_PointerType_2= rulePointerType | this_FunctionType_3= ruleFunctionType | this_InterfaceType_4= ruleInterfaceType | this_SliceType_5= ruleSliceType | this_MapType_6= ruleMapType | this_ChannelType_7= ruleChannelType )
            {
            // InternalGo.g:276:2: (this_ArrayType_0= ruleArrayType | this_StructType_1= ruleStructType | this_PointerType_2= rulePointerType | this_FunctionType_3= ruleFunctionType | this_InterfaceType_4= ruleInterfaceType | this_SliceType_5= ruleSliceType | this_MapType_6= ruleMapType | this_ChannelType_7= ruleChannelType )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalGo.g:277:3: this_ArrayType_0= ruleArrayType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getArrayTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayType_0=ruleArrayType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArrayType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:289:3: this_StructType_1= ruleStructType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getStructTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StructType_1=ruleStructType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StructType_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:301:3: this_PointerType_2= rulePointerType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getPointerTypeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PointerType_2=rulePointerType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PointerType_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:313:3: this_FunctionType_3= ruleFunctionType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getFunctionTypeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionType_3=ruleFunctionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionType_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:325:3: this_InterfaceType_4= ruleInterfaceType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getInterfaceTypeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InterfaceType_4=ruleInterfaceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InterfaceType_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:337:3: this_SliceType_5= ruleSliceType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getSliceTypeParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SliceType_5=ruleSliceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SliceType_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:349:3: this_MapType_6= ruleMapType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getMapTypeParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MapType_6=ruleMapType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapType_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGo.g:361:3: this_ChannelType_7= ruleChannelType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getChannelTypeParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ChannelType_7=ruleChannelType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ChannelType_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeLit"


    // $ANTLR start "entryRuleArrayLength"
    // InternalGo.g:376:1: entryRuleArrayLength returns [EObject current=null] : iv_ruleArrayLength= ruleArrayLength EOF ;
    public final EObject entryRuleArrayLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLength = null;


        try {
            // InternalGo.g:376:52: (iv_ruleArrayLength= ruleArrayLength EOF )
            // InternalGo.g:377:2: iv_ruleArrayLength= ruleArrayLength EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLengthRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayLength=ruleArrayLength();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLength; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayLength"


    // $ANTLR start "ruleArrayLength"
    // InternalGo.g:383:1: ruleArrayLength returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleArrayLength() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalGo.g:389:2: (this_Expression_0= ruleExpression )
            // InternalGo.g:390:2: this_Expression_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getArrayLengthAccess().getExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Expression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArrayLength"


    // $ANTLR start "entryRuleArrayType"
    // InternalGo.g:404:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalGo.g:404:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalGo.g:405:2: iv_ruleArrayType= ruleArrayType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalGo.g:411:1: ruleArrayType returns [EObject current=null] : (otherlv_0= '[' this_ArrayLength_1= ruleArrayLength otherlv_2= ']' ( (lv_Type_3_0= ruleType ) ) ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ArrayLength_1 = null;

        EObject lv_Type_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:417:2: ( (otherlv_0= '[' this_ArrayLength_1= ruleArrayLength otherlv_2= ']' ( (lv_Type_3_0= ruleType ) ) ) )
            // InternalGo.g:418:2: (otherlv_0= '[' this_ArrayLength_1= ruleArrayLength otherlv_2= ']' ( (lv_Type_3_0= ruleType ) ) )
            {
            // InternalGo.g:418:2: (otherlv_0= '[' this_ArrayLength_1= ruleArrayLength otherlv_2= ']' ( (lv_Type_3_0= ruleType ) ) )
            // InternalGo.g:419:3: otherlv_0= '[' this_ArrayLength_1= ruleArrayLength otherlv_2= ']' ( (lv_Type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArrayTypeAccess().getArrayLengthParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_9);
            this_ArrayLength_1=ruleArrayLength();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ArrayLength_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_2());
              		
            }
            // InternalGo.g:438:3: ( (lv_Type_3_0= ruleType ) )
            // InternalGo.g:439:4: (lv_Type_3_0= ruleType )
            {
            // InternalGo.g:439:4: (lv_Type_3_0= ruleType )
            // InternalGo.g:440:5: lv_Type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayTypeAccess().getTypeTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_Type_3_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayTypeRule());
              					}
              					set(
              						current,
              						"Type",
              						lv_Type_3_0,
              						"com.ufcg.compiladores.Go.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleElementType"
    // InternalGo.g:461:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // InternalGo.g:461:52: (iv_ruleElementType= ruleElementType EOF )
            // InternalGo.g:462:2: iv_ruleElementType= ruleElementType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementType=ruleElementType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalGo.g:468:1: ruleElementType returns [EObject current=null] : ( (lv_Type_0_0= ruleType ) ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject lv_Type_0_0 = null;



        	enterRule();

        try {
            // InternalGo.g:474:2: ( ( (lv_Type_0_0= ruleType ) ) )
            // InternalGo.g:475:2: ( (lv_Type_0_0= ruleType ) )
            {
            // InternalGo.g:475:2: ( (lv_Type_0_0= ruleType ) )
            // InternalGo.g:476:3: (lv_Type_0_0= ruleType )
            {
            // InternalGo.g:476:3: (lv_Type_0_0= ruleType )
            // InternalGo.g:477:4: lv_Type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElementTypeAccess().getTypeTypeParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_Type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getElementTypeRule());
              				}
              				set(
              					current,
              					"Type",
              					lv_Type_0_0,
              					"com.ufcg.compiladores.Go.Type");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleSliceType"
    // InternalGo.g:497:1: entryRuleSliceType returns [EObject current=null] : iv_ruleSliceType= ruleSliceType EOF ;
    public final EObject entryRuleSliceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSliceType = null;


        try {
            // InternalGo.g:497:50: (iv_ruleSliceType= ruleSliceType EOF )
            // InternalGo.g:498:2: iv_ruleSliceType= ruleSliceType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSliceTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSliceType=ruleSliceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSliceType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSliceType"


    // $ANTLR start "ruleSliceType"
    // InternalGo.g:504:1: ruleSliceType returns [EObject current=null] : (otherlv_0= '[' otherlv_1= ']' this_ElementType_2= ruleElementType ) ;
    public final EObject ruleSliceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_ElementType_2 = null;



        	enterRule();

        try {
            // InternalGo.g:510:2: ( (otherlv_0= '[' otherlv_1= ']' this_ElementType_2= ruleElementType ) )
            // InternalGo.g:511:2: (otherlv_0= '[' otherlv_1= ']' this_ElementType_2= ruleElementType )
            {
            // InternalGo.g:511:2: (otherlv_0= '[' otherlv_1= ']' this_ElementType_2= ruleElementType )
            // InternalGo.g:512:3: otherlv_0= '[' otherlv_1= ']' this_ElementType_2= ruleElementType
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSliceTypeAccess().getLeftSquareBracketKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSliceTypeAccess().getRightSquareBracketKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSliceTypeAccess().getElementTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_ElementType_2=ruleElementType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ElementType_2;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSliceType"


    // $ANTLR start "entryRuleStructType"
    // InternalGo.g:535:1: entryRuleStructType returns [EObject current=null] : iv_ruleStructType= ruleStructType EOF ;
    public final EObject entryRuleStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructType = null;


        try {
            // InternalGo.g:535:51: (iv_ruleStructType= ruleStructType EOF )
            // InternalGo.g:536:2: iv_ruleStructType= ruleStructType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStructType=ruleStructType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStructType"


    // $ANTLR start "ruleStructType"
    // InternalGo.g:542:1: ruleStructType returns [EObject current=null] : (otherlv_0= 'struct' otherlv_1= '{' ( ( (lv_FieldDecl_2_0= ruleFieldDecl ) ) otherlv_3= ';' )* otherlv_4= ';' ) ;
    public final EObject ruleStructType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_FieldDecl_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:548:2: ( (otherlv_0= 'struct' otherlv_1= '{' ( ( (lv_FieldDecl_2_0= ruleFieldDecl ) ) otherlv_3= ';' )* otherlv_4= ';' ) )
            // InternalGo.g:549:2: (otherlv_0= 'struct' otherlv_1= '{' ( ( (lv_FieldDecl_2_0= ruleFieldDecl ) ) otherlv_3= ';' )* otherlv_4= ';' )
            {
            // InternalGo.g:549:2: (otherlv_0= 'struct' otherlv_1= '{' ( ( (lv_FieldDecl_2_0= ruleFieldDecl ) ) otherlv_3= ';' )* otherlv_4= ';' )
            // InternalGo.g:550:3: otherlv_0= 'struct' otherlv_1= '{' ( ( (lv_FieldDecl_2_0= ruleFieldDecl ) ) otherlv_3= ';' )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStructTypeAccess().getStructKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGo.g:558:3: ( ( (lv_FieldDecl_2_0= ruleFieldDecl ) ) otherlv_3= ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_LETTER||LA5_0==24||LA5_0==60) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGo.g:559:4: ( (lv_FieldDecl_2_0= ruleFieldDecl ) ) otherlv_3= ';'
            	    {
            	    // InternalGo.g:559:4: ( (lv_FieldDecl_2_0= ruleFieldDecl ) )
            	    // InternalGo.g:560:5: (lv_FieldDecl_2_0= ruleFieldDecl )
            	    {
            	    // InternalGo.g:560:5: (lv_FieldDecl_2_0= ruleFieldDecl )
            	    // InternalGo.g:561:6: lv_FieldDecl_2_0= ruleFieldDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStructTypeAccess().getFieldDeclFieldDeclParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_FieldDecl_2_0=ruleFieldDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getStructTypeRule());
            	      						}
            	      						set(
            	      							current,
            	      							"FieldDecl",
            	      							lv_FieldDecl_2_0,
            	      							"com.ufcg.compiladores.Go.FieldDecl");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getStructTypeAccess().getSemicolonKeyword_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getStructTypeAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStructType"


    // $ANTLR start "entryRuleFieldDecl"
    // InternalGo.g:591:1: entryRuleFieldDecl returns [EObject current=null] : iv_ruleFieldDecl= ruleFieldDecl EOF ;
    public final EObject entryRuleFieldDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDecl = null;


        try {
            // InternalGo.g:591:50: (iv_ruleFieldDecl= ruleFieldDecl EOF )
            // InternalGo.g:592:2: iv_ruleFieldDecl= ruleFieldDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldDecl=ruleFieldDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFieldDecl"


    // $ANTLR start "ruleFieldDecl"
    // InternalGo.g:598:1: ruleFieldDecl returns [EObject current=null] : ( ( ( ruleIdentifierList this_Type_1= ruleType ) | ruleEmbeddedField ) ( ruleTag )? ) ;
    public final EObject ruleFieldDecl() throws RecognitionException {
        EObject current = null;

        EObject this_Type_1 = null;



        	enterRule();

        try {
            // InternalGo.g:604:2: ( ( ( ( ruleIdentifierList this_Type_1= ruleType ) | ruleEmbeddedField ) ( ruleTag )? ) )
            // InternalGo.g:605:2: ( ( ( ruleIdentifierList this_Type_1= ruleType ) | ruleEmbeddedField ) ( ruleTag )? )
            {
            // InternalGo.g:605:2: ( ( ( ruleIdentifierList this_Type_1= ruleType ) | ruleEmbeddedField ) ( ruleTag )? )
            // InternalGo.g:606:3: ( ( ruleIdentifierList this_Type_1= ruleType ) | ruleEmbeddedField ) ( ruleTag )?
            {
            // InternalGo.g:606:3: ( ( ruleIdentifierList this_Type_1= ruleType ) | ruleEmbeddedField )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalGo.g:607:4: ( ruleIdentifierList this_Type_1= ruleType )
                    {
                    // InternalGo.g:607:4: ( ruleIdentifierList this_Type_1= ruleType )
                    // InternalGo.g:608:5: ruleIdentifierList this_Type_1= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFieldDeclAccess().getIdentifierListParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_6);
                    ruleIdentifierList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFieldDeclAccess().getTypeParserRuleCall_0_0_1());
                      				
                    }
                    pushFollow(FOLLOW_13);
                    this_Type_1=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_Type_1;
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:631:4: ruleEmbeddedField
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFieldDeclAccess().getEmbeddedFieldParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_13);
                    ruleEmbeddedField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:642:3: ( ruleTag )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=64 && LA7_0<=65)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGo.g:643:4: ruleTag
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFieldDeclAccess().getTagParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleTag();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFieldDecl"


    // $ANTLR start "entryRuleEmbeddedField"
    // InternalGo.g:658:1: entryRuleEmbeddedField returns [String current=null] : iv_ruleEmbeddedField= ruleEmbeddedField EOF ;
    public final String entryRuleEmbeddedField() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEmbeddedField = null;


        try {
            // InternalGo.g:658:53: (iv_ruleEmbeddedField= ruleEmbeddedField EOF )
            // InternalGo.g:659:2: iv_ruleEmbeddedField= ruleEmbeddedField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmbeddedFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEmbeddedField=ruleEmbeddedField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmbeddedField.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEmbeddedField"


    // $ANTLR start "ruleEmbeddedField"
    // InternalGo.g:665:1: ruleEmbeddedField returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '*' )? this_TypeName_1= ruleTypeName ) ;
    public final AntlrDatatypeRuleToken ruleEmbeddedField() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeName_1 = null;



        	enterRule();

        try {
            // InternalGo.g:671:2: ( ( (kw= '*' )? this_TypeName_1= ruleTypeName ) )
            // InternalGo.g:672:2: ( (kw= '*' )? this_TypeName_1= ruleTypeName )
            {
            // InternalGo.g:672:2: ( (kw= '*' )? this_TypeName_1= ruleTypeName )
            // InternalGo.g:673:3: (kw= '*' )? this_TypeName_1= ruleTypeName
            {
            // InternalGo.g:673:3: (kw= '*' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:674:4: kw= '*'
                    {
                    kw=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEmbeddedFieldAccess().getAsteriskKeyword_0());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEmbeddedFieldAccess().getTypeNameParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_TypeName_1=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TypeName_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEmbeddedField"


    // $ANTLR start "entryRuleTag"
    // InternalGo.g:694:1: entryRuleTag returns [String current=null] : iv_ruleTag= ruleTag EOF ;
    public final String entryRuleTag() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTag = null;


        try {
            // InternalGo.g:694:43: (iv_ruleTag= ruleTag EOF )
            // InternalGo.g:695:2: iv_ruleTag= ruleTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTag.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalGo.g:701:1: ruleTag returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_string_lit_0= rulestring_lit ;
    public final AntlrDatatypeRuleToken ruleTag() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_string_lit_0 = null;



        	enterRule();

        try {
            // InternalGo.g:707:2: (this_string_lit_0= rulestring_lit )
            // InternalGo.g:708:2: this_string_lit_0= rulestring_lit
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getTagAccess().getString_litParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_string_lit_0=rulestring_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_string_lit_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRulePointerType"
    // InternalGo.g:721:1: entryRulePointerType returns [EObject current=null] : iv_rulePointerType= rulePointerType EOF ;
    public final EObject entryRulePointerType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointerType = null;


        try {
            // InternalGo.g:721:52: (iv_rulePointerType= rulePointerType EOF )
            // InternalGo.g:722:2: iv_rulePointerType= rulePointerType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointerTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePointerType=rulePointerType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePointerType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePointerType"


    // $ANTLR start "rulePointerType"
    // InternalGo.g:728:1: rulePointerType returns [EObject current=null] : (otherlv_0= '*' this_BaseType_1= ruleBaseType ) ;
    public final EObject rulePointerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_BaseType_1 = null;



        	enterRule();

        try {
            // InternalGo.g:734:2: ( (otherlv_0= '*' this_BaseType_1= ruleBaseType ) )
            // InternalGo.g:735:2: (otherlv_0= '*' this_BaseType_1= ruleBaseType )
            {
            // InternalGo.g:735:2: (otherlv_0= '*' this_BaseType_1= ruleBaseType )
            // InternalGo.g:736:3: otherlv_0= '*' this_BaseType_1= ruleBaseType
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPointerTypeAccess().getAsteriskKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPointerTypeAccess().getBaseTypeParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_BaseType_1=ruleBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BaseType_1;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePointerType"


    // $ANTLR start "entryRuleBaseType"
    // InternalGo.g:755:1: entryRuleBaseType returns [EObject current=null] : iv_ruleBaseType= ruleBaseType EOF ;
    public final EObject entryRuleBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseType = null;


        try {
            // InternalGo.g:755:49: (iv_ruleBaseType= ruleBaseType EOF )
            // InternalGo.g:756:2: iv_ruleBaseType= ruleBaseType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBaseType=ruleBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBaseType"


    // $ANTLR start "ruleBaseType"
    // InternalGo.g:762:1: ruleBaseType returns [EObject current=null] : ( (lv_Type_0_0= ruleType ) ) ;
    public final EObject ruleBaseType() throws RecognitionException {
        EObject current = null;

        EObject lv_Type_0_0 = null;



        	enterRule();

        try {
            // InternalGo.g:768:2: ( ( (lv_Type_0_0= ruleType ) ) )
            // InternalGo.g:769:2: ( (lv_Type_0_0= ruleType ) )
            {
            // InternalGo.g:769:2: ( (lv_Type_0_0= ruleType ) )
            // InternalGo.g:770:3: (lv_Type_0_0= ruleType )
            {
            // InternalGo.g:770:3: (lv_Type_0_0= ruleType )
            // InternalGo.g:771:4: lv_Type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getBaseTypeAccess().getTypeTypeParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_Type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getBaseTypeRule());
              				}
              				set(
              					current,
              					"Type",
              					lv_Type_0_0,
              					"com.ufcg.compiladores.Go.Type");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBaseType"


    // $ANTLR start "entryRuleFunctionType"
    // InternalGo.g:791:1: entryRuleFunctionType returns [EObject current=null] : iv_ruleFunctionType= ruleFunctionType EOF ;
    public final EObject entryRuleFunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionType = null;


        try {
            // InternalGo.g:791:53: (iv_ruleFunctionType= ruleFunctionType EOF )
            // InternalGo.g:792:2: iv_ruleFunctionType= ruleFunctionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionType=ruleFunctionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionType"


    // $ANTLR start "ruleFunctionType"
    // InternalGo.g:798:1: ruleFunctionType returns [EObject current=null] : (otherlv_0= 'func' ( (lv_Signature_1_0= ruleSignature ) ) ) ;
    public final EObject ruleFunctionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_Signature_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:804:2: ( (otherlv_0= 'func' ( (lv_Signature_1_0= ruleSignature ) ) ) )
            // InternalGo.g:805:2: (otherlv_0= 'func' ( (lv_Signature_1_0= ruleSignature ) ) )
            {
            // InternalGo.g:805:2: (otherlv_0= 'func' ( (lv_Signature_1_0= ruleSignature ) ) )
            // InternalGo.g:806:3: otherlv_0= 'func' ( (lv_Signature_1_0= ruleSignature ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionTypeAccess().getFuncKeyword_0());
              		
            }
            // InternalGo.g:810:3: ( (lv_Signature_1_0= ruleSignature ) )
            // InternalGo.g:811:4: (lv_Signature_1_0= ruleSignature )
            {
            // InternalGo.g:811:4: (lv_Signature_1_0= ruleSignature )
            // InternalGo.g:812:5: lv_Signature_1_0= ruleSignature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionTypeAccess().getSignatureSignatureParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_Signature_1_0=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionTypeRule());
              					}
              					set(
              						current,
              						"Signature",
              						lv_Signature_1_0,
              						"com.ufcg.compiladores.Go.Signature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunctionType"


    // $ANTLR start "entryRuleSignature"
    // InternalGo.g:833:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalGo.g:833:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalGo.g:834:2: iv_ruleSignature= ruleSignature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalGo.g:840:1: ruleSignature returns [EObject current=null] : (this_Parameters_0= ruleParameters ( (lv_Result_1_0= ruleResult ) )? ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        EObject this_Parameters_0 = null;

        EObject lv_Result_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:846:2: ( (this_Parameters_0= ruleParameters ( (lv_Result_1_0= ruleResult ) )? ) )
            // InternalGo.g:847:2: (this_Parameters_0= ruleParameters ( (lv_Result_1_0= ruleResult ) )? )
            {
            // InternalGo.g:847:2: (this_Parameters_0= ruleParameters ( (lv_Result_1_0= ruleResult ) )? )
            // InternalGo.g:848:3: this_Parameters_0= ruleParameters ( (lv_Result_1_0= ruleResult ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSignatureAccess().getParametersParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_Parameters_0=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Parameters_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:859:3: ( (lv_Result_1_0= ruleResult ) )?
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalGo.g:860:4: (lv_Result_1_0= ruleResult )
                    {
                    // InternalGo.g:860:4: (lv_Result_1_0= ruleResult )
                    // InternalGo.g:861:5: lv_Result_1_0= ruleResult
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSignatureAccess().getResultResultParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_Result_1_0=ruleResult();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSignatureRule());
                      					}
                      					set(
                      						current,
                      						"Result",
                      						lv_Result_1_0,
                      						"com.ufcg.compiladores.Go.Result");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleResult"
    // InternalGo.g:882:1: entryRuleResult returns [EObject current=null] : iv_ruleResult= ruleResult EOF ;
    public final EObject entryRuleResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResult = null;


        try {
            // InternalGo.g:882:47: (iv_ruleResult= ruleResult EOF )
            // InternalGo.g:883:2: iv_ruleResult= ruleResult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleResult=ruleResult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResult; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalGo.g:889:1: ruleResult returns [EObject current=null] : (this_Parameters_0= ruleParameters | this_Type_1= ruleType ) ;
    public final EObject ruleResult() throws RecognitionException {
        EObject current = null;

        EObject this_Parameters_0 = null;

        EObject this_Type_1 = null;



        	enterRule();

        try {
            // InternalGo.g:895:2: ( (this_Parameters_0= ruleParameters | this_Type_1= ruleType ) )
            // InternalGo.g:896:2: (this_Parameters_0= ruleParameters | this_Type_1= ruleType )
            {
            // InternalGo.g:896:2: (this_Parameters_0= ruleParameters | this_Type_1= ruleType )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalGo.g:897:3: this_Parameters_0= ruleParameters
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getResultAccess().getParametersParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Parameters_0=ruleParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Parameters_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:909:3: this_Type_1= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getResultAccess().getTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Type_1=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Type_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleParameters"
    // InternalGo.g:924:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // InternalGo.g:924:51: (iv_ruleParameters= ruleParameters EOF )
            // InternalGo.g:925:2: iv_ruleParameters= ruleParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameters=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameters; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalGo.g:931:1: ruleParameters returns [EObject current=null] : (otherlv_0= '(' (this_ParameterList_1= ruleParameterList (otherlv_2= ',' )? )? otherlv_3= ')' ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_ParameterList_1 = null;



        	enterRule();

        try {
            // InternalGo.g:937:2: ( (otherlv_0= '(' (this_ParameterList_1= ruleParameterList (otherlv_2= ',' )? )? otherlv_3= ')' ) )
            // InternalGo.g:938:2: (otherlv_0= '(' (this_ParameterList_1= ruleParameterList (otherlv_2= ',' )? )? otherlv_3= ')' )
            {
            // InternalGo.g:938:2: (otherlv_0= '(' (this_ParameterList_1= ruleParameterList (otherlv_2= ',' )? )? otherlv_3= ')' )
            // InternalGo.g:939:3: otherlv_0= '(' (this_ParameterList_1= ruleParameterList (otherlv_2= ',' )? )? otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParametersAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGo.g:943:3: (this_ParameterList_1= ruleParameterList (otherlv_2= ',' )? )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_LETTER||LA12_0==17||LA12_0==19||LA12_0==21||(LA12_0>=24 && LA12_0<=25)||(LA12_0>=27 && LA12_0<=28)||(LA12_0>=30 && LA12_0<=32)||LA12_0==60) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGo.g:944:4: this_ParameterList_1= ruleParameterList (otherlv_2= ',' )?
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParametersAccess().getParameterListParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_ParameterList_1=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ParameterList_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:955:4: (otherlv_2= ',' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==26) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalGo.g:956:5: otherlv_2= ','
                            {
                            otherlv_2=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getCommaKeyword_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getParametersAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleParameterList"
    // InternalGo.g:970:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalGo.g:970:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalGo.g:971:2: iv_ruleParameterList= ruleParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalGo.g:977:1: ruleParameterList returns [EObject current=null] : (this_ParameterDecl_0= ruleParameterDecl (otherlv_1= ',' ( (lv_ParameterDecl_2_0= ruleParameterDecl ) ) )? ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ParameterDecl_0 = null;

        EObject lv_ParameterDecl_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:983:2: ( (this_ParameterDecl_0= ruleParameterDecl (otherlv_1= ',' ( (lv_ParameterDecl_2_0= ruleParameterDecl ) ) )? ) )
            // InternalGo.g:984:2: (this_ParameterDecl_0= ruleParameterDecl (otherlv_1= ',' ( (lv_ParameterDecl_2_0= ruleParameterDecl ) ) )? )
            {
            // InternalGo.g:984:2: (this_ParameterDecl_0= ruleParameterDecl (otherlv_1= ',' ( (lv_ParameterDecl_2_0= ruleParameterDecl ) ) )? )
            // InternalGo.g:985:3: this_ParameterDecl_0= ruleParameterDecl (otherlv_1= ',' ( (lv_ParameterDecl_2_0= ruleParameterDecl ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParameterListAccess().getParameterDeclParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            this_ParameterDecl_0=ruleParameterDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ParameterDecl_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:996:3: (otherlv_1= ',' ( (lv_ParameterDecl_2_0= ruleParameterDecl ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_LETTER||LA13_1==17||LA13_1==19||LA13_1==21||(LA13_1>=24 && LA13_1<=25)||(LA13_1>=27 && LA13_1<=28)||(LA13_1>=30 && LA13_1<=32)||LA13_1==60) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalGo.g:997:4: otherlv_1= ',' ( (lv_ParameterDecl_2_0= ruleParameterDecl ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
                      			
                    }
                    // InternalGo.g:1001:4: ( (lv_ParameterDecl_2_0= ruleParameterDecl ) )
                    // InternalGo.g:1002:5: (lv_ParameterDecl_2_0= ruleParameterDecl )
                    {
                    // InternalGo.g:1002:5: (lv_ParameterDecl_2_0= ruleParameterDecl )
                    // InternalGo.g:1003:6: lv_ParameterDecl_2_0= ruleParameterDecl
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterListAccess().getParameterDeclParameterDeclParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_ParameterDecl_2_0=ruleParameterDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterListRule());
                      						}
                      						set(
                      							current,
                      							"ParameterDecl",
                      							lv_ParameterDecl_2_0,
                      							"com.ufcg.compiladores.Go.ParameterDecl");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameterDecl"
    // InternalGo.g:1025:1: entryRuleParameterDecl returns [EObject current=null] : iv_ruleParameterDecl= ruleParameterDecl EOF ;
    public final EObject entryRuleParameterDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDecl = null;


        try {
            // InternalGo.g:1025:54: (iv_ruleParameterDecl= ruleParameterDecl EOF )
            // InternalGo.g:1026:2: iv_ruleParameterDecl= ruleParameterDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterDecl=ruleParameterDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameterDecl"


    // $ANTLR start "ruleParameterDecl"
    // InternalGo.g:1032:1: ruleParameterDecl returns [EObject current=null] : ( ( ruleIdentifierList )? (otherlv_1= '...' )? this_Type_2= ruleType ) ;
    public final EObject ruleParameterDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Type_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1038:2: ( ( ( ruleIdentifierList )? (otherlv_1= '...' )? this_Type_2= ruleType ) )
            // InternalGo.g:1039:2: ( ( ruleIdentifierList )? (otherlv_1= '...' )? this_Type_2= ruleType )
            {
            // InternalGo.g:1039:2: ( ( ruleIdentifierList )? (otherlv_1= '...' )? this_Type_2= ruleType )
            // InternalGo.g:1040:3: ( ruleIdentifierList )? (otherlv_1= '...' )? this_Type_2= ruleType
            {
            // InternalGo.g:1040:3: ( ruleIdentifierList )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalGo.g:1041:4: ruleIdentifierList
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParameterDeclAccess().getIdentifierListParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_20);
                    ruleIdentifierList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:1052:3: (otherlv_1= '...' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGo.g:1053:4: otherlv_1= '...'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getParameterDeclAccess().getFullStopFullStopFullStopKeyword_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParameterDeclAccess().getTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_Type_2=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Type_2;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameterDecl"


    // $ANTLR start "entryRuleInterfaceType"
    // InternalGo.g:1073:1: entryRuleInterfaceType returns [EObject current=null] : iv_ruleInterfaceType= ruleInterfaceType EOF ;
    public final EObject entryRuleInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceType = null;


        try {
            // InternalGo.g:1073:54: (iv_ruleInterfaceType= ruleInterfaceType EOF )
            // InternalGo.g:1074:2: iv_ruleInterfaceType= ruleInterfaceType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceType=ruleInterfaceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterfaceType"


    // $ANTLR start "ruleInterfaceType"
    // InternalGo.g:1080:1: ruleInterfaceType returns [EObject current=null] : (otherlv_0= 'interface' otherlv_1= '{' ( ( (lv_MethodSpec_2_0= ruleMethodSpec ) ) otherlv_3= ';' )? otherlv_4= '}' ) ;
    public final EObject ruleInterfaceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_MethodSpec_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1086:2: ( (otherlv_0= 'interface' otherlv_1= '{' ( ( (lv_MethodSpec_2_0= ruleMethodSpec ) ) otherlv_3= ';' )? otherlv_4= '}' ) )
            // InternalGo.g:1087:2: (otherlv_0= 'interface' otherlv_1= '{' ( ( (lv_MethodSpec_2_0= ruleMethodSpec ) ) otherlv_3= ';' )? otherlv_4= '}' )
            {
            // InternalGo.g:1087:2: (otherlv_0= 'interface' otherlv_1= '{' ( ( (lv_MethodSpec_2_0= ruleMethodSpec ) ) otherlv_3= ';' )? otherlv_4= '}' )
            // InternalGo.g:1088:3: otherlv_0= 'interface' otherlv_1= '{' ( ( (lv_MethodSpec_2_0= ruleMethodSpec ) ) otherlv_3= ';' )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInterfaceTypeAccess().getInterfaceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInterfaceTypeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGo.g:1096:3: ( ( (lv_MethodSpec_2_0= ruleMethodSpec ) ) otherlv_3= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_LETTER||LA16_0==60) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGo.g:1097:4: ( (lv_MethodSpec_2_0= ruleMethodSpec ) ) otherlv_3= ';'
                    {
                    // InternalGo.g:1097:4: ( (lv_MethodSpec_2_0= ruleMethodSpec ) )
                    // InternalGo.g:1098:5: (lv_MethodSpec_2_0= ruleMethodSpec )
                    {
                    // InternalGo.g:1098:5: (lv_MethodSpec_2_0= ruleMethodSpec )
                    // InternalGo.g:1099:6: lv_MethodSpec_2_0= ruleMethodSpec
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterfaceTypeAccess().getMethodSpecMethodSpecParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_MethodSpec_2_0=ruleMethodSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInterfaceTypeRule());
                      						}
                      						set(
                      							current,
                      							"MethodSpec",
                      							lv_MethodSpec_2_0,
                      							"com.ufcg.compiladores.Go.MethodSpec");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getInterfaceTypeAccess().getSemicolonKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getInterfaceTypeAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInterfaceType"


    // $ANTLR start "entryRuleMethodSpec"
    // InternalGo.g:1129:1: entryRuleMethodSpec returns [EObject current=null] : iv_ruleMethodSpec= ruleMethodSpec EOF ;
    public final EObject entryRuleMethodSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodSpec = null;


        try {
            // InternalGo.g:1129:51: (iv_ruleMethodSpec= ruleMethodSpec EOF )
            // InternalGo.g:1130:2: iv_ruleMethodSpec= ruleMethodSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodSpec=ruleMethodSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodSpec"


    // $ANTLR start "ruleMethodSpec"
    // InternalGo.g:1136:1: ruleMethodSpec returns [EObject current=null] : ( ( ruleMethodName this_Signature_1= ruleSignature ) | ruleInterfaceTypeName ) ;
    public final EObject ruleMethodSpec() throws RecognitionException {
        EObject current = null;

        EObject this_Signature_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1142:2: ( ( ( ruleMethodName this_Signature_1= ruleSignature ) | ruleInterfaceTypeName ) )
            // InternalGo.g:1143:2: ( ( ruleMethodName this_Signature_1= ruleSignature ) | ruleInterfaceTypeName )
            {
            // InternalGo.g:1143:2: ( ( ruleMethodName this_Signature_1= ruleSignature ) | ruleInterfaceTypeName )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalGo.g:1144:3: ( ruleMethodName this_Signature_1= ruleSignature )
                    {
                    // InternalGo.g:1144:3: ( ruleMethodName this_Signature_1= ruleSignature )
                    // InternalGo.g:1145:4: ruleMethodName this_Signature_1= ruleSignature
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMethodSpecAccess().getMethodNameParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    ruleMethodName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMethodSpecAccess().getSignatureParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Signature_1=ruleSignature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Signature_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1168:3: ruleInterfaceTypeName
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMethodSpecAccess().getInterfaceTypeNameParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruleInterfaceTypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMethodSpec"


    // $ANTLR start "entryRuleMethodName"
    // InternalGo.g:1182:1: entryRuleMethodName returns [String current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final String entryRuleMethodName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodName = null;


        try {
            // InternalGo.g:1182:50: (iv_ruleMethodName= ruleMethodName EOF )
            // InternalGo.g:1183:2: iv_ruleMethodName= ruleMethodName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodName=ruleMethodName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodName"


    // $ANTLR start "ruleMethodName"
    // InternalGo.g:1189:1: ruleMethodName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_identifier_0= ruleidentifier ;
    public final AntlrDatatypeRuleToken ruleMethodName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_identifier_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1195:2: (this_identifier_0= ruleidentifier )
            // InternalGo.g:1196:2: this_identifier_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getMethodNameAccess().getIdentifierParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_identifier_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_identifier_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMethodName"


    // $ANTLR start "entryRuleInterfaceTypeName"
    // InternalGo.g:1209:1: entryRuleInterfaceTypeName returns [String current=null] : iv_ruleInterfaceTypeName= ruleInterfaceTypeName EOF ;
    public final String entryRuleInterfaceTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterfaceTypeName = null;


        try {
            // InternalGo.g:1209:57: (iv_ruleInterfaceTypeName= ruleInterfaceTypeName EOF )
            // InternalGo.g:1210:2: iv_ruleInterfaceTypeName= ruleInterfaceTypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceTypeNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceTypeName=ruleInterfaceTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceTypeName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterfaceTypeName"


    // $ANTLR start "ruleInterfaceTypeName"
    // InternalGo.g:1216:1: ruleInterfaceTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_TypeName_0= ruleTypeName ;
    public final AntlrDatatypeRuleToken ruleInterfaceTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TypeName_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1222:2: (this_TypeName_0= ruleTypeName )
            // InternalGo.g:1223:2: this_TypeName_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getInterfaceTypeNameAccess().getTypeNameParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_TypeName_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_TypeName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInterfaceTypeName"


    // $ANTLR start "entryRuleMapType"
    // InternalGo.g:1236:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // InternalGo.g:1236:48: (iv_ruleMapType= ruleMapType EOF )
            // InternalGo.g:1237:2: iv_ruleMapType= ruleMapType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapType=ruleMapType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // InternalGo.g:1243:1: ruleMapType returns [EObject current=null] : (otherlv_0= 'map' otherlv_1= '[' this_KeyType_2= ruleKeyType otherlv_3= ']' ( (lv_ElementType_4_0= ruleElementType ) ) ) ;
    public final EObject ruleMapType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_KeyType_2 = null;

        EObject lv_ElementType_4_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1249:2: ( (otherlv_0= 'map' otherlv_1= '[' this_KeyType_2= ruleKeyType otherlv_3= ']' ( (lv_ElementType_4_0= ruleElementType ) ) ) )
            // InternalGo.g:1250:2: (otherlv_0= 'map' otherlv_1= '[' this_KeyType_2= ruleKeyType otherlv_3= ']' ( (lv_ElementType_4_0= ruleElementType ) ) )
            {
            // InternalGo.g:1250:2: (otherlv_0= 'map' otherlv_1= '[' this_KeyType_2= ruleKeyType otherlv_3= ']' ( (lv_ElementType_4_0= ruleElementType ) ) )
            // InternalGo.g:1251:3: otherlv_0= 'map' otherlv_1= '[' this_KeyType_2= ruleKeyType otherlv_3= ']' ( (lv_ElementType_4_0= ruleElementType ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMapTypeAccess().getMapKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMapTypeAccess().getKeyTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_9);
            this_KeyType_2=ruleKeyType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_KeyType_2;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_3=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMapTypeAccess().getRightSquareBracketKeyword_3());
              		
            }
            // InternalGo.g:1274:3: ( (lv_ElementType_4_0= ruleElementType ) )
            // InternalGo.g:1275:4: (lv_ElementType_4_0= ruleElementType )
            {
            // InternalGo.g:1275:4: (lv_ElementType_4_0= ruleElementType )
            // InternalGo.g:1276:5: lv_ElementType_4_0= ruleElementType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapTypeAccess().getElementTypeElementTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ElementType_4_0=ruleElementType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapTypeRule());
              					}
              					set(
              						current,
              						"ElementType",
              						lv_ElementType_4_0,
              						"com.ufcg.compiladores.Go.ElementType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleKeyType"
    // InternalGo.g:1297:1: entryRuleKeyType returns [EObject current=null] : iv_ruleKeyType= ruleKeyType EOF ;
    public final EObject entryRuleKeyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyType = null;


        try {
            // InternalGo.g:1297:48: (iv_ruleKeyType= ruleKeyType EOF )
            // InternalGo.g:1298:2: iv_ruleKeyType= ruleKeyType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKeyType=ruleKeyType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKeyType"


    // $ANTLR start "ruleKeyType"
    // InternalGo.g:1304:1: ruleKeyType returns [EObject current=null] : ( (lv_Type_0_0= ruleType ) ) ;
    public final EObject ruleKeyType() throws RecognitionException {
        EObject current = null;

        EObject lv_Type_0_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1310:2: ( ( (lv_Type_0_0= ruleType ) ) )
            // InternalGo.g:1311:2: ( (lv_Type_0_0= ruleType ) )
            {
            // InternalGo.g:1311:2: ( (lv_Type_0_0= ruleType ) )
            // InternalGo.g:1312:3: (lv_Type_0_0= ruleType )
            {
            // InternalGo.g:1312:3: (lv_Type_0_0= ruleType )
            // InternalGo.g:1313:4: lv_Type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getKeyTypeAccess().getTypeTypeParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_Type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getKeyTypeRule());
              				}
              				set(
              					current,
              					"Type",
              					lv_Type_0_0,
              					"com.ufcg.compiladores.Go.Type");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleKeyType"


    // $ANTLR start "entryRuleChannelType"
    // InternalGo.g:1333:1: entryRuleChannelType returns [EObject current=null] : iv_ruleChannelType= ruleChannelType EOF ;
    public final EObject entryRuleChannelType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelType = null;


        try {
            // InternalGo.g:1333:52: (iv_ruleChannelType= ruleChannelType EOF )
            // InternalGo.g:1334:2: iv_ruleChannelType= ruleChannelType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChannelTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChannelType=ruleChannelType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChannelType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleChannelType"


    // $ANTLR start "ruleChannelType"
    // InternalGo.g:1340:1: ruleChannelType returns [EObject current=null] : ( (otherlv_0= 'chan' | (otherlv_1= 'chan' otherlv_2= '<-' ) | (otherlv_3= '<-' otherlv_4= 'chan' ) ) this_ElementType_5= ruleElementType ) ;
    public final EObject ruleChannelType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_ElementType_5 = null;



        	enterRule();

        try {
            // InternalGo.g:1346:2: ( ( (otherlv_0= 'chan' | (otherlv_1= 'chan' otherlv_2= '<-' ) | (otherlv_3= '<-' otherlv_4= 'chan' ) ) this_ElementType_5= ruleElementType ) )
            // InternalGo.g:1347:2: ( (otherlv_0= 'chan' | (otherlv_1= 'chan' otherlv_2= '<-' ) | (otherlv_3= '<-' otherlv_4= 'chan' ) ) this_ElementType_5= ruleElementType )
            {
            // InternalGo.g:1347:2: ( (otherlv_0= 'chan' | (otherlv_1= 'chan' otherlv_2= '<-' ) | (otherlv_3= '<-' otherlv_4= 'chan' ) ) this_ElementType_5= ruleElementType )
            // InternalGo.g:1348:3: (otherlv_0= 'chan' | (otherlv_1= 'chan' otherlv_2= '<-' ) | (otherlv_3= '<-' otherlv_4= 'chan' ) ) this_ElementType_5= ruleElementType
            {
            // InternalGo.g:1348:3: (otherlv_0= 'chan' | (otherlv_1= 'chan' otherlv_2= '<-' ) | (otherlv_3= '<-' otherlv_4= 'chan' ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred25_InternalGo()) ) {
                    alt18=1;
                }
                else if ( (synpred26_InternalGo()) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0==32) ) {
                alt18=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalGo.g:1349:4: otherlv_0= 'chan'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getChannelTypeAccess().getChanKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1354:4: (otherlv_1= 'chan' otherlv_2= '<-' )
                    {
                    // InternalGo.g:1354:4: (otherlv_1= 'chan' otherlv_2= '<-' )
                    // InternalGo.g:1355:5: otherlv_1= 'chan' otherlv_2= '<-'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getChannelTypeAccess().getChanKeyword_0_1_0());
                      				
                    }
                    otherlv_2=(Token)match(input,32,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getChannelTypeAccess().getLessThanSignHyphenMinusKeyword_0_1_1());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1365:4: (otherlv_3= '<-' otherlv_4= 'chan' )
                    {
                    // InternalGo.g:1365:4: (otherlv_3= '<-' otherlv_4= 'chan' )
                    // InternalGo.g:1366:5: otherlv_3= '<-' otherlv_4= 'chan'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getChannelTypeAccess().getLessThanSignHyphenMinusKeyword_0_2_0());
                      				
                    }
                    otherlv_4=(Token)match(input,31,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getChannelTypeAccess().getChanKeyword_0_2_1());
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getChannelTypeAccess().getElementTypeParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_ElementType_5=ruleElementType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ElementType_5;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleChannelType"


    // $ANTLR start "entryRuleBlock"
    // InternalGo.g:1391:1: entryRuleBlock returns [String current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final String entryRuleBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlock = null;


        try {
            // InternalGo.g:1391:45: (iv_ruleBlock= ruleBlock EOF )
            // InternalGo.g:1392:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalGo.g:1398:1: ruleBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_StatementList_1= ruleStatementList kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_StatementList_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1404:2: ( (kw= '{' this_StatementList_1= ruleStatementList kw= '}' ) )
            // InternalGo.g:1405:2: (kw= '{' this_StatementList_1= ruleStatementList kw= '}' )
            {
            // InternalGo.g:1405:2: (kw= '{' this_StatementList_1= ruleStatementList kw= '}' )
            // InternalGo.g:1406:3: kw= '{' this_StatementList_1= ruleStatementList kw= '}'
            {
            kw=(Token)match(input,22,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBlockAccess().getStatementListParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_22);
            this_StatementList_1=ruleStatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_StatementList_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleStatementList"
    // InternalGo.g:1430:1: entryRuleStatementList returns [String current=null] : iv_ruleStatementList= ruleStatementList EOF ;
    public final String entryRuleStatementList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatementList = null;


        try {
            // InternalGo.g:1430:53: (iv_ruleStatementList= ruleStatementList EOF )
            // InternalGo.g:1431:2: iv_ruleStatementList= ruleStatementList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatementList=ruleStatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementList.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatementList"


    // $ANTLR start "ruleStatementList"
    // InternalGo.g:1437:1: ruleStatementList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Statement_0= ruleStatement kw= ';' )? ;
    public final AntlrDatatypeRuleToken ruleStatementList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Statement_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1443:2: ( (this_Statement_0= ruleStatement kw= ';' )? )
            // InternalGo.g:1444:2: (this_Statement_0= ruleStatement kw= ';' )?
            {
            // InternalGo.g:1444:2: (this_Statement_0= ruleStatement kw= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==59) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGo.g:1445:3: this_Statement_0= ruleStatement kw= ';'
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementListAccess().getStatementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_12);
                    this_Statement_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Statement_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getStatementListAccess().getSemicolonKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStatementList"


    // $ANTLR start "entryRuleDeclaration"
    // InternalGo.g:1464:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalGo.g:1464:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalGo.g:1465:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalGo.g:1471:1: ruleDeclaration returns [EObject current=null] : (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ConstDecl_0 = null;

        EObject this_TypeDecl_1 = null;

        EObject this_VarDecl_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1477:2: ( (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl ) )
            // InternalGo.g:1478:2: (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl )
            {
            // InternalGo.g:1478:2: (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt20=1;
                }
                break;
            case 35:
                {
                alt20=2;
                }
                break;
            case 36:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalGo.g:1479:3: this_ConstDecl_0= ruleConstDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarationAccess().getConstDeclParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConstDecl_0=ruleConstDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConstDecl_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1491:3: this_TypeDecl_1= ruleTypeDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarationAccess().getTypeDeclParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeDecl_1=ruleTypeDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeDecl_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:1503:3: this_VarDecl_2= ruleVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarationAccess().getVarDeclParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VarDecl_2=ruleVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VarDecl_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleConstDecl"
    // InternalGo.g:1518:1: entryRuleConstDecl returns [EObject current=null] : iv_ruleConstDecl= ruleConstDecl EOF ;
    public final EObject entryRuleConstDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstDecl = null;


        try {
            // InternalGo.g:1518:50: (iv_ruleConstDecl= ruleConstDecl EOF )
            // InternalGo.g:1519:2: iv_ruleConstDecl= ruleConstDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstDecl=ruleConstDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstDecl"


    // $ANTLR start "ruleConstDecl"
    // InternalGo.g:1525:1: ruleConstDecl returns [EObject current=null] : (otherlv_0= 'const' (this_ConstSpec_1= ruleConstSpec | (otherlv_2= '(' (this_ConstSpec_3= ruleConstSpec otherlv_4= ';' )? otherlv_5= ')' ) ) ) ;
    public final EObject ruleConstDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_ConstSpec_1 = null;

        EObject this_ConstSpec_3 = null;



        	enterRule();

        try {
            // InternalGo.g:1531:2: ( (otherlv_0= 'const' (this_ConstSpec_1= ruleConstSpec | (otherlv_2= '(' (this_ConstSpec_3= ruleConstSpec otherlv_4= ';' )? otherlv_5= ')' ) ) ) )
            // InternalGo.g:1532:2: (otherlv_0= 'const' (this_ConstSpec_1= ruleConstSpec | (otherlv_2= '(' (this_ConstSpec_3= ruleConstSpec otherlv_4= ';' )? otherlv_5= ')' ) ) )
            {
            // InternalGo.g:1532:2: (otherlv_0= 'const' (this_ConstSpec_1= ruleConstSpec | (otherlv_2= '(' (this_ConstSpec_3= ruleConstSpec otherlv_4= ';' )? otherlv_5= ')' ) ) )
            // InternalGo.g:1533:3: otherlv_0= 'const' (this_ConstSpec_1= ruleConstSpec | (otherlv_2= '(' (this_ConstSpec_3= ruleConstSpec otherlv_4= ';' )? otherlv_5= ')' ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstDeclAccess().getConstKeyword_0());
              		
            }
            // InternalGo.g:1537:3: (this_ConstSpec_1= ruleConstSpec | (otherlv_2= '(' (this_ConstSpec_3= ruleConstSpec otherlv_4= ';' )? otherlv_5= ')' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_LETTER) ) {
                alt22=1;
            }
            else if ( (LA22_0==17) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalGo.g:1538:4: this_ConstSpec_1= ruleConstSpec
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConstDeclAccess().getConstSpecParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ConstSpec_1=ruleConstSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ConstSpec_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1550:4: (otherlv_2= '(' (this_ConstSpec_3= ruleConstSpec otherlv_4= ';' )? otherlv_5= ')' )
                    {
                    // InternalGo.g:1550:4: (otherlv_2= '(' (this_ConstSpec_3= ruleConstSpec otherlv_4= ';' )? otherlv_5= ')' )
                    // InternalGo.g:1551:5: otherlv_2= '(' (this_ConstSpec_3= ruleConstSpec otherlv_4= ';' )? otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getConstDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalGo.g:1555:5: (this_ConstSpec_3= ruleConstSpec otherlv_4= ';' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_LETTER) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalGo.g:1556:6: this_ConstSpec_3= ruleConstSpec otherlv_4= ';'
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getConstDeclAccess().getConstSpecParserRuleCall_1_1_1_0());
                              					
                            }
                            pushFollow(FOLLOW_12);
                            this_ConstSpec_3=ruleConstSpec();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_ConstSpec_3;
                              						afterParserOrEnumRuleCall();
                              					
                            }
                            otherlv_4=(Token)match(input,23,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getConstDeclAccess().getSemicolonKeyword_1_1_1_1());
                              					
                            }

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getConstDeclAccess().getRightParenthesisKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstDecl"


    // $ANTLR start "entryRuleConstSpec"
    // InternalGo.g:1582:1: entryRuleConstSpec returns [EObject current=null] : iv_ruleConstSpec= ruleConstSpec EOF ;
    public final EObject entryRuleConstSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstSpec = null;


        try {
            // InternalGo.g:1582:50: (iv_ruleConstSpec= ruleConstSpec EOF )
            // InternalGo.g:1583:2: iv_ruleConstSpec= ruleConstSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstSpec=ruleConstSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstSpec"


    // $ANTLR start "ruleConstSpec"
    // InternalGo.g:1589:1: ruleConstSpec returns [EObject current=null] : ( ruleIdentifierList ( (this_Type_1= ruleType )? otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) ) )? ) ;
    public final EObject ruleConstSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Type_1 = null;

        EObject lv_ExpressionList_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1595:2: ( ( ruleIdentifierList ( (this_Type_1= ruleType )? otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) ) )? ) )
            // InternalGo.g:1596:2: ( ruleIdentifierList ( (this_Type_1= ruleType )? otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) ) )? )
            {
            // InternalGo.g:1596:2: ( ruleIdentifierList ( (this_Type_1= ruleType )? otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) ) )? )
            // InternalGo.g:1597:3: ruleIdentifierList ( (this_Type_1= ruleType )? otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConstSpecAccess().getIdentifierListParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_29);
            ruleIdentifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1607:3: ( (this_Type_1= ruleType )? otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_LETTER||LA24_0==17||LA24_0==19||LA24_0==21||(LA24_0>=24 && LA24_0<=25)||LA24_0==28||(LA24_0>=30 && LA24_0<=32)||LA24_0==34||LA24_0==60) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGo.g:1608:4: (this_Type_1= ruleType )? otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) )
                    {
                    // InternalGo.g:1608:4: (this_Type_1= ruleType )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_LETTER||LA23_0==17||LA23_0==19||LA23_0==21||(LA23_0>=24 && LA23_0<=25)||LA23_0==28||(LA23_0>=30 && LA23_0<=32)||LA23_0==60) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalGo.g:1609:5: this_Type_1= ruleType
                            {
                            if ( state.backtracking==0 ) {

                              					/* */
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getConstSpecAccess().getTypeParserRuleCall_1_0());
                              				
                            }
                            pushFollow(FOLLOW_30);
                            this_Type_1=ruleType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_Type_1;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,34,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getConstSpecAccess().getEqualsSignKeyword_1_1());
                      			
                    }
                    // InternalGo.g:1625:4: ( (lv_ExpressionList_3_0= ruleExpressionList ) )
                    // InternalGo.g:1626:5: (lv_ExpressionList_3_0= ruleExpressionList )
                    {
                    // InternalGo.g:1626:5: (lv_ExpressionList_3_0= ruleExpressionList )
                    // InternalGo.g:1627:6: lv_ExpressionList_3_0= ruleExpressionList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstSpecAccess().getExpressionListExpressionListParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_ExpressionList_3_0=ruleExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConstSpecRule());
                      						}
                      						set(
                      							current,
                      							"ExpressionList",
                      							lv_ExpressionList_3_0,
                      							"com.ufcg.compiladores.Go.ExpressionList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstSpec"


    // $ANTLR start "entryRuleIdentifierList"
    // InternalGo.g:1649:1: entryRuleIdentifierList returns [String current=null] : iv_ruleIdentifierList= ruleIdentifierList EOF ;
    public final String entryRuleIdentifierList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifierList = null;


        try {
            // InternalGo.g:1649:54: (iv_ruleIdentifierList= ruleIdentifierList EOF )
            // InternalGo.g:1650:2: iv_ruleIdentifierList= ruleIdentifierList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdentifierList=ruleIdentifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifierList.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdentifierList"


    // $ANTLR start "ruleIdentifierList"
    // InternalGo.g:1656:1: ruleIdentifierList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )? ) ;
    public final AntlrDatatypeRuleToken ruleIdentifierList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_0 = null;

        AntlrDatatypeRuleToken this_identifier_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1662:2: ( (this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )? ) )
            // InternalGo.g:1663:2: (this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )? )
            {
            // InternalGo.g:1663:2: (this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )? )
            // InternalGo.g:1664:3: this_identifier_0= ruleidentifier (kw= ',' this_identifier_2= ruleidentifier )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIdentifierListAccess().getIdentifierParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            this_identifier_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_identifier_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1674:3: (kw= ',' this_identifier_2= ruleidentifier )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGo.g:1675:4: kw= ',' this_identifier_2= ruleidentifier
                    {
                    kw=(Token)match(input,26,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIdentifierListAccess().getCommaKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIdentifierListAccess().getIdentifierParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_identifier_2=ruleidentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_identifier_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIdentifierList"


    // $ANTLR start "entryRuleExpressionList"
    // InternalGo.g:1695:1: entryRuleExpressionList returns [EObject current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final EObject entryRuleExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionList = null;


        try {
            // InternalGo.g:1695:55: (iv_ruleExpressionList= ruleExpressionList EOF )
            // InternalGo.g:1696:2: iv_ruleExpressionList= ruleExpressionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionList=ruleExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // InternalGo.g:1702:1: ruleExpressionList returns [EObject current=null] : (this_Expression_0= ruleExpression (otherlv_1= ',' ( (lv_Expression_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpressionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Expression_0 = null;

        EObject lv_Expression_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1708:2: ( (this_Expression_0= ruleExpression (otherlv_1= ',' ( (lv_Expression_2_0= ruleExpression ) ) )? ) )
            // InternalGo.g:1709:2: (this_Expression_0= ruleExpression (otherlv_1= ',' ( (lv_Expression_2_0= ruleExpression ) ) )? )
            {
            // InternalGo.g:1709:2: (this_Expression_0= ruleExpression (otherlv_1= ',' ( (lv_Expression_2_0= ruleExpression ) ) )? )
            // InternalGo.g:1710:3: this_Expression_0= ruleExpression (otherlv_1= ',' ( (lv_Expression_2_0= ruleExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1721:3: (otherlv_1= ',' ( (lv_Expression_2_0= ruleExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGo.g:1722:4: otherlv_1= ',' ( (lv_Expression_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getExpressionListAccess().getCommaKeyword_1_0());
                      			
                    }
                    // InternalGo.g:1726:4: ( (lv_Expression_2_0= ruleExpression ) )
                    // InternalGo.g:1727:5: (lv_Expression_2_0= ruleExpression )
                    {
                    // InternalGo.g:1727:5: (lv_Expression_2_0= ruleExpression )
                    // InternalGo.g:1728:6: lv_Expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_Expression_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionListRule());
                      						}
                      						set(
                      							current,
                      							"Expression",
                      							lv_Expression_2_0,
                      							"com.ufcg.compiladores.Go.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleTypeDecl"
    // InternalGo.g:1750:1: entryRuleTypeDecl returns [EObject current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final EObject entryRuleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDecl = null;


        try {
            // InternalGo.g:1750:49: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // InternalGo.g:1751:2: iv_ruleTypeDecl= ruleTypeDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeDecl=ruleTypeDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeDecl"


    // $ANTLR start "ruleTypeDecl"
    // InternalGo.g:1757:1: ruleTypeDecl returns [EObject current=null] : (otherlv_0= 'type' (this_TypeSpec_1= ruleTypeSpec | (otherlv_2= '(' (this_TypeSpec_3= ruleTypeSpec otherlv_4= ';' )? otherlv_5= ')' ) ) ) ;
    public final EObject ruleTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_TypeSpec_1 = null;

        EObject this_TypeSpec_3 = null;



        	enterRule();

        try {
            // InternalGo.g:1763:2: ( (otherlv_0= 'type' (this_TypeSpec_1= ruleTypeSpec | (otherlv_2= '(' (this_TypeSpec_3= ruleTypeSpec otherlv_4= ';' )? otherlv_5= ')' ) ) ) )
            // InternalGo.g:1764:2: (otherlv_0= 'type' (this_TypeSpec_1= ruleTypeSpec | (otherlv_2= '(' (this_TypeSpec_3= ruleTypeSpec otherlv_4= ';' )? otherlv_5= ')' ) ) )
            {
            // InternalGo.g:1764:2: (otherlv_0= 'type' (this_TypeSpec_1= ruleTypeSpec | (otherlv_2= '(' (this_TypeSpec_3= ruleTypeSpec otherlv_4= ';' )? otherlv_5= ')' ) ) )
            // InternalGo.g:1765:3: otherlv_0= 'type' (this_TypeSpec_1= ruleTypeSpec | (otherlv_2= '(' (this_TypeSpec_3= ruleTypeSpec otherlv_4= ';' )? otherlv_5= ')' ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypeDeclAccess().getTypeKeyword_0());
              		
            }
            // InternalGo.g:1769:3: (this_TypeSpec_1= ruleTypeSpec | (otherlv_2= '(' (this_TypeSpec_3= ruleTypeSpec otherlv_4= ';' )? otherlv_5= ')' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_LETTER) ) {
                alt28=1;
            }
            else if ( (LA28_0==17) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalGo.g:1770:4: this_TypeSpec_1= ruleTypeSpec
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeDeclAccess().getTypeSpecParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeSpec_1=ruleTypeSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TypeSpec_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1782:4: (otherlv_2= '(' (this_TypeSpec_3= ruleTypeSpec otherlv_4= ';' )? otherlv_5= ')' )
                    {
                    // InternalGo.g:1782:4: (otherlv_2= '(' (this_TypeSpec_3= ruleTypeSpec otherlv_4= ';' )? otherlv_5= ')' )
                    // InternalGo.g:1783:5: otherlv_2= '(' (this_TypeSpec_3= ruleTypeSpec otherlv_4= ';' )? otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getTypeDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalGo.g:1787:5: (this_TypeSpec_3= ruleTypeSpec otherlv_4= ';' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_LETTER) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalGo.g:1788:6: this_TypeSpec_3= ruleTypeSpec otherlv_4= ';'
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getTypeDeclAccess().getTypeSpecParserRuleCall_1_1_1_0());
                              					
                            }
                            pushFollow(FOLLOW_12);
                            this_TypeSpec_3=ruleTypeSpec();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_TypeSpec_3;
                              						afterParserOrEnumRuleCall();
                              					
                            }
                            otherlv_4=(Token)match(input,23,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getTypeDeclAccess().getSemicolonKeyword_1_1_1_1());
                              					
                            }

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getTypeDeclAccess().getRightParenthesisKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuleTypeSpec"
    // InternalGo.g:1814:1: entryRuleTypeSpec returns [EObject current=null] : iv_ruleTypeSpec= ruleTypeSpec EOF ;
    public final EObject entryRuleTypeSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpec = null;


        try {
            // InternalGo.g:1814:49: (iv_ruleTypeSpec= ruleTypeSpec EOF )
            // InternalGo.g:1815:2: iv_ruleTypeSpec= ruleTypeSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeSpec=ruleTypeSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeSpec"


    // $ANTLR start "ruleTypeSpec"
    // InternalGo.g:1821:1: ruleTypeSpec returns [EObject current=null] : (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef ) ;
    public final EObject ruleTypeSpec() throws RecognitionException {
        EObject current = null;

        EObject this_AliasDecl_0 = null;

        EObject this_TypeDef_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1827:2: ( (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef ) )
            // InternalGo.g:1828:2: (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef )
            {
            // InternalGo.g:1828:2: (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalGo.g:1829:3: this_AliasDecl_0= ruleAliasDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeSpecAccess().getAliasDeclParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AliasDecl_0=ruleAliasDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AliasDecl_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1841:3: this_TypeDef_1= ruleTypeDef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeSpecAccess().getTypeDefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeDef_1=ruleTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeDef_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeSpec"


    // $ANTLR start "entryRuleAliasDecl"
    // InternalGo.g:1856:1: entryRuleAliasDecl returns [EObject current=null] : iv_ruleAliasDecl= ruleAliasDecl EOF ;
    public final EObject entryRuleAliasDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasDecl = null;


        try {
            // InternalGo.g:1856:50: (iv_ruleAliasDecl= ruleAliasDecl EOF )
            // InternalGo.g:1857:2: iv_ruleAliasDecl= ruleAliasDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAliasDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAliasDecl=ruleAliasDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAliasDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAliasDecl"


    // $ANTLR start "ruleAliasDecl"
    // InternalGo.g:1863:1: ruleAliasDecl returns [EObject current=null] : ( ruleidentifier otherlv_1= '=' this_Type_2= ruleType ) ;
    public final EObject ruleAliasDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Type_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1869:2: ( ( ruleidentifier otherlv_1= '=' this_Type_2= ruleType ) )
            // InternalGo.g:1870:2: ( ruleidentifier otherlv_1= '=' this_Type_2= ruleType )
            {
            // InternalGo.g:1870:2: ( ruleidentifier otherlv_1= '=' this_Type_2= ruleType )
            // InternalGo.g:1871:3: ruleidentifier otherlv_1= '=' this_Type_2= ruleType
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAliasDeclAccess().getIdentifierParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_30);
            ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,34,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAliasDeclAccess().getEqualsSignKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAliasDeclAccess().getTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_Type_2=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Type_2;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAliasDecl"


    // $ANTLR start "entryRuleTypeDef"
    // InternalGo.g:1900:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalGo.g:1900:48: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalGo.g:1901:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalGo.g:1907:1: ruleTypeDef returns [EObject current=null] : ( ruleidentifier this_Type_1= ruleType ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject this_Type_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1913:2: ( ( ruleidentifier this_Type_1= ruleType ) )
            // InternalGo.g:1914:2: ( ruleidentifier this_Type_1= ruleType )
            {
            // InternalGo.g:1914:2: ( ruleidentifier this_Type_1= ruleType )
            // InternalGo.g:1915:3: ruleidentifier this_Type_1= ruleType
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeDefAccess().getIdentifierParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_6);
            ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeDefAccess().getTypeParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Type_1=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Type_1;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleVarDecl"
    // InternalGo.g:1940:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalGo.g:1940:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalGo.g:1941:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalGo.g:1947:1: ruleVarDecl returns [EObject current=null] : (otherlv_0= 'var' (this_VarSpec_1= ruleVarSpec | (otherlv_2= '(' (this_VarSpec_3= ruleVarSpec otherlv_4= ';' )? otherlv_5= ')' ) ) ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_VarSpec_1 = null;

        EObject this_VarSpec_3 = null;



        	enterRule();

        try {
            // InternalGo.g:1953:2: ( (otherlv_0= 'var' (this_VarSpec_1= ruleVarSpec | (otherlv_2= '(' (this_VarSpec_3= ruleVarSpec otherlv_4= ';' )? otherlv_5= ')' ) ) ) )
            // InternalGo.g:1954:2: (otherlv_0= 'var' (this_VarSpec_1= ruleVarSpec | (otherlv_2= '(' (this_VarSpec_3= ruleVarSpec otherlv_4= ';' )? otherlv_5= ')' ) ) )
            {
            // InternalGo.g:1954:2: (otherlv_0= 'var' (this_VarSpec_1= ruleVarSpec | (otherlv_2= '(' (this_VarSpec_3= ruleVarSpec otherlv_4= ';' )? otherlv_5= ')' ) ) )
            // InternalGo.g:1955:3: otherlv_0= 'var' (this_VarSpec_1= ruleVarSpec | (otherlv_2= '(' (this_VarSpec_3= ruleVarSpec otherlv_4= ';' )? otherlv_5= ')' ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVarDeclAccess().getVarKeyword_0());
              		
            }
            // InternalGo.g:1959:3: (this_VarSpec_1= ruleVarSpec | (otherlv_2= '(' (this_VarSpec_3= ruleVarSpec otherlv_4= ';' )? otherlv_5= ')' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_LETTER) ) {
                alt31=1;
            }
            else if ( (LA31_0==17) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalGo.g:1960:4: this_VarSpec_1= ruleVarSpec
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getVarDeclAccess().getVarSpecParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_VarSpec_1=ruleVarSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_VarSpec_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1972:4: (otherlv_2= '(' (this_VarSpec_3= ruleVarSpec otherlv_4= ';' )? otherlv_5= ')' )
                    {
                    // InternalGo.g:1972:4: (otherlv_2= '(' (this_VarSpec_3= ruleVarSpec otherlv_4= ';' )? otherlv_5= ')' )
                    // InternalGo.g:1973:5: otherlv_2= '(' (this_VarSpec_3= ruleVarSpec otherlv_4= ';' )? otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getVarDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalGo.g:1977:5: (this_VarSpec_3= ruleVarSpec otherlv_4= ';' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_LETTER) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalGo.g:1978:6: this_VarSpec_3= ruleVarSpec otherlv_4= ';'
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getVarDeclAccess().getVarSpecParserRuleCall_1_1_1_0());
                              					
                            }
                            pushFollow(FOLLOW_12);
                            this_VarSpec_3=ruleVarSpec();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_VarSpec_3;
                              						afterParserOrEnumRuleCall();
                              					
                            }
                            otherlv_4=(Token)match(input,23,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getVarDeclAccess().getSemicolonKeyword_1_1_1_1());
                              					
                            }

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getVarDeclAccess().getRightParenthesisKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleVarSpec"
    // InternalGo.g:2004:1: entryRuleVarSpec returns [EObject current=null] : iv_ruleVarSpec= ruleVarSpec EOF ;
    public final EObject entryRuleVarSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarSpec = null;


        try {
            // InternalGo.g:2004:48: (iv_ruleVarSpec= ruleVarSpec EOF )
            // InternalGo.g:2005:2: iv_ruleVarSpec= ruleVarSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarSpec=ruleVarSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarSpec"


    // $ANTLR start "ruleVarSpec"
    // InternalGo.g:2011:1: ruleVarSpec returns [EObject current=null] : ( ruleIdentifierList ( (this_Type_1= ruleType (otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) ) )? ) | (otherlv_4= '=' this_ExpressionList_5= ruleExpressionList ) ) ) ;
    public final EObject ruleVarSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Type_1 = null;

        EObject lv_ExpressionList_3_0 = null;

        EObject this_ExpressionList_5 = null;



        	enterRule();

        try {
            // InternalGo.g:2017:2: ( ( ruleIdentifierList ( (this_Type_1= ruleType (otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) ) )? ) | (otherlv_4= '=' this_ExpressionList_5= ruleExpressionList ) ) ) )
            // InternalGo.g:2018:2: ( ruleIdentifierList ( (this_Type_1= ruleType (otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) ) )? ) | (otherlv_4= '=' this_ExpressionList_5= ruleExpressionList ) ) )
            {
            // InternalGo.g:2018:2: ( ruleIdentifierList ( (this_Type_1= ruleType (otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) ) )? ) | (otherlv_4= '=' this_ExpressionList_5= ruleExpressionList ) ) )
            // InternalGo.g:2019:3: ruleIdentifierList ( (this_Type_1= ruleType (otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) ) )? ) | (otherlv_4= '=' this_ExpressionList_5= ruleExpressionList ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVarSpecAccess().getIdentifierListParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_32);
            ruleIdentifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2029:3: ( (this_Type_1= ruleType (otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) ) )? ) | (otherlv_4= '=' this_ExpressionList_5= ruleExpressionList ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_LETTER||LA33_0==17||LA33_0==19||LA33_0==21||(LA33_0>=24 && LA33_0<=25)||LA33_0==28||(LA33_0>=30 && LA33_0<=32)||LA33_0==60) ) {
                alt33=1;
            }
            else if ( (LA33_0==34) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalGo.g:2030:4: (this_Type_1= ruleType (otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) ) )? )
                    {
                    // InternalGo.g:2030:4: (this_Type_1= ruleType (otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) ) )? )
                    // InternalGo.g:2031:5: this_Type_1= ruleType (otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVarSpecAccess().getTypeParserRuleCall_1_0_0());
                      				
                    }
                    pushFollow(FOLLOW_33);
                    this_Type_1=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_Type_1;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalGo.g:2042:5: (otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==34) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalGo.g:2043:6: otherlv_2= '=' ( (lv_ExpressionList_3_0= ruleExpressionList ) )
                            {
                            otherlv_2=(Token)match(input,34,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getVarSpecAccess().getEqualsSignKeyword_1_0_1_0());
                              					
                            }
                            // InternalGo.g:2047:6: ( (lv_ExpressionList_3_0= ruleExpressionList ) )
                            // InternalGo.g:2048:7: (lv_ExpressionList_3_0= ruleExpressionList )
                            {
                            // InternalGo.g:2048:7: (lv_ExpressionList_3_0= ruleExpressionList )
                            // InternalGo.g:2049:8: lv_ExpressionList_3_0= ruleExpressionList
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getVarSpecAccess().getExpressionListExpressionListParserRuleCall_1_0_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_ExpressionList_3_0=ruleExpressionList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getVarSpecRule());
                              								}
                              								set(
                              									current,
                              									"ExpressionList",
                              									lv_ExpressionList_3_0,
                              									"com.ufcg.compiladores.Go.ExpressionList");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2069:4: (otherlv_4= '=' this_ExpressionList_5= ruleExpressionList )
                    {
                    // InternalGo.g:2069:4: (otherlv_4= '=' this_ExpressionList_5= ruleExpressionList )
                    // InternalGo.g:2070:5: otherlv_4= '=' this_ExpressionList_5= ruleExpressionList
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getVarSpecAccess().getEqualsSignKeyword_1_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVarSpecAccess().getExpressionListParserRuleCall_1_1_1());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionList_5=ruleExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_ExpressionList_5;
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVarSpec"


    // $ANTLR start "entryRuleFunctionDecl"
    // InternalGo.g:2091:1: entryRuleFunctionDecl returns [EObject current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final EObject entryRuleFunctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDecl = null;


        try {
            // InternalGo.g:2091:53: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // InternalGo.g:2092:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDecl=ruleFunctionDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionDecl"


    // $ANTLR start "ruleFunctionDecl"
    // InternalGo.g:2098:1: ruleFunctionDecl returns [EObject current=null] : (otherlv_0= 'func' ruleFunctionName this_Signature_2= ruleSignature ( ruleFunctionBody )? ) ;
    public final EObject ruleFunctionDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Signature_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2104:2: ( (otherlv_0= 'func' ruleFunctionName this_Signature_2= ruleSignature ( ruleFunctionBody )? ) )
            // InternalGo.g:2105:2: (otherlv_0= 'func' ruleFunctionName this_Signature_2= ruleSignature ( ruleFunctionBody )? )
            {
            // InternalGo.g:2105:2: (otherlv_0= 'func' ruleFunctionName this_Signature_2= ruleSignature ( ruleFunctionBody )? )
            // InternalGo.g:2106:3: otherlv_0= 'func' ruleFunctionName this_Signature_2= ruleSignature ( ruleFunctionBody )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionDeclAccess().getFuncKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionDeclAccess().getFunctionNameParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_15);
            ruleFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionDeclAccess().getSignatureParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_34);
            this_Signature_2=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Signature_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2131:3: ( ruleFunctionBody )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==22) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGo.g:2132:4: ruleFunctionBody
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunctionDeclAccess().getFunctionBodyParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleFunctionBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunctionDecl"


    // $ANTLR start "entryRuleFunctionName"
    // InternalGo.g:2147:1: entryRuleFunctionName returns [String current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final String entryRuleFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionName = null;


        try {
            // InternalGo.g:2147:52: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalGo.g:2148:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalGo.g:2154:1: ruleFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_identifier_0= ruleidentifier ;
    public final AntlrDatatypeRuleToken ruleFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_identifier_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2160:2: (this_identifier_0= ruleidentifier )
            // InternalGo.g:2161:2: this_identifier_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getFunctionNameAccess().getIdentifierParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_identifier_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_identifier_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleFunctionBody"
    // InternalGo.g:2174:1: entryRuleFunctionBody returns [String current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final String entryRuleFunctionBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionBody = null;


        try {
            // InternalGo.g:2174:52: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // InternalGo.g:2175:2: iv_ruleFunctionBody= ruleFunctionBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionBody=ruleFunctionBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionBody.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionBody"


    // $ANTLR start "ruleFunctionBody"
    // InternalGo.g:2181:1: ruleFunctionBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Block_0= ruleBlock ;
    public final AntlrDatatypeRuleToken ruleFunctionBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Block_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2187:2: (this_Block_0= ruleBlock )
            // InternalGo.g:2188:2: this_Block_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getFunctionBodyAccess().getBlockParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Block_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Block_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunctionBody"


    // $ANTLR start "entryRuleMethodDecl"
    // InternalGo.g:2201:1: entryRuleMethodDecl returns [EObject current=null] : iv_ruleMethodDecl= ruleMethodDecl EOF ;
    public final EObject entryRuleMethodDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDecl = null;


        try {
            // InternalGo.g:2201:51: (iv_ruleMethodDecl= ruleMethodDecl EOF )
            // InternalGo.g:2202:2: iv_ruleMethodDecl= ruleMethodDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodDecl=ruleMethodDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodDecl"


    // $ANTLR start "ruleMethodDecl"
    // InternalGo.g:2208:1: ruleMethodDecl returns [EObject current=null] : (otherlv_0= 'func' this_Receiver_1= ruleReceiver ruleMethodName ( (lv_Signature_3_0= ruleSignature ) ) ( ruleFunctionBody )? ) ;
    public final EObject ruleMethodDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Receiver_1 = null;

        EObject lv_Signature_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2214:2: ( (otherlv_0= 'func' this_Receiver_1= ruleReceiver ruleMethodName ( (lv_Signature_3_0= ruleSignature ) ) ( ruleFunctionBody )? ) )
            // InternalGo.g:2215:2: (otherlv_0= 'func' this_Receiver_1= ruleReceiver ruleMethodName ( (lv_Signature_3_0= ruleSignature ) ) ( ruleFunctionBody )? )
            {
            // InternalGo.g:2215:2: (otherlv_0= 'func' this_Receiver_1= ruleReceiver ruleMethodName ( (lv_Signature_3_0= ruleSignature ) ) ( ruleFunctionBody )? )
            // InternalGo.g:2216:3: otherlv_0= 'func' this_Receiver_1= ruleReceiver ruleMethodName ( (lv_Signature_3_0= ruleSignature ) ) ( ruleFunctionBody )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMethodDeclAccess().getFuncKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMethodDeclAccess().getReceiverParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_31);
            this_Receiver_1=ruleReceiver();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Receiver_1;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMethodDeclAccess().getMethodNameParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_15);
            ruleMethodName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2241:3: ( (lv_Signature_3_0= ruleSignature ) )
            // InternalGo.g:2242:4: (lv_Signature_3_0= ruleSignature )
            {
            // InternalGo.g:2242:4: (lv_Signature_3_0= ruleSignature )
            // InternalGo.g:2243:5: lv_Signature_3_0= ruleSignature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMethodDeclAccess().getSignatureSignatureParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_34);
            lv_Signature_3_0=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMethodDeclRule());
              					}
              					set(
              						current,
              						"Signature",
              						lv_Signature_3_0,
              						"com.ufcg.compiladores.Go.Signature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:2260:3: ( ruleFunctionBody )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==22) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGo.g:2261:4: ruleFunctionBody
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMethodDeclAccess().getFunctionBodyParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleFunctionBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMethodDecl"


    // $ANTLR start "entryRuleReceiver"
    // InternalGo.g:2276:1: entryRuleReceiver returns [EObject current=null] : iv_ruleReceiver= ruleReceiver EOF ;
    public final EObject entryRuleReceiver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiver = null;


        try {
            // InternalGo.g:2276:49: (iv_ruleReceiver= ruleReceiver EOF )
            // InternalGo.g:2277:2: iv_ruleReceiver= ruleReceiver EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReceiverRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReceiver=ruleReceiver();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReceiver; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReceiver"


    // $ANTLR start "ruleReceiver"
    // InternalGo.g:2283:1: ruleReceiver returns [EObject current=null] : this_Parameters_0= ruleParameters ;
    public final EObject ruleReceiver() throws RecognitionException {
        EObject current = null;

        EObject this_Parameters_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2289:2: (this_Parameters_0= ruleParameters )
            // InternalGo.g:2290:2: this_Parameters_0= ruleParameters
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getReceiverAccess().getParametersParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Parameters_0=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Parameters_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReceiver"


    // $ANTLR start "entryRuleOperand"
    // InternalGo.g:2304:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // InternalGo.g:2304:48: (iv_ruleOperand= ruleOperand EOF )
            // InternalGo.g:2305:2: iv_ruleOperand= ruleOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperand=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalGo.g:2311:1: ruleOperand returns [EObject current=null] : (this_Literal_0= ruleLiteral | ruleOperandName | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Literal_0 = null;

        EObject this_Expression_3 = null;



        	enterRule();

        try {
            // InternalGo.g:2317:2: ( (this_Literal_0= ruleLiteral | ruleOperandName | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) )
            // InternalGo.g:2318:2: (this_Literal_0= ruleLiteral | ruleOperandName | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            {
            // InternalGo.g:2318:2: (this_Literal_0= ruleLiteral | ruleOperandName | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            int alt36=3;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // InternalGo.g:2319:3: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperandAccess().getLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Literal_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2331:3: ruleOperandName
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperandAccess().getOperandNameParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruleOperandName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2342:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    {
                    // InternalGo.g:2342:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    // InternalGo.g:2343:4: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOperandAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOperandAccess().getExpressionParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_7);
                    this_Expression_3=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getOperandAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleLiteral"
    // InternalGo.g:2367:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalGo.g:2367:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalGo.g:2368:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalGo.g:2374:1: ruleLiteral returns [EObject current=null] : ( ruleBasicLit | this_CompositeLit_1= ruleCompositeLit | this_FunctionLit_2= ruleFunctionLit ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeLit_1 = null;

        EObject this_FunctionLit_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2380:2: ( ( ruleBasicLit | this_CompositeLit_1= ruleCompositeLit | this_FunctionLit_2= ruleFunctionLit ) )
            // InternalGo.g:2381:2: ( ruleBasicLit | this_CompositeLit_1= ruleCompositeLit | this_FunctionLit_2= ruleFunctionLit )
            {
            // InternalGo.g:2381:2: ( ruleBasicLit | this_CompositeLit_1= ruleCompositeLit | this_FunctionLit_2= ruleFunctionLit )
            int alt37=3;
            switch ( input.LA(1) ) {
            case RULE_DECIMAL_DIGIT:
            case 37:
            case 61:
            case 64:
            case 65:
                {
                alt37=1;
                }
                break;
            case RULE_LETTER:
            case 19:
            case 21:
            case 30:
            case 60:
                {
                alt37=2;
                }
                break;
            case 25:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalGo.g:2382:3: ruleBasicLit
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getBasicLitParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruleBasicLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2393:3: this_CompositeLit_1= ruleCompositeLit
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getCompositeLitParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CompositeLit_1=ruleCompositeLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CompositeLit_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2405:3: this_FunctionLit_2= ruleFunctionLit
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getFunctionLitParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionLit_2=ruleFunctionLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionLit_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBasicLit"
    // InternalGo.g:2420:1: entryRuleBasicLit returns [String current=null] : iv_ruleBasicLit= ruleBasicLit EOF ;
    public final String entryRuleBasicLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicLit = null;


        try {
            // InternalGo.g:2420:48: (iv_ruleBasicLit= ruleBasicLit EOF )
            // InternalGo.g:2421:2: iv_ruleBasicLit= ruleBasicLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicLitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicLit=ruleBasicLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicLit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicLit"


    // $ANTLR start "ruleBasicLit"
    // InternalGo.g:2427:1: ruleBasicLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_int_lit_0= ruleint_lit | this_float_lit_1= rulefloat_lit | this_rune_lit_2= rulerune_lit | this_string_lit_3= rulestring_lit ) ;
    public final AntlrDatatypeRuleToken ruleBasicLit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_int_lit_0 = null;

        AntlrDatatypeRuleToken this_float_lit_1 = null;

        AntlrDatatypeRuleToken this_rune_lit_2 = null;

        AntlrDatatypeRuleToken this_string_lit_3 = null;



        	enterRule();

        try {
            // InternalGo.g:2433:2: ( (this_int_lit_0= ruleint_lit | this_float_lit_1= rulefloat_lit | this_rune_lit_2= rulerune_lit | this_string_lit_3= rulestring_lit ) )
            // InternalGo.g:2434:2: (this_int_lit_0= ruleint_lit | this_float_lit_1= rulefloat_lit | this_rune_lit_2= rulerune_lit | this_string_lit_3= rulestring_lit )
            {
            // InternalGo.g:2434:2: (this_int_lit_0= ruleint_lit | this_float_lit_1= rulefloat_lit | this_rune_lit_2= rulerune_lit | this_string_lit_3= rulestring_lit )
            int alt38=4;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalGo.g:2435:3: this_int_lit_0= ruleint_lit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicLitAccess().getInt_litParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_int_lit_0=ruleint_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_int_lit_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2446:3: this_float_lit_1= rulefloat_lit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicLitAccess().getFloat_litParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_float_lit_1=rulefloat_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_float_lit_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2457:3: this_rune_lit_2= rulerune_lit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicLitAccess().getRune_litParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_rune_lit_2=rulerune_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_rune_lit_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:2468:3: this_string_lit_3= rulestring_lit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicLitAccess().getString_litParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_string_lit_3=rulestring_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_string_lit_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBasicLit"


    // $ANTLR start "entryRuleOperandName"
    // InternalGo.g:2482:1: entryRuleOperandName returns [String current=null] : iv_ruleOperandName= ruleOperandName EOF ;
    public final String entryRuleOperandName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperandName = null;


        try {
            // InternalGo.g:2482:51: (iv_ruleOperandName= ruleOperandName EOF )
            // InternalGo.g:2483:2: iv_ruleOperandName= ruleOperandName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperandName=ruleOperandName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperandName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperandName"


    // $ANTLR start "ruleOperandName"
    // InternalGo.g:2489:1: ruleOperandName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifier_0= ruleidentifier | this_QualifiedIdent_1= ruleQualifiedIdent ) ;
    public final AntlrDatatypeRuleToken ruleOperandName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_identifier_0 = null;

        AntlrDatatypeRuleToken this_QualifiedIdent_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2495:2: ( (this_identifier_0= ruleidentifier | this_QualifiedIdent_1= ruleQualifiedIdent ) )
            // InternalGo.g:2496:2: (this_identifier_0= ruleidentifier | this_QualifiedIdent_1= ruleQualifiedIdent )
            {
            // InternalGo.g:2496:2: (this_identifier_0= ruleidentifier | this_QualifiedIdent_1= ruleQualifiedIdent )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_LETTER) ) {
                alt39=1;
            }
            else if ( (LA39_0==60) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalGo.g:2497:3: this_identifier_0= ruleidentifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperandNameAccess().getIdentifierParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_identifier_0=ruleidentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_identifier_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2508:3: this_QualifiedIdent_1= ruleQualifiedIdent
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperandNameAccess().getQualifiedIdentParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_QualifiedIdent_1=ruleQualifiedIdent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_QualifiedIdent_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOperandName"


    // $ANTLR start "entryRuleQualifiedIdent"
    // InternalGo.g:2522:1: entryRuleQualifiedIdent returns [String current=null] : iv_ruleQualifiedIdent= ruleQualifiedIdent EOF ;
    public final String entryRuleQualifiedIdent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedIdent = null;


        try {
            // InternalGo.g:2522:54: (iv_ruleQualifiedIdent= ruleQualifiedIdent EOF )
            // InternalGo.g:2523:2: iv_ruleQualifiedIdent= ruleQualifiedIdent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedIdentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedIdent=ruleQualifiedIdent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedIdent.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedIdent"


    // $ANTLR start "ruleQualifiedIdent"
    // InternalGo.g:2529:1: ruleQualifiedIdent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PackageName_0= rulePackageName kw= '.' this_identifier_2= ruleidentifier ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedIdent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PackageName_0 = null;

        AntlrDatatypeRuleToken this_identifier_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2535:2: ( (this_PackageName_0= rulePackageName kw= '.' this_identifier_2= ruleidentifier ) )
            // InternalGo.g:2536:2: (this_PackageName_0= rulePackageName kw= '.' this_identifier_2= ruleidentifier )
            {
            // InternalGo.g:2536:2: (this_PackageName_0= rulePackageName kw= '.' this_identifier_2= ruleidentifier )
            // InternalGo.g:2537:3: this_PackageName_0= rulePackageName kw= '.' this_identifier_2= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedIdentAccess().getPackageNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_PackageName_0=rulePackageName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_PackageName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,37,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedIdentAccess().getFullStopKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedIdentAccess().getIdentifierParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_identifier_2=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_identifier_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedIdent"


    // $ANTLR start "entryRuleCompositeLit"
    // InternalGo.g:2566:1: entryRuleCompositeLit returns [EObject current=null] : iv_ruleCompositeLit= ruleCompositeLit EOF ;
    public final EObject entryRuleCompositeLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeLit = null;


        try {
            // InternalGo.g:2566:53: (iv_ruleCompositeLit= ruleCompositeLit EOF )
            // InternalGo.g:2567:2: iv_ruleCompositeLit= ruleCompositeLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeLitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompositeLit=ruleCompositeLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeLit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompositeLit"


    // $ANTLR start "ruleCompositeLit"
    // InternalGo.g:2573:1: ruleCompositeLit returns [EObject current=null] : (this_LiteralType_0= ruleLiteralType ( (lv_LiteralValue_1_0= ruleLiteralValue ) ) ) ;
    public final EObject ruleCompositeLit() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralType_0 = null;

        EObject lv_LiteralValue_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2579:2: ( (this_LiteralType_0= ruleLiteralType ( (lv_LiteralValue_1_0= ruleLiteralValue ) ) ) )
            // InternalGo.g:2580:2: (this_LiteralType_0= ruleLiteralType ( (lv_LiteralValue_1_0= ruleLiteralValue ) ) )
            {
            // InternalGo.g:2580:2: (this_LiteralType_0= ruleLiteralType ( (lv_LiteralValue_1_0= ruleLiteralValue ) ) )
            // InternalGo.g:2581:3: this_LiteralType_0= ruleLiteralType ( (lv_LiteralValue_1_0= ruleLiteralValue ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCompositeLitAccess().getLiteralTypeParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_10);
            this_LiteralType_0=ruleLiteralType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LiteralType_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2592:3: ( (lv_LiteralValue_1_0= ruleLiteralValue ) )
            // InternalGo.g:2593:4: (lv_LiteralValue_1_0= ruleLiteralValue )
            {
            // InternalGo.g:2593:4: (lv_LiteralValue_1_0= ruleLiteralValue )
            // InternalGo.g:2594:5: lv_LiteralValue_1_0= ruleLiteralValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCompositeLitAccess().getLiteralValueLiteralValueParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_LiteralValue_1_0=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCompositeLitRule());
              					}
              					set(
              						current,
              						"LiteralValue",
              						lv_LiteralValue_1_0,
              						"com.ufcg.compiladores.Go.LiteralValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCompositeLit"


    // $ANTLR start "entryRuleLiteralType"
    // InternalGo.g:2615:1: entryRuleLiteralType returns [EObject current=null] : iv_ruleLiteralType= ruleLiteralType EOF ;
    public final EObject entryRuleLiteralType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralType = null;


        try {
            // InternalGo.g:2615:52: (iv_ruleLiteralType= ruleLiteralType EOF )
            // InternalGo.g:2616:2: iv_ruleLiteralType= ruleLiteralType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralType=ruleLiteralType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralType"


    // $ANTLR start "ruleLiteralType"
    // InternalGo.g:2622:1: ruleLiteralType returns [EObject current=null] : (this_StructType_0= ruleStructType | ( (lv_ArrayType_1_0= ruleArrayType ) ) | (otherlv_2= '[' otherlv_3= '...' otherlv_4= ']' this_ElementType_5= ruleElementType ) | this_SliceType_6= ruleSliceType | this_MapType_7= ruleMapType | ruleTypeName ) ;
    public final EObject ruleLiteralType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_StructType_0 = null;

        EObject lv_ArrayType_1_0 = null;

        EObject this_ElementType_5 = null;

        EObject this_SliceType_6 = null;

        EObject this_MapType_7 = null;



        	enterRule();

        try {
            // InternalGo.g:2628:2: ( (this_StructType_0= ruleStructType | ( (lv_ArrayType_1_0= ruleArrayType ) ) | (otherlv_2= '[' otherlv_3= '...' otherlv_4= ']' this_ElementType_5= ruleElementType ) | this_SliceType_6= ruleSliceType | this_MapType_7= ruleMapType | ruleTypeName ) )
            // InternalGo.g:2629:2: (this_StructType_0= ruleStructType | ( (lv_ArrayType_1_0= ruleArrayType ) ) | (otherlv_2= '[' otherlv_3= '...' otherlv_4= ']' this_ElementType_5= ruleElementType ) | this_SliceType_6= ruleSliceType | this_MapType_7= ruleMapType | ruleTypeName )
            {
            // InternalGo.g:2629:2: (this_StructType_0= ruleStructType | ( (lv_ArrayType_1_0= ruleArrayType ) ) | (otherlv_2= '[' otherlv_3= '...' otherlv_4= ']' this_ElementType_5= ruleElementType ) | this_SliceType_6= ruleSliceType | this_MapType_7= ruleMapType | ruleTypeName )
            int alt40=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt40=1;
                }
                break;
            case 19:
                {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt40=3;
                    }
                    break;
                case RULE_LETTER:
                case RULE_DECIMAL_DIGIT:
                case 16:
                case 17:
                case 19:
                case 21:
                case 24:
                case 25:
                case 28:
                case 30:
                case 31:
                case 32:
                case 37:
                case 48:
                case 49:
                case 56:
                case 58:
                case 60:
                case 61:
                case 64:
                case 65:
                    {
                    alt40=2;
                    }
                    break;
                case 20:
                    {
                    alt40=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }

                }
                break;
            case 30:
                {
                alt40=5;
                }
                break;
            case RULE_LETTER:
            case 60:
                {
                alt40=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalGo.g:2630:3: this_StructType_0= ruleStructType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralTypeAccess().getStructTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StructType_0=ruleStructType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StructType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2642:3: ( (lv_ArrayType_1_0= ruleArrayType ) )
                    {
                    // InternalGo.g:2642:3: ( (lv_ArrayType_1_0= ruleArrayType ) )
                    // InternalGo.g:2643:4: (lv_ArrayType_1_0= ruleArrayType )
                    {
                    // InternalGo.g:2643:4: (lv_ArrayType_1_0= ruleArrayType )
                    // InternalGo.g:2644:5: lv_ArrayType_1_0= ruleArrayType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLiteralTypeAccess().getArrayTypeArrayTypeParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ArrayType_1_0=ruleArrayType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLiteralTypeRule());
                      					}
                      					set(
                      						current,
                      						"ArrayType",
                      						lv_ArrayType_1_0,
                      						"com.ufcg.compiladores.Go.ArrayType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:2662:3: (otherlv_2= '[' otherlv_3= '...' otherlv_4= ']' this_ElementType_5= ruleElementType )
                    {
                    // InternalGo.g:2662:3: (otherlv_2= '[' otherlv_3= '...' otherlv_4= ']' this_ElementType_5= ruleElementType )
                    // InternalGo.g:2663:4: otherlv_2= '[' otherlv_3= '...' otherlv_4= ']' this_ElementType_5= ruleElementType
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLiteralTypeAccess().getLeftSquareBracketKeyword_2_0());
                      			
                    }
                    otherlv_3=(Token)match(input,27,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLiteralTypeAccess().getFullStopFullStopFullStopKeyword_2_1());
                      			
                    }
                    otherlv_4=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getLiteralTypeAccess().getRightSquareBracketKeyword_2_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLiteralTypeAccess().getElementTypeParserRuleCall_2_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ElementType_5=ruleElementType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ElementType_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:2688:3: this_SliceType_6= ruleSliceType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralTypeAccess().getSliceTypeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SliceType_6=ruleSliceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SliceType_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:2700:3: this_MapType_7= ruleMapType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralTypeAccess().getMapTypeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MapType_7=ruleMapType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapType_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:2712:3: ruleTypeName
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralTypeAccess().getTypeNameParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruleTypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLiteralType"


    // $ANTLR start "entryRuleLiteralValue"
    // InternalGo.g:2726:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // InternalGo.g:2726:53: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // InternalGo.g:2727:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralValue"


    // $ANTLR start "ruleLiteralValue"
    // InternalGo.g:2733:1: ruleLiteralValue returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_ElementList_1_0= ruleElementList ) ) (otherlv_2= ',' )? )? otherlv_3= '}' ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_ElementList_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2739:2: ( (otherlv_0= '{' ( ( (lv_ElementList_1_0= ruleElementList ) ) (otherlv_2= ',' )? )? otherlv_3= '}' ) )
            // InternalGo.g:2740:2: (otherlv_0= '{' ( ( (lv_ElementList_1_0= ruleElementList ) ) (otherlv_2= ',' )? )? otherlv_3= '}' )
            {
            // InternalGo.g:2740:2: (otherlv_0= '{' ( ( (lv_ElementList_1_0= ruleElementList ) ) (otherlv_2= ',' )? )? otherlv_3= '}' )
            // InternalGo.g:2741:3: otherlv_0= '{' ( ( (lv_ElementList_1_0= ruleElementList ) ) (otherlv_2= ',' )? )? otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLiteralValueAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalGo.g:2745:3: ( ( (lv_ElementList_1_0= ruleElementList ) ) (otherlv_2= ',' )? )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_LETTER && LA42_0<=RULE_DECIMAL_DIGIT)||(LA42_0>=16 && LA42_0<=17)||LA42_0==19||(LA42_0>=21 && LA42_0<=22)||(LA42_0>=24 && LA42_0<=25)||LA42_0==28||(LA42_0>=30 && LA42_0<=32)||LA42_0==37||(LA42_0>=48 && LA42_0<=49)||LA42_0==56||LA42_0==58||(LA42_0>=60 && LA42_0<=61)||(LA42_0>=64 && LA42_0<=65)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGo.g:2746:4: ( (lv_ElementList_1_0= ruleElementList ) ) (otherlv_2= ',' )?
                    {
                    // InternalGo.g:2746:4: ( (lv_ElementList_1_0= ruleElementList ) )
                    // InternalGo.g:2747:5: (lv_ElementList_1_0= ruleElementList )
                    {
                    // InternalGo.g:2747:5: (lv_ElementList_1_0= ruleElementList )
                    // InternalGo.g:2748:6: lv_ElementList_1_0= ruleElementList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLiteralValueAccess().getElementListElementListParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
                    lv_ElementList_1_0=ruleElementList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLiteralValueRule());
                      						}
                      						set(
                      							current,
                      							"ElementList",
                      							lv_ElementList_1_0,
                      							"com.ufcg.compiladores.Go.ElementList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGo.g:2765:4: (otherlv_2= ',' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==26) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalGo.g:2766:5: otherlv_2= ','
                            {
                            otherlv_2=(Token)match(input,26,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getLiteralValueAccess().getCommaKeyword_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLiteralValueAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLiteralValue"


    // $ANTLR start "entryRuleElementList"
    // InternalGo.g:2780:1: entryRuleElementList returns [EObject current=null] : iv_ruleElementList= ruleElementList EOF ;
    public final EObject entryRuleElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementList = null;


        try {
            // InternalGo.g:2780:52: (iv_ruleElementList= ruleElementList EOF )
            // InternalGo.g:2781:2: iv_ruleElementList= ruleElementList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementList=ruleElementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElementList"


    // $ANTLR start "ruleElementList"
    // InternalGo.g:2787:1: ruleElementList returns [EObject current=null] : (this_KeyedElement_0= ruleKeyedElement (otherlv_1= ',' ( (lv_KeyedElement_2_0= ruleKeyedElement ) ) )? ) ;
    public final EObject ruleElementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_KeyedElement_0 = null;

        EObject lv_KeyedElement_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2793:2: ( (this_KeyedElement_0= ruleKeyedElement (otherlv_1= ',' ( (lv_KeyedElement_2_0= ruleKeyedElement ) ) )? ) )
            // InternalGo.g:2794:2: (this_KeyedElement_0= ruleKeyedElement (otherlv_1= ',' ( (lv_KeyedElement_2_0= ruleKeyedElement ) ) )? )
            {
            // InternalGo.g:2794:2: (this_KeyedElement_0= ruleKeyedElement (otherlv_1= ',' ( (lv_KeyedElement_2_0= ruleKeyedElement ) ) )? )
            // InternalGo.g:2795:3: this_KeyedElement_0= ruleKeyedElement (otherlv_1= ',' ( (lv_KeyedElement_2_0= ruleKeyedElement ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getElementListAccess().getKeyedElementParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            this_KeyedElement_0=ruleKeyedElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_KeyedElement_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2806:3: (otherlv_1= ',' ( (lv_KeyedElement_2_0= ruleKeyedElement ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==26) ) {
                int LA43_1 = input.LA(2);

                if ( ((LA43_1>=RULE_LETTER && LA43_1<=RULE_DECIMAL_DIGIT)||(LA43_1>=16 && LA43_1<=17)||LA43_1==19||(LA43_1>=21 && LA43_1<=22)||(LA43_1>=24 && LA43_1<=25)||LA43_1==28||(LA43_1>=30 && LA43_1<=32)||LA43_1==37||(LA43_1>=48 && LA43_1<=49)||LA43_1==56||LA43_1==58||(LA43_1>=60 && LA43_1<=61)||(LA43_1>=64 && LA43_1<=65)) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalGo.g:2807:4: otherlv_1= ',' ( (lv_KeyedElement_2_0= ruleKeyedElement ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getElementListAccess().getCommaKeyword_1_0());
                      			
                    }
                    // InternalGo.g:2811:4: ( (lv_KeyedElement_2_0= ruleKeyedElement ) )
                    // InternalGo.g:2812:5: (lv_KeyedElement_2_0= ruleKeyedElement )
                    {
                    // InternalGo.g:2812:5: (lv_KeyedElement_2_0= ruleKeyedElement )
                    // InternalGo.g:2813:6: lv_KeyedElement_2_0= ruleKeyedElement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getElementListAccess().getKeyedElementKeyedElementParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_KeyedElement_2_0=ruleKeyedElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getElementListRule());
                      						}
                      						set(
                      							current,
                      							"KeyedElement",
                      							lv_KeyedElement_2_0,
                      							"com.ufcg.compiladores.Go.KeyedElement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleElementList"


    // $ANTLR start "entryRuleElement"
    // InternalGo.g:2835:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalGo.g:2835:48: (iv_ruleElement= ruleElement EOF )
            // InternalGo.g:2836:2: iv_ruleElement= ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalGo.g:2842:1: ruleElement returns [EObject current=null] : (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_LiteralValue_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2848:2: ( (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue ) )
            // InternalGo.g:2849:2: (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue )
            {
            // InternalGo.g:2849:2: (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_LETTER && LA44_0<=RULE_DECIMAL_DIGIT)||(LA44_0>=16 && LA44_0<=17)||LA44_0==19||LA44_0==21||(LA44_0>=24 && LA44_0<=25)||LA44_0==28||(LA44_0>=30 && LA44_0<=32)||LA44_0==37||(LA44_0>=48 && LA44_0<=49)||LA44_0==56||LA44_0==58||(LA44_0>=60 && LA44_0<=61)||(LA44_0>=64 && LA44_0<=65)) ) {
                alt44=1;
            }
            else if ( (LA44_0==22) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalGo.g:2850:3: this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Expression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2862:3: this_LiteralValue_1= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getLiteralValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralValue_1=ruleLiteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralValue_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleKeyedElement"
    // InternalGo.g:2877:1: entryRuleKeyedElement returns [EObject current=null] : iv_ruleKeyedElement= ruleKeyedElement EOF ;
    public final EObject entryRuleKeyedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyedElement = null;


        try {
            // InternalGo.g:2877:53: (iv_ruleKeyedElement= ruleKeyedElement EOF )
            // InternalGo.g:2878:2: iv_ruleKeyedElement= ruleKeyedElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyedElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKeyedElement=ruleKeyedElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyedElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKeyedElement"


    // $ANTLR start "ruleKeyedElement"
    // InternalGo.g:2884:1: ruleKeyedElement returns [EObject current=null] : ( (this_Key_0= ruleKey otherlv_1= ':' )? ( (lv_Element_2_0= ruleElement ) ) ) ;
    public final EObject ruleKeyedElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Key_0 = null;

        EObject lv_Element_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2890:2: ( ( (this_Key_0= ruleKey otherlv_1= ':' )? ( (lv_Element_2_0= ruleElement ) ) ) )
            // InternalGo.g:2891:2: ( (this_Key_0= ruleKey otherlv_1= ':' )? ( (lv_Element_2_0= ruleElement ) ) )
            {
            // InternalGo.g:2891:2: ( (this_Key_0= ruleKey otherlv_1= ':' )? ( (lv_Element_2_0= ruleElement ) ) )
            // InternalGo.g:2892:3: (this_Key_0= ruleKey otherlv_1= ':' )? ( (lv_Element_2_0= ruleElement ) )
            {
            // InternalGo.g:2892:3: (this_Key_0= ruleKey otherlv_1= ':' )?
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // InternalGo.g:2893:4: this_Key_0= ruleKey otherlv_1= ':'
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getKeyedElementAccess().getKeyParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_40);
                    this_Key_0=ruleKey();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Key_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_1=(Token)match(input,38,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getKeyedElementAccess().getColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:2909:3: ( (lv_Element_2_0= ruleElement ) )
            // InternalGo.g:2910:4: (lv_Element_2_0= ruleElement )
            {
            // InternalGo.g:2910:4: (lv_Element_2_0= ruleElement )
            // InternalGo.g:2911:5: lv_Element_2_0= ruleElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyedElementAccess().getElementElementParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_Element_2_0=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getKeyedElementRule());
              					}
              					set(
              						current,
              						"Element",
              						lv_Element_2_0,
              						"com.ufcg.compiladores.Go.Element");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleKeyedElement"


    // $ANTLR start "entryRuleKey"
    // InternalGo.g:2932:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // InternalGo.g:2932:44: (iv_ruleKey= ruleKey EOF )
            // InternalGo.g:2933:2: iv_ruleKey= ruleKey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKey=ruleKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKey; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalGo.g:2939:1: ruleKey returns [EObject current=null] : ( ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_1 = null;

        EObject this_LiteralValue_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2945:2: ( ( ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue ) )
            // InternalGo.g:2946:2: ( ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue )
            {
            // InternalGo.g:2946:2: ( ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue )
            int alt46=3;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalGo.g:2947:3: ruleFieldName
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getKeyAccess().getFieldNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruleFieldName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2958:3: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getKeyAccess().getExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Expression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2970:3: this_LiteralValue_2= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getKeyAccess().getLiteralValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralValue_2=ruleLiteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralValue_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleFieldName"
    // InternalGo.g:2985:1: entryRuleFieldName returns [String current=null] : iv_ruleFieldName= ruleFieldName EOF ;
    public final String entryRuleFieldName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldName = null;


        try {
            // InternalGo.g:2985:49: (iv_ruleFieldName= ruleFieldName EOF )
            // InternalGo.g:2986:2: iv_ruleFieldName= ruleFieldName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldName=ruleFieldName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFieldName"


    // $ANTLR start "ruleFieldName"
    // InternalGo.g:2992:1: ruleFieldName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_identifier_0= ruleidentifier ;
    public final AntlrDatatypeRuleToken ruleFieldName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_identifier_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2998:2: (this_identifier_0= ruleidentifier )
            // InternalGo.g:2999:2: this_identifier_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getFieldNameAccess().getIdentifierParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_identifier_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_identifier_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFieldName"


    // $ANTLR start "entryRuleFunctionLit"
    // InternalGo.g:3012:1: entryRuleFunctionLit returns [EObject current=null] : iv_ruleFunctionLit= ruleFunctionLit EOF ;
    public final EObject entryRuleFunctionLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionLit = null;


        try {
            // InternalGo.g:3012:52: (iv_ruleFunctionLit= ruleFunctionLit EOF )
            // InternalGo.g:3013:2: iv_ruleFunctionLit= ruleFunctionLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionLitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionLit=ruleFunctionLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionLit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionLit"


    // $ANTLR start "ruleFunctionLit"
    // InternalGo.g:3019:1: ruleFunctionLit returns [EObject current=null] : (otherlv_0= 'func' this_Signature_1= ruleSignature ( (lv_FunctionBody_2_0= ruleFunctionBody ) ) ) ;
    public final EObject ruleFunctionLit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Signature_1 = null;

        AntlrDatatypeRuleToken lv_FunctionBody_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3025:2: ( (otherlv_0= 'func' this_Signature_1= ruleSignature ( (lv_FunctionBody_2_0= ruleFunctionBody ) ) ) )
            // InternalGo.g:3026:2: (otherlv_0= 'func' this_Signature_1= ruleSignature ( (lv_FunctionBody_2_0= ruleFunctionBody ) ) )
            {
            // InternalGo.g:3026:2: (otherlv_0= 'func' this_Signature_1= ruleSignature ( (lv_FunctionBody_2_0= ruleFunctionBody ) ) )
            // InternalGo.g:3027:3: otherlv_0= 'func' this_Signature_1= ruleSignature ( (lv_FunctionBody_2_0= ruleFunctionBody ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionLitAccess().getFuncKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionLitAccess().getSignatureParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_10);
            this_Signature_1=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Signature_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:3042:3: ( (lv_FunctionBody_2_0= ruleFunctionBody ) )
            // InternalGo.g:3043:4: (lv_FunctionBody_2_0= ruleFunctionBody )
            {
            // InternalGo.g:3043:4: (lv_FunctionBody_2_0= ruleFunctionBody )
            // InternalGo.g:3044:5: lv_FunctionBody_2_0= ruleFunctionBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionLitAccess().getFunctionBodyFunctionBodyParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_FunctionBody_2_0=ruleFunctionBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionLitRule());
              					}
              					set(
              						current,
              						"FunctionBody",
              						lv_FunctionBody_2_0,
              						"com.ufcg.compiladores.Go.FunctionBody");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunctionLit"


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalGo.g:3065:1: entryRulePrimaryExpr returns [EObject current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final EObject entryRulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpr = null;


        try {
            // InternalGo.g:3065:52: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // InternalGo.g:3066:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpr=rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // InternalGo.g:3072:1: rulePrimaryExpr returns [EObject current=null] : ( (this_Operand_0= ruleOperand ( (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha ) ) ) | (this_Conversion_2= ruleConversion ( (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha ) ) ) | (this_MethodExpr_4= ruleMethodExpr ( (lv_PrimaryExprLinha_5_0= rulePrimaryExprLinha ) ) ) ) ;
    public final EObject rulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Operand_0 = null;

        AntlrDatatypeRuleToken lv_PrimaryExprLinha_1_0 = null;

        EObject this_Conversion_2 = null;

        AntlrDatatypeRuleToken lv_PrimaryExprLinha_3_0 = null;

        EObject this_MethodExpr_4 = null;

        AntlrDatatypeRuleToken lv_PrimaryExprLinha_5_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3078:2: ( ( (this_Operand_0= ruleOperand ( (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha ) ) ) | (this_Conversion_2= ruleConversion ( (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha ) ) ) | (this_MethodExpr_4= ruleMethodExpr ( (lv_PrimaryExprLinha_5_0= rulePrimaryExprLinha ) ) ) ) )
            // InternalGo.g:3079:2: ( (this_Operand_0= ruleOperand ( (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha ) ) ) | (this_Conversion_2= ruleConversion ( (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha ) ) ) | (this_MethodExpr_4= ruleMethodExpr ( (lv_PrimaryExprLinha_5_0= rulePrimaryExprLinha ) ) ) )
            {
            // InternalGo.g:3079:2: ( (this_Operand_0= ruleOperand ( (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha ) ) ) | (this_Conversion_2= ruleConversion ( (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha ) ) ) | (this_MethodExpr_4= ruleMethodExpr ( (lv_PrimaryExprLinha_5_0= rulePrimaryExprLinha ) ) ) )
            int alt47=3;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // InternalGo.g:3080:3: (this_Operand_0= ruleOperand ( (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha ) ) )
                    {
                    // InternalGo.g:3080:3: (this_Operand_0= ruleOperand ( (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha ) ) )
                    // InternalGo.g:3081:4: this_Operand_0= ruleOperand ( (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha ) )
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getOperandParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_41);
                    this_Operand_0=ruleOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Operand_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:3092:4: ( (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha ) )
                    // InternalGo.g:3093:5: (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha )
                    {
                    // InternalGo.g:3093:5: (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha )
                    // InternalGo.g:3094:6: lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaPrimaryExprLinhaParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_PrimaryExprLinha_1_0=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
                      						}
                      						set(
                      							current,
                      							"PrimaryExprLinha",
                      							lv_PrimaryExprLinha_1_0,
                      							"com.ufcg.compiladores.Go.PrimaryExprLinha");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:3113:3: (this_Conversion_2= ruleConversion ( (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha ) ) )
                    {
                    // InternalGo.g:3113:3: (this_Conversion_2= ruleConversion ( (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha ) ) )
                    // InternalGo.g:3114:4: this_Conversion_2= ruleConversion ( (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha ) )
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getConversionParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_41);
                    this_Conversion_2=ruleConversion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Conversion_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:3125:4: ( (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha ) )
                    // InternalGo.g:3126:5: (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha )
                    {
                    // InternalGo.g:3126:5: (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha )
                    // InternalGo.g:3127:6: lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaPrimaryExprLinhaParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_PrimaryExprLinha_3_0=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
                      						}
                      						set(
                      							current,
                      							"PrimaryExprLinha",
                      							lv_PrimaryExprLinha_3_0,
                      							"com.ufcg.compiladores.Go.PrimaryExprLinha");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:3146:3: (this_MethodExpr_4= ruleMethodExpr ( (lv_PrimaryExprLinha_5_0= rulePrimaryExprLinha ) ) )
                    {
                    // InternalGo.g:3146:3: (this_MethodExpr_4= ruleMethodExpr ( (lv_PrimaryExprLinha_5_0= rulePrimaryExprLinha ) ) )
                    // InternalGo.g:3147:4: this_MethodExpr_4= ruleMethodExpr ( (lv_PrimaryExprLinha_5_0= rulePrimaryExprLinha ) )
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getMethodExprParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_41);
                    this_MethodExpr_4=ruleMethodExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MethodExpr_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:3158:4: ( (lv_PrimaryExprLinha_5_0= rulePrimaryExprLinha ) )
                    // InternalGo.g:3159:5: (lv_PrimaryExprLinha_5_0= rulePrimaryExprLinha )
                    {
                    // InternalGo.g:3159:5: (lv_PrimaryExprLinha_5_0= rulePrimaryExprLinha )
                    // InternalGo.g:3160:6: lv_PrimaryExprLinha_5_0= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaPrimaryExprLinhaParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_PrimaryExprLinha_5_0=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
                      						}
                      						set(
                      							current,
                      							"PrimaryExprLinha",
                      							lv_PrimaryExprLinha_5_0,
                      							"com.ufcg.compiladores.Go.PrimaryExprLinha");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRulePrimaryExprLinha"
    // InternalGo.g:3182:1: entryRulePrimaryExprLinha returns [String current=null] : iv_rulePrimaryExprLinha= rulePrimaryExprLinha EOF ;
    public final String entryRulePrimaryExprLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinha = null;


        try {
            // InternalGo.g:3182:56: (iv_rulePrimaryExprLinha= rulePrimaryExprLinha EOF )
            // InternalGo.g:3183:2: iv_rulePrimaryExprLinha= rulePrimaryExprLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprLinha=rulePrimaryExprLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExprLinha"


    // $ANTLR start "rulePrimaryExprLinha"
    // InternalGo.g:3189:1: rulePrimaryExprLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'fa' ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3195:2: (kw= 'fa' )
            // InternalGo.g:3196:2: kw= 'fa'
            {
            kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getPrimaryExprLinhaAccess().getFaKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimaryExprLinha"


    // $ANTLR start "entryRuleMethodExpr"
    // InternalGo.g:3204:1: entryRuleMethodExpr returns [EObject current=null] : iv_ruleMethodExpr= ruleMethodExpr EOF ;
    public final EObject entryRuleMethodExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodExpr = null;


        try {
            // InternalGo.g:3204:51: (iv_ruleMethodExpr= ruleMethodExpr EOF )
            // InternalGo.g:3205:2: iv_ruleMethodExpr= ruleMethodExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodExpr=ruleMethodExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodExpr"


    // $ANTLR start "ruleMethodExpr"
    // InternalGo.g:3211:1: ruleMethodExpr returns [EObject current=null] : (this_ReceiverType_0= ruleReceiverType otherlv_1= '.' ruleMethodName ) ;
    public final EObject ruleMethodExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ReceiverType_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3217:2: ( (this_ReceiverType_0= ruleReceiverType otherlv_1= '.' ruleMethodName ) )
            // InternalGo.g:3218:2: (this_ReceiverType_0= ruleReceiverType otherlv_1= '.' ruleMethodName )
            {
            // InternalGo.g:3218:2: (this_ReceiverType_0= ruleReceiverType otherlv_1= '.' ruleMethodName )
            // InternalGo.g:3219:3: this_ReceiverType_0= ruleReceiverType otherlv_1= '.' ruleMethodName
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMethodExprAccess().getReceiverTypeParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_ReceiverType_0=ruleReceiverType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ReceiverType_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,37,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMethodExprAccess().getFullStopKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMethodExprAccess().getMethodNameParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            ruleMethodName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMethodExpr"


    // $ANTLR start "entryRuleReceiverType"
    // InternalGo.g:3248:1: entryRuleReceiverType returns [EObject current=null] : iv_ruleReceiverType= ruleReceiverType EOF ;
    public final EObject entryRuleReceiverType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiverType = null;


        try {
            // InternalGo.g:3248:53: (iv_ruleReceiverType= ruleReceiverType EOF )
            // InternalGo.g:3249:2: iv_ruleReceiverType= ruleReceiverType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReceiverTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReceiverType=ruleReceiverType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReceiverType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReceiverType"


    // $ANTLR start "ruleReceiverType"
    // InternalGo.g:3255:1: ruleReceiverType returns [EObject current=null] : this_Type_0= ruleType ;
    public final EObject ruleReceiverType() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3261:2: (this_Type_0= ruleType )
            // InternalGo.g:3262:2: this_Type_0= ruleType
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getReceiverTypeAccess().getTypeParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Type_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Type_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReceiverType"


    // $ANTLR start "entryRuleExpression"
    // InternalGo.g:3276:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGo.g:3276:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGo.g:3277:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalGo.g:3283:1: ruleExpression returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr ( (lv_ExpressionLinha_1_0= ruleExpressionLinha ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpr_0 = null;

        EObject lv_ExpressionLinha_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3289:2: ( (this_UnaryExpr_0= ruleUnaryExpr ( (lv_ExpressionLinha_1_0= ruleExpressionLinha ) ) ) )
            // InternalGo.g:3290:2: (this_UnaryExpr_0= ruleUnaryExpr ( (lv_ExpressionLinha_1_0= ruleExpressionLinha ) ) )
            {
            // InternalGo.g:3290:2: (this_UnaryExpr_0= ruleUnaryExpr ( (lv_ExpressionLinha_1_0= ruleExpressionLinha ) ) )
            // InternalGo.g:3291:3: this_UnaryExpr_0= ruleUnaryExpr ( (lv_ExpressionLinha_1_0= ruleExpressionLinha ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getUnaryExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_42);
            this_UnaryExpr_0=ruleUnaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:3302:3: ( (lv_ExpressionLinha_1_0= ruleExpressionLinha ) )
            // InternalGo.g:3303:4: (lv_ExpressionLinha_1_0= ruleExpressionLinha )
            {
            // InternalGo.g:3303:4: (lv_ExpressionLinha_1_0= ruleExpressionLinha )
            // InternalGo.g:3304:5: lv_ExpressionLinha_1_0= ruleExpressionLinha
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionAccess().getExpressionLinhaExpressionLinhaParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ExpressionLinha_1_0=ruleExpressionLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionRule());
              					}
              					set(
              						current,
              						"ExpressionLinha",
              						lv_ExpressionLinha_1_0,
              						"com.ufcg.compiladores.Go.ExpressionLinha");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpressionLinha"
    // InternalGo.g:3325:1: entryRuleExpressionLinha returns [EObject current=null] : iv_ruleExpressionLinha= ruleExpressionLinha EOF ;
    public final EObject entryRuleExpressionLinha() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLinha = null;


        try {
            // InternalGo.g:3325:56: (iv_ruleExpressionLinha= ruleExpressionLinha EOF )
            // InternalGo.g:3326:2: iv_ruleExpressionLinha= ruleExpressionLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLinha=ruleExpressionLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLinha; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLinha"


    // $ANTLR start "ruleExpressionLinha"
    // InternalGo.g:3332:1: ruleExpressionLinha returns [EObject current=null] : ( rulebinary_op this_Expression_1= ruleExpression )? ;
    public final EObject ruleExpressionLinha() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalGo.g:3338:2: ( ( rulebinary_op this_Expression_1= ruleExpression )? )
            // InternalGo.g:3339:2: ( rulebinary_op this_Expression_1= ruleExpression )?
            {
            // InternalGo.g:3339:2: ( rulebinary_op this_Expression_1= ruleExpression )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==24||(LA48_0>=40 && LA48_0<=57)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGo.g:3340:3: rulebinary_op this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLinhaAccess().getBinary_opParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_8);
                    rulebinary_op();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLinhaAccess().getExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Expression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLinha"


    // $ANTLR start "entryRuleUnaryExpr"
    // InternalGo.g:3365:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // InternalGo.g:3365:50: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // InternalGo.g:3366:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpr=ruleUnaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // InternalGo.g:3372:1: ruleUnaryExpr returns [EObject current=null] : ( ( (lv_PrimaryExpr_0_0= rulePrimaryExpr ) ) | ( ruleunary_op this_UnaryExpr_2= ruleUnaryExpr ) ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_PrimaryExpr_0_0 = null;

        EObject this_UnaryExpr_2 = null;



        	enterRule();

        try {
            // InternalGo.g:3378:2: ( ( ( (lv_PrimaryExpr_0_0= rulePrimaryExpr ) ) | ( ruleunary_op this_UnaryExpr_2= ruleUnaryExpr ) ) )
            // InternalGo.g:3379:2: ( ( (lv_PrimaryExpr_0_0= rulePrimaryExpr ) ) | ( ruleunary_op this_UnaryExpr_2= ruleUnaryExpr ) )
            {
            // InternalGo.g:3379:2: ( ( (lv_PrimaryExpr_0_0= rulePrimaryExpr ) ) | ( ruleunary_op this_UnaryExpr_2= ruleUnaryExpr ) )
            int alt49=2;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // InternalGo.g:3380:3: ( (lv_PrimaryExpr_0_0= rulePrimaryExpr ) )
                    {
                    // InternalGo.g:3380:3: ( (lv_PrimaryExpr_0_0= rulePrimaryExpr ) )
                    // InternalGo.g:3381:4: (lv_PrimaryExpr_0_0= rulePrimaryExpr )
                    {
                    // InternalGo.g:3381:4: (lv_PrimaryExpr_0_0= rulePrimaryExpr )
                    // InternalGo.g:3382:5: lv_PrimaryExpr_0_0= rulePrimaryExpr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getUnaryExprAccess().getPrimaryExprPrimaryExprParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_PrimaryExpr_0_0=rulePrimaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getUnaryExprRule());
                      					}
                      					set(
                      						current,
                      						"PrimaryExpr",
                      						lv_PrimaryExpr_0_0,
                      						"com.ufcg.compiladores.Go.PrimaryExpr");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:3400:3: ( ruleunary_op this_UnaryExpr_2= ruleUnaryExpr )
                    {
                    // InternalGo.g:3400:3: ( ruleunary_op this_UnaryExpr_2= ruleUnaryExpr )
                    // InternalGo.g:3401:4: ruleunary_op this_UnaryExpr_2= ruleUnaryExpr
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getUnaryExprAccess().getUnary_opParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_8);
                    ruleunary_op();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getUnaryExprAccess().getUnaryExprParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryExpr_2=ruleUnaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_UnaryExpr_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRulebinary_op"
    // InternalGo.g:3427:1: entryRulebinary_op returns [String current=null] : iv_rulebinary_op= rulebinary_op EOF ;
    public final String entryRulebinary_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebinary_op = null;


        try {
            // InternalGo.g:3427:49: (iv_rulebinary_op= rulebinary_op EOF )
            // InternalGo.g:3428:2: iv_rulebinary_op= rulebinary_op EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinary_opRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulebinary_op=rulebinary_op();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebinary_op.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulebinary_op"


    // $ANTLR start "rulebinary_op"
    // InternalGo.g:3434:1: rulebinary_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '||' | kw= '&&' | this_rel_op_2= rulerel_op | this_add_op_3= ruleadd_op | this_mul_op_4= rulemul_op ) ;
    public final AntlrDatatypeRuleToken rulebinary_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_rel_op_2 = null;

        AntlrDatatypeRuleToken this_add_op_3 = null;

        AntlrDatatypeRuleToken this_mul_op_4 = null;



        	enterRule();

        try {
            // InternalGo.g:3440:2: ( (kw= '||' | kw= '&&' | this_rel_op_2= rulerel_op | this_add_op_3= ruleadd_op | this_mul_op_4= rulemul_op ) )
            // InternalGo.g:3441:2: (kw= '||' | kw= '&&' | this_rel_op_2= rulerel_op | this_add_op_3= ruleadd_op | this_mul_op_4= rulemul_op )
            {
            // InternalGo.g:3441:2: (kw= '||' | kw= '&&' | this_rel_op_2= rulerel_op | this_add_op_3= ruleadd_op | this_mul_op_4= rulemul_op )
            int alt50=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt50=1;
                }
                break;
            case 41:
                {
                alt50=2;
                }
                break;
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
                {
                alt50=3;
                }
                break;
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt50=4;
                }
                break;
            case 24:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt50=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalGo.g:3442:3: kw= '||'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBinary_opAccess().getVerticalLineVerticalLineKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3448:3: kw= '&&'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBinary_opAccess().getAmpersandAmpersandKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:3454:3: this_rel_op_2= rulerel_op
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinary_opAccess().getRel_opParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_rel_op_2=rulerel_op();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_rel_op_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:3465:3: this_add_op_3= ruleadd_op
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinary_opAccess().getAdd_opParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_add_op_3=ruleadd_op();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_add_op_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:3476:3: this_mul_op_4= rulemul_op
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinary_opAccess().getMul_opParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_mul_op_4=rulemul_op();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_mul_op_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulebinary_op"


    // $ANTLR start "entryRulerel_op"
    // InternalGo.g:3490:1: entryRulerel_op returns [String current=null] : iv_rulerel_op= rulerel_op EOF ;
    public final String entryRulerel_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerel_op = null;


        try {
            // InternalGo.g:3490:46: (iv_rulerel_op= rulerel_op EOF )
            // InternalGo.g:3491:2: iv_rulerel_op= rulerel_op EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRel_opRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerel_op=rulerel_op();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerel_op.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulerel_op"


    // $ANTLR start "rulerel_op"
    // InternalGo.g:3497:1: rulerel_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken rulerel_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3503:2: ( (kw= '==' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) )
            // InternalGo.g:3504:2: (kw= '==' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            {
            // InternalGo.g:3504:2: (kw= '==' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            int alt51=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt51=1;
                }
                break;
            case 43:
                {
                alt51=2;
                }
                break;
            case 44:
                {
                alt51=3;
                }
                break;
            case 45:
                {
                alt51=4;
                }
                break;
            case 46:
                {
                alt51=5;
                }
                break;
            case 47:
                {
                alt51=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalGo.g:3505:3: kw= '=='
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRel_opAccess().getEqualsSignEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3511:3: kw= '!='
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRel_opAccess().getExclamationMarkEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:3517:3: kw= '<'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRel_opAccess().getLessThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:3523:3: kw= '<='
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRel_opAccess().getLessThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:3529:3: kw= '>'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRel_opAccess().getGreaterThanSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:3535:3: kw= '>='
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRel_opAccess().getGreaterThanSignEqualsSignKeyword_5());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulerel_op"


    // $ANTLR start "entryRuleadd_op"
    // InternalGo.g:3544:1: entryRuleadd_op returns [String current=null] : iv_ruleadd_op= ruleadd_op EOF ;
    public final String entryRuleadd_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleadd_op = null;


        try {
            // InternalGo.g:3544:46: (iv_ruleadd_op= ruleadd_op EOF )
            // InternalGo.g:3545:2: iv_ruleadd_op= ruleadd_op EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdd_opRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleadd_op=ruleadd_op();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleadd_op.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleadd_op"


    // $ANTLR start "ruleadd_op"
    // InternalGo.g:3551:1: ruleadd_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '|' | kw= '\\u02C6' ) ;
    public final AntlrDatatypeRuleToken ruleadd_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3557:2: ( (kw= '+' | kw= '-' | kw= '|' | kw= '\\u02C6' ) )
            // InternalGo.g:3558:2: (kw= '+' | kw= '-' | kw= '|' | kw= '\\u02C6' )
            {
            // InternalGo.g:3558:2: (kw= '+' | kw= '-' | kw= '|' | kw= '\\u02C6' )
            int alt52=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt52=1;
                }
                break;
            case 49:
                {
                alt52=2;
                }
                break;
            case 50:
                {
                alt52=3;
                }
                break;
            case 51:
                {
                alt52=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalGo.g:3559:3: kw= '+'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAdd_opAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3565:3: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAdd_opAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:3571:3: kw= '|'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAdd_opAccess().getVerticalLineKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:3577:3: kw= '\\u02C6'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAdd_opAccess().getModifierLetterCircumflexAccentKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleadd_op"


    // $ANTLR start "entryRulemul_op"
    // InternalGo.g:3586:1: entryRulemul_op returns [String current=null] : iv_rulemul_op= rulemul_op EOF ;
    public final String entryRulemul_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemul_op = null;


        try {
            // InternalGo.g:3586:46: (iv_rulemul_op= rulemul_op EOF )
            // InternalGo.g:3587:2: iv_rulemul_op= rulemul_op EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMul_opRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulemul_op=rulemul_op();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemul_op.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulemul_op"


    // $ANTLR start "rulemul_op"
    // InternalGo.g:3593:1: rulemul_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' | kw= '<<' | kw= '>>' | kw= '&' | kw= '&^' ) ;
    public final AntlrDatatypeRuleToken rulemul_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3599:2: ( (kw= '*' | kw= '/' | kw= '%' | kw= '<<' | kw= '>>' | kw= '&' | kw= '&^' ) )
            // InternalGo.g:3600:2: (kw= '*' | kw= '/' | kw= '%' | kw= '<<' | kw= '>>' | kw= '&' | kw= '&^' )
            {
            // InternalGo.g:3600:2: (kw= '*' | kw= '/' | kw= '%' | kw= '<<' | kw= '>>' | kw= '&' | kw= '&^' )
            int alt53=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt53=1;
                }
                break;
            case 52:
                {
                alt53=2;
                }
                break;
            case 53:
                {
                alt53=3;
                }
                break;
            case 54:
                {
                alt53=4;
                }
                break;
            case 55:
                {
                alt53=5;
                }
                break;
            case 56:
                {
                alt53=6;
                }
                break;
            case 57:
                {
                alt53=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalGo.g:3601:3: kw= '*'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMul_opAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3607:3: kw= '/'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMul_opAccess().getSolidusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:3613:3: kw= '%'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMul_opAccess().getPercentSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:3619:3: kw= '<<'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMul_opAccess().getLessThanSignLessThanSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:3625:3: kw= '>>'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMul_opAccess().getGreaterThanSignGreaterThanSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:3631:3: kw= '&'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMul_opAccess().getAmpersandKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:3637:3: kw= '&^'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMul_opAccess().getAmpersandCircumflexAccentKeyword_6());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulemul_op"


    // $ANTLR start "entryRuleunary_op"
    // InternalGo.g:3646:1: entryRuleunary_op returns [String current=null] : iv_ruleunary_op= ruleunary_op EOF ;
    public final String entryRuleunary_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunary_op = null;


        try {
            // InternalGo.g:3646:48: (iv_ruleunary_op= ruleunary_op EOF )
            // InternalGo.g:3647:2: iv_ruleunary_op= ruleunary_op EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnary_opRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleunary_op=ruleunary_op();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunary_op.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleunary_op"


    // $ANTLR start "ruleunary_op"
    // InternalGo.g:3653:1: ruleunary_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '*' | kw= '&' | kw= '<-' ) ;
    public final AntlrDatatypeRuleToken ruleunary_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3659:2: ( (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '*' | kw= '&' | kw= '<-' ) )
            // InternalGo.g:3660:2: (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '*' | kw= '&' | kw= '<-' )
            {
            // InternalGo.g:3660:2: (kw= '+' | kw= '-' | kw= '!' | kw= '^' | kw= '*' | kw= '&' | kw= '<-' )
            int alt54=7;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt54=1;
                }
                break;
            case 49:
                {
                alt54=2;
                }
                break;
            case 16:
                {
                alt54=3;
                }
                break;
            case 58:
                {
                alt54=4;
                }
                break;
            case 24:
                {
                alt54=5;
                }
                break;
            case 56:
                {
                alt54=6;
                }
                break;
            case 32:
                {
                alt54=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalGo.g:3661:3: kw= '+'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnary_opAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3667:3: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnary_opAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:3673:3: kw= '!'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnary_opAccess().getExclamationMarkKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:3679:3: kw= '^'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnary_opAccess().getCircumflexAccentKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:3685:3: kw= '*'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnary_opAccess().getAsteriskKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:3691:3: kw= '&'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnary_opAccess().getAmpersandKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:3697:3: kw= '<-'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnary_opAccess().getLessThanSignHyphenMinusKeyword_6());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleunary_op"


    // $ANTLR start "entryRuleConversion"
    // InternalGo.g:3706:1: entryRuleConversion returns [EObject current=null] : iv_ruleConversion= ruleConversion EOF ;
    public final EObject entryRuleConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConversion = null;


        try {
            // InternalGo.g:3706:51: (iv_ruleConversion= ruleConversion EOF )
            // InternalGo.g:3707:2: iv_ruleConversion= ruleConversion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConversionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConversion=ruleConversion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConversion; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConversion"


    // $ANTLR start "ruleConversion"
    // InternalGo.g:3713:1: ruleConversion returns [EObject current=null] : (this_Type_0= ruleType otherlv_1= '(' ( (lv_Expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? otherlv_4= ')' ) ;
    public final EObject ruleConversion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_Type_0 = null;

        EObject lv_Expression_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3719:2: ( (this_Type_0= ruleType otherlv_1= '(' ( (lv_Expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? otherlv_4= ')' ) )
            // InternalGo.g:3720:2: (this_Type_0= ruleType otherlv_1= '(' ( (lv_Expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? otherlv_4= ')' )
            {
            // InternalGo.g:3720:2: (this_Type_0= ruleType otherlv_1= '(' ( (lv_Expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? otherlv_4= ')' )
            // InternalGo.g:3721:3: this_Type_0= ruleType otherlv_1= '(' ( (lv_Expression_2_0= ruleExpression ) ) (otherlv_3= ',' )? otherlv_4= ')'
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConversionAccess().getTypeParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            this_Type_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Type_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConversionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGo.g:3736:3: ( (lv_Expression_2_0= ruleExpression ) )
            // InternalGo.g:3737:4: (lv_Expression_2_0= ruleExpression )
            {
            // InternalGo.g:3737:4: (lv_Expression_2_0= ruleExpression )
            // InternalGo.g:3738:5: lv_Expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConversionAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_Expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConversionRule());
              					}
              					set(
              						current,
              						"Expression",
              						lv_Expression_2_0,
              						"com.ufcg.compiladores.Go.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:3755:3: (otherlv_3= ',' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==26) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalGo.g:3756:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getConversionAccess().getCommaKeyword_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConversionAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConversion"


    // $ANTLR start "entryRuleStatement"
    // InternalGo.g:3769:1: entryRuleStatement returns [String current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final String entryRuleStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatement = null;


        try {
            // InternalGo.g:3769:49: (iv_ruleStatement= ruleStatement EOF )
            // InternalGo.g:3770:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalGo.g:3776:1: ruleStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ola' ;
    public final AntlrDatatypeRuleToken ruleStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3782:2: (kw= 'ola' )
            // InternalGo.g:3783:2: kw= 'ola'
            {
            kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getStatementAccess().getOlaKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePackageName"
    // InternalGo.g:3791:1: entryRulePackageName returns [String current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final String entryRulePackageName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackageName = null;


        try {
            // InternalGo.g:3791:51: (iv_rulePackageName= rulePackageName EOF )
            // InternalGo.g:3792:2: iv_rulePackageName= rulePackageName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackageName=rulePackageName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackageName"


    // $ANTLR start "rulePackageName"
    // InternalGo.g:3798:1: rulePackageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'carai' ;
    public final AntlrDatatypeRuleToken rulePackageName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3804:2: (kw= 'carai' )
            // InternalGo.g:3805:2: kw= 'carai'
            {
            kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getPackageNameAccess().getCaraiKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePackageName"


    // $ANTLR start "entryRuleidentifier"
    // InternalGo.g:3813:1: entryRuleidentifier returns [String current=null] : iv_ruleidentifier= ruleidentifier EOF ;
    public final String entryRuleidentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleidentifier = null;


        try {
            // InternalGo.g:3813:50: (iv_ruleidentifier= ruleidentifier EOF )
            // InternalGo.g:3814:2: iv_ruleidentifier= ruleidentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleidentifier=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleidentifier.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleidentifier"


    // $ANTLR start "ruleidentifier"
    // InternalGo.g:3820:1: ruleidentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LETTER_0= RULE_LETTER (this_LETTER_1= RULE_LETTER | this_DECIMAL_DIGIT_2= RULE_DECIMAL_DIGIT )* ) ;
    public final AntlrDatatypeRuleToken ruleidentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LETTER_0=null;
        Token this_LETTER_1=null;
        Token this_DECIMAL_DIGIT_2=null;


        	enterRule();

        try {
            // InternalGo.g:3826:2: ( (this_LETTER_0= RULE_LETTER (this_LETTER_1= RULE_LETTER | this_DECIMAL_DIGIT_2= RULE_DECIMAL_DIGIT )* ) )
            // InternalGo.g:3827:2: (this_LETTER_0= RULE_LETTER (this_LETTER_1= RULE_LETTER | this_DECIMAL_DIGIT_2= RULE_DECIMAL_DIGIT )* )
            {
            // InternalGo.g:3827:2: (this_LETTER_0= RULE_LETTER (this_LETTER_1= RULE_LETTER | this_DECIMAL_DIGIT_2= RULE_DECIMAL_DIGIT )* )
            // InternalGo.g:3828:3: this_LETTER_0= RULE_LETTER (this_LETTER_1= RULE_LETTER | this_DECIMAL_DIGIT_2= RULE_DECIMAL_DIGIT )*
            {
            this_LETTER_0=(Token)match(input,RULE_LETTER,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LETTER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LETTER_0, grammarAccess.getIdentifierAccess().getLETTERTerminalRuleCall_0());
              		
            }
            // InternalGo.g:3835:3: (this_LETTER_1= RULE_LETTER | this_DECIMAL_DIGIT_2= RULE_DECIMAL_DIGIT )*
            loop56:
            do {
                int alt56=3;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_LETTER) ) {
                    int LA56_2 = input.LA(2);

                    if ( (synpred94_InternalGo()) ) {
                        alt56=1;
                    }


                }
                else if ( (LA56_0==RULE_DECIMAL_DIGIT) ) {
                    alt56=2;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalGo.g:3836:4: this_LETTER_1= RULE_LETTER
            	    {
            	    this_LETTER_1=(Token)match(input,RULE_LETTER,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_LETTER_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_LETTER_1, grammarAccess.getIdentifierAccess().getLETTERTerminalRuleCall_1_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalGo.g:3844:4: this_DECIMAL_DIGIT_2= RULE_DECIMAL_DIGIT
            	    {
            	    this_DECIMAL_DIGIT_2=(Token)match(input,RULE_DECIMAL_DIGIT,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DECIMAL_DIGIT_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DECIMAL_DIGIT_2, grammarAccess.getIdentifierAccess().getDECIMAL_DIGITTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleidentifier"


    // $ANTLR start "entryRuleint_lit"
    // InternalGo.g:3856:1: entryRuleint_lit returns [String current=null] : iv_ruleint_lit= ruleint_lit EOF ;
    public final String entryRuleint_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleint_lit = null;


        try {
            // InternalGo.g:3856:47: (iv_ruleint_lit= ruleint_lit EOF )
            // InternalGo.g:3857:2: iv_ruleint_lit= ruleint_lit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt_litRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleint_lit=ruleint_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleint_lit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleint_lit"


    // $ANTLR start "ruleint_lit"
    // InternalGo.g:3863:1: ruleint_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_decimal_lit_0= ruledecimal_lit | this_octal_lit_1= ruleoctal_lit | this_hex_lit_2= rulehex_lit ) ;
    public final AntlrDatatypeRuleToken ruleint_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_decimal_lit_0 = null;

        AntlrDatatypeRuleToken this_octal_lit_1 = null;

        AntlrDatatypeRuleToken this_hex_lit_2 = null;



        	enterRule();

        try {
            // InternalGo.g:3869:2: ( (this_decimal_lit_0= ruledecimal_lit | this_octal_lit_1= ruleoctal_lit | this_hex_lit_2= rulehex_lit ) )
            // InternalGo.g:3870:2: (this_decimal_lit_0= ruledecimal_lit | this_octal_lit_1= ruleoctal_lit | this_hex_lit_2= rulehex_lit )
            {
            // InternalGo.g:3870:2: (this_decimal_lit_0= ruledecimal_lit | this_octal_lit_1= ruleoctal_lit | this_hex_lit_2= rulehex_lit )
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_DECIMAL_DIGIT) ) {
                alt57=1;
            }
            else if ( (LA57_0==61) ) {
                int LA57_2 = input.LA(2);

                if ( (LA57_2==EOF||LA57_2==RULE_OCTAL_DIGIT||LA57_2==39) ) {
                    alt57=2;
                }
                else if ( ((LA57_2>=62 && LA57_2<=63)) ) {
                    alt57=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalGo.g:3871:3: this_decimal_lit_0= ruledecimal_lit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInt_litAccess().getDecimal_litParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_decimal_lit_0=ruledecimal_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_decimal_lit_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3882:3: this_octal_lit_1= ruleoctal_lit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInt_litAccess().getOctal_litParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_octal_lit_1=ruleoctal_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_octal_lit_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:3893:3: this_hex_lit_2= rulehex_lit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInt_litAccess().getHex_litParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_hex_lit_2=rulehex_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_hex_lit_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleint_lit"


    // $ANTLR start "entryRuledecimal_lit"
    // InternalGo.g:3907:1: entryRuledecimal_lit returns [String current=null] : iv_ruledecimal_lit= ruledecimal_lit EOF ;
    public final String entryRuledecimal_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledecimal_lit = null;


        try {
            // InternalGo.g:3907:51: (iv_ruledecimal_lit= ruledecimal_lit EOF )
            // InternalGo.g:3908:2: iv_ruledecimal_lit= ruledecimal_lit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimal_litRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledecimal_lit=ruledecimal_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledecimal_lit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuledecimal_lit"


    // $ANTLR start "ruledecimal_lit"
    // InternalGo.g:3914:1: ruledecimal_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DECIMAL_DIGIT_0= RULE_DECIMAL_DIGIT (this_DECIMAL_DIGIT_1= RULE_DECIMAL_DIGIT )* ) ;
    public final AntlrDatatypeRuleToken ruledecimal_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_DIGIT_0=null;
        Token this_DECIMAL_DIGIT_1=null;


        	enterRule();

        try {
            // InternalGo.g:3920:2: ( (this_DECIMAL_DIGIT_0= RULE_DECIMAL_DIGIT (this_DECIMAL_DIGIT_1= RULE_DECIMAL_DIGIT )* ) )
            // InternalGo.g:3921:2: (this_DECIMAL_DIGIT_0= RULE_DECIMAL_DIGIT (this_DECIMAL_DIGIT_1= RULE_DECIMAL_DIGIT )* )
            {
            // InternalGo.g:3921:2: (this_DECIMAL_DIGIT_0= RULE_DECIMAL_DIGIT (this_DECIMAL_DIGIT_1= RULE_DECIMAL_DIGIT )* )
            // InternalGo.g:3922:3: this_DECIMAL_DIGIT_0= RULE_DECIMAL_DIGIT (this_DECIMAL_DIGIT_1= RULE_DECIMAL_DIGIT )*
            {
            this_DECIMAL_DIGIT_0=(Token)match(input,RULE_DECIMAL_DIGIT,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DECIMAL_DIGIT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DECIMAL_DIGIT_0, grammarAccess.getDecimal_litAccess().getDECIMAL_DIGITTerminalRuleCall_0());
              		
            }
            // InternalGo.g:3929:3: (this_DECIMAL_DIGIT_1= RULE_DECIMAL_DIGIT )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_DECIMAL_DIGIT) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalGo.g:3930:4: this_DECIMAL_DIGIT_1= RULE_DECIMAL_DIGIT
            	    {
            	    this_DECIMAL_DIGIT_1=(Token)match(input,RULE_DECIMAL_DIGIT,FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DECIMAL_DIGIT_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DECIMAL_DIGIT_1, grammarAccess.getDecimal_litAccess().getDECIMAL_DIGITTerminalRuleCall_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruledecimal_lit"


    // $ANTLR start "entryRuleoctal_lit"
    // InternalGo.g:3942:1: entryRuleoctal_lit returns [String current=null] : iv_ruleoctal_lit= ruleoctal_lit EOF ;
    public final String entryRuleoctal_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoctal_lit = null;


        try {
            // InternalGo.g:3942:49: (iv_ruleoctal_lit= ruleoctal_lit EOF )
            // InternalGo.g:3943:2: iv_ruleoctal_lit= ruleoctal_lit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOctal_litRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleoctal_lit=ruleoctal_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleoctal_lit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleoctal_lit"


    // $ANTLR start "ruleoctal_lit"
    // InternalGo.g:3949:1: ruleoctal_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0' (this_OCTAL_DIGIT_1= RULE_OCTAL_DIGIT )* ) ;
    public final AntlrDatatypeRuleToken ruleoctal_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_OCTAL_DIGIT_1=null;


        	enterRule();

        try {
            // InternalGo.g:3955:2: ( (kw= '0' (this_OCTAL_DIGIT_1= RULE_OCTAL_DIGIT )* ) )
            // InternalGo.g:3956:2: (kw= '0' (this_OCTAL_DIGIT_1= RULE_OCTAL_DIGIT )* )
            {
            // InternalGo.g:3956:2: (kw= '0' (this_OCTAL_DIGIT_1= RULE_OCTAL_DIGIT )* )
            // InternalGo.g:3957:3: kw= '0' (this_OCTAL_DIGIT_1= RULE_OCTAL_DIGIT )*
            {
            kw=(Token)match(input,61,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getOctal_litAccess().getDigitZeroKeyword_0());
              		
            }
            // InternalGo.g:3962:3: (this_OCTAL_DIGIT_1= RULE_OCTAL_DIGIT )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_OCTAL_DIGIT) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalGo.g:3963:4: this_OCTAL_DIGIT_1= RULE_OCTAL_DIGIT
            	    {
            	    this_OCTAL_DIGIT_1=(Token)match(input,RULE_OCTAL_DIGIT,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_OCTAL_DIGIT_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_OCTAL_DIGIT_1, grammarAccess.getOctal_litAccess().getOCTAL_DIGITTerminalRuleCall_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleoctal_lit"


    // $ANTLR start "entryRulehex_lit"
    // InternalGo.g:3975:1: entryRulehex_lit returns [String current=null] : iv_rulehex_lit= rulehex_lit EOF ;
    public final String entryRulehex_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulehex_lit = null;


        try {
            // InternalGo.g:3975:47: (iv_rulehex_lit= rulehex_lit EOF )
            // InternalGo.g:3976:2: iv_rulehex_lit= rulehex_lit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHex_litRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulehex_lit=rulehex_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulehex_lit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulehex_lit"


    // $ANTLR start "rulehex_lit"
    // InternalGo.g:3982:1: rulehex_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0' (kw= 'x' | kw= 'X' ) this_HEX_DIGIT_3= RULE_HEX_DIGIT (this_HEX_DIGIT_4= RULE_HEX_DIGIT )* ) ;
    public final AntlrDatatypeRuleToken rulehex_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_HEX_DIGIT_3=null;
        Token this_HEX_DIGIT_4=null;


        	enterRule();

        try {
            // InternalGo.g:3988:2: ( (kw= '0' (kw= 'x' | kw= 'X' ) this_HEX_DIGIT_3= RULE_HEX_DIGIT (this_HEX_DIGIT_4= RULE_HEX_DIGIT )* ) )
            // InternalGo.g:3989:2: (kw= '0' (kw= 'x' | kw= 'X' ) this_HEX_DIGIT_3= RULE_HEX_DIGIT (this_HEX_DIGIT_4= RULE_HEX_DIGIT )* )
            {
            // InternalGo.g:3989:2: (kw= '0' (kw= 'x' | kw= 'X' ) this_HEX_DIGIT_3= RULE_HEX_DIGIT (this_HEX_DIGIT_4= RULE_HEX_DIGIT )* )
            // InternalGo.g:3990:3: kw= '0' (kw= 'x' | kw= 'X' ) this_HEX_DIGIT_3= RULE_HEX_DIGIT (this_HEX_DIGIT_4= RULE_HEX_DIGIT )*
            {
            kw=(Token)match(input,61,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getHex_litAccess().getDigitZeroKeyword_0());
              		
            }
            // InternalGo.g:3995:3: (kw= 'x' | kw= 'X' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==62) ) {
                alt60=1;
            }
            else if ( (LA60_0==63) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalGo.g:3996:4: kw= 'x'
                    {
                    kw=(Token)match(input,62,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getHex_litAccess().getXKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:4002:4: kw= 'X'
                    {
                    kw=(Token)match(input,63,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getHex_litAccess().getXKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            this_HEX_DIGIT_3=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_HEX_DIGIT_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HEX_DIGIT_3, grammarAccess.getHex_litAccess().getHEX_DIGITTerminalRuleCall_2());
              		
            }
            // InternalGo.g:4015:3: (this_HEX_DIGIT_4= RULE_HEX_DIGIT )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_HEX_DIGIT) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalGo.g:4016:4: this_HEX_DIGIT_4= RULE_HEX_DIGIT
            	    {
            	    this_HEX_DIGIT_4=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_HEX_DIGIT_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_HEX_DIGIT_4, grammarAccess.getHex_litAccess().getHEX_DIGITTerminalRuleCall_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulehex_lit"


    // $ANTLR start "entryRulefloat_lit"
    // InternalGo.g:4028:1: entryRulefloat_lit returns [String current=null] : iv_rulefloat_lit= rulefloat_lit EOF ;
    public final String entryRulefloat_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefloat_lit = null;


        try {
            // InternalGo.g:4028:49: (iv_rulefloat_lit= rulefloat_lit EOF )
            // InternalGo.g:4029:2: iv_rulefloat_lit= rulefloat_lit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloat_litRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefloat_lit=rulefloat_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefloat_lit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulefloat_lit"


    // $ANTLR start "rulefloat_lit"
    // InternalGo.g:4035:1: rulefloat_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_decimals_0= ruledecimals kw= '.' (this_decimals_2= ruledecimals )? (this_exponent_3= ruleexponent )? ) | (this_decimals_4= ruledecimals this_exponent_5= ruleexponent ) | (kw= '.' this_decimals_7= ruledecimals (this_exponent_8= ruleexponent )? ) ) ;
    public final AntlrDatatypeRuleToken rulefloat_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_decimals_0 = null;

        AntlrDatatypeRuleToken this_decimals_2 = null;

        AntlrDatatypeRuleToken this_exponent_3 = null;

        AntlrDatatypeRuleToken this_decimals_4 = null;

        AntlrDatatypeRuleToken this_exponent_5 = null;

        AntlrDatatypeRuleToken this_decimals_7 = null;

        AntlrDatatypeRuleToken this_exponent_8 = null;



        	enterRule();

        try {
            // InternalGo.g:4041:2: ( ( (this_decimals_0= ruledecimals kw= '.' (this_decimals_2= ruledecimals )? (this_exponent_3= ruleexponent )? ) | (this_decimals_4= ruledecimals this_exponent_5= ruleexponent ) | (kw= '.' this_decimals_7= ruledecimals (this_exponent_8= ruleexponent )? ) ) )
            // InternalGo.g:4042:2: ( (this_decimals_0= ruledecimals kw= '.' (this_decimals_2= ruledecimals )? (this_exponent_3= ruleexponent )? ) | (this_decimals_4= ruledecimals this_exponent_5= ruleexponent ) | (kw= '.' this_decimals_7= ruledecimals (this_exponent_8= ruleexponent )? ) )
            {
            // InternalGo.g:4042:2: ( (this_decimals_0= ruledecimals kw= '.' (this_decimals_2= ruledecimals )? (this_exponent_3= ruleexponent )? ) | (this_decimals_4= ruledecimals this_exponent_5= ruleexponent ) | (kw= '.' this_decimals_7= ruledecimals (this_exponent_8= ruleexponent )? ) )
            int alt65=3;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // InternalGo.g:4043:3: (this_decimals_0= ruledecimals kw= '.' (this_decimals_2= ruledecimals )? (this_exponent_3= ruleexponent )? )
                    {
                    // InternalGo.g:4043:3: (this_decimals_0= ruledecimals kw= '.' (this_decimals_2= ruledecimals )? (this_exponent_3= ruleexponent )? )
                    // InternalGo.g:4044:4: this_decimals_0= ruledecimals kw= '.' (this_decimals_2= ruledecimals )? (this_exponent_3= ruleexponent )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFloat_litAccess().getDecimalsParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_35);
                    this_decimals_0=ruledecimals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_decimals_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,37,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFloat_litAccess().getFullStopKeyword_0_1());
                      			
                    }
                    // InternalGo.g:4059:4: (this_decimals_2= ruledecimals )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_DECIMAL_DIGIT) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalGo.g:4060:5: this_decimals_2= ruledecimals
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getFloat_litAccess().getDecimalsParserRuleCall_0_2());
                              				
                            }
                            pushFollow(FOLLOW_50);
                            this_decimals_2=ruledecimals();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_decimals_2);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }

                    // InternalGo.g:4071:4: (this_exponent_3= ruleexponent )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( ((LA63_0>=68 && LA63_0<=69)) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalGo.g:4072:5: this_exponent_3= ruleexponent
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_0_3());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_exponent_3=ruleexponent();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_exponent_3);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:4085:3: (this_decimals_4= ruledecimals this_exponent_5= ruleexponent )
                    {
                    // InternalGo.g:4085:3: (this_decimals_4= ruledecimals this_exponent_5= ruleexponent )
                    // InternalGo.g:4086:4: this_decimals_4= ruledecimals this_exponent_5= ruleexponent
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFloat_litAccess().getDecimalsParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_51);
                    this_decimals_4=ruledecimals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_decimals_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_exponent_5=ruleexponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_exponent_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:4108:3: (kw= '.' this_decimals_7= ruledecimals (this_exponent_8= ruleexponent )? )
                    {
                    // InternalGo.g:4108:3: (kw= '.' this_decimals_7= ruledecimals (this_exponent_8= ruleexponent )? )
                    // InternalGo.g:4109:4: kw= '.' this_decimals_7= ruledecimals (this_exponent_8= ruleexponent )?
                    {
                    kw=(Token)match(input,37,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFloat_litAccess().getFullStopKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFloat_litAccess().getDecimalsParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_50);
                    this_decimals_7=ruledecimals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_decimals_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:4124:4: (this_exponent_8= ruleexponent )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( ((LA64_0>=68 && LA64_0<=69)) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalGo.g:4125:5: this_exponent_8= ruleexponent
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getFloat_litAccess().getExponentParserRuleCall_2_2());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_exponent_8=ruleexponent();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_exponent_8);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulefloat_lit"


    // $ANTLR start "entryRulestring_lit"
    // InternalGo.g:4141:1: entryRulestring_lit returns [String current=null] : iv_rulestring_lit= rulestring_lit EOF ;
    public final String entryRulestring_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestring_lit = null;


        try {
            // InternalGo.g:4141:50: (iv_rulestring_lit= rulestring_lit EOF )
            // InternalGo.g:4142:2: iv_rulestring_lit= rulestring_lit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getString_litRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestring_lit=rulestring_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestring_lit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulestring_lit"


    // $ANTLR start "rulestring_lit"
    // InternalGo.g:4148:1: rulestring_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_raw_string_lit_0= ruleraw_string_lit | this_interpreted_string_lit_1= ruleinterpreted_string_lit ) ;
    public final AntlrDatatypeRuleToken rulestring_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_raw_string_lit_0 = null;

        AntlrDatatypeRuleToken this_interpreted_string_lit_1 = null;



        	enterRule();

        try {
            // InternalGo.g:4154:2: ( (this_raw_string_lit_0= ruleraw_string_lit | this_interpreted_string_lit_1= ruleinterpreted_string_lit ) )
            // InternalGo.g:4155:2: (this_raw_string_lit_0= ruleraw_string_lit | this_interpreted_string_lit_1= ruleinterpreted_string_lit )
            {
            // InternalGo.g:4155:2: (this_raw_string_lit_0= ruleraw_string_lit | this_interpreted_string_lit_1= ruleinterpreted_string_lit )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==64) ) {
                alt66=1;
            }
            else if ( (LA66_0==65) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalGo.g:4156:3: this_raw_string_lit_0= ruleraw_string_lit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getString_litAccess().getRaw_string_litParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_raw_string_lit_0=ruleraw_string_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_raw_string_lit_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:4167:3: this_interpreted_string_lit_1= ruleinterpreted_string_lit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getString_litAccess().getInterpreted_string_litParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_interpreted_string_lit_1=ruleinterpreted_string_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_interpreted_string_lit_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulestring_lit"


    // $ANTLR start "entryRuleraw_string_lit"
    // InternalGo.g:4181:1: entryRuleraw_string_lit returns [String current=null] : iv_ruleraw_string_lit= ruleraw_string_lit EOF ;
    public final String entryRuleraw_string_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleraw_string_lit = null;


        try {
            // InternalGo.g:4181:54: (iv_ruleraw_string_lit= ruleraw_string_lit EOF )
            // InternalGo.g:4182:2: iv_ruleraw_string_lit= ruleraw_string_lit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRaw_string_litRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleraw_string_lit=ruleraw_string_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleraw_string_lit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleraw_string_lit"


    // $ANTLR start "ruleraw_string_lit"
    // InternalGo.g:4188:1: ruleraw_string_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\'' (this_unicode_char_1= ruleunicode_char | this_newline_2= rulenewline )? kw= '\\'' ) ;
    public final AntlrDatatypeRuleToken ruleraw_string_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_unicode_char_1 = null;

        AntlrDatatypeRuleToken this_newline_2 = null;



        	enterRule();

        try {
            // InternalGo.g:4194:2: ( (kw= '\\'' (this_unicode_char_1= ruleunicode_char | this_newline_2= rulenewline )? kw= '\\'' ) )
            // InternalGo.g:4195:2: (kw= '\\'' (this_unicode_char_1= ruleunicode_char | this_newline_2= rulenewline )? kw= '\\'' )
            {
            // InternalGo.g:4195:2: (kw= '\\'' (this_unicode_char_1= ruleunicode_char | this_newline_2= rulenewline )? kw= '\\'' )
            // InternalGo.g:4196:3: kw= '\\'' (this_unicode_char_1= ruleunicode_char | this_newline_2= rulenewline )? kw= '\\''
            {
            kw=(Token)match(input,64,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRaw_string_litAccess().getApostropheKeyword_0());
              		
            }
            // InternalGo.g:4201:3: (this_unicode_char_1= ruleunicode_char | this_newline_2= rulenewline )?
            int alt67=3;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==16||LA67_0==26||LA67_0==37||LA67_0==66) ) {
                alt67=1;
            }
            else if ( (LA67_0==67) ) {
                alt67=2;
            }
            switch (alt67) {
                case 1 :
                    // InternalGo.g:4202:4: this_unicode_char_1= ruleunicode_char
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRaw_string_litAccess().getUnicode_charParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_54);
                    this_unicode_char_1=ruleunicode_char();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_unicode_char_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:4213:4: this_newline_2= rulenewline
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRaw_string_litAccess().getNewlineParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_54);
                    this_newline_2=rulenewline();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_newline_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRaw_string_litAccess().getApostropheKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleraw_string_lit"


    // $ANTLR start "entryRuleinterpreted_string_lit"
    // InternalGo.g:4233:1: entryRuleinterpreted_string_lit returns [String current=null] : iv_ruleinterpreted_string_lit= ruleinterpreted_string_lit EOF ;
    public final String entryRuleinterpreted_string_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinterpreted_string_lit = null;


        try {
            // InternalGo.g:4233:62: (iv_ruleinterpreted_string_lit= ruleinterpreted_string_lit EOF )
            // InternalGo.g:4234:2: iv_ruleinterpreted_string_lit= ruleinterpreted_string_lit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterpreted_string_litRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleinterpreted_string_lit=ruleinterpreted_string_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinterpreted_string_lit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleinterpreted_string_lit"


    // $ANTLR start "ruleinterpreted_string_lit"
    // InternalGo.g:4240:1: ruleinterpreted_string_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"' (this_unicode_value_1= ruleunicode_value | this_byte_value_2= rulebyte_value )? kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleinterpreted_string_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_unicode_value_1 = null;

        AntlrDatatypeRuleToken this_byte_value_2 = null;



        	enterRule();

        try {
            // InternalGo.g:4246:2: ( (kw= '\"' (this_unicode_value_1= ruleunicode_value | this_byte_value_2= rulebyte_value )? kw= '\"' ) )
            // InternalGo.g:4247:2: (kw= '\"' (this_unicode_value_1= ruleunicode_value | this_byte_value_2= rulebyte_value )? kw= '\"' )
            {
            // InternalGo.g:4247:2: (kw= '\"' (this_unicode_value_1= ruleunicode_value | this_byte_value_2= rulebyte_value )? kw= '\"' )
            // InternalGo.g:4248:3: kw= '\"' (this_unicode_value_1= ruleunicode_value | this_byte_value_2= rulebyte_value )? kw= '\"'
            {
            kw=(Token)match(input,65,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_0());
              		
            }
            // InternalGo.g:4253:3: (this_unicode_value_1= ruleunicode_value | this_byte_value_2= rulebyte_value )?
            int alt68=3;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_LETTER) ) {
                alt68=1;
            }
            else if ( (LA68_0==64) ) {
                int LA68_2 = input.LA(2);

                if ( ((LA68_2>=64 && LA68_2<=65)||(LA68_2>=70 && LA68_2<=78)) ) {
                    alt68=1;
                }
                else if ( (LA68_2==RULE_OCTAL_DIGIT||LA68_2==62) ) {
                    alt68=2;
                }
            }
            switch (alt68) {
                case 1 :
                    // InternalGo.g:4254:4: this_unicode_value_1= ruleunicode_value
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getInterpreted_string_litAccess().getUnicode_valueParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_56);
                    this_unicode_value_1=ruleunicode_value();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_unicode_value_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:4265:4: this_byte_value_2= rulebyte_value
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getInterpreted_string_litAccess().getByte_valueParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_56);
                    this_byte_value_2=rulebyte_value();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_byte_value_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInterpreted_string_litAccess().getQuotationMarkKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleinterpreted_string_lit"


    // $ANTLR start "entryRuleunicode_char"
    // InternalGo.g:4285:1: entryRuleunicode_char returns [String current=null] : iv_ruleunicode_char= ruleunicode_char EOF ;
    public final String entryRuleunicode_char() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunicode_char = null;


        try {
            // InternalGo.g:4285:52: (iv_ruleunicode_char= ruleunicode_char EOF )
            // InternalGo.g:4286:2: iv_ruleunicode_char= ruleunicode_char EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnicode_charRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleunicode_char=ruleunicode_char();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunicode_char.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleunicode_char"


    // $ANTLR start "ruleunicode_char"
    // InternalGo.g:4292:1: ruleunicode_char returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '?' | kw= '.' | kw= ',' | kw= '!' ) ;
    public final AntlrDatatypeRuleToken ruleunicode_char() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:4298:2: ( (kw= '?' | kw= '.' | kw= ',' | kw= '!' ) )
            // InternalGo.g:4299:2: (kw= '?' | kw= '.' | kw= ',' | kw= '!' )
            {
            // InternalGo.g:4299:2: (kw= '?' | kw= '.' | kw= ',' | kw= '!' )
            int alt69=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt69=1;
                }
                break;
            case 37:
                {
                alt69=2;
                }
                break;
            case 26:
                {
                alt69=3;
                }
                break;
            case 16:
                {
                alt69=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalGo.g:4300:3: kw= '?'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnicode_charAccess().getQuestionMarkKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:4306:3: kw= '.'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnicode_charAccess().getFullStopKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:4312:3: kw= ','
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnicode_charAccess().getCommaKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:4318:3: kw= '!'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnicode_charAccess().getExclamationMarkKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleunicode_char"


    // $ANTLR start "entryRulenewline"
    // InternalGo.g:4327:1: entryRulenewline returns [String current=null] : iv_rulenewline= rulenewline EOF ;
    public final String entryRulenewline() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenewline = null;


        try {
            // InternalGo.g:4327:47: (iv_rulenewline= rulenewline EOF )
            // InternalGo.g:4328:2: iv_rulenewline= rulenewline EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewlineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulenewline=rulenewline();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenewline.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulenewline"


    // $ANTLR start "rulenewline"
    // InternalGo.g:4334:1: rulenewline returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'U+000A' ;
    public final AntlrDatatypeRuleToken rulenewline() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:4340:2: (kw= 'U+000A' )
            // InternalGo.g:4341:2: kw= 'U+000A'
            {
            kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getNewlineAccess().getU000AKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulenewline"


    // $ANTLR start "entryRuledecimals"
    // InternalGo.g:4349:1: entryRuledecimals returns [String current=null] : iv_ruledecimals= ruledecimals EOF ;
    public final String entryRuledecimals() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledecimals = null;


        try {
            // InternalGo.g:4349:48: (iv_ruledecimals= ruledecimals EOF )
            // InternalGo.g:4350:2: iv_ruledecimals= ruledecimals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledecimals=ruledecimals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledecimals.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuledecimals"


    // $ANTLR start "ruledecimals"
    // InternalGo.g:4356:1: ruledecimals returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DECIMAL_DIGIT_0= RULE_DECIMAL_DIGIT (this_DECIMAL_DIGIT_1= RULE_DECIMAL_DIGIT )* ) ;
    public final AntlrDatatypeRuleToken ruledecimals() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_DIGIT_0=null;
        Token this_DECIMAL_DIGIT_1=null;


        	enterRule();

        try {
            // InternalGo.g:4362:2: ( (this_DECIMAL_DIGIT_0= RULE_DECIMAL_DIGIT (this_DECIMAL_DIGIT_1= RULE_DECIMAL_DIGIT )* ) )
            // InternalGo.g:4363:2: (this_DECIMAL_DIGIT_0= RULE_DECIMAL_DIGIT (this_DECIMAL_DIGIT_1= RULE_DECIMAL_DIGIT )* )
            {
            // InternalGo.g:4363:2: (this_DECIMAL_DIGIT_0= RULE_DECIMAL_DIGIT (this_DECIMAL_DIGIT_1= RULE_DECIMAL_DIGIT )* )
            // InternalGo.g:4364:3: this_DECIMAL_DIGIT_0= RULE_DECIMAL_DIGIT (this_DECIMAL_DIGIT_1= RULE_DECIMAL_DIGIT )*
            {
            this_DECIMAL_DIGIT_0=(Token)match(input,RULE_DECIMAL_DIGIT,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DECIMAL_DIGIT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DECIMAL_DIGIT_0, grammarAccess.getDecimalsAccess().getDECIMAL_DIGITTerminalRuleCall_0());
              		
            }
            // InternalGo.g:4371:3: (this_DECIMAL_DIGIT_1= RULE_DECIMAL_DIGIT )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==RULE_DECIMAL_DIGIT) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalGo.g:4372:4: this_DECIMAL_DIGIT_1= RULE_DECIMAL_DIGIT
            	    {
            	    this_DECIMAL_DIGIT_1=(Token)match(input,RULE_DECIMAL_DIGIT,FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DECIMAL_DIGIT_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DECIMAL_DIGIT_1, grammarAccess.getDecimalsAccess().getDECIMAL_DIGITTerminalRuleCall_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruledecimals"


    // $ANTLR start "entryRuleexponent"
    // InternalGo.g:4384:1: entryRuleexponent returns [String current=null] : iv_ruleexponent= ruleexponent EOF ;
    public final String entryRuleexponent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexponent = null;


        try {
            // InternalGo.g:4384:48: (iv_ruleexponent= ruleexponent EOF )
            // InternalGo.g:4385:2: iv_ruleexponent= ruleexponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexponent=ruleexponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexponent.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleexponent"


    // $ANTLR start "ruleexponent"
    // InternalGo.g:4391:1: ruleexponent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_decimals_4= ruledecimals ) ;
    public final AntlrDatatypeRuleToken ruleexponent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_decimals_4 = null;



        	enterRule();

        try {
            // InternalGo.g:4397:2: ( ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_decimals_4= ruledecimals ) )
            // InternalGo.g:4398:2: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_decimals_4= ruledecimals )
            {
            // InternalGo.g:4398:2: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_decimals_4= ruledecimals )
            // InternalGo.g:4399:3: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_decimals_4= ruledecimals
            {
            // InternalGo.g:4399:3: (kw= 'e' | kw= 'E' )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==68) ) {
                alt71=1;
            }
            else if ( (LA71_0==69) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalGo.g:4400:4: kw= 'e'
                    {
                    kw=(Token)match(input,68,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExponentAccess().getEKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:4406:4: kw= 'E'
                    {
                    kw=(Token)match(input,69,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExponentAccess().getEKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:4412:3: (kw= '+' | kw= '-' )?
            int alt72=3;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==48) ) {
                alt72=1;
            }
            else if ( (LA72_0==49) ) {
                alt72=2;
            }
            switch (alt72) {
                case 1 :
                    // InternalGo.g:4413:4: kw= '+'
                    {
                    kw=(Token)match(input,48,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExponentAccess().getPlusSignKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:4419:4: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExponentAccess().getHyphenMinusKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExponentAccess().getDecimalsParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_decimals_4=ruledecimals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_decimals_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleexponent"


    // $ANTLR start "entryRulerune_lit"
    // InternalGo.g:4439:1: entryRulerune_lit returns [String current=null] : iv_rulerune_lit= rulerune_lit EOF ;
    public final String entryRulerune_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerune_lit = null;


        try {
            // InternalGo.g:4439:48: (iv_rulerune_lit= rulerune_lit EOF )
            // InternalGo.g:4440:2: iv_rulerune_lit= rulerune_lit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRune_litRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerune_lit=rulerune_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerune_lit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulerune_lit"


    // $ANTLR start "rulerune_lit"
    // InternalGo.g:4446:1: rulerune_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\'' (this_unicode_value_1= ruleunicode_value | this_byte_value_2= rulebyte_value ) kw= '\\'' ) ;
    public final AntlrDatatypeRuleToken rulerune_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_unicode_value_1 = null;

        AntlrDatatypeRuleToken this_byte_value_2 = null;



        	enterRule();

        try {
            // InternalGo.g:4452:2: ( (kw= '\\'' (this_unicode_value_1= ruleunicode_value | this_byte_value_2= rulebyte_value ) kw= '\\'' ) )
            // InternalGo.g:4453:2: (kw= '\\'' (this_unicode_value_1= ruleunicode_value | this_byte_value_2= rulebyte_value ) kw= '\\'' )
            {
            // InternalGo.g:4453:2: (kw= '\\'' (this_unicode_value_1= ruleunicode_value | this_byte_value_2= rulebyte_value ) kw= '\\'' )
            // InternalGo.g:4454:3: kw= '\\'' (this_unicode_value_1= ruleunicode_value | this_byte_value_2= rulebyte_value ) kw= '\\''
            {
            kw=(Token)match(input,64,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRune_litAccess().getApostropheKeyword_0());
              		
            }
            // InternalGo.g:4459:3: (this_unicode_value_1= ruleunicode_value | this_byte_value_2= rulebyte_value )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_LETTER) ) {
                alt73=1;
            }
            else if ( (LA73_0==64) ) {
                int LA73_2 = input.LA(2);

                if ( ((LA73_2>=64 && LA73_2<=65)||(LA73_2>=70 && LA73_2<=78)) ) {
                    alt73=1;
                }
                else if ( (LA73_2==RULE_OCTAL_DIGIT||LA73_2==62) ) {
                    alt73=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalGo.g:4460:4: this_unicode_value_1= ruleunicode_value
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRune_litAccess().getUnicode_valueParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_54);
                    this_unicode_value_1=ruleunicode_value();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_unicode_value_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:4471:4: this_byte_value_2= rulebyte_value
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRune_litAccess().getByte_valueParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_54);
                    this_byte_value_2=rulebyte_value();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_byte_value_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRune_litAccess().getApostropheKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulerune_lit"


    // $ANTLR start "entryRuleunicode_value"
    // InternalGo.g:4491:1: entryRuleunicode_value returns [String current=null] : iv_ruleunicode_value= ruleunicode_value EOF ;
    public final String entryRuleunicode_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunicode_value = null;


        try {
            // InternalGo.g:4491:53: (iv_ruleunicode_value= ruleunicode_value EOF )
            // InternalGo.g:4492:2: iv_ruleunicode_value= ruleunicode_value EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnicode_valueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleunicode_value=ruleunicode_value();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunicode_value.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleunicode_value"


    // $ANTLR start "ruleunicode_value"
    // InternalGo.g:4498:1: ruleunicode_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LETTER_0= RULE_LETTER | this_little_u_value_1= rulelittle_u_value | this_big_u_value_2= rulebig_u_value | this_escaped_char_3= ruleescaped_char ) ;
    public final AntlrDatatypeRuleToken ruleunicode_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LETTER_0=null;
        AntlrDatatypeRuleToken this_little_u_value_1 = null;

        AntlrDatatypeRuleToken this_big_u_value_2 = null;

        AntlrDatatypeRuleToken this_escaped_char_3 = null;



        	enterRule();

        try {
            // InternalGo.g:4504:2: ( (this_LETTER_0= RULE_LETTER | this_little_u_value_1= rulelittle_u_value | this_big_u_value_2= rulebig_u_value | this_escaped_char_3= ruleescaped_char ) )
            // InternalGo.g:4505:2: (this_LETTER_0= RULE_LETTER | this_little_u_value_1= rulelittle_u_value | this_big_u_value_2= rulebig_u_value | this_escaped_char_3= ruleescaped_char )
            {
            // InternalGo.g:4505:2: (this_LETTER_0= RULE_LETTER | this_little_u_value_1= rulelittle_u_value | this_big_u_value_2= rulebig_u_value | this_escaped_char_3= ruleescaped_char )
            int alt74=4;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_LETTER) ) {
                alt74=1;
            }
            else if ( (LA74_0==64) ) {
                switch ( input.LA(2) ) {
                case 71:
                    {
                    alt74=3;
                    }
                    break;
                case 64:
                case 65:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                    {
                    alt74=4;
                    }
                    break;
                case 70:
                    {
                    alt74=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalGo.g:4506:3: this_LETTER_0= RULE_LETTER
                    {
                    this_LETTER_0=(Token)match(input,RULE_LETTER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LETTER_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_LETTER_0, grammarAccess.getUnicode_valueAccess().getLETTERTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:4514:3: this_little_u_value_1= rulelittle_u_value
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnicode_valueAccess().getLittle_u_valueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_little_u_value_1=rulelittle_u_value();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_little_u_value_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:4525:3: this_big_u_value_2= rulebig_u_value
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnicode_valueAccess().getBig_u_valueParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_big_u_value_2=rulebig_u_value();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_big_u_value_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:4536:3: this_escaped_char_3= ruleescaped_char
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnicode_valueAccess().getEscaped_charParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_escaped_char_3=ruleescaped_char();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_escaped_char_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleunicode_value"


    // $ANTLR start "entryRulebyte_value"
    // InternalGo.g:4550:1: entryRulebyte_value returns [String current=null] : iv_rulebyte_value= rulebyte_value EOF ;
    public final String entryRulebyte_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebyte_value = null;


        try {
            // InternalGo.g:4550:50: (iv_rulebyte_value= rulebyte_value EOF )
            // InternalGo.g:4551:2: iv_rulebyte_value= rulebyte_value EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getByte_valueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulebyte_value=rulebyte_value();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebyte_value.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulebyte_value"


    // $ANTLR start "rulebyte_value"
    // InternalGo.g:4557:1: rulebyte_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_octal_byte_value_0= ruleoctal_byte_value | this_hex_byte_value_1= rulehex_byte_value ) ;
    public final AntlrDatatypeRuleToken rulebyte_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_octal_byte_value_0 = null;

        AntlrDatatypeRuleToken this_hex_byte_value_1 = null;



        	enterRule();

        try {
            // InternalGo.g:4563:2: ( (this_octal_byte_value_0= ruleoctal_byte_value | this_hex_byte_value_1= rulehex_byte_value ) )
            // InternalGo.g:4564:2: (this_octal_byte_value_0= ruleoctal_byte_value | this_hex_byte_value_1= rulehex_byte_value )
            {
            // InternalGo.g:4564:2: (this_octal_byte_value_0= ruleoctal_byte_value | this_hex_byte_value_1= rulehex_byte_value )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==64) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==62) ) {
                    alt75=2;
                }
                else if ( (LA75_1==RULE_OCTAL_DIGIT) ) {
                    alt75=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalGo.g:4565:3: this_octal_byte_value_0= ruleoctal_byte_value
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getByte_valueAccess().getOctal_byte_valueParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_octal_byte_value_0=ruleoctal_byte_value();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_octal_byte_value_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:4576:3: this_hex_byte_value_1= rulehex_byte_value
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getByte_valueAccess().getHex_byte_valueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_hex_byte_value_1=rulehex_byte_value();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_hex_byte_value_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulebyte_value"


    // $ANTLR start "entryRuleoctal_byte_value"
    // InternalGo.g:4590:1: entryRuleoctal_byte_value returns [String current=null] : iv_ruleoctal_byte_value= ruleoctal_byte_value EOF ;
    public final String entryRuleoctal_byte_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoctal_byte_value = null;


        try {
            // InternalGo.g:4590:56: (iv_ruleoctal_byte_value= ruleoctal_byte_value EOF )
            // InternalGo.g:4591:2: iv_ruleoctal_byte_value= ruleoctal_byte_value EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOctal_byte_valueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleoctal_byte_value=ruleoctal_byte_value();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleoctal_byte_value.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleoctal_byte_value"


    // $ANTLR start "ruleoctal_byte_value"
    // InternalGo.g:4597:1: ruleoctal_byte_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHAR_0= ruleCHAR this_OCTAL_DIGIT_1= RULE_OCTAL_DIGIT this_OCTAL_DIGIT_2= RULE_OCTAL_DIGIT this_OCTAL_DIGIT_3= RULE_OCTAL_DIGIT ) ;
    public final AntlrDatatypeRuleToken ruleoctal_byte_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OCTAL_DIGIT_1=null;
        Token this_OCTAL_DIGIT_2=null;
        Token this_OCTAL_DIGIT_3=null;
        AntlrDatatypeRuleToken this_CHAR_0 = null;



        	enterRule();

        try {
            // InternalGo.g:4603:2: ( (this_CHAR_0= ruleCHAR this_OCTAL_DIGIT_1= RULE_OCTAL_DIGIT this_OCTAL_DIGIT_2= RULE_OCTAL_DIGIT this_OCTAL_DIGIT_3= RULE_OCTAL_DIGIT ) )
            // InternalGo.g:4604:2: (this_CHAR_0= ruleCHAR this_OCTAL_DIGIT_1= RULE_OCTAL_DIGIT this_OCTAL_DIGIT_2= RULE_OCTAL_DIGIT this_OCTAL_DIGIT_3= RULE_OCTAL_DIGIT )
            {
            // InternalGo.g:4604:2: (this_CHAR_0= ruleCHAR this_OCTAL_DIGIT_1= RULE_OCTAL_DIGIT this_OCTAL_DIGIT_2= RULE_OCTAL_DIGIT this_OCTAL_DIGIT_3= RULE_OCTAL_DIGIT )
            // InternalGo.g:4605:3: this_CHAR_0= ruleCHAR this_OCTAL_DIGIT_1= RULE_OCTAL_DIGIT this_OCTAL_DIGIT_2= RULE_OCTAL_DIGIT this_OCTAL_DIGIT_3= RULE_OCTAL_DIGIT
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOctal_byte_valueAccess().getCHARParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_59);
            this_CHAR_0=ruleCHAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_CHAR_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_OCTAL_DIGIT_1=(Token)match(input,RULE_OCTAL_DIGIT,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_OCTAL_DIGIT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OCTAL_DIGIT_1, grammarAccess.getOctal_byte_valueAccess().getOCTAL_DIGITTerminalRuleCall_1());
              		
            }
            this_OCTAL_DIGIT_2=(Token)match(input,RULE_OCTAL_DIGIT,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_OCTAL_DIGIT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OCTAL_DIGIT_2, grammarAccess.getOctal_byte_valueAccess().getOCTAL_DIGITTerminalRuleCall_2());
              		
            }
            this_OCTAL_DIGIT_3=(Token)match(input,RULE_OCTAL_DIGIT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_OCTAL_DIGIT_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OCTAL_DIGIT_3, grammarAccess.getOctal_byte_valueAccess().getOCTAL_DIGITTerminalRuleCall_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleoctal_byte_value"


    // $ANTLR start "entryRulehex_byte_value"
    // InternalGo.g:4640:1: entryRulehex_byte_value returns [String current=null] : iv_rulehex_byte_value= rulehex_byte_value EOF ;
    public final String entryRulehex_byte_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulehex_byte_value = null;


        try {
            // InternalGo.g:4640:54: (iv_rulehex_byte_value= rulehex_byte_value EOF )
            // InternalGo.g:4641:2: iv_rulehex_byte_value= rulehex_byte_value EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHex_byte_valueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulehex_byte_value=rulehex_byte_value();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulehex_byte_value.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulehex_byte_value"


    // $ANTLR start "rulehex_byte_value"
    // InternalGo.g:4647:1: rulehex_byte_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHAR_0= ruleCHAR kw= 'x' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT ) ;
    public final AntlrDatatypeRuleToken rulehex_byte_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_HEX_DIGIT_2=null;
        Token this_HEX_DIGIT_3=null;
        AntlrDatatypeRuleToken this_CHAR_0 = null;



        	enterRule();

        try {
            // InternalGo.g:4653:2: ( (this_CHAR_0= ruleCHAR kw= 'x' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT ) )
            // InternalGo.g:4654:2: (this_CHAR_0= ruleCHAR kw= 'x' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT )
            {
            // InternalGo.g:4654:2: (this_CHAR_0= ruleCHAR kw= 'x' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT )
            // InternalGo.g:4655:3: this_CHAR_0= ruleCHAR kw= 'x' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getHex_byte_valueAccess().getCHARParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_CHAR_0=ruleCHAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_CHAR_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,62,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getHex_byte_valueAccess().getXKeyword_1());
              		
            }
            this_HEX_DIGIT_2=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_HEX_DIGIT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HEX_DIGIT_2, grammarAccess.getHex_byte_valueAccess().getHEX_DIGITTerminalRuleCall_2());
              		
            }
            this_HEX_DIGIT_3=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_HEX_DIGIT_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HEX_DIGIT_3, grammarAccess.getHex_byte_valueAccess().getHEX_DIGITTerminalRuleCall_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulehex_byte_value"


    // $ANTLR start "entryRulelittle_u_value"
    // InternalGo.g:4688:1: entryRulelittle_u_value returns [String current=null] : iv_rulelittle_u_value= rulelittle_u_value EOF ;
    public final String entryRulelittle_u_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelittle_u_value = null;


        try {
            // InternalGo.g:4688:54: (iv_rulelittle_u_value= rulelittle_u_value EOF )
            // InternalGo.g:4689:2: iv_rulelittle_u_value= rulelittle_u_value EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLittle_u_valueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulelittle_u_value=rulelittle_u_value();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelittle_u_value.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulelittle_u_value"


    // $ANTLR start "rulelittle_u_value"
    // InternalGo.g:4695:1: rulelittle_u_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHAR_0= ruleCHAR kw= 'u' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT ) ;
    public final AntlrDatatypeRuleToken rulelittle_u_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_HEX_DIGIT_2=null;
        Token this_HEX_DIGIT_3=null;
        Token this_HEX_DIGIT_4=null;
        Token this_HEX_DIGIT_5=null;
        AntlrDatatypeRuleToken this_CHAR_0 = null;



        	enterRule();

        try {
            // InternalGo.g:4701:2: ( (this_CHAR_0= ruleCHAR kw= 'u' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT ) )
            // InternalGo.g:4702:2: (this_CHAR_0= ruleCHAR kw= 'u' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT )
            {
            // InternalGo.g:4702:2: (this_CHAR_0= ruleCHAR kw= 'u' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT )
            // InternalGo.g:4703:3: this_CHAR_0= ruleCHAR kw= 'u' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLittle_u_valueAccess().getCHARParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_61);
            this_CHAR_0=ruleCHAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_CHAR_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,70,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getLittle_u_valueAccess().getUKeyword_1());
              		
            }
            this_HEX_DIGIT_2=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_HEX_DIGIT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HEX_DIGIT_2, grammarAccess.getLittle_u_valueAccess().getHEX_DIGITTerminalRuleCall_2());
              		
            }
            this_HEX_DIGIT_3=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_HEX_DIGIT_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HEX_DIGIT_3, grammarAccess.getLittle_u_valueAccess().getHEX_DIGITTerminalRuleCall_3());
              		
            }
            this_HEX_DIGIT_4=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_HEX_DIGIT_4);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HEX_DIGIT_4, grammarAccess.getLittle_u_valueAccess().getHEX_DIGITTerminalRuleCall_4());
              		
            }
            this_HEX_DIGIT_5=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_HEX_DIGIT_5);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HEX_DIGIT_5, grammarAccess.getLittle_u_valueAccess().getHEX_DIGITTerminalRuleCall_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulelittle_u_value"


    // $ANTLR start "entryRulebig_u_value"
    // InternalGo.g:4750:1: entryRulebig_u_value returns [String current=null] : iv_rulebig_u_value= rulebig_u_value EOF ;
    public final String entryRulebig_u_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebig_u_value = null;


        try {
            // InternalGo.g:4750:51: (iv_rulebig_u_value= rulebig_u_value EOF )
            // InternalGo.g:4751:2: iv_rulebig_u_value= rulebig_u_value EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBig_u_valueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulebig_u_value=rulebig_u_value();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebig_u_value.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulebig_u_value"


    // $ANTLR start "rulebig_u_value"
    // InternalGo.g:4757:1: rulebig_u_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHAR_0= ruleCHAR kw= 'U' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT this_HEX_DIGIT_6= RULE_HEX_DIGIT this_HEX_DIGIT_7= RULE_HEX_DIGIT this_HEX_DIGIT_8= RULE_HEX_DIGIT this_HEX_DIGIT_9= RULE_HEX_DIGIT ) ;
    public final AntlrDatatypeRuleToken rulebig_u_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_HEX_DIGIT_2=null;
        Token this_HEX_DIGIT_3=null;
        Token this_HEX_DIGIT_4=null;
        Token this_HEX_DIGIT_5=null;
        Token this_HEX_DIGIT_6=null;
        Token this_HEX_DIGIT_7=null;
        Token this_HEX_DIGIT_8=null;
        Token this_HEX_DIGIT_9=null;
        AntlrDatatypeRuleToken this_CHAR_0 = null;



        	enterRule();

        try {
            // InternalGo.g:4763:2: ( (this_CHAR_0= ruleCHAR kw= 'U' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT this_HEX_DIGIT_6= RULE_HEX_DIGIT this_HEX_DIGIT_7= RULE_HEX_DIGIT this_HEX_DIGIT_8= RULE_HEX_DIGIT this_HEX_DIGIT_9= RULE_HEX_DIGIT ) )
            // InternalGo.g:4764:2: (this_CHAR_0= ruleCHAR kw= 'U' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT this_HEX_DIGIT_6= RULE_HEX_DIGIT this_HEX_DIGIT_7= RULE_HEX_DIGIT this_HEX_DIGIT_8= RULE_HEX_DIGIT this_HEX_DIGIT_9= RULE_HEX_DIGIT )
            {
            // InternalGo.g:4764:2: (this_CHAR_0= ruleCHAR kw= 'U' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT this_HEX_DIGIT_6= RULE_HEX_DIGIT this_HEX_DIGIT_7= RULE_HEX_DIGIT this_HEX_DIGIT_8= RULE_HEX_DIGIT this_HEX_DIGIT_9= RULE_HEX_DIGIT )
            // InternalGo.g:4765:3: this_CHAR_0= ruleCHAR kw= 'U' this_HEX_DIGIT_2= RULE_HEX_DIGIT this_HEX_DIGIT_3= RULE_HEX_DIGIT this_HEX_DIGIT_4= RULE_HEX_DIGIT this_HEX_DIGIT_5= RULE_HEX_DIGIT this_HEX_DIGIT_6= RULE_HEX_DIGIT this_HEX_DIGIT_7= RULE_HEX_DIGIT this_HEX_DIGIT_8= RULE_HEX_DIGIT this_HEX_DIGIT_9= RULE_HEX_DIGIT
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBig_u_valueAccess().getCHARParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_62);
            this_CHAR_0=ruleCHAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_CHAR_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,71,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBig_u_valueAccess().getUKeyword_1());
              		
            }
            this_HEX_DIGIT_2=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_HEX_DIGIT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HEX_DIGIT_2, grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_2());
              		
            }
            this_HEX_DIGIT_3=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_HEX_DIGIT_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HEX_DIGIT_3, grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_3());
              		
            }
            this_HEX_DIGIT_4=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_HEX_DIGIT_4);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HEX_DIGIT_4, grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_4());
              		
            }
            this_HEX_DIGIT_5=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_HEX_DIGIT_5);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HEX_DIGIT_5, grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_5());
              		
            }
            this_HEX_DIGIT_6=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_HEX_DIGIT_6);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HEX_DIGIT_6, grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_6());
              		
            }
            this_HEX_DIGIT_7=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_HEX_DIGIT_7);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HEX_DIGIT_7, grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_7());
              		
            }
            this_HEX_DIGIT_8=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_HEX_DIGIT_8);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HEX_DIGIT_8, grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_8());
              		
            }
            this_HEX_DIGIT_9=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_HEX_DIGIT_9);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HEX_DIGIT_9, grammarAccess.getBig_u_valueAccess().getHEX_DIGITTerminalRuleCall_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulebig_u_value"


    // $ANTLR start "entryRuleescaped_char"
    // InternalGo.g:4840:1: entryRuleescaped_char returns [String current=null] : iv_ruleescaped_char= ruleescaped_char EOF ;
    public final String entryRuleescaped_char() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleescaped_char = null;


        try {
            // InternalGo.g:4840:52: (iv_ruleescaped_char= ruleescaped_char EOF )
            // InternalGo.g:4841:2: iv_ruleescaped_char= ruleescaped_char EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEscaped_charRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleescaped_char=ruleescaped_char();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleescaped_char.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleescaped_char"


    // $ANTLR start "ruleescaped_char"
    // InternalGo.g:4847:1: ruleescaped_char returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHAR_0= ruleCHAR (kw= 'a' | kw= 'b' | kw= 'f' | kw= 'n' | kw= 'r' | kw= 't' | kw= 'v' | this_CHAR_8= ruleCHAR | kw= '\\'' | kw= '\"' ) ) ;
    public final AntlrDatatypeRuleToken ruleescaped_char() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CHAR_0 = null;

        AntlrDatatypeRuleToken this_CHAR_8 = null;



        	enterRule();

        try {
            // InternalGo.g:4853:2: ( (this_CHAR_0= ruleCHAR (kw= 'a' | kw= 'b' | kw= 'f' | kw= 'n' | kw= 'r' | kw= 't' | kw= 'v' | this_CHAR_8= ruleCHAR | kw= '\\'' | kw= '\"' ) ) )
            // InternalGo.g:4854:2: (this_CHAR_0= ruleCHAR (kw= 'a' | kw= 'b' | kw= 'f' | kw= 'n' | kw= 'r' | kw= 't' | kw= 'v' | this_CHAR_8= ruleCHAR | kw= '\\'' | kw= '\"' ) )
            {
            // InternalGo.g:4854:2: (this_CHAR_0= ruleCHAR (kw= 'a' | kw= 'b' | kw= 'f' | kw= 'n' | kw= 'r' | kw= 't' | kw= 'v' | this_CHAR_8= ruleCHAR | kw= '\\'' | kw= '\"' ) )
            // InternalGo.g:4855:3: this_CHAR_0= ruleCHAR (kw= 'a' | kw= 'b' | kw= 'f' | kw= 'n' | kw= 'r' | kw= 't' | kw= 'v' | this_CHAR_8= ruleCHAR | kw= '\\'' | kw= '\"' )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEscaped_charAccess().getCHARParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_63);
            this_CHAR_0=ruleCHAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_CHAR_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:4865:3: (kw= 'a' | kw= 'b' | kw= 'f' | kw= 'n' | kw= 'r' | kw= 't' | kw= 'v' | this_CHAR_8= ruleCHAR | kw= '\\'' | kw= '\"' )
            int alt76=10;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // InternalGo.g:4866:4: kw= 'a'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getAKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:4872:4: kw= 'b'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getBKeyword_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:4878:4: kw= 'f'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getFKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:4884:4: kw= 'n'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getNKeyword_1_3());
                      			
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:4890:4: kw= 'r'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getRKeyword_1_4());
                      			
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:4896:4: kw= 't'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getTKeyword_1_5());
                      			
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:4902:4: kw= 'v'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getVKeyword_1_6());
                      			
                    }

                    }
                    break;
                case 8 :
                    // InternalGo.g:4908:4: this_CHAR_8= ruleCHAR
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getEscaped_charAccess().getCHARParserRuleCall_1_7());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_CHAR_8=ruleCHAR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_CHAR_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 9 :
                    // InternalGo.g:4919:4: kw= '\\''
                    {
                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getApostropheKeyword_1_8());
                      			
                    }

                    }
                    break;
                case 10 :
                    // InternalGo.g:4925:4: kw= '\"'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEscaped_charAccess().getQuotationMarkKeyword_1_9());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleescaped_char"


    // $ANTLR start "entryRuleCHAR"
    // InternalGo.g:4935:1: entryRuleCHAR returns [String current=null] : iv_ruleCHAR= ruleCHAR EOF ;
    public final String entryRuleCHAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCHAR = null;


        try {
            // InternalGo.g:4935:44: (iv_ruleCHAR= ruleCHAR EOF )
            // InternalGo.g:4936:2: iv_ruleCHAR= ruleCHAR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCHARRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCHAR=ruleCHAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCHAR.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCHAR"


    // $ANTLR start "ruleCHAR"
    // InternalGo.g:4942:1: ruleCHAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\'' ;
    public final AntlrDatatypeRuleToken ruleCHAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:4948:2: (kw= '\\'' )
            // InternalGo.g:4949:2: kw= '\\''
            {
            kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getCHARAccess().getApostropheKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCHAR"

    // $ANTLR start synpred13_InternalGo
    public final void synpred13_InternalGo_fragment() throws RecognitionException {   
        EObject this_Type_1 = null;


        // InternalGo.g:607:4: ( ( ruleIdentifierList this_Type_1= ruleType ) )
        // InternalGo.g:607:4: ( ruleIdentifierList this_Type_1= ruleType )
        {
        // InternalGo.g:607:4: ( ruleIdentifierList this_Type_1= ruleType )
        // InternalGo.g:608:5: ruleIdentifierList this_Type_1= ruleType
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }
        pushFollow(FOLLOW_6);
        ruleIdentifierList();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_Type_1=ruleType();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalGo

    // $ANTLR start synpred16_InternalGo
    public final void synpred16_InternalGo_fragment() throws RecognitionException {   
        EObject lv_Result_1_0 = null;


        // InternalGo.g:860:4: ( (lv_Result_1_0= ruleResult ) )
        // InternalGo.g:860:4: (lv_Result_1_0= ruleResult )
        {
        // InternalGo.g:860:4: (lv_Result_1_0= ruleResult )
        // InternalGo.g:861:5: lv_Result_1_0= ruleResult
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getSignatureAccess().getResultResultParserRuleCall_1_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_Result_1_0=ruleResult();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalGo

    // $ANTLR start synpred17_InternalGo
    public final void synpred17_InternalGo_fragment() throws RecognitionException {   
        EObject this_Parameters_0 = null;


        // InternalGo.g:897:3: (this_Parameters_0= ruleParameters )
        // InternalGo.g:897:3: this_Parameters_0= ruleParameters
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Parameters_0=ruleParameters();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalGo

    // $ANTLR start synpred21_InternalGo
    public final void synpred21_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1041:4: ( ruleIdentifierList )
        // InternalGo.g:1041:4: ruleIdentifierList
        {
        if ( state.backtracking==0 ) {

          				/* */
          			
        }
        pushFollow(FOLLOW_2);
        ruleIdentifierList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalGo

    // $ANTLR start synpred25_InternalGo
    public final void synpred25_InternalGo_fragment() throws RecognitionException {   
        Token otherlv_0=null;

        // InternalGo.g:1349:4: (otherlv_0= 'chan' )
        // InternalGo.g:1349:4: otherlv_0= 'chan'
        {
        otherlv_0=(Token)match(input,31,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalGo

    // $ANTLR start synpred26_InternalGo
    public final void synpred26_InternalGo_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        Token otherlv_2=null;

        // InternalGo.g:1354:4: ( (otherlv_1= 'chan' otherlv_2= '<-' ) )
        // InternalGo.g:1354:4: (otherlv_1= 'chan' otherlv_2= '<-' )
        {
        // InternalGo.g:1354:4: (otherlv_1= 'chan' otherlv_2= '<-' )
        // InternalGo.g:1355:5: otherlv_1= 'chan' otherlv_2= '<-'
        {
        otherlv_1=(Token)match(input,31,FOLLOW_24); if (state.failed) return ;
        otherlv_2=(Token)match(input,32,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalGo

    // $ANTLR start synpred62_InternalGo
    public final void synpred62_InternalGo_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject this_Key_0 = null;


        // InternalGo.g:2893:4: (this_Key_0= ruleKey otherlv_1= ':' )
        // InternalGo.g:2893:4: this_Key_0= ruleKey otherlv_1= ':'
        {
        if ( state.backtracking==0 ) {

          				/* */
          			
        }
        pushFollow(FOLLOW_40);
        this_Key_0=ruleKey();

        state._fsp--;
        if (state.failed) return ;
        otherlv_1=(Token)match(input,38,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalGo

    // $ANTLR start synpred65_InternalGo
    public final void synpred65_InternalGo_fragment() throws RecognitionException {   
        EObject this_Operand_0 = null;

        AntlrDatatypeRuleToken lv_PrimaryExprLinha_1_0 = null;


        // InternalGo.g:3080:3: ( (this_Operand_0= ruleOperand ( (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha ) ) ) )
        // InternalGo.g:3080:3: (this_Operand_0= ruleOperand ( (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha ) ) )
        {
        // InternalGo.g:3080:3: (this_Operand_0= ruleOperand ( (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha ) ) )
        // InternalGo.g:3081:4: this_Operand_0= ruleOperand ( (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha ) )
        {
        if ( state.backtracking==0 ) {

          				/* */
          			
        }
        pushFollow(FOLLOW_41);
        this_Operand_0=ruleOperand();

        state._fsp--;
        if (state.failed) return ;
        // InternalGo.g:3092:4: ( (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha ) )
        // InternalGo.g:3093:5: (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha )
        {
        // InternalGo.g:3093:5: (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha )
        // InternalGo.g:3094:6: lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaPrimaryExprLinhaParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_PrimaryExprLinha_1_0=rulePrimaryExprLinha();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred65_InternalGo

    // $ANTLR start synpred66_InternalGo
    public final void synpred66_InternalGo_fragment() throws RecognitionException {   
        EObject this_Conversion_2 = null;

        AntlrDatatypeRuleToken lv_PrimaryExprLinha_3_0 = null;


        // InternalGo.g:3113:3: ( (this_Conversion_2= ruleConversion ( (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha ) ) ) )
        // InternalGo.g:3113:3: (this_Conversion_2= ruleConversion ( (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha ) ) )
        {
        // InternalGo.g:3113:3: (this_Conversion_2= ruleConversion ( (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha ) ) )
        // InternalGo.g:3114:4: this_Conversion_2= ruleConversion ( (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha ) )
        {
        if ( state.backtracking==0 ) {

          				/* */
          			
        }
        pushFollow(FOLLOW_41);
        this_Conversion_2=ruleConversion();

        state._fsp--;
        if (state.failed) return ;
        // InternalGo.g:3125:4: ( (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha ) )
        // InternalGo.g:3126:5: (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha )
        {
        // InternalGo.g:3126:5: (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha )
        // InternalGo.g:3127:6: lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaPrimaryExprLinhaParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_PrimaryExprLinha_3_0=rulePrimaryExprLinha();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred66_InternalGo

    // $ANTLR start synpred68_InternalGo
    public final void synpred68_InternalGo_fragment() throws RecognitionException {   
        EObject lv_PrimaryExpr_0_0 = null;


        // InternalGo.g:3380:3: ( ( (lv_PrimaryExpr_0_0= rulePrimaryExpr ) ) )
        // InternalGo.g:3380:3: ( (lv_PrimaryExpr_0_0= rulePrimaryExpr ) )
        {
        // InternalGo.g:3380:3: ( (lv_PrimaryExpr_0_0= rulePrimaryExpr ) )
        // InternalGo.g:3381:4: (lv_PrimaryExpr_0_0= rulePrimaryExpr )
        {
        // InternalGo.g:3381:4: (lv_PrimaryExpr_0_0= rulePrimaryExpr )
        // InternalGo.g:3382:5: lv_PrimaryExpr_0_0= rulePrimaryExpr
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getUnaryExprAccess().getPrimaryExprPrimaryExprParserRuleCall_0_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_PrimaryExpr_0_0=rulePrimaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred68_InternalGo

    // $ANTLR start synpred94_InternalGo
    public final void synpred94_InternalGo_fragment() throws RecognitionException {   
        Token this_LETTER_1=null;

        // InternalGo.g:3836:4: (this_LETTER_1= RULE_LETTER )
        // InternalGo.g:3836:4: this_LETTER_1= RULE_LETTER
        {
        this_LETTER_1=(Token)match(input,RULE_LETTER,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred94_InternalGo

    // $ANTLR start synpred131_InternalGo
    public final void synpred131_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_CHAR_8 = null;


        // InternalGo.g:4908:4: (this_CHAR_8= ruleCHAR )
        // InternalGo.g:4908:4: this_CHAR_8= ruleCHAR
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getEscaped_charAccess().getCHARParserRuleCall_1_7());
          			
        }
        pushFollow(FOLLOW_2);
        this_CHAR_8=ruleCHAR();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred131_InternalGo

    // $ANTLR start synpred132_InternalGo
    public final void synpred132_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;

        // InternalGo.g:4919:4: (kw= '\\'' )
        // InternalGo.g:4919:4: kw= '\\''
        {
        kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred132_InternalGo

    // Delegated rules

    public final boolean synpred132_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred131_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred131_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA76 dfa76 = new DFA76(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\23\1\5\10\uffff";
    static final String dfa_3s = "\1\40\1\101\10\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\3\1\4\1\5\1\7\1\10\1\1\1\6";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\2\uffff\1\3\1\4\2\uffff\1\5\1\uffff\1\6\2\7",
            "\2\10\11\uffff\2\10\1\uffff\1\10\1\11\1\10\2\uffff\2\10\2\uffff\1\10\1\uffff\3\10\4\uffff\1\10\12\uffff\2\10\6\uffff\1\10\1\uffff\1\10\1\uffff\2\10\2\uffff\2\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "276:2: (this_ArrayType_0= ruleArrayType | this_StructType_1= ruleStructType | this_PointerType_2= rulePointerType | this_FunctionType_3= ruleFunctionType | this_InterfaceType_4= ruleInterfaceType | this_SliceType_5= ruleSliceType | this_MapType_6= ruleMapType | this_ChannelType_7= ruleChannelType )";
        }
    }
    static final String dfa_7s = "\6\uffff";
    static final String dfa_8s = "\1\uffff\1\2\2\uffff\1\2\1\uffff";
    static final String dfa_9s = "\2\5\1\uffff\1\0\1\5\1\uffff";
    static final String dfa_10s = "\1\74\1\101\1\uffff\1\0\1\101\1\uffff";
    static final String dfa_11s = "\2\uffff\1\2\2\uffff\1\1";
    static final String dfa_12s = "\3\uffff\1\0\2\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\22\uffff\1\2\43\uffff\1\2",
            "\1\3\1\4\12\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\2\3\5\1\uffff\1\5\1\uffff\3\5\33\uffff\1\5\3\uffff\2\2",
            "",
            "\1\uffff",
            "\1\3\1\4\12\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\2\3\5\1\uffff\1\5\1\uffff\3\5\33\uffff\1\5\3\uffff\2\2",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "606:3: ( ( ruleIdentifierList this_Type_1= ruleType ) | ruleEmbeddedField )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_3 = input.LA(1);

                         
                        int index6_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalGo()) ) {s = 5;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index6_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\26\uffff";
    static final String dfa_15s = "\1\14\25\uffff";
    static final String dfa_16s = "\1\5\1\0\24\uffff";
    static final String dfa_17s = "\1\101\1\0\24\uffff";
    static final String dfa_18s = "\2\uffff\1\1\11\uffff\1\2\11\uffff";
    static final String dfa_19s = "\1\uffff\1\0\24\uffff}>";
    static final String[] dfa_20s = {
            "\1\2\13\uffff\1\1\1\14\1\2\1\14\1\2\2\14\2\2\1\14\1\uffff\1\2\1\uffff\3\2\1\uffff\1\14\2\uffff\1\14\26\uffff\1\2\3\uffff\2\14",
            "\1\uffff",
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
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "859:3: ( (lv_Result_1_0= ruleResult ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\15\uffff";
    static final String dfa_22s = "\1\5\1\0\13\uffff";
    static final String dfa_23s = "\1\74\1\0\13\uffff";
    static final String dfa_24s = "\2\uffff\1\2\11\uffff\1\1";
    static final String dfa_25s = "\1\uffff\1\0\13\uffff}>";
    static final String[] dfa_26s = {
            "\1\2\13\uffff\1\1\1\uffff\1\2\1\uffff\1\2\2\uffff\2\2\2\uffff\1\2\1\uffff\3\2\33\uffff\1\2",
            "\1\uffff",
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
            ""
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "896:2: (this_Parameters_0= ruleParameters | this_Type_1= ruleType )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_1 = input.LA(1);

                         
                        int index10_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalGo()) ) {s = 12;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\10\uffff";
    static final String dfa_28s = "\1\uffff\1\2\2\uffff\2\2\2\uffff";
    static final String dfa_29s = "\2\5\1\uffff\1\0\2\5\1\uffff\1\0";
    static final String dfa_30s = "\2\74\1\uffff\1\0\2\74\1\uffff\1\0";
    static final String dfa_31s = "\2\uffff\1\2\3\uffff\1\1\1\uffff";
    static final String dfa_32s = "\3\uffff\1\0\3\uffff\1\1}>";
    static final String[] dfa_33s = {
            "\1\1\13\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\2\2\1\uffff\3\2\33\uffff\1\2",
            "\1\3\1\4\12\uffff\1\6\1\2\1\6\1\uffff\1\6\2\uffff\2\6\1\5\2\6\1\uffff\3\6\33\uffff\1\6",
            "",
            "\1\uffff",
            "\1\3\1\4\12\uffff\1\6\1\2\1\6\1\uffff\1\6\2\uffff\2\6\1\5\2\6\1\uffff\3\6\33\uffff\1\6",
            "\1\7\13\uffff\3\2\1\uffff\1\2\2\uffff\2\2\1\uffff\2\2\1\uffff\3\2\33\uffff\1\2",
            "",
            "\1\uffff"
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_27;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "1040:3: ( ruleIdentifierList )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGo()) ) {s = 6;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGo()) ) {s = 6;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\1\uffff\1\2\1\uffff\2\2\1\uffff";
    static final String dfa_35s = "\2\5\1\uffff\2\5\1\uffff";
    static final String dfa_36s = "\1\74\1\27\1\uffff\2\27\1\uffff";
    static final String dfa_37s = "\6\uffff}>";
    static final String[] dfa_38s = {
            "\1\1\66\uffff\1\2",
            "\1\3\1\4\12\uffff\1\5\5\uffff\1\2",
            "",
            "\1\3\1\4\12\uffff\1\5\5\uffff\1\2",
            "\1\3\1\4\12\uffff\1\5\5\uffff\1\2",
            ""
    };
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_7;
            this.eof = dfa_34;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_11;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "1143:2: ( ( ruleMethodName this_Signature_1= ruleSignature ) | ruleInterfaceTypeName )";
        }
    }
    static final String dfa_39s = "\2\uffff\1\4\3\uffff\2\4";
    static final String dfa_40s = "\4\5\2\uffff\2\5";
    static final String dfa_41s = "\1\5\3\74\2\uffff\2\74";
    static final String dfa_42s = "\4\uffff\1\2\1\1\2\uffff";
    static final String dfa_43s = "\10\uffff}>";
    static final String[] dfa_44s = {
            "\1\1",
            "\1\2\1\3\12\uffff\1\4\1\uffff\1\4\1\uffff\1\4\2\uffff\2\4\2\uffff\1\4\1\uffff\3\4\1\uffff\1\5\31\uffff\1\4",
            "\1\6\1\7\12\uffff\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\3\4\2\uffff\1\4\1\uffff\3\4\1\uffff\1\5\31\uffff\1\4",
            "\1\2\1\3\12\uffff\1\4\1\uffff\1\4\1\uffff\1\4\2\uffff\2\4\2\uffff\1\4\1\uffff\3\4\1\uffff\1\5\31\uffff\1\4",
            "",
            "",
            "\1\6\1\7\12\uffff\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\3\4\2\uffff\1\4\1\uffff\3\4\1\uffff\1\5\31\uffff\1\4",
            "\1\6\1\7\12\uffff\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\3\4\2\uffff\1\4\1\uffff\3\4\1\uffff\1\5\31\uffff\1\4"
    };
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_27;
            this.eof = dfa_39;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "1828:2: (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef )";
        }
    }
    static final String dfa_45s = "\14\uffff";
    static final String dfa_46s = "\2\uffff\1\7\2\uffff\2\7\2\uffff\3\7";
    static final String dfa_47s = "\1\5\1\uffff\1\5\1\45\1\uffff\2\5\1\uffff\4\5";
    static final String dfa_48s = "\1\101\1\uffff\1\47\1\45\1\uffff\2\47\1\uffff\1\5\3\47";
    static final String dfa_49s = "\1\uffff\1\1\2\uffff\1\3\2\uffff\1\2\4\uffff";
    static final String dfa_50s = "\14\uffff}>";
    static final String[] dfa_51s = {
            "\1\2\1\1\12\uffff\1\4\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\4\uffff\1\1\6\uffff\1\1\26\uffff\1\3\1\1\2\uffff\2\1",
            "",
            "\1\5\1\6\17\uffff\1\1\20\uffff\1\7",
            "\1\10",
            "",
            "\1\5\1\6\17\uffff\1\1\20\uffff\1\7",
            "\1\5\1\6\17\uffff\1\1\20\uffff\1\7",
            "",
            "\1\11",
            "\1\12\1\13\17\uffff\1\1\20\uffff\1\7",
            "\1\12\1\13\17\uffff\1\1\20\uffff\1\7",
            "\1\12\1\13\17\uffff\1\1\20\uffff\1\7"
    };

    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[][] dfa_51 = unpackEncodedStringArray(dfa_51s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_45;
            this.eof = dfa_46;
            this.min = dfa_47;
            this.max = dfa_48;
            this.accept = dfa_49;
            this.special = dfa_50;
            this.transition = dfa_51;
        }
        public String getDescription() {
            return "2318:2: (this_Literal_0= ruleLiteral | ruleOperandName | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )";
        }
    }
    static final String dfa_52s = "\11\uffff";
    static final String dfa_53s = "\1\uffff\1\2\4\uffff\1\2\1\uffff\1\5";
    static final String dfa_54s = "\2\6\2\uffff\1\5\1\uffff\1\6\1\uffff\1\7";
    static final String dfa_55s = "\1\101\1\105\2\uffff\1\103\1\uffff\1\105\1\uffff\1\116";
    static final String dfa_56s = "\2\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\3\1\uffff";
    static final String dfa_57s = "\11\uffff}>";
    static final String[] dfa_58s = {
            "\1\1\36\uffff\1\3\27\uffff\1\2\2\uffff\1\4\1\5",
            "\1\6\36\uffff\1\3\1\uffff\1\2\34\uffff\2\3",
            "",
            "",
            "\1\7\12\uffff\1\5\11\uffff\1\5\12\uffff\1\5\32\uffff\1\10\1\uffff\2\5",
            "",
            "\1\6\36\uffff\1\3\1\uffff\1\2\34\uffff\2\3",
            "",
            "\1\7\37\uffff\1\5\26\uffff\1\7\1\uffff\2\7\4\uffff\11\7"
    };

    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[][] dfa_58 = unpackEncodedStringArray(dfa_58s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_52;
            this.eof = dfa_53;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_56;
            this.special = dfa_57;
            this.transition = dfa_58;
        }
        public String getDescription() {
            return "2434:2: (this_int_lit_0= ruleint_lit | this_float_lit_1= rulefloat_lit | this_rune_lit_2= rulerune_lit | this_string_lit_3= rulestring_lit )";
        }
    }
    static final String dfa_59s = "\31\uffff";
    static final String dfa_60s = "\1\5\26\0\2\uffff";
    static final String dfa_61s = "\1\101\26\0\2\uffff";
    static final String dfa_62s = "\27\uffff\1\1\1\2";
    static final String dfa_63s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\2\uffff}>";
    static final String[] dfa_64s = {
            "\1\1\1\2\11\uffff\1\23\1\14\1\uffff\1\10\1\uffff\1\7\1\26\1\uffff\1\15\1\13\2\uffff\1\16\1\uffff\1\11\1\17\1\20\4\uffff\1\4\12\uffff\1\21\1\22\6\uffff\1\25\1\uffff\1\24\1\uffff\1\12\1\3\2\uffff\1\5\1\6",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final char[] dfa_61 = DFA.unpackEncodedStringToUnsignedChars(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[][] dfa_64 = unpackEncodedStringArray(dfa_64s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_59;
            this.eof = dfa_59;
            this.min = dfa_60;
            this.max = dfa_61;
            this.accept = dfa_62;
            this.special = dfa_63;
            this.transition = dfa_64;
        }
        public String getDescription() {
            return "2892:3: (this_Key_0= ruleKey otherlv_1= ':' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_1 = input.LA(1);

                         
                        int index45_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_2 = input.LA(1);

                         
                        int index45_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA45_3 = input.LA(1);

                         
                        int index45_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA45_4 = input.LA(1);

                         
                        int index45_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA45_5 = input.LA(1);

                         
                        int index45_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA45_6 = input.LA(1);

                         
                        int index45_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA45_7 = input.LA(1);

                         
                        int index45_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA45_8 = input.LA(1);

                         
                        int index45_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA45_9 = input.LA(1);

                         
                        int index45_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA45_10 = input.LA(1);

                         
                        int index45_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA45_11 = input.LA(1);

                         
                        int index45_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA45_12 = input.LA(1);

                         
                        int index45_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA45_13 = input.LA(1);

                         
                        int index45_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA45_14 = input.LA(1);

                         
                        int index45_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA45_15 = input.LA(1);

                         
                        int index45_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA45_16 = input.LA(1);

                         
                        int index45_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA45_17 = input.LA(1);

                         
                        int index45_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA45_18 = input.LA(1);

                         
                        int index45_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA45_19 = input.LA(1);

                         
                        int index45_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA45_20 = input.LA(1);

                         
                        int index45_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA45_21 = input.LA(1);

                         
                        int index45_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA45_22 = input.LA(1);

                         
                        int index45_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalGo()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index45_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_65s = "\7\uffff";
    static final String dfa_66s = "\1\uffff\1\6\2\uffff\2\6\1\uffff";
    static final String dfa_67s = "\2\5\2\uffff\2\5\1\uffff";
    static final String dfa_68s = "\1\101\1\47\2\uffff\2\47\1\uffff";
    static final String dfa_69s = "\2\uffff\1\2\1\3\2\uffff\1\1";
    static final String dfa_70s = "\7\uffff}>";
    static final String[] dfa_71s = {
            "\1\1\1\2\11\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\3\1\uffff\2\2\2\uffff\1\2\1\uffff\3\2\4\uffff\1\2\12\uffff\2\2\6\uffff\1\2\1\uffff\1\2\1\uffff\2\2\2\uffff\2\2",
            "\1\4\1\5\12\uffff\1\2\4\uffff\1\2\16\uffff\1\2\1\6\1\2",
            "",
            "",
            "\1\4\1\5\12\uffff\1\2\4\uffff\1\2\16\uffff\1\2\1\6\1\2",
            "\1\4\1\5\12\uffff\1\2\4\uffff\1\2\16\uffff\1\2\1\6\1\2",
            ""
    };

    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final char[] dfa_67 = DFA.unpackEncodedStringToUnsignedChars(dfa_67s);
    static final char[] dfa_68 = DFA.unpackEncodedStringToUnsignedChars(dfa_68s);
    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final short[][] dfa_71 = unpackEncodedStringArray(dfa_71s);

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_65;
            this.eof = dfa_66;
            this.min = dfa_67;
            this.max = dfa_68;
            this.accept = dfa_69;
            this.special = dfa_70;
            this.transition = dfa_71;
        }
        public String getDescription() {
            return "2946:2: ( ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue )";
        }
    }
    static final String dfa_72s = "\23\uffff";
    static final String dfa_73s = "\1\5\5\uffff\13\0\2\uffff";
    static final String dfa_74s = "\1\101\5\uffff\13\0\2\uffff";
    static final String dfa_75s = "\1\uffff\1\1\17\uffff\1\2\1\3";
    static final String dfa_76s = "\6\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_77s = {
            "\1\11\1\1\12\uffff\1\14\1\uffff\1\7\1\uffff\1\6\2\uffff\1\15\1\13\2\uffff\1\16\1\uffff\1\10\1\17\1\20\4\uffff\1\1\26\uffff\1\12\1\1\2\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_72 = DFA.unpackEncodedString(dfa_72s);
    static final char[] dfa_73 = DFA.unpackEncodedStringToUnsignedChars(dfa_73s);
    static final char[] dfa_74 = DFA.unpackEncodedStringToUnsignedChars(dfa_74s);
    static final short[] dfa_75 = DFA.unpackEncodedString(dfa_75s);
    static final short[] dfa_76 = DFA.unpackEncodedString(dfa_76s);
    static final short[][] dfa_77 = unpackEncodedStringArray(dfa_77s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_72;
            this.eof = dfa_72;
            this.min = dfa_73;
            this.max = dfa_74;
            this.accept = dfa_75;
            this.special = dfa_76;
            this.transition = dfa_77;
        }
        public String getDescription() {
            return "3079:2: ( (this_Operand_0= ruleOperand ( (lv_PrimaryExprLinha_1_0= rulePrimaryExprLinha ) ) ) | (this_Conversion_2= ruleConversion ( (lv_PrimaryExprLinha_3_0= rulePrimaryExprLinha ) ) ) | (this_MethodExpr_4= ruleMethodExpr ( (lv_PrimaryExprLinha_5_0= rulePrimaryExprLinha ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_6 = input.LA(1);

                         
                        int index47_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 1;}

                        else if ( (synpred66_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index47_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA47_7 = input.LA(1);

                         
                        int index47_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 1;}

                        else if ( (synpred66_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index47_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA47_8 = input.LA(1);

                         
                        int index47_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 1;}

                        else if ( (synpred66_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index47_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA47_9 = input.LA(1);

                         
                        int index47_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 1;}

                        else if ( (synpred66_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index47_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA47_10 = input.LA(1);

                         
                        int index47_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 1;}

                        else if ( (synpred66_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index47_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA47_11 = input.LA(1);

                         
                        int index47_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 1;}

                        else if ( (synpred66_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index47_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA47_12 = input.LA(1);

                         
                        int index47_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 1;}

                        else if ( (synpred66_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index47_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA47_13 = input.LA(1);

                         
                        int index47_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index47_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA47_14 = input.LA(1);

                         
                        int index47_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index47_14);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA47_15 = input.LA(1);

                         
                        int index47_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index47_15);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA47_16 = input.LA(1);

                         
                        int index47_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index47_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_78s = "\1\5\14\uffff\1\0\2\uffff\1\0\5\uffff";
    static final String dfa_79s = "\1\101\14\uffff\1\0\2\uffff\1\0\5\uffff";
    static final String dfa_80s = "\1\uffff\1\1\17\uffff\1\2\4\uffff";
    static final String dfa_81s = "\15\uffff\1\0\2\uffff\1\1\5\uffff}>";
    static final String[] dfa_82s = {
            "\2\1\11\uffff\1\21\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\15\1\1\2\uffff\1\1\1\uffff\2\1\1\20\4\uffff\1\1\12\uffff\2\21\6\uffff\1\21\1\uffff\1\21\1\uffff\2\1\2\uffff\2\1",
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
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_78 = DFA.unpackEncodedStringToUnsignedChars(dfa_78s);
    static final char[] dfa_79 = DFA.unpackEncodedStringToUnsignedChars(dfa_79s);
    static final short[] dfa_80 = DFA.unpackEncodedString(dfa_80s);
    static final short[] dfa_81 = DFA.unpackEncodedString(dfa_81s);
    static final short[][] dfa_82 = unpackEncodedStringArray(dfa_82s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_78;
            this.max = dfa_79;
            this.accept = dfa_80;
            this.special = dfa_81;
            this.transition = dfa_82;
        }
        public String getDescription() {
            return "3379:2: ( ( (lv_PrimaryExpr_0_0= rulePrimaryExpr ) ) | ( ruleunary_op this_UnaryExpr_2= ruleUnaryExpr ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_13 = input.LA(1);

                         
                        int index49_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index49_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_16 = input.LA(1);

                         
                        int index49_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index49_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_83s = "\2\6\1\uffff\1\6\2\uffff";
    static final String dfa_84s = "\1\45\1\105\1\uffff\1\105\2\uffff";
    static final String dfa_85s = "\2\uffff\1\3\1\uffff\1\1\1\2";
    static final String[] dfa_86s = {
            "\1\1\36\uffff\1\2",
            "\1\3\36\uffff\1\4\36\uffff\2\5",
            "",
            "\1\3\36\uffff\1\4\36\uffff\2\5",
            "",
            ""
    };
    static final char[] dfa_83 = DFA.unpackEncodedStringToUnsignedChars(dfa_83s);
    static final char[] dfa_84 = DFA.unpackEncodedStringToUnsignedChars(dfa_84s);
    static final short[] dfa_85 = DFA.unpackEncodedString(dfa_85s);
    static final short[][] dfa_86 = unpackEncodedStringArray(dfa_86s);

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_83;
            this.max = dfa_84;
            this.accept = dfa_85;
            this.special = dfa_37;
            this.transition = dfa_86;
        }
        public String getDescription() {
            return "4042:2: ( (this_decimals_0= ruledecimals kw= '.' (this_decimals_2= ruledecimals )? (this_exponent_3= ruleexponent )? ) | (this_decimals_4= ruledecimals this_exponent_5= ruleexponent ) | (kw= '.' this_decimals_7= ruledecimals (this_exponent_8= ruleexponent )? ) )";
        }
    }
    static final String dfa_87s = "\1\100\7\uffff\1\0\3\uffff";
    static final String dfa_88s = "\1\116\7\uffff\1\0\3\uffff";
    static final String dfa_89s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\10\1\11";
    static final String dfa_90s = "\10\uffff\1\0\3\uffff}>";
    static final String[] dfa_91s = {
            "\1\10\1\11\6\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            ""
    };
    static final char[] dfa_87 = DFA.unpackEncodedStringToUnsignedChars(dfa_87s);
    static final char[] dfa_88 = DFA.unpackEncodedStringToUnsignedChars(dfa_88s);
    static final short[] dfa_89 = DFA.unpackEncodedString(dfa_89s);
    static final short[] dfa_90 = DFA.unpackEncodedString(dfa_90s);
    static final short[][] dfa_91 = unpackEncodedStringArray(dfa_91s);

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_45;
            this.eof = dfa_45;
            this.min = dfa_87;
            this.max = dfa_88;
            this.accept = dfa_89;
            this.special = dfa_90;
            this.transition = dfa_91;
        }
        public String getDescription() {
            return "4865:3: (kw= 'a' | kw= 'b' | kw= 'f' | kw= 'n' | kw= 'r' | kw= 't' | kw= 'v' | this_CHAR_8= ruleCHAR | kw= '\\'' | kw= '\"' )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_8 = input.LA(1);

                         
                        int index76_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred131_InternalGo()) ) {s = 10;}

                        else if ( (synpred132_InternalGo()) ) {s = 11;}

                         
                        input.seek(index76_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x10000001D32A0020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x35030021D32B0060L,0x0000000000000003L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x1000000001800020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x2000002000000042L,0x0000000000000003L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x1000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x10000001D32A0022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x10000001DB2E0020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x10000001DB2A0020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x1000000020000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x10000005D32A0022L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x10000005D32A0020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x35030021F36B0060L,0x0000000000000003L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x35030021D36B0060L,0x0000000000000003L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x03FFFF0001000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000002004010000L,0x000000000000000DL});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000003L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0003000000000040L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000001L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007F03L});

}