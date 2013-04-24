package com.tp.training.main;

import java.util.ArrayList;
import java.util.List;

public class ClassWithCollection {
	protected List<String> _strings = new ArrayList<String>();
	public void add(String string) {
		_strings.add(string);
	}
	public int getCount(){
		return _strings.size();
	}
}
