package com.tp.training.patterns.visitor;

public class VisitedItem {
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
