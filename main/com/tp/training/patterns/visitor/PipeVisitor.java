package com.tp.training.patterns.visitor;


public class PipeVisitor extends Visitor {
	@Override
	public void visit(VisitedCollection visitedCollection) {
		setResult("|");
	}
	@Override
	public void visit(VisitedItem visitedItem) {
		setResult(getResult()+visitedItem.getValue()+"|");
	}
	@Override
	public void visit(TivertonItem visiteditem) {
		setResult(getResult()+visiteditem.getValue()+" - from Tiverton|");
	}
}
