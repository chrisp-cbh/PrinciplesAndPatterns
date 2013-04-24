package com.tp.training.patterns.visitor;

public class TivertonItem extends VisitedItem {

	public TivertonItem(String value) {
		super(value);
	}
	public void accept(Visitor visitor){
		visitor.visit(this);
	}

}
