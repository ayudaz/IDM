/*
* generated by Xtext
*/
package org.xtext.istic.mapUI.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.istic.mapUI.services.MapUIGrammarAccess;

public class MapUIParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MapUIGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.istic.mapUI.parser.antlr.internal.InternalMapUIParser createParser(XtextTokenStream stream) {
		return new org.xtext.istic.mapUI.parser.antlr.internal.InternalMapUIParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "MapUI";
	}
	
	public MapUIGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MapUIGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
