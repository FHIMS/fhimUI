/*
 * generated by Xtext 2.10.0
 */
package gov.us.fhim.xtext.cimi.parser.antlr;

import com.google.inject.Inject;
import gov.us.fhim.xtext.cimi.parser.antlr.internal.InternalCIMIDSLParser;
import gov.us.fhim.xtext.cimi.services.CIMIDSLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class CIMIDSLParser extends AbstractAntlrParser {

	@Inject
	private CIMIDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCIMIDSLParser createParser(XtextTokenStream stream) {
		return new InternalCIMIDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ArchetypeModel";
	}

	public CIMIDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CIMIDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
