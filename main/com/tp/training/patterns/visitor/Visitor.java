package com.tp.training.patterns.visitor;

public class Visitor {
	private String _result;
	protected void setResult(String value){
		_result = value;
	}
	public String getResult(){
		return _result;
	}
	public void visit(VisitedCollection visitedCollection) {
		setResult("");
	}
	public void visit(VisitedItem visitedItem) {
	}
	public void visit(TivertonItem visiteditem){
	}
}
