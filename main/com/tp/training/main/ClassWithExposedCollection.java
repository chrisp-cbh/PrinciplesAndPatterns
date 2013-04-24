package com.tp.training.main;
import java.util.ArrayList;
import java.util.List;


/*
 class that exposes its collection so that clients can 
 access the items in the collection
 Unfortunately this also allows clients to access all methods
 on the List interface, which may not be what you want and 
 negates the reasons for wrapping the list in the first place
 */

public class ClassWithExposedCollection{
	protected List<String> _strings = new ArrayList<String>();
	public void add(String string) {
		_strings.add(string);
	}
	public int getCount(){
		return _strings.size();
	}
	public List<String> getStrings() {
		return _strings;
	}
}
