package com.tp.training.patterns.iterator;
import java.util.Iterator;

import com.tp.training.main.ClassWithCollection;


public class ClassUsingIterator extends ClassWithCollection {
	public Iterator<String> getIterator(){
		return  _strings.iterator();
	}
}
