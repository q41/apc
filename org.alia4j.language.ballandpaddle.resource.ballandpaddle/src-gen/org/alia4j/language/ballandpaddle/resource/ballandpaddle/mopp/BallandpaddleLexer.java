// $ANTLR 3.4

	package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BallandpaddleLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int ANDOR=4;
    public static final int CHAR=5;
    public static final int COMMENT=6;
    public static final int FLOAT=7;
    public static final int INTEGER=8;
    public static final int LEVELLINE=9;
    public static final int LINEBREAK=10;
    public static final int TEXT=11;
    public static final int WHITESPACE=12;

    	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public BallandpaddleLexer() {} 
    public BallandpaddleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public BallandpaddleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Ballandpaddle.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:15:7: ( '!' )
            // Ballandpaddle.g:15:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:16:7: ( '!=' )
            // Ballandpaddle.g:16:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:17:7: ( '&' )
            // Ballandpaddle.g:17:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:18:7: ( '(' )
            // Ballandpaddle.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:19:7: ( ')' )
            // Ballandpaddle.g:19:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:20:7: ( '*' )
            // Ballandpaddle.g:20:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:21:7: ( '+' )
            // Ballandpaddle.g:21:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:22:7: ( '-' )
            // Ballandpaddle.g:22:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:23:7: ( '/' )
            // Ballandpaddle.g:23:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:24:7: ( '<' )
            // Ballandpaddle.g:24:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:25:7: ( '<=' )
            // Ballandpaddle.g:25:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:26:7: ( '=' )
            // Ballandpaddle.g:26:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:27:7: ( '>' )
            // Ballandpaddle.g:27:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:28:7: ( '>=' )
            // Ballandpaddle.g:28:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:29:7: ( 'ball' )
            // Ballandpaddle.g:29:9: 'ball'
            {
            match("ball"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:30:7: ( 'block' )
            // Ballandpaddle.g:30:9: 'block'
            {
            match("block"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:31:7: ( 'cold damage' )
            // Ballandpaddle.g:31:9: 'cold damage'
            {
            match("cold damage"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:32:7: ( 'direction' )
            // Ballandpaddle.g:32:9: 'direction'
            {
            match("direction"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:33:7: ( 'duration' )
            // Ballandpaddle.g:33:9: 'duration'
            {
            match("duration"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:34:7: ( 'effect' )
            // Ballandpaddle.g:34:9: 'effect'
            {
            match("effect"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:35:7: ( 'effects' )
            // Ballandpaddle.g:35:9: 'effects'
            {
            match("effects"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:36:7: ( 'fire damage' )
            // Ballandpaddle.g:36:9: 'fire damage'
            {
            match("fire damage"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:37:7: ( 'hardness' )
            // Ballandpaddle.g:37:9: 'hardness'
            {
            match("hardness"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:38:7: ( 'level' )
            // Ballandpaddle.g:38:9: 'level'
            {
            match("level"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:39:7: ( 'normal damage' )
            // Ballandpaddle.g:39:9: 'normal damage'
            {
            match("normal damage"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:40:7: ( 'orientation' )
            // Ballandpaddle.g:40:9: 'orientation'
            {
            match("orientation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:41:7: ( 'paddle' )
            // Ballandpaddle.g:41:9: 'paddle'
            {
            match("paddle"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:42:7: ( 'power' )
            // Ballandpaddle.g:42:9: 'power'
            {
            match("power"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:43:7: ( 'powerSpawnChance' )
            // Ballandpaddle.g:43:9: 'powerSpawnChance'
            {
            match("powerSpawnChance"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:44:7: ( 'resistance cold' )
            // Ballandpaddle.g:44:9: 'resistance cold'
            {
            match("resistance cold"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:45:7: ( 'resistance fire' )
            // Ballandpaddle.g:45:9: 'resistance fire'
            {
            match("resistance fire"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:46:7: ( 'resistance normal' )
            // Ballandpaddle.g:46:9: 'resistance normal'
            {
            match("resistance normal"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:47:7: ( 'resistance shock' )
            // Ballandpaddle.g:47:9: 'resistance shock'
            {
            match("resistance shock"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:48:7: ( 'shock damage' )
            // Ballandpaddle.g:48:9: 'shock damage'
            {
            match("shock damage"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:49:7: ( 'size' )
            // Ballandpaddle.g:49:9: 'size'
            {
            match("size"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:50:7: ( 'speed' )
            // Ballandpaddle.g:50:9: 'speed'
            {
            match("speed"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:51:7: ( 'x' )
            // Ballandpaddle.g:51:9: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:52:7: ( 'y' )
            // Ballandpaddle.g:52:9: 'y'
            {
            match('y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:53:7: ( '{' )
            // Ballandpaddle.g:53:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:54:7: ( '|' )
            // Ballandpaddle.g:54:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:55:7: ( '}' )
            // Ballandpaddle.g:55:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:4753:8: ( ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Ballandpaddle.g:4754:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Ballandpaddle.g:4754:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Ballandpaddle.g:4754:2: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 



            // Ballandpaddle.g:4754:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Ballandpaddle.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFE') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:4757:8: ( ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) )
            // Ballandpaddle.g:4758:2: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            {
            // Ballandpaddle.g:4758:2: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-'||(LA4_0 >= '1' && LA4_0 <= '9')) ) {
                alt4=1;
            }
            else if ( (LA4_0=='0') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Ballandpaddle.g:4758:2: ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // Ballandpaddle.g:4758:2: ( '-' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // Ballandpaddle.g:4758:3: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }


                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // Ballandpaddle.g:4758:18: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Ballandpaddle.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Ballandpaddle.g:4758:30: '0'
                    {
                    match('0'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:4760:6: ( ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ ) )
            // Ballandpaddle.g:4761:2: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            {
            // Ballandpaddle.g:4761:2: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            // Ballandpaddle.g:4761:2: ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+
            {
            // Ballandpaddle.g:4761:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Ballandpaddle.g:4761:3: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // Ballandpaddle.g:4761:8: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0 >= '1' && LA7_0 <= '9')) ) {
                alt7=1;
            }
            else if ( (LA7_0=='0') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // Ballandpaddle.g:4761:9: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // Ballandpaddle.g:4761:20: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // Ballandpaddle.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Ballandpaddle.g:4761:34: '0'
                    {
                    match('0'); 

                    }
                    break;

            }


            match('.'); 

            // Ballandpaddle.g:4761:43: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Ballandpaddle.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:4763:5: ( ( ( 'A' .. 'Z' ) ) )
            // Ballandpaddle.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "LEVELLINE"
    public final void mLEVELLINE() throws RecognitionException {
        try {
            int _type = LEVELLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:4766:10: ( ( ( ( 'A' .. 'Z' ) | ( '.' ) )+ ) )
            // Ballandpaddle.g:4767:2: ( ( ( 'A' .. 'Z' ) | ( '.' ) )+ )
            {
            // Ballandpaddle.g:4767:2: ( ( ( 'A' .. 'Z' ) | ( '.' ) )+ )
            // Ballandpaddle.g:4767:2: ( ( 'A' .. 'Z' ) | ( '.' ) )+
            {
            // Ballandpaddle.g:4767:2: ( ( 'A' .. 'Z' ) | ( '.' ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='.'||(LA9_0 >= 'A' && LA9_0 <= 'Z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Ballandpaddle.g:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEVELLINE"

    // $ANTLR start "ANDOR"
    public final void mANDOR() throws RecognitionException {
        try {
            int _type = ANDOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:4769:6: ( ( ( '|' ) | ( '&' ) ) )
            // Ballandpaddle.g:4770:2: ( ( '|' ) | ( '&' ) )
            {
            if ( input.LA(1)=='&'||input.LA(1)=='|' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ANDOR"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:4773:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Ballandpaddle.g:4774:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Ballandpaddle.g:4774:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Ballandpaddle.g:4774:2: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Ballandpaddle.g:4774:2: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='-'||(LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||LA10_0=='_'||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Ballandpaddle.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:4776:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Ballandpaddle.g:4777:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ballandpaddle.g:4780:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Ballandpaddle.g:4781:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Ballandpaddle.g:4781:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Ballandpaddle.g:4781:2: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Ballandpaddle.g:4781:2: ( '\\r\\n' | '\\r' | '\\n' )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='\n') ) {
                    alt11=1;
                }
                else {
                    alt11=2;
                }
            }
            else if ( (LA11_0=='\n') ) {
                alt11=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // Ballandpaddle.g:4781:3: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Ballandpaddle.g:4781:12: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Ballandpaddle.g:4781:19: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINEBREAK"

    public void mTokens() throws RecognitionException {
        // Ballandpaddle.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | COMMENT | INTEGER | FLOAT | CHAR | LEVELLINE | ANDOR | TEXT | WHITESPACE | LINEBREAK )
        int alt12=50;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // Ballandpaddle.g:1:10: T__13
                {
                mT__13(); 


                }
                break;
            case 2 :
                // Ballandpaddle.g:1:16: T__14
                {
                mT__14(); 


                }
                break;
            case 3 :
                // Ballandpaddle.g:1:22: T__15
                {
                mT__15(); 


                }
                break;
            case 4 :
                // Ballandpaddle.g:1:28: T__16
                {
                mT__16(); 


                }
                break;
            case 5 :
                // Ballandpaddle.g:1:34: T__17
                {
                mT__17(); 


                }
                break;
            case 6 :
                // Ballandpaddle.g:1:40: T__18
                {
                mT__18(); 


                }
                break;
            case 7 :
                // Ballandpaddle.g:1:46: T__19
                {
                mT__19(); 


                }
                break;
            case 8 :
                // Ballandpaddle.g:1:52: T__20
                {
                mT__20(); 


                }
                break;
            case 9 :
                // Ballandpaddle.g:1:58: T__21
                {
                mT__21(); 


                }
                break;
            case 10 :
                // Ballandpaddle.g:1:64: T__22
                {
                mT__22(); 


                }
                break;
            case 11 :
                // Ballandpaddle.g:1:70: T__23
                {
                mT__23(); 


                }
                break;
            case 12 :
                // Ballandpaddle.g:1:76: T__24
                {
                mT__24(); 


                }
                break;
            case 13 :
                // Ballandpaddle.g:1:82: T__25
                {
                mT__25(); 


                }
                break;
            case 14 :
                // Ballandpaddle.g:1:88: T__26
                {
                mT__26(); 


                }
                break;
            case 15 :
                // Ballandpaddle.g:1:94: T__27
                {
                mT__27(); 


                }
                break;
            case 16 :
                // Ballandpaddle.g:1:100: T__28
                {
                mT__28(); 


                }
                break;
            case 17 :
                // Ballandpaddle.g:1:106: T__29
                {
                mT__29(); 


                }
                break;
            case 18 :
                // Ballandpaddle.g:1:112: T__30
                {
                mT__30(); 


                }
                break;
            case 19 :
                // Ballandpaddle.g:1:118: T__31
                {
                mT__31(); 


                }
                break;
            case 20 :
                // Ballandpaddle.g:1:124: T__32
                {
                mT__32(); 


                }
                break;
            case 21 :
                // Ballandpaddle.g:1:130: T__33
                {
                mT__33(); 


                }
                break;
            case 22 :
                // Ballandpaddle.g:1:136: T__34
                {
                mT__34(); 


                }
                break;
            case 23 :
                // Ballandpaddle.g:1:142: T__35
                {
                mT__35(); 


                }
                break;
            case 24 :
                // Ballandpaddle.g:1:148: T__36
                {
                mT__36(); 


                }
                break;
            case 25 :
                // Ballandpaddle.g:1:154: T__37
                {
                mT__37(); 


                }
                break;
            case 26 :
                // Ballandpaddle.g:1:160: T__38
                {
                mT__38(); 


                }
                break;
            case 27 :
                // Ballandpaddle.g:1:166: T__39
                {
                mT__39(); 


                }
                break;
            case 28 :
                // Ballandpaddle.g:1:172: T__40
                {
                mT__40(); 


                }
                break;
            case 29 :
                // Ballandpaddle.g:1:178: T__41
                {
                mT__41(); 


                }
                break;
            case 30 :
                // Ballandpaddle.g:1:184: T__42
                {
                mT__42(); 


                }
                break;
            case 31 :
                // Ballandpaddle.g:1:190: T__43
                {
                mT__43(); 


                }
                break;
            case 32 :
                // Ballandpaddle.g:1:196: T__44
                {
                mT__44(); 


                }
                break;
            case 33 :
                // Ballandpaddle.g:1:202: T__45
                {
                mT__45(); 


                }
                break;
            case 34 :
                // Ballandpaddle.g:1:208: T__46
                {
                mT__46(); 


                }
                break;
            case 35 :
                // Ballandpaddle.g:1:214: T__47
                {
                mT__47(); 


                }
                break;
            case 36 :
                // Ballandpaddle.g:1:220: T__48
                {
                mT__48(); 


                }
                break;
            case 37 :
                // Ballandpaddle.g:1:226: T__49
                {
                mT__49(); 


                }
                break;
            case 38 :
                // Ballandpaddle.g:1:232: T__50
                {
                mT__50(); 


                }
                break;
            case 39 :
                // Ballandpaddle.g:1:238: T__51
                {
                mT__51(); 


                }
                break;
            case 40 :
                // Ballandpaddle.g:1:244: T__52
                {
                mT__52(); 


                }
                break;
            case 41 :
                // Ballandpaddle.g:1:250: T__53
                {
                mT__53(); 


                }
                break;
            case 42 :
                // Ballandpaddle.g:1:256: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 43 :
                // Ballandpaddle.g:1:264: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 44 :
                // Ballandpaddle.g:1:272: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 45 :
                // Ballandpaddle.g:1:278: CHAR
                {
                mCHAR(); 


                }
                break;
            case 46 :
                // Ballandpaddle.g:1:283: LEVELLINE
                {
                mLEVELLINE(); 


                }
                break;
            case 47 :
                // Ballandpaddle.g:1:293: ANDOR
                {
                mANDOR(); 


                }
                break;
            case 48 :
                // Ballandpaddle.g:1:299: TEXT
                {
                mTEXT(); 


                }
                break;
            case 49 :
                // Ballandpaddle.g:1:304: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 50 :
                // Ballandpaddle.g:1:315: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\45\5\uffff\1\47\1\52\1\54\1\uffff\1\56\14\41\1\100\1"+
        "\101\3\uffff\2\104\1\106\10\uffff\1\41\6\uffff\21\41\3\uffff\1\104"+
        "\3\uffff\1\40\21\41\1\152\16\41\1\171\1\41\1\uffff\1\173\1\uffff"+
        "\3\41\1\uffff\1\41\1\u0080\3\41\1\u0085\2\41\1\uffff\1\u0088\1\uffff"+
        "\2\41\1\u008c\1\41\1\uffff\2\41\1\u0090\1\41\1\uffff\1\41\2\uffff"+
        "\2\41\1\u0095\1\uffff\1\41\1\uffff\1\41\1\uffff\3\41\1\u009b\1\uffff"+
        "\1\u009c\3\41\1\u00a0\2\uffff\3\41\1\uffff\3\41\1\u00a7\1\41\2\uffff"+
        "\1\41\4\uffff\3\41\1\u00b1\1\uffff";
    static final String DFA12_eofS =
        "\u00b2\uffff";
    static final String DFA12_minS =
        "\1\11\1\75\5\uffff\1\55\1\57\1\75\1\uffff\1\75\1\141\1\157\1\151"+
        "\1\146\1\151\1\141\1\145\1\157\1\162\1\141\1\145\1\150\2\55\3\uffff"+
        "\3\55\10\uffff\1\56\6\uffff\1\154\1\157\1\154\2\162\1\146\2\162"+
        "\1\166\1\162\1\151\1\144\1\167\1\163\1\157\1\172\1\145\3\uffff\1"+
        "\55\3\uffff\1\55\1\154\1\143\1\144\1\145\1\141\2\145\1\144\1\145"+
        "\1\155\1\145\1\144\1\145\1\151\1\143\2\145\1\55\1\153\1\40\1\143"+
        "\1\164\1\143\1\40\1\156\1\154\1\141\1\156\1\154\1\162\1\163\1\153"+
        "\1\55\1\144\1\uffff\1\55\1\uffff\1\164\1\151\1\164\1\uffff\1\145"+
        "\1\55\1\154\1\164\1\145\1\55\1\164\1\40\1\uffff\1\55\1\uffff\1\151"+
        "\1\157\1\55\1\163\1\uffff\1\40\1\141\1\55\1\160\1\uffff\1\141\2"+
        "\uffff\1\157\1\156\1\55\1\uffff\1\163\1\uffff\1\164\1\uffff\1\141"+
        "\2\156\1\55\1\uffff\1\55\1\151\1\167\1\143\1\55\2\uffff\1\157\1"+
        "\156\1\145\1\uffff\1\156\1\103\1\40\1\55\1\150\1\143\1\uffff\1\141"+
        "\4\uffff\1\156\1\143\1\145\1\55\1\uffff";
    static final String DFA12_maxS =
        "\1\175\1\75\5\uffff\1\172\1\57\1\75\1\uffff\1\75\1\154\1\157\1\165"+
        "\1\146\1\151\1\141\1\145\1\157\1\162\1\157\1\145\1\160\2\172\3\uffff"+
        "\3\172\10\uffff\1\56\6\uffff\1\154\1\157\1\154\2\162\1\146\2\162"+
        "\1\166\1\162\1\151\1\144\1\167\1\163\1\157\1\172\1\145\3\uffff\1"+
        "\172\3\uffff\1\172\1\154\1\143\1\144\1\145\1\141\2\145\1\144\1\145"+
        "\1\155\1\145\1\144\1\145\1\151\1\143\2\145\1\172\1\153\1\40\1\143"+
        "\1\164\1\143\1\40\1\156\1\154\1\141\1\156\1\154\1\162\1\163\1\153"+
        "\1\172\1\144\1\uffff\1\172\1\uffff\1\164\1\151\1\164\1\uffff\1\145"+
        "\1\172\1\154\1\164\1\145\1\172\1\164\1\40\1\uffff\1\172\1\uffff"+
        "\1\151\1\157\1\172\1\163\1\uffff\1\40\1\141\1\172\1\160\1\uffff"+
        "\1\141\2\uffff\1\157\1\156\1\172\1\uffff\1\163\1\uffff\1\164\1\uffff"+
        "\1\141\2\156\1\172\1\uffff\1\172\1\151\1\167\1\143\1\172\2\uffff"+
        "\1\157\1\156\1\145\1\uffff\1\156\1\103\1\40\1\172\1\150\1\163\1"+
        "\uffff\1\141\4\uffff\1\156\1\143\1\145\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\3\uffff\1\14\17\uffff\1\47\1\50\1\51"+
        "\3\uffff\1\56\1\60\1\61\1\62\1\2\1\1\1\3\1\10\1\uffff\1\52\1\11"+
        "\1\13\1\12\1\16\1\15\21\uffff\1\45\1\46\1\50\1\uffff\1\53\1\54\1"+
        "\55\43\uffff\1\17\1\uffff\1\21\3\uffff\1\26\10\uffff\1\43\1\uffff"+
        "\1\20\4\uffff\1\30\4\uffff\1\34\1\uffff\1\42\1\44\3\uffff\1\24\1"+
        "\uffff\1\31\1\uffff\1\33\4\uffff\1\25\5\uffff\1\23\1\27\3\uffff"+
        "\1\22\6\uffff\1\32\1\uffff\1\36\1\37\1\40\1\41\4\uffff\1\35";
    static final String DFA12_specialS =
        "\u00b2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\42\1\43\1\uffff\1\42\1\43\22\uffff\1\42\1\1\4\uffff\1\2\1"+
            "\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\40\1\10\1\36\11\35\2\uffff"+
            "\1\11\1\12\1\13\2\uffff\32\37\4\uffff\1\41\1\uffff\1\41\1\14"+
            "\1\15\1\16\1\17\1\20\1\41\1\21\3\41\1\22\1\41\1\23\1\24\1\25"+
            "\1\41\1\26\1\27\4\41\1\30\1\31\1\41\1\32\1\33\1\34",
            "\1\44",
            "",
            "",
            "",
            "",
            "",
            "\1\41\2\uffff\1\50\11\35\7\uffff\32\41\4\uffff\1\41\1\uffff"+
            "\32\41",
            "\1\51",
            "\1\53",
            "",
            "\1\55",
            "\1\57\12\uffff\1\60",
            "\1\61",
            "\1\62\13\uffff\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72\15\uffff\1\73",
            "\1\74",
            "\1\75\1\76\6\uffff\1\77",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "\1\41\1\105\1\uffff\12\103\7\uffff\32\41\4\uffff\1\41\1\uffff"+
            "\32\41",
            "\1\41\1\105\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff"+
            "\32\41",
            "\1\41\1\40\1\uffff\12\41\7\uffff\32\107\4\uffff\1\41\1\uffff"+
            "\32\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\105",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "",
            "",
            "\1\41\1\105\1\uffff\12\103\7\uffff\32\41\4\uffff\1\41\1\uffff"+
            "\32\41",
            "",
            "",
            "",
            "\1\41\2\uffff\12\41\7\uffff\32\107\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\153",
            "\1\154",
            "\1\155",
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
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\172",
            "",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\41\2\uffff\12\41\7\uffff\22\41\1\u0084\7\41\4\uffff\1\41"+
            "\1\uffff\32\41",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\22\41"+
            "\1\u008b\7\41",
            "\1\u008d",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0091",
            "",
            "\1\u0092",
            "",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u0096",
            "",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a8",
            "\1\u00a9\2\uffff\1\u00aa\7\uffff\1\u00ab\4\uffff\1\u00ac",
            "",
            "\1\u00ad",
            "",
            "",
            "",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | COMMENT | INTEGER | FLOAT | CHAR | LEVELLINE | ANDOR | TEXT | WHITESPACE | LINEBREAK );";
        }
    }
 

}