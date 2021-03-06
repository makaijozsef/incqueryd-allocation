/*
* generated by Xtext
*/
package org.eclipse.incquery.patternlanguage.mondix.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.incquery.patternlanguage.mondix.services.MondixPatternLanguageGrammarAccess;

public class MondixPatternLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MondixPatternLanguageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.incquery.patternlanguage.mondix.parser.antlr.internal.InternalMondixPatternLanguageParser createParser(XtextTokenStream stream) {
		return new org.eclipse.incquery.patternlanguage.mondix.parser.antlr.internal.InternalMondixPatternLanguageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "MondixPatternModel";
	}
	
	public MondixPatternLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MondixPatternLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
