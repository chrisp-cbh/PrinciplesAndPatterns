package com.tp.training.patterns.visitor;

public class CsvVisitor extends Visitor {
	@Override
	public void visit(VisitedCollection visitedCollection) {
		super.visit(visitedCollection);
	}
	@Override
	public void visit(VisitedItem visitedItem) {
		if("" != getResult()){
			setResult(getResult() + ",");
		}
		setResult(getResult() + visitedItem.getValue());
	}
	@Override
	public void visit(TivertonItem visiteditem) {
	}
}
