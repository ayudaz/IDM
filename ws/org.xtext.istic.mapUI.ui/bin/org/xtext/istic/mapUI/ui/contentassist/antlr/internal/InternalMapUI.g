/*
* generated by Xtext
*/
grammar InternalMapUI;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.istic.mapUI.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.istic.mapUI.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.istic.mapUI.services.MapUIGrammarAccess;

}

@parser::members {
 
 	private MapUIGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(MapUIGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleMapUI
entryRuleMapUI 
:
{ before(grammarAccess.getMapUIRule()); }
	 ruleMapUI
{ after(grammarAccess.getMapUIRule()); } 
	 EOF 
;

// Rule MapUI
ruleMapUI
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMapUIAccess().getMappingsAssignment()); }
(rule__MapUI__MappingsAssignment)*
{ after(grammarAccess.getMapUIAccess().getMappingsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMapping
entryRuleMapping 
:
{ before(grammarAccess.getMappingRule()); }
	 ruleMapping
{ after(grammarAccess.getMappingRule()); } 
	 EOF 
;

// Rule Mapping
ruleMapping
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMappingAccess().getGroup()); }
(rule__Mapping__Group__0)
{ after(grammarAccess.getMappingAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleType
entryRuleType 
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTypeAccess().getCheckboxParserRuleCall()); }
	ruleCheckbox
{ after(grammarAccess.getTypeAccess().getCheckboxParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCheckbox
entryRuleCheckbox 
:
{ before(grammarAccess.getCheckboxRule()); }
	 ruleCheckbox
{ after(grammarAccess.getCheckboxRule()); } 
	 EOF 
;

// Rule Checkbox
ruleCheckbox
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCheckboxAccess().getCheckboxKeyword()); }

	'Checkbox' 

{ after(grammarAccess.getCheckboxAccess().getCheckboxKeyword()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Mapping__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mapping__Group__0__Impl
	rule__Mapping__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getQuestionKeyword_0()); }

	'Question ' 

{ after(grammarAccess.getMappingAccess().getQuestionKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mapping__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mapping__Group__1__Impl
	rule__Mapping__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getNameAssignment_1()); }
(rule__Mapping__NameAssignment_1)
{ after(grammarAccess.getMappingAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mapping__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mapping__Group__2__Impl
	rule__Mapping__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMappingAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mapping__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mapping__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getTypeAssignment_3()); }
(rule__Mapping__TypeAssignment_3)
{ after(grammarAccess.getMappingAccess().getTypeAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}











rule__MapUI__MappingsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMapUIAccess().getMappingsMappingParserRuleCall_0()); }
	ruleMapping{ after(grammarAccess.getMapUIAccess().getMappingsMappingParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__TypeAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getTypeTypeParserRuleCall_3_0()); }
	ruleType{ after(grammarAccess.getMappingAccess().getTypeTypeParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


