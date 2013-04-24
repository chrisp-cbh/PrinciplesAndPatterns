package com.tp.training.patterns.visitor;

public class VisitedItem implements Visited {
	private String _value;
	public String getValue(){
		return _value;
	}
	public VisitedItem(String value){
		_value = value;
	}
	public void accept(Visitor visitor){
		visitor.visit(this);
	}
}
