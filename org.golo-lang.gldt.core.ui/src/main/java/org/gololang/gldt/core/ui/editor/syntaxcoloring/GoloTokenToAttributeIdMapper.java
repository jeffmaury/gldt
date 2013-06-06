/**
 * 
 */
package org.gololang.gldt.core.ui.editor.syntaxcoloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

/**
 * 
 */
public class GoloTokenToAttributeIdMapper extends
		DefaultAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		System.out.println(tokenName);
		if ("RULE_STRING".equals(tokenName) || "RULE_CHAR".equals(tokenName)) {
			return DefaultHighlightingConfiguration.STRING_ID;
		} else if ("RULE_COMMENT".equals(tokenName)) {
			return DefaultHighlightingConfiguration.COMMENT_ID;
		} else if ("RULE_NUMBER".equals(tokenName) || "RULE_LONG_NUMBER".equals(tokenName) || "RULE_FLOAT".equals(tokenName) || "RULE_FLOATING_NUMBER".equals(tokenName)) {
			return DefaultHighlightingConfiguration.NUMBER_ID;
		} else if ("RULE_NEWLINE".equals(tokenName)) {
			return DefaultHighlightingConfiguration.DEFAULT_ID;
		} else if ("RULE_IDENTIFIER".equals(tokenName)) {
			return DefaultHighlightingConfiguration.DEFAULT_ID;
		} else if (tokenName.startsWith("RULE_") && !(tokenName.endsWith("OPERATOR") || "RULE_INVOCATION".equals(tokenName))) {
			return DefaultHighlightingConfiguration.KEYWORD_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}

}
