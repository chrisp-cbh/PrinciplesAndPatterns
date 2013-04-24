package com.tp.training.patterns.templatemethod;

import java.util.Iterator;

import com.tp.training.patterns.iterator.ClassUsingIterator;

public class TemplateMethodBase extends ClassUsingIterator{
	private String _result;
	protected void setResult(String value){
		_result = value;
	}
	public String getResult(){
		return _result;
	}
	protected void templateMethod(String string){}
	public void iterateStrings(){
		setResult("");
		for(Iterator<String> iterator = getIterator();iterator.hasNext();){
			templateMethod(iterator.next());
		}
	}
}
