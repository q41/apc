// $ANTLR 3.4

	package org.alia4j.language.textadventure.resource.textadventure.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TextadventureLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
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
    public static final int COMMENT=4;
    public static final int FLOAT=5;
    public static final int INTEGER=6;
    public static final int LINEBREAK=7;
    public static final int QUOTED_34_34=8;
    public static final int TEXT=9;
    public static final int WHITESPACE=10;

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

    public TextadventureLexer() {} 
    public TextadventureLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TextadventureLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Textadventure.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Textadventure.g:15:7: ( '=' )
            // Textadventure.g:15:9: '='
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Textadventure.g:16:7: ( '@' )
            // Textadventure.g:16:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Textadventure.g:17:7: ( 'Items' )
            // Textadventure.g:17:9: 'Items'
            {
            match("Items"); 



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
            // Textadventure.g:18:7: ( 'Persons' )
            // Textadventure.g:18:9: 'Persons'
            {
            match("Persons"); 



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
            // Textadventure.g:19:7: ( 'Tile' )
            // Textadventure.g:19:9: 'Tile'
            {
            match("Tile"); 



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
            // Textadventure.g:20:7: ( 'description' )
            // Textadventure.g:20:9: 'description'
            {
            match("description"); 



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
            // Textadventure.g:21:7: ( 'from' )
            // Textadventure.g:21:9: 'from'
            {
            match("from"); 



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
            // Textadventure.g:22:7: ( 'ignore' )
            // Textadventure.g:22:9: 'ignore'
            {
            match("ignore"); 



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
            // Textadventure.g:23:7: ( 'item' )
            // Textadventure.g:23:9: 'item'
            {
            match("item"); 



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
            // Textadventure.g:24:7: ( 'on' )
            // Textadventure.g:24:9: 'on'
            {
            match("on"); 



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
            // Textadventure.g:25:7: ( 'person' )
            // Textadventure.g:25:9: 'person'
            {
            match("person"); 



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
            // Textadventure.g:26:7: ( 'remove' )
            // Textadventure.g:26:9: 'remove'
            {
            match("remove"); 



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
            // Textadventure.g:27:7: ( 'result' )
            // Textadventure.g:27:9: 'result'
            {
            match("result"); 



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
            // Textadventure.g:28:7: ( 'tile' )
            // Textadventure.g:28:9: 'tile'
            {
            match("tile"); 



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
            // Textadventure.g:29:7: ( 'used' )
            // Textadventure.g:29:9: 'used'
            {
            match("used"); 



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
            // Textadventure.g:30:7: ( 'while' )
            // Textadventure.g:30:9: 'while'
            {
            match("while"); 



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
            // Textadventure.g:31:7: ( 'x' )
            // Textadventure.g:31:9: 'x'
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Textadventure.g:32:7: ( 'y' )
            // Textadventure.g:32:9: 'y'
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Textadventure.g:33:7: ( '{' )
            // Textadventure.g:33:9: '{'
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Textadventure.g:34:7: ( '}' )
            // Textadventure.g:34:9: '}'
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
    // $ANTLR end "T__30"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Textadventure.g:1718:8: ( ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Textadventure.g:1719:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Textadventure.g:1719:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Textadventure.g:1719:3: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 



            // Textadventure.g:1719:7: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Textadventure.g:
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
            // Textadventure.g:1722:8: ( ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) )
            // Textadventure.g:1723:2: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            {
            // Textadventure.g:1723:2: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
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
                    // Textadventure.g:1723:3: ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // Textadventure.g:1723:3: ( '-' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // Textadventure.g:1723:4: '-'
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


                    // Textadventure.g:1723:19: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Textadventure.g:
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
                    // Textadventure.g:1723:31: '0'
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
            // Textadventure.g:1725:6: ( ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ ) )
            // Textadventure.g:1726:2: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            {
            // Textadventure.g:1726:2: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            // Textadventure.g:1726:3: ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+
            {
            // Textadventure.g:1726:3: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Textadventure.g:1726:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // Textadventure.g:1726:9: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
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
                    // Textadventure.g:1726:10: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // Textadventure.g:1726:21: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // Textadventure.g:
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
                    // Textadventure.g:1726:35: '0'
                    {
                    match('0'); 

                    }
                    break;

            }


            match('.'); 

            // Textadventure.g:1726:44: ( '0' .. '9' )+
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
            	    // Textadventure.g:
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


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Textadventure.g:1729:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Textadventure.g:1730:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Textadventure.g:1730:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Textadventure.g:1730:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Textadventure.g:1730:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='-'||(LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Textadventure.g:
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
    // $ANTLR end "TEXT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Textadventure.g:1732:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Textadventure.g:1733:2: ( ( ' ' | '\\t' | '\\f' ) )
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
            // Textadventure.g:1736:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Textadventure.g:1737:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Textadventure.g:1737:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Textadventure.g:1737:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Textadventure.g:1737:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\r') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='\n') ) {
                    alt10=1;
                }
                else {
                    alt10=2;
                }
            }
            else if ( (LA10_0=='\n') ) {
                alt10=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // Textadventure.g:1737:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Textadventure.g:1737:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Textadventure.g:1737:20: '\\n'
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

    // $ANTLR start "QUOTED_34_34"
    public final void mQUOTED_34_34() throws RecognitionException {
        try {
            int _type = QUOTED_34_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Textadventure.g:1740:13: ( ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) ) )
            // Textadventure.g:1741:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            {
            // Textadventure.g:1741:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            // Textadventure.g:1741:3: ( '\"' ) (~ ( '\"' ) )* ( '\"' )
            {
            // Textadventure.g:1741:3: ( '\"' )
            // Textadventure.g:1741:4: '\"'
            {
            match('\"'); 

            }


            // Textadventure.g:1741:8: (~ ( '\"' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '\u0000' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Textadventure.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop11;
                }
            } while (true);


            // Textadventure.g:1741:17: ( '\"' )
            // Textadventure.g:1741:18: '\"'
            {
            match('\"'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_34_34"

    public void mTokens() throws RecognitionException {
        // Textadventure.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | COMMENT | INTEGER | FLOAT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 )
        int alt12=27;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // Textadventure.g:1:10: T__11
                {
                mT__11(); 


                }
                break;
            case 2 :
                // Textadventure.g:1:16: T__12
                {
                mT__12(); 


                }
                break;
            case 3 :
                // Textadventure.g:1:22: T__13
                {
                mT__13(); 


                }
                break;
            case 4 :
                // Textadventure.g:1:28: T__14
                {
                mT__14(); 


                }
                break;
            case 5 :
                // Textadventure.g:1:34: T__15
                {
                mT__15(); 


                }
                break;
            case 6 :
                // Textadventure.g:1:40: T__16
                {
                mT__16(); 


                }
                break;
            case 7 :
                // Textadventure.g:1:46: T__17
                {
                mT__17(); 


                }
                break;
            case 8 :
                // Textadventure.g:1:52: T__18
                {
                mT__18(); 


                }
                break;
            case 9 :
                // Textadventure.g:1:58: T__19
                {
                mT__19(); 


                }
                break;
            case 10 :
                // Textadventure.g:1:64: T__20
                {
                mT__20(); 


                }
                break;
            case 11 :
                // Textadventure.g:1:70: T__21
                {
                mT__21(); 


                }
                break;
            case 12 :
                // Textadventure.g:1:76: T__22
                {
                mT__22(); 


                }
                break;
            case 13 :
                // Textadventure.g:1:82: T__23
                {
                mT__23(); 


                }
                break;
            case 14 :
                // Textadventure.g:1:88: T__24
                {
                mT__24(); 


                }
                break;
            case 15 :
                // Textadventure.g:1:94: T__25
                {
                mT__25(); 


                }
                break;
            case 16 :
                // Textadventure.g:1:100: T__26
                {
                mT__26(); 


                }
                break;
            case 17 :
                // Textadventure.g:1:106: T__27
                {
                mT__27(); 


                }
                break;
            case 18 :
                // Textadventure.g:1:112: T__28
                {
                mT__28(); 


                }
                break;
            case 19 :
                // Textadventure.g:1:118: T__29
                {
                mT__29(); 


                }
                break;
            case 20 :
                // Textadventure.g:1:124: T__30
                {
                mT__30(); 


                }
                break;
            case 21 :
                // Textadventure.g:1:130: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 22 :
                // Textadventure.g:1:138: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 23 :
                // Textadventure.g:1:146: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 24 :
                // Textadventure.g:1:152: TEXT
                {
                mTEXT(); 


                }
                break;
            case 25 :
                // Textadventure.g:1:157: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 26 :
                // Textadventure.g:1:168: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 27 :
                // Textadventure.g:1:178: QUOTED_34_34
                {
                mQUOTED_34_34(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\3\uffff\14\27\1\50\1\51\3\uffff\1\27\2\54\4\uffff\7\27\1\65\5\27"+
        "\2\uffff\1\27\1\54\2\uffff\7\27\1\uffff\10\27\1\113\1\27\1\115\1"+
        "\27\1\117\3\27\1\123\1\124\1\27\1\126\1\27\1\uffff\1\27\1\uffff"+
        "\1\27\1\uffff\3\27\2\uffff\1\135\1\uffff\2\27\1\140\1\141\1\142"+
        "\1\143\1\uffff\1\144\1\27\5\uffff\3\27\1\151\1\uffff";
    static final String DFA12_eofS =
        "\152\uffff";
    static final String DFA12_minS =
        "\1\11\2\uffff\1\164\1\145\1\151\1\145\1\162\1\147\1\156\2\145\1"+
        "\151\1\163\1\150\2\55\3\uffff\1\60\2\55\4\uffff\1\145\1\162\1\154"+
        "\1\163\1\157\1\156\1\145\1\55\1\162\1\155\1\154\1\145\1\151\2\uffff"+
        "\1\56\1\55\2\uffff\1\155\1\163\1\145\1\143\1\155\1\157\1\155\1\uffff"+
        "\1\163\1\157\1\165\1\145\1\144\1\154\1\163\1\157\1\55\1\162\1\55"+
        "\1\162\1\55\1\157\1\166\1\154\2\55\1\145\1\55\1\156\1\uffff\1\151"+
        "\1\uffff\1\145\1\uffff\1\156\1\145\1\164\2\uffff\1\55\1\uffff\1"+
        "\163\1\160\4\55\1\uffff\1\55\1\164\5\uffff\1\151\1\157\1\156\1\55"+
        "\1\uffff";
    static final String DFA12_maxS =
        "\1\175\2\uffff\1\164\1\145\1\151\1\145\1\162\1\164\1\156\2\145\1"+
        "\151\1\163\1\150\2\172\3\uffff\1\71\2\172\4\uffff\1\145\1\162\1"+
        "\154\1\163\1\157\1\156\1\145\1\172\1\162\1\163\1\154\1\145\1\151"+
        "\2\uffff\1\56\1\172\2\uffff\1\155\1\163\1\145\1\143\1\155\1\157"+
        "\1\155\1\uffff\1\163\1\157\1\165\1\145\1\144\1\154\1\163\1\157\1"+
        "\172\1\162\1\172\1\162\1\172\1\157\1\166\1\154\2\172\1\145\1\172"+
        "\1\156\1\uffff\1\151\1\uffff\1\145\1\uffff\1\156\1\145\1\164\2\uffff"+
        "\1\172\1\uffff\1\163\1\160\4\172\1\uffff\1\172\1\164\5\uffff\1\151"+
        "\1\157\1\156\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\16\uffff\1\23\1\24\1\25\3\uffff\1\30\1\31\1\32"+
        "\1\33\15\uffff\1\21\1\22\2\uffff\1\26\1\27\7\uffff\1\12\25\uffff"+
        "\1\5\1\uffff\1\7\1\uffff\1\11\3\uffff\1\16\1\17\1\uffff\1\3\6\uffff"+
        "\1\20\2\uffff\1\10\1\13\1\14\1\15\1\4\4\uffff\1\6";
    static final String DFA12_specialS =
        "\152\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\30\1\31\1\uffff\1\30\1\31\22\uffff\1\30\1\uffff\1\32\12\uffff"+
            "\1\24\1\uffff\1\23\1\26\11\25\3\uffff\1\1\2\uffff\1\2\10\27"+
            "\1\3\6\27\1\4\3\27\1\5\6\27\4\uffff\1\27\1\uffff\3\27\1\6\1"+
            "\27\1\7\2\27\1\10\5\27\1\11\1\12\1\27\1\13\1\27\1\14\1\15\1"+
            "\27\1\16\1\17\1\20\1\27\1\21\1\uffff\1\22",
            "",
            "",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40\14\uffff\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "\1\52\11\25",
            "\1\27\1\55\1\uffff\12\53\7\uffff\32\27\4\uffff\1\27\1\uffff"+
            "\32\27",
            "\1\27\1\55\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff"+
            "\32\27",
            "",
            "",
            "",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\66",
            "\1\67\5\uffff\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "\1\55",
            "\1\27\1\55\1\uffff\12\53\7\uffff\32\27\4\uffff\1\27\1\uffff"+
            "\32\27",
            "",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\114",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\116",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\125",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\127",
            "",
            "\1\130",
            "",
            "\1\131",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\136",
            "\1\137",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\145",
            "",
            "",
            "",
            "",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | COMMENT | INTEGER | FLOAT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 );";
        }
    }
 

}