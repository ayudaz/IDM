/*
* generated by Xtext
*/
grammar InternalMapUI;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.istic.mapUI.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.istic.mapUI.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.istic.mapUI.services.MapUIGrammarAccess;

}

@parser::members {

 	private MapUIGrammarAccess grammarAccess;
 	
    public InternalMapUIParser(TokenStream input, MapUIGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "MapUI";	
   	}
   	
   	@Override
   	protected MapUIGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMapUI
entryRuleMapUI returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMapUIRule()); }
	 iv_ruleMapUI=ruleMapUI 
	 { $current=$iv_ruleMapUI.current; } 
	 EOF 
;

// Rule MapUI
ruleMapUI returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getMapUIAccess().getMappingsMappingParserRuleCall_0()); 
	    }
		lv_Mappings_0_0=ruleMapping		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMapUIRule());
	        }
       		add(
       			$current, 
       			"Mappings",
        		lv_Mappings_0_0, 
        		"Mapping");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleMapping
entryRuleMapping returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMappingRule()); }
	 iv_ruleMapping=ruleMapping 
	 { $current=$iv_ruleMapping.current; } 
	 EOF 
;

// Rule Mapping
ruleMapping returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Question ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getQuestionKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMappingRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMappingAccess().getTypeTypeParserRuleCall_3_0()); 
	    }
		lv_type_3_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMappingRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_3_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleType
entryRuleType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); } 
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current.getText(); }  
	 EOF 
;

// Rule Type
ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getTypeAccess().getCheckBoxParserRuleCall_0()); 
    }
    this_CheckBox_0=ruleCheckBox    {
		$current.merge(this_CheckBox_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTypeAccess().getRadioButtonParserRuleCall_1()); 
    }
    this_RadioButton_1=ruleRadioButton    {
		$current.merge(this_RadioButton_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    ;





// Entry rule entryRuleCheckBox
entryRuleCheckBox returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getCheckBoxRule()); } 
	 iv_ruleCheckBox=ruleCheckBox 
	 { $current=$iv_ruleCheckBox.current.getText(); }  
	 EOF 
;

// Rule CheckBox
ruleCheckBox returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	kw='CheckBox' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getCheckBoxAccess().getCheckBoxKeyword()); 
    }

    ;





// Entry rule entryRuleRadioButton
entryRuleRadioButton returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getRadioButtonRule()); } 
	 iv_ruleRadioButton=ruleRadioButton 
	 { $current=$iv_ruleRadioButton.current.getText(); }  
	 EOF 
;

// Rule RadioButton
ruleRadioButton returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	kw='RadioButton' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getRadioButtonAccess().getRadioButtonKeyword()); 
    }

    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


