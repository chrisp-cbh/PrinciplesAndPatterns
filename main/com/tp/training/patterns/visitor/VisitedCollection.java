package com.tp.training.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitedCollection {
	protected List<VisitedItem> _items = new ArrayList<VisitedItem>();
	public void add(VisitedItem item){
		_items.add(item);
	}
	public int getCount(){
		return _items.size();
	}
	public void accept(Visitor visitor){
		visitor.visit(this);
		for(VisitedItem item:_items){
			item.accept(visitor);
		}
	}
}
