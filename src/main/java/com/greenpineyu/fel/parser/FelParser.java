// $ANTLR 3.4 E:\\workspace\\Fel\\Fel.g 2012-11-12 09:00:06

package com.greenpineyu.fel.parser;
//import com.greenpineyu.fel.exception.ParseException;
import java.util.HashMap;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class FelParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Additive", "And", "BooleanLiteral", "Bracket", "COMMENT", "CharacterLiteral", "Colon", "DecimalLiteral", "Dot", "Equals", "EscapeSequence", "Exponent", "FloatTypeSuffix", "FloatingPointLiteral", "HexDigit", "HexLiteral", "Identifier", "IntegerTypeSuffix", "JavaIDDigit", "LINE_COMMENT", "Letter", "Multiplicative", "Not", "OctalEscape", "OctalLiteral", "Or", "Ques", "Relational", "StringLiteral", "UnicodeEscape", "WS", "'('", "')'", "','", "']'"
    };

    public static final int EOF=-1;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int Additive=4;
    public static final int And=5;
    public static final int BooleanLiteral=6;
    public static final int Bracket=7;
    public static final int COMMENT=8;
    public static final int CharacterLiteral=9;
    public static final int Colon=10;
    public static final int DecimalLiteral=11;
    public static final int Dot=12;
    public static final int Equals=13;
    public static final int EscapeSequence=14;
    public static final int Exponent=15;
    public static final int FloatTypeSuffix=16;
    public static final int FloatingPointLiteral=17;
    public static final int HexDigit=18;
    public static final int HexLiteral=19;
    public static final int Identifier=20;
    public static final int IntegerTypeSuffix=21;
    public static final int JavaIDDigit=22;
    public static final int LINE_COMMENT=23;
    public static final int Letter=24;
    public static final int Multiplicative=25;
    public static final int Not=26;
    public static final int OctalEscape=27;
    public static final int OctalLiteral=28;
    public static final int Or=29;
    public static final int Ques=30;
    public static final int Relational=31;
    public static final int StringLiteral=32;
    public static final int UnicodeEscape=33;
    public static final int WS=34;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public FelParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public FelParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[46+1];
         

    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return FelParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\workspace\\Fel\\Fel.g"; }


    protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)
    	throws RecognitionException
    {
    	throw new MismatchedTokenException(ttype, input);
    }
    //public void emitErrorMessage(String msg) {
    //		System.err.println(msg);
    	// do not display error ,instead of ErrorHndler
    //}



    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
	// E:\\workspace\\Fel\\Fel.g:46:1: program : conditionalExpression EOF !;
    public final FelParser.program_return program() throws RecognitionException {
        FelParser.program_return retval = new FelParser.program_return();
        retval.start = input.LT(1);

        int program_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EOF2=null;
        FelParser.conditionalExpression_return conditionalExpression1 =null;


        CommonTree EOF2_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:46:9: ( conditionalExpression EOF !)
			// E:\\workspace\\Fel\\Fel.g:46:11: conditionalExpression EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conditionalExpression_in_program87);
            conditionalExpression1=conditionalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression1.getTree());

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program89); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "program"


    public static class parExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parExpression"
	// E:\\workspace\\Fel\\Fel.g:49:1: parExpression : '(' ! expressionList ')'
	// !;
    public final FelParser.parExpression_return parExpression() throws RecognitionException {
        FelParser.parExpression_return retval = new FelParser.parExpression_return();
        retval.start = input.LT(1);

        int parExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal3=null;
        Token char_literal5=null;
        FelParser.expressionList_return expressionList4 =null;


        CommonTree char_literal3_tree=null;
        CommonTree char_literal5_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:50:5: ( '(' ! expressionList ')' !)
			// E:\\workspace\\Fel\\Fel.g:50:9: '(' ! expressionList ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


				char_literal3 = (Token) match(input, 35, FOLLOW_35_in_parExpression105);
				if (state.failed)
					return retval;

            pushFollow(FOLLOW_expressionList_in_parExpression108);
            expressionList4=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList4.getTree());

				char_literal5 = (Token) match(input, 36, FOLLOW_36_in_parExpression110);
				if (state.failed)
					return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "parExpression"


    public static class expressionList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionList"
	// E:\\workspace\\Fel\\Fel.g:53:1: expressionList : ( conditionalExpression
	// )? ( ',' ! ( conditionalExpression )? )* ;
    public final FelParser.expressionList_return expressionList() throws RecognitionException {
        FelParser.expressionList_return retval = new FelParser.expressionList_return();
        retval.start = input.LT(1);

        int expressionList_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal7=null;
        FelParser.conditionalExpression_return conditionalExpression6 =null;

        FelParser.conditionalExpression_return conditionalExpression8 =null;


        CommonTree char_literal7_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:54:5: ( ( conditionalExpression )? (
			// ',' ! ( conditionalExpression )? )* )
			// E:\\workspace\\Fel\\Fel.g:54:9: ( conditionalExpression )? ( ','
			// ! ( conditionalExpression )? )*
            {
            root_0 = (CommonTree)adaptor.nil();


				// E:\\workspace\\Fel\\Fel.g:54:9: ( conditionalExpression )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Additive||LA1_0==BooleanLiteral||LA1_0==CharacterLiteral||LA1_0==DecimalLiteral||LA1_0==FloatingPointLiteral||(LA1_0 >= HexLiteral && LA1_0 <= Identifier)||LA1_0==Not||LA1_0==OctalLiteral||LA1_0==StringLiteral||LA1_0==35) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
					// E:\\workspace\\Fel\\Fel.g:54:9: conditionalExpression
                    {
					pushFollow(FOLLOW_conditionalExpression_in_expressionList130);
                    conditionalExpression6=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression6.getTree());

                    }
                    break;

            }


				// E:\\workspace\\Fel\\Fel.g:55:4: ( ',' ! (
				// conditionalExpression )? )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==37) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
						// E:\\workspace\\Fel\\Fel.g:55:5: ',' ! (
						// conditionalExpression )?
            	    {
						char_literal7 = (Token) match(input, 37, FOLLOW_37_in_expressionList137);
						if (state.failed)
							return retval;

            	    // E:\\workspace\\Fel\\Fel.g:55:10: (
						// conditionalExpression )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==Additive||LA2_0==BooleanLiteral||LA2_0==CharacterLiteral||LA2_0==DecimalLiteral||LA2_0==FloatingPointLiteral||(LA2_0 >= HexLiteral && LA2_0 <= Identifier)||LA2_0==Not||LA2_0==OctalLiteral||LA2_0==StringLiteral||LA2_0==35) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
							// E:\\workspace\\Fel\\Fel.g:55:10:
							// conditionalExpression
            	            {
							pushFollow(FOLLOW_conditionalExpression_in_expressionList140);
            	            conditionalExpression8=conditionalExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression8.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, expressionList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expressionList"


    public static class conditionalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalExpression"
	// E:\\workspace\\Fel\\Fel.g:57:1: conditionalExpression :
	// conditionalOrExpression ( Ques ^ conditionalExpression Colon !
	// conditionalExpression )? ;
    public final FelParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        FelParser.conditionalExpression_return retval = new FelParser.conditionalExpression_return();
        retval.start = input.LT(1);

        int conditionalExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Ques10=null;
        Token Colon12=null;
        FelParser.conditionalOrExpression_return conditionalOrExpression9 =null;

        FelParser.conditionalExpression_return conditionalExpression11 =null;

        FelParser.conditionalExpression_return conditionalExpression13 =null;


        CommonTree Ques10_tree=null;
        CommonTree Colon12_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:58:5: ( conditionalOrExpression ( Ques
			// ^ conditionalExpression Colon ! conditionalExpression )? )
			// E:\\workspace\\Fel\\Fel.g:58:9: conditionalOrExpression ( Ques ^
			// conditionalExpression Colon ! conditionalExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression171);
            conditionalOrExpression9=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression9.getTree());

				// E:\\workspace\\Fel\\Fel.g:58:33: ( Ques ^
				// conditionalExpression Colon ! conditionalExpression )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Ques) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
					// E:\\workspace\\Fel\\Fel.g:58:35: Ques ^
					// conditionalExpression Colon ! conditionalExpression
                    {
					Ques10 = (Token) match(input, Ques, FOLLOW_Ques_in_conditionalExpression175);
					if (state.failed)
						return retval;
                    if ( state.backtracking==0 ) {
                    Ques10_tree = 
                    (CommonTree)adaptor.create(Ques10)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Ques10_tree, root_0);
                    }

					pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression178);
                    conditionalExpression11=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression11.getTree());

					Colon12 = (Token) match(input, Colon, FOLLOW_Colon_in_conditionalExpression180);
					if (state.failed)
						return retval;

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression183);
                    conditionalExpression13=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression13.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, conditionalExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "conditionalExpression"


    public static class conditionalOrExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalOrExpression"
	// E:\\workspace\\Fel\\Fel.g:60:1: conditionalOrExpression :
	// conditionalAndExpression ( Or ^ conditionalAndExpression )* ;
    public final FelParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        FelParser.conditionalOrExpression_return retval = new FelParser.conditionalOrExpression_return();
        retval.start = input.LT(1);

        int conditionalOrExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Or15=null;
        FelParser.conditionalAndExpression_return conditionalAndExpression14 =null;

        FelParser.conditionalAndExpression_return conditionalAndExpression16 =null;


        CommonTree Or15_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:61:2: ( conditionalAndExpression ( Or ^
			// conditionalAndExpression )* )
			// E:\\workspace\\Fel\\Fel.g:61:4: conditionalAndExpression ( Or ^
			// conditionalAndExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression199);
            conditionalAndExpression14=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression14.getTree());

				// E:\\workspace\\Fel\\Fel.g:61:29: ( Or ^
				// conditionalAndExpression )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Or) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
						// E:\\workspace\\Fel\\Fel.g:61:30: Or ^
						// conditionalAndExpression
            	    {
						Or15 = (Token) match(input, Or, FOLLOW_Or_in_conditionalOrExpression202);
						if (state.failed)
							return retval;
            	    if ( state.backtracking==0 ) {
            	    Or15_tree = 
            	    (CommonTree)adaptor.create(Or15)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Or15_tree, root_0);
            	    }

						pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression205);
            	    conditionalAndExpression16=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression16.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, conditionalOrExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "conditionalOrExpression"


    public static class conditionalAndExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalAndExpression"
	// E:\\workspace\\Fel\\Fel.g:64:1: conditionalAndExpression :
	// equalityExpression ( And ^ equalityExpression )* ;
    public final FelParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        FelParser.conditionalAndExpression_return retval = new FelParser.conditionalAndExpression_return();
        retval.start = input.LT(1);

        int conditionalAndExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token And18=null;
        FelParser.equalityExpression_return equalityExpression17 =null;

        FelParser.equalityExpression_return equalityExpression19 =null;


        CommonTree And18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:65:2: ( equalityExpression ( And ^
			// equalityExpression )* )
			// E:\\workspace\\Fel\\Fel.g:65:4: equalityExpression ( And ^
			// equalityExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression219);
            equalityExpression17=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression17.getTree());

				// E:\\workspace\\Fel\\Fel.g:65:23: ( And ^ equalityExpression
				// )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==And) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
						// E:\\workspace\\Fel\\Fel.g:65:24: And ^
						// equalityExpression
            	    {
						And18 = (Token) match(input, And, FOLLOW_And_in_conditionalAndExpression222);
						if (state.failed)
							return retval;
            	    if ( state.backtracking==0 ) {
            	    And18_tree = 
            	    (CommonTree)adaptor.create(And18)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(And18_tree, root_0);
            	    }

						pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression225);
            	    equalityExpression19=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression19.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, conditionalAndExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "conditionalAndExpression"


    public static class equalityExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityExpression"
	// E:\\workspace\\Fel\\Fel.g:68:1: equalityExpression : relationalExpression
	// ( Equals ^ relationalExpression )* ;
    public final FelParser.equalityExpression_return equalityExpression() throws RecognitionException {
        FelParser.equalityExpression_return retval = new FelParser.equalityExpression_return();
        retval.start = input.LT(1);

        int equalityExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Equals21=null;
        FelParser.relationalExpression_return relationalExpression20 =null;

        FelParser.relationalExpression_return relationalExpression22 =null;


        CommonTree Equals21_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:69:5: ( relationalExpression ( Equals ^
			// relationalExpression )* )
			// E:\\workspace\\Fel\\Fel.g:69:9: relationalExpression ( Equals ^
			// relationalExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_relationalExpression_in_equalityExpression243);
            relationalExpression20=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression20.getTree());

				// E:\\workspace\\Fel\\Fel.g:69:30: ( Equals ^
				// relationalExpression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Equals) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
						// E:\\workspace\\Fel\\Fel.g:69:32: Equals ^
						// relationalExpression
            	    {
						Equals21 = (Token) match(input, Equals, FOLLOW_Equals_in_equalityExpression247);
						if (state.failed)
							return retval;
            	    if ( state.backtracking==0 ) {
            	    Equals21_tree = 
            	    (CommonTree)adaptor.create(Equals21)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Equals21_tree, root_0);
            	    }

						pushFollow(FOLLOW_relationalExpression_in_equalityExpression250);
            	    relationalExpression22=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression22.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, equalityExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "equalityExpression"


    public static class relationalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationalExpression"
	// E:\\workspace\\Fel\\Fel.g:72:1: relationalExpression : additiveExpression
	// ( Relational ^ additiveExpression )* ;
    public final FelParser.relationalExpression_return relationalExpression() throws RecognitionException {
        FelParser.relationalExpression_return retval = new FelParser.relationalExpression_return();
        retval.start = input.LT(1);

        int relationalExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Relational24=null;
        FelParser.additiveExpression_return additiveExpression23 =null;

        FelParser.additiveExpression_return additiveExpression25 =null;


        CommonTree Relational24_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:73:5: ( additiveExpression ( Relational
			// ^ additiveExpression )* )
			// E:\\workspace\\Fel\\Fel.g:73:9: additiveExpression ( Relational ^
			// additiveExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_additiveExpression_in_relationalExpression272);
            additiveExpression23=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression23.getTree());

				// E:\\workspace\\Fel\\Fel.g:73:28: ( Relational ^
				// additiveExpression )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Relational) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
						// E:\\workspace\\Fel\\Fel.g:73:30: Relational ^
						// additiveExpression
            	    {
						Relational24 = (Token) match(input, Relational, FOLLOW_Relational_in_relationalExpression276);
						if (state.failed)
							return retval;
            	    if ( state.backtracking==0 ) {
            	    Relational24_tree = 
            	    (CommonTree)adaptor.create(Relational24)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Relational24_tree, root_0);
            	    }

						pushFollow(FOLLOW_additiveExpression_in_relationalExpression279);
            	    additiveExpression25=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression25.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, relationalExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "relationalExpression"


    public static class additiveExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additiveExpression"
	// E:\\workspace\\Fel\\Fel.g:76:1: additiveExpression :
	// multiplicativeExpression ( Additive ^ multiplicativeExpression )* ;
    public final FelParser.additiveExpression_return additiveExpression() throws RecognitionException {
        FelParser.additiveExpression_return retval = new FelParser.additiveExpression_return();
        retval.start = input.LT(1);

        int additiveExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Additive27=null;
        FelParser.multiplicativeExpression_return multiplicativeExpression26 =null;

        FelParser.multiplicativeExpression_return multiplicativeExpression28 =null;


        CommonTree Additive27_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:77:5: ( multiplicativeExpression (
			// Additive ^ multiplicativeExpression )* )
			// E:\\workspace\\Fel\\Fel.g:77:9: multiplicativeExpression (
			// Additive ^ multiplicativeExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression301);
            multiplicativeExpression26=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression26.getTree());

				// E:\\workspace\\Fel\\Fel.g:77:34: ( Additive ^
				// multiplicativeExpression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Additive) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
						// E:\\workspace\\Fel\\Fel.g:77:35: Additive ^
						// multiplicativeExpression
            	    {
						Additive27 = (Token) match(input, Additive, FOLLOW_Additive_in_additiveExpression304);
						if (state.failed)
							return retval;
            	    if ( state.backtracking==0 ) {
            	    Additive27_tree = 
            	    (CommonTree)adaptor.create(Additive27)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Additive27_tree, root_0);
            	    }

						pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression307);
            	    multiplicativeExpression28=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression28.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, additiveExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "additiveExpression"


    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicativeExpression"
	// E:\\workspace\\Fel\\Fel.g:80:1: multiplicativeExpression :
	// unaryExpression ( Multiplicative ^ unaryExpression )* ;
    public final FelParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        FelParser.multiplicativeExpression_return retval = new FelParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        int multiplicativeExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Multiplicative30=null;
        FelParser.unaryExpression_return unaryExpression29 =null;

        FelParser.unaryExpression_return unaryExpression31 =null;


        CommonTree Multiplicative30_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:81:5: ( unaryExpression (
			// Multiplicative ^ unaryExpression )* )
			// E:\\workspace\\Fel\\Fel.g:81:9: unaryExpression ( Multiplicative
			// ^ unaryExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression329);
            unaryExpression29=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression29.getTree());

				// E:\\workspace\\Fel\\Fel.g:81:25: ( Multiplicative ^
				// unaryExpression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Multiplicative) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
						// E:\\workspace\\Fel\\Fel.g:81:27: Multiplicative ^
						// unaryExpression
            	    {
						Multiplicative30 = (Token) match(input, Multiplicative,
								FOLLOW_Multiplicative_in_multiplicativeExpression333);
						if (state.failed)
							return retval;
            	    if ( state.backtracking==0 ) {
            	    Multiplicative30_tree = 
            	    (CommonTree)adaptor.create(Multiplicative30)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Multiplicative30_tree, root_0);
            	    }

						pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression336);
            	    unaryExpression31=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression31.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, multiplicativeExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"


    public static class unaryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExpression"
	// E:\\workspace\\Fel\\Fel.g:84:1: unaryExpression : ( Additive ^
	// unaryExpression | unaryExpressionNotPlusMinus );
    public final FelParser.unaryExpression_return unaryExpression() throws RecognitionException {
        FelParser.unaryExpression_return retval = new FelParser.unaryExpression_return();
        retval.start = input.LT(1);

        int unaryExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Additive32=null;
        FelParser.unaryExpression_return unaryExpression33 =null;

        FelParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus34 =null;


        CommonTree Additive32_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:85:7: ( Additive ^ unaryExpression |
			// unaryExpressionNotPlusMinus )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Additive) ) {
                alt11=1;
            }
            else if ( (LA11_0==BooleanLiteral||LA11_0==CharacterLiteral||LA11_0==DecimalLiteral||LA11_0==FloatingPointLiteral||(LA11_0 >= HexLiteral && LA11_0 <= Identifier)||LA11_0==Not||LA11_0==OctalLiteral||LA11_0==StringLiteral||LA11_0==35) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
				// E:\\workspace\\Fel\\Fel.g:85:9: Additive ^ unaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


				Additive32 = (Token) match(input, Additive, FOLLOW_Additive_in_unaryExpression358);
				if (state.failed)
					return retval;
                    if ( state.backtracking==0 ) {
                    Additive32_tree = 
                    (CommonTree)adaptor.create(Additive32)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Additive32_tree, root_0);
                    }

				pushFollow(FOLLOW_unaryExpression_in_unaryExpression361);
                    unaryExpression33=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression33.getTree());

                    }
                    break;
                case 2 :
				// E:\\workspace\\Fel\\Fel.g:86:3: unaryExpressionNotPlusMinus
                    {
                    root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression365);
                    unaryExpressionNotPlusMinus34=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus34.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, unaryExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unaryExpression"


    public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExpressionNotPlusMinus"
	// E:\\workspace\\Fel\\Fel.g:89:1: unaryExpressionNotPlusMinus : ( Not ^
	// unaryExpressionNotPlusMinus | array ( Dot ^ parDot )* );
    public final FelParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        FelParser.unaryExpressionNotPlusMinus_return retval = new FelParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);

        int unaryExpressionNotPlusMinus_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Not35=null;
        Token Dot38=null;
        FelParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus36 =null;

        FelParser.array_return array37 =null;

        FelParser.parDot_return parDot39 =null;


        CommonTree Not35_tree=null;
        CommonTree Dot38_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:90:5: ( Not ^
			// unaryExpressionNotPlusMinus | array ( Dot ^ parDot )* )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Not) ) {
                alt13=1;
            }
            else if ( (LA13_0==BooleanLiteral||LA13_0==CharacterLiteral||LA13_0==DecimalLiteral||LA13_0==FloatingPointLiteral||(LA13_0 >= HexLiteral && LA13_0 <= Identifier)||LA13_0==OctalLiteral||LA13_0==StringLiteral||LA13_0==35) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
				// E:\\workspace\\Fel\\Fel.g:90:8: Not ^
				// unaryExpressionNotPlusMinus
                    {
                    root_0 = (CommonTree)adaptor.nil();


				Not35 = (Token) match(input, Not, FOLLOW_Not_in_unaryExpressionNotPlusMinus380);
				if (state.failed)
					return retval;
                    if ( state.backtracking==0 ) {
                    Not35_tree = 
                    (CommonTree)adaptor.create(Not35)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Not35_tree, root_0);
                    }

				pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus383);
                    unaryExpressionNotPlusMinus36=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus36.getTree());

                    }
                    break;
                case 2 :
				// E:\\workspace\\Fel\\Fel.g:92:9: array ( Dot ^ parDot )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_array_in_unaryExpressionNotPlusMinus397);
                    array37=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array37.getTree());

				// E:\\workspace\\Fel\\Fel.g:92:15: ( Dot ^ parDot )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Dot) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
						// E:\\workspace\\Fel\\Fel.g:92:16: Dot ^ parDot
                    	    {
						Dot38 = (Token) match(input, Dot, FOLLOW_Dot_in_unaryExpressionNotPlusMinus400);
						if (state.failed)
							return retval;
                    	    if ( state.backtracking==0 ) {
                    	    Dot38_tree = 
                    	    (CommonTree)adaptor.create(Dot38)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(Dot38_tree, root_0);
                    	    }

						pushFollow(FOLLOW_parDot_in_unaryExpressionNotPlusMinus403);
                    	    parDot39=parDot();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parDot39.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, unaryExpressionNotPlusMinus_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"


    public static class array_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array"
	// E:\\workspace\\Fel\\Fel.g:94:3: array : primary ( Bracket ^
	// conditionalExpression ']' !)* ;
    public final FelParser.array_return array() throws RecognitionException {
        FelParser.array_return retval = new FelParser.array_return();
        retval.start = input.LT(1);

        int array_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Bracket41=null;
        Token char_literal43=null;
        FelParser.primary_return primary40 =null;

        FelParser.conditionalExpression_return conditionalExpression42 =null;


        CommonTree Bracket41_tree=null;
        CommonTree char_literal43_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:95:3: ( primary ( Bracket ^
			// conditionalExpression ']' !)* )
			// E:\\workspace\\Fel\\Fel.g:95:6: primary ( Bracket ^
			// conditionalExpression ']' !)*
            {
            root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_primary_in_array424);
            primary40=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primary40.getTree());

				// E:\\workspace\\Fel\\Fel.g:95:14: ( Bracket ^
				// conditionalExpression ']' !)*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Bracket) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
						// E:\\workspace\\Fel\\Fel.g:95:15: Bracket ^
						// conditionalExpression ']' !
            	    {
						Bracket41 = (Token) match(input, Bracket, FOLLOW_Bracket_in_array427);
						if (state.failed)
							return retval;
            	    if ( state.backtracking==0 ) {
            	    Bracket41_tree = 
            	    (CommonTree)adaptor.create(Bracket41)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Bracket41_tree, root_0);
            	    }

						pushFollow(FOLLOW_conditionalExpression_in_array430);
            	    conditionalExpression42=conditionalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression42.getTree());

						char_literal43 = (Token) match(input, 38, FOLLOW_38_in_array432);
						if (state.failed)
							return retval;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, array_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "array"


    public static class primary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
	// E:\\workspace\\Fel\\Fel.g:97:5: primary : ( parExpression | parDot ( Dot
	// ^ parDot )* | literal );
    public final FelParser.primary_return primary() throws RecognitionException {
        FelParser.primary_return retval = new FelParser.primary_return();
        retval.start = input.LT(1);

        int primary_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Dot46=null;
        FelParser.parExpression_return parExpression44 =null;

        FelParser.parDot_return parDot45 =null;

        FelParser.parDot_return parDot47 =null;

        FelParser.literal_return literal48 =null;


        CommonTree Dot46_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:98:5: ( parExpression | parDot ( Dot ^
			// parDot )* | literal )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt16=1;
                }
                break;
            case Identifier:
                {
                alt16=2;
                }
                break;
            case StringLiteral:
                {
                int LA16_3 = input.LA(2);

                if ( (synpred17_Fel()) ) {
                    alt16=2;
                }
                else if ( (true) ) {
                    alt16=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;

                }
                }
                break;
            case CharacterLiteral:
                {
                int LA16_4 = input.LA(2);

                if ( (synpred17_Fel()) ) {
                    alt16=2;
                }
                else if ( (true) ) {
                    alt16=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 4, input);

                    throw nvae;

                }
                }
                break;
            case BooleanLiteral:
            case DecimalLiteral:
            case FloatingPointLiteral:
            case HexLiteral:
            case OctalLiteral:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
				// E:\\workspace\\Fel\\Fel.g:98:9: parExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_parExpression_in_primary456);
                    parExpression44=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression44.getTree());

                    }
                    break;
                case 2 :
				// E:\\workspace\\Fel\\Fel.g:99:9: parDot ( Dot ^ parDot )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_parDot_in_primary476);
                    parDot45=parDot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parDot45.getTree());

				// E:\\workspace\\Fel\\Fel.g:99:16: ( Dot ^ parDot )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==Dot) ) {
                            switch ( input.LA(2) ) {
                            case Identifier:
                                {
                                int LA15_3 = input.LA(3);

                                if ( (synpred16_Fel()) ) {
                                    alt15=1;
                                }


                                }
                                break;
                            case StringLiteral:
                                {
                                int LA15_4 = input.LA(3);

                                if ( (synpred16_Fel()) ) {
                                    alt15=1;
                                }


                                }
                                break;
                            case CharacterLiteral:
                                {
                                int LA15_5 = input.LA(3);

                                if ( (synpred16_Fel()) ) {
                                    alt15=1;
                                }


                                }
                                break;

                            }

                        }


                        switch (alt15) {
                    	case 1 :
						// E:\\workspace\\Fel\\Fel.g:99:17: Dot ^ parDot
                    	    {
						Dot46 = (Token) match(input, Dot, FOLLOW_Dot_in_primary479);
						if (state.failed)
							return retval;
                    	    if ( state.backtracking==0 ) {
                    	    Dot46_tree = 
                    	    (CommonTree)adaptor.create(Dot46)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(Dot46_tree, root_0);
                    	    }

						pushFollow(FOLLOW_parDot_in_primary482);
                    	    parDot47=parDot();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parDot47.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
				// E:\\workspace\\Fel\\Fel.g:100:7: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_literal_in_primary493);
                    literal48=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal48.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, primary_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "primary"


    public static class parDot_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parDot"
	// E:\\workspace\\Fel\\Fel.g:110:5: parDot : ( identifierOrFun |
	// StringLiteral | CharacterLiteral );
    public final FelParser.parDot_return parDot() throws RecognitionException {
        FelParser.parDot_return retval = new FelParser.parDot_return();
        retval.start = input.LT(1);

        int parDot_StartIndex = input.index();

        CommonTree root_0 = null;

        Token StringLiteral50=null;
        Token CharacterLiteral51=null;
        FelParser.identifierOrFun_return identifierOrFun49 =null;


        CommonTree StringLiteral50_tree=null;
        CommonTree CharacterLiteral51_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:111:5: ( identifierOrFun |
			// StringLiteral | CharacterLiteral )
            int alt17=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                alt17=1;
                }
                break;
            case StringLiteral:
                {
                alt17=2;
                }
                break;
            case CharacterLiteral:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
				// E:\\workspace\\Fel\\Fel.g:111:7: identifierOrFun
                    {
                    root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_identifierOrFun_in_parDot529);
                    identifierOrFun49=identifierOrFun();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierOrFun49.getTree());

                    }
                    break;
                case 2 :
				// E:\\workspace\\Fel\\Fel.g:112:7: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


				StringLiteral50 = (Token) match(input, StringLiteral, FOLLOW_StringLiteral_in_parDot538);
				if (state.failed)
					return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral50_tree = 
                    (CommonTree)adaptor.create(StringLiteral50)
                    ;
                    adaptor.addChild(root_0, StringLiteral50_tree);
                    }

                    }
                    break;
                case 3 :
				// E:\\workspace\\Fel\\Fel.g:113:7: CharacterLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


				CharacterLiteral51 = (Token) match(input, CharacterLiteral, FOLLOW_CharacterLiteral_in_parDot546);
				if (state.failed)
					return retval;
                    if ( state.backtracking==0 ) {
                    CharacterLiteral51_tree = 
                    (CommonTree)adaptor.create(CharacterLiteral51)
                    ;
                    adaptor.addChild(root_0, CharacterLiteral51_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parDot_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "parDot"


    public static class identifierOrFun_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifierOrFun"
	// E:\\workspace\\Fel\\Fel.g:116:5: identifierOrFun : ( Identifier |
	// Identifier ^ arguments );
    public final FelParser.identifierOrFun_return identifierOrFun() throws RecognitionException {
        FelParser.identifierOrFun_return retval = new FelParser.identifierOrFun_return();
        retval.start = input.LT(1);

        int identifierOrFun_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Identifier52=null;
        Token Identifier53=null;
        FelParser.arguments_return arguments54 =null;


        CommonTree Identifier52_tree=null;
        CommonTree Identifier53_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:117:6: ( Identifier | Identifier ^
			// arguments )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Identifier) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==EOF||(LA18_1 >= Additive && LA18_1 <= And)||LA18_1==Bracket||LA18_1==Colon||(LA18_1 >= Dot && LA18_1 <= Equals)||LA18_1==Multiplicative||(LA18_1 >= Or && LA18_1 <= Relational)||(LA18_1 >= 36 && LA18_1 <= 38)) ) {
                    alt18=1;
                }
                else if ( (LA18_1==35) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
				// E:\\workspace\\Fel\\Fel.g:117:8: Identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


				Identifier52 = (Token) match(input, Identifier, FOLLOW_Identifier_in_identifierOrFun571);
				if (state.failed)
					return retval;
                    if ( state.backtracking==0 ) {
                    Identifier52_tree = 
                    (CommonTree)adaptor.create(Identifier52)
                    ;
                    adaptor.addChild(root_0, Identifier52_tree);
                    }

                    }
                    break;
                case 2 :
				// E:\\workspace\\Fel\\Fel.g:118:9: Identifier ^ arguments
                    {
                    root_0 = (CommonTree)adaptor.nil();


				Identifier53 = (Token) match(input, Identifier, FOLLOW_Identifier_in_identifierOrFun586);
				if (state.failed)
					return retval;
                    if ( state.backtracking==0 ) {
                    Identifier53_tree = 
                    (CommonTree)adaptor.create(Identifier53)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Identifier53_tree, root_0);
                    }

				pushFollow(FOLLOW_arguments_in_identifierOrFun589);
                    arguments54=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments54.getTree());

                    if ( state.backtracking==0 ) {
                         	if((arguments54!=null?input.toString(arguments54.start,arguments54.stop):null)!=null){
                    	  root_0 = new com.greenpineyu.fel.parser.FunNode(root_0);
                          	}
                         }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, identifierOrFun_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "identifierOrFun"


    public static class arguments_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments"
	// E:\\workspace\\Fel\\Fel.g:126:5: arguments : '(' ! ( expressionList )?
	// ')' !;
    public final FelParser.arguments_return arguments() throws RecognitionException {
        FelParser.arguments_return retval = new FelParser.arguments_return();
        retval.start = input.LT(1);

        int arguments_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal55=null;
        Token char_literal57=null;
        FelParser.expressionList_return expressionList56 =null;


        CommonTree char_literal55_tree=null;
        CommonTree char_literal57_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:127:5: ( '(' ! ( expressionList )? ')'
			// !)
			// E:\\workspace\\Fel\\Fel.g:127:9: '(' ! ( expressionList )? ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


				char_literal55 = (Token) match(input, 35, FOLLOW_35_in_arguments624);
				if (state.failed)
					return retval;

            // E:\\workspace\\Fel\\Fel.g:127:14: ( expressionList )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Additive||LA19_0==BooleanLiteral||LA19_0==CharacterLiteral||LA19_0==DecimalLiteral||LA19_0==FloatingPointLiteral||(LA19_0 >= HexLiteral && LA19_0 <= Identifier)||LA19_0==Not||LA19_0==OctalLiteral||LA19_0==StringLiteral||LA19_0==35||LA19_0==37) ) {
                alt19=1;
            }
            else if ( (LA19_0==36) ) {
                int LA19_2 = input.LA(2);

                if ( (synpred21_Fel()) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
					// E:\\workspace\\Fel\\Fel.g:127:14: expressionList
                    {
					pushFollow(FOLLOW_expressionList_in_arguments627);
                    expressionList56=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList56.getTree());

                    }
                    break;

            }


				char_literal57 = (Token) match(input, 36, FOLLOW_36_in_arguments630);
				if (state.failed)
					return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, arguments_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arguments"


    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
	// E:\\workspace\\Fel\\Fel.g:163:1: literal : ( integerLiteral |
	// FloatingPointLiteral | CharacterLiteral | StringLiteral | BooleanLiteral
	// );
    public final FelParser.literal_return literal() throws RecognitionException {
        FelParser.literal_return retval = new FelParser.literal_return();
        retval.start = input.LT(1);

        int literal_StartIndex = input.index();

        CommonTree root_0 = null;

        Token FloatingPointLiteral59=null;
        Token CharacterLiteral60=null;
        Token StringLiteral61=null;
        Token BooleanLiteral62=null;
        FelParser.integerLiteral_return integerLiteral58 =null;


        CommonTree FloatingPointLiteral59_tree=null;
        CommonTree CharacterLiteral60_tree=null;
        CommonTree StringLiteral61_tree=null;
        CommonTree BooleanLiteral62_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:164:5: ( integerLiteral |
			// FloatingPointLiteral | CharacterLiteral | StringLiteral |
			// BooleanLiteral )
            int alt20=5;
            switch ( input.LA(1) ) {
            case DecimalLiteral:
            case HexLiteral:
            case OctalLiteral:
                {
                alt20=1;
                }
                break;
            case FloatingPointLiteral:
                {
                alt20=2;
                }
                break;
            case CharacterLiteral:
                {
                alt20=3;
                }
                break;
            case StringLiteral:
                {
                alt20=4;
                }
                break;
            case BooleanLiteral:
                {
                alt20=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
				// E:\\workspace\\Fel\\Fel.g:164:9: integerLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_integerLiteral_in_literal669);
                    integerLiteral58=integerLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteral58.getTree());

                    }
                    break;
                case 2 :
				// E:\\workspace\\Fel\\Fel.g:165:9: FloatingPointLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


				FloatingPointLiteral59 = (Token) match(input, FloatingPointLiteral,
						FOLLOW_FloatingPointLiteral_in_literal679);
				if (state.failed)
					return retval;
                    if ( state.backtracking==0 ) {
                    FloatingPointLiteral59_tree = 
                    (CommonTree)adaptor.create(FloatingPointLiteral59)
                    ;
                    adaptor.addChild(root_0, FloatingPointLiteral59_tree);
                    }

                    }
                    break;
                case 3 :
				// E:\\workspace\\Fel\\Fel.g:166:9: CharacterLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


				CharacterLiteral60 = (Token) match(input, CharacterLiteral, FOLLOW_CharacterLiteral_in_literal689);
				if (state.failed)
					return retval;
                    if ( state.backtracking==0 ) {
                    CharacterLiteral60_tree = 
                    (CommonTree)adaptor.create(CharacterLiteral60)
                    ;
                    adaptor.addChild(root_0, CharacterLiteral60_tree);
                    }

                    }
                    break;
                case 4 :
				// E:\\workspace\\Fel\\Fel.g:167:9: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


				StringLiteral61 = (Token) match(input, StringLiteral, FOLLOW_StringLiteral_in_literal699);
				if (state.failed)
					return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral61_tree = 
                    (CommonTree)adaptor.create(StringLiteral61)
                    ;
                    adaptor.addChild(root_0, StringLiteral61_tree);
                    }

                    }
                    break;
                case 5 :
				// E:\\workspace\\Fel\\Fel.g:168:9: BooleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


				BooleanLiteral62 = (Token) match(input, BooleanLiteral, FOLLOW_BooleanLiteral_in_literal709);
				if (state.failed)
					return retval;
                    if ( state.backtracking==0 ) {
                    BooleanLiteral62_tree = 
                    (CommonTree)adaptor.create(BooleanLiteral62)
                    ;
                    adaptor.addChild(root_0, BooleanLiteral62_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, literal_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class integerLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integerLiteral"
	// E:\\workspace\\Fel\\Fel.g:170:1: integerLiteral : ( HexLiteral |
	// OctalLiteral | DecimalLiteral );
    public final FelParser.integerLiteral_return integerLiteral() throws RecognitionException {
        FelParser.integerLiteral_return retval = new FelParser.integerLiteral_return();
        retval.start = input.LT(1);

        int integerLiteral_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set63=null;

        CommonTree set63_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:171:5: ( HexLiteral | OctalLiteral |
			// DecimalLiteral )
            // E:\\workspace\\Fel\\Fel.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set63=(Token)input.LT(1);

            if ( input.LA(1)==DecimalLiteral||input.LA(1)==HexLiteral||input.LA(1)==OctalLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set63)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, integerLiteral_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "integerLiteral"

    // $ANTLR start synpred16_Fel
    public final void synpred16_Fel_fragment() throws RecognitionException {
		// E:\\workspace\\Fel\\Fel.g:99:17: ( Dot parDot )
		// E:\\workspace\\Fel\\Fel.g:99:17: Dot parDot
        {
			match(input, Dot, FOLLOW_Dot_in_synpred16_Fel479);
			if (state.failed)
				return;

        pushFollow(FOLLOW_parDot_in_synpred16_Fel482);
        parDot();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_Fel

    // $ANTLR start synpred17_Fel
    public final void synpred17_Fel_fragment() throws RecognitionException {
		// E:\\workspace\\Fel\\Fel.g:99:9: ( parDot ( Dot parDot )* )
		// E:\\workspace\\Fel\\Fel.g:99:9: parDot ( Dot parDot )*
        {
			pushFollow(FOLLOW_parDot_in_synpred17_Fel476);
        parDot();

        state._fsp--;
        if (state.failed) return ;

			// E:\\workspace\\Fel\\Fel.g:99:16: ( Dot parDot )*
        loop22:
        do {
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Dot) ) {
                alt22=1;
            }


            switch (alt22) {
        	case 1 :
					// E:\\workspace\\Fel\\Fel.g:99:17: Dot parDot
        	    {
					match(input, Dot, FOLLOW_Dot_in_synpred17_Fel479);
					if (state.failed)
						return;

        	    pushFollow(FOLLOW_parDot_in_synpred17_Fel482);
        	    parDot();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop22;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred17_Fel

    // $ANTLR start synpred21_Fel
    public final void synpred21_Fel_fragment() throws RecognitionException {
		// E:\\workspace\\Fel\\Fel.g:127:14: ( expressionList )
		// E:\\workspace\\Fel\\Fel.g:127:14: expressionList
        {
			pushFollow(FOLLOW_expressionList_in_synpred21_Fel627);
        expressionList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred21_Fel

    // Delegated rules

    public final boolean synpred16_Fel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_Fel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_Fel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_Fel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_Fel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_Fel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_conditionalExpression_in_program87 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_parExpression105 = new BitSet(new long[] { 0x00000039141A0A50L });
	public static final BitSet FOLLOW_expressionList_in_parExpression108 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_36_in_parExpression110 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_conditionalExpression_in_expressionList130 = new BitSet(
			new long[] { 0x0000002000000002L });
	public static final BitSet FOLLOW_37_in_expressionList137 = new BitSet(new long[] { 0x00000029141A0A52L });
	public static final BitSet FOLLOW_conditionalExpression_in_expressionList140 = new BitSet(
			new long[] { 0x0000002000000002L });
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression171 = new BitSet(
			new long[] { 0x0000000040000002L });
	public static final BitSet FOLLOW_Ques_in_conditionalExpression175 = new BitSet(new long[] { 0x00000009141A0A50L });
	public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression178 = new BitSet(
			new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_Colon_in_conditionalExpression180 = new BitSet(new long[] { 0x00000009141A0A50L });
	public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression183 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression199 = new BitSet(
			new long[] { 0x0000000020000002L });
	public static final BitSet FOLLOW_Or_in_conditionalOrExpression202 = new BitSet(new long[] { 0x00000009141A0A50L });
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression205 = new BitSet(
			new long[] { 0x0000000020000002L });
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression219 = new BitSet(
			new long[] { 0x0000000000000022L });
	public static final BitSet FOLLOW_And_in_conditionalAndExpression222 = new BitSet(
			new long[] { 0x00000009141A0A50L });
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression225 = new BitSet(
			new long[] { 0x0000000000000022L });
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression243 = new BitSet(
			new long[] { 0x0000000000002002L });
	public static final BitSet FOLLOW_Equals_in_equalityExpression247 = new BitSet(new long[] { 0x00000009141A0A50L });
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression250 = new BitSet(
			new long[] { 0x0000000000002002L });
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression272 = new BitSet(
			new long[] { 0x0000000080000002L });
	public static final BitSet FOLLOW_Relational_in_relationalExpression276 = new BitSet(
			new long[] { 0x00000009141A0A50L });
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression279 = new BitSet(
			new long[] { 0x0000000080000002L });
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression301 = new BitSet(
			new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_Additive_in_additiveExpression304 = new BitSet(new long[] { 0x00000009141A0A50L });
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression307 = new BitSet(
			new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression329 = new BitSet(
			new long[] { 0x0000000002000002L });
	public static final BitSet FOLLOW_Multiplicative_in_multiplicativeExpression333 = new BitSet(
			new long[] { 0x00000009141A0A50L });
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression336 = new BitSet(
			new long[] { 0x0000000002000002L });
	public static final BitSet FOLLOW_Additive_in_unaryExpression358 = new BitSet(new long[] { 0x00000009141A0A50L });
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression361 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression365 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Not_in_unaryExpressionNotPlusMinus380 = new BitSet(
			new long[] { 0x00000009141A0A40L });
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus383 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_array_in_unaryExpressionNotPlusMinus397 = new BitSet(
			new long[] { 0x0000000000001002L });
	public static final BitSet FOLLOW_Dot_in_unaryExpressionNotPlusMinus400 = new BitSet(
			new long[] { 0x0000000100100200L });
	public static final BitSet FOLLOW_parDot_in_unaryExpressionNotPlusMinus403 = new BitSet(
			new long[] { 0x0000000000001002L });
	public static final BitSet FOLLOW_primary_in_array424 = new BitSet(new long[] { 0x0000000000000082L });
	public static final BitSet FOLLOW_Bracket_in_array427 = new BitSet(new long[] { 0x00000009141A0A50L });
	public static final BitSet FOLLOW_conditionalExpression_in_array430 = new BitSet(new long[] { 0x0000004000000000L });
	public static final BitSet FOLLOW_38_in_array432 = new BitSet(new long[] { 0x0000000000000082L });
	public static final BitSet FOLLOW_parExpression_in_primary456 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_parDot_in_primary476 = new BitSet(new long[] { 0x0000000000001002L });
	public static final BitSet FOLLOW_Dot_in_primary479 = new BitSet(new long[] { 0x0000000100100200L });
	public static final BitSet FOLLOW_parDot_in_primary482 = new BitSet(new long[] { 0x0000000000001002L });
	public static final BitSet FOLLOW_literal_in_primary493 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_identifierOrFun_in_parDot529 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_StringLiteral_in_parDot538 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CharacterLiteral_in_parDot546 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Identifier_in_identifierOrFun571 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Identifier_in_identifierOrFun586 = new BitSet(new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_arguments_in_identifierOrFun589 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_35_in_arguments624 = new BitSet(new long[] { 0x00000039141A0A50L });
	public static final BitSet FOLLOW_expressionList_in_arguments627 = new BitSet(new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_36_in_arguments630 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_integerLiteral_in_literal669 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FloatingPointLiteral_in_literal679 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CharacterLiteral_in_literal689 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_StringLiteral_in_literal699 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_BooleanLiteral_in_literal709 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Dot_in_synpred16_Fel479 = new BitSet(new long[] { 0x0000000100100200L });
	public static final BitSet FOLLOW_parDot_in_synpred16_Fel482 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_parDot_in_synpred17_Fel476 = new BitSet(new long[] { 0x0000000000001002L });
	public static final BitSet FOLLOW_Dot_in_synpred17_Fel479 = new BitSet(new long[] { 0x0000000100100200L });
	public static final BitSet FOLLOW_parDot_in_synpred17_Fel482 = new BitSet(new long[] { 0x0000000000001002L });
	public static final BitSet FOLLOW_expressionList_in_synpred21_Fel627 = new BitSet(
			new long[] { 0x0000000000000002L });

}