package com;

public class TextEditor {
private SpellChecker s;
public TextEditor()
{
	
}
public SpellChecker getS() {
	return s;
}
public void setS(SpellChecker s) {
	this.s = s;
}

public void spellCheck() {
	s.checkSpelling();
}
}
