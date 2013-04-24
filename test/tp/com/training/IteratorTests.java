package tp.com.training;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.tp.training.patterns.iterator.ClassUsingIterator;

public class IteratorTests {
	private ClassUsingIterator iteratorClass;
	private Iterator<String> iterator;
	@Before
	public void before(){
		iteratorClass= new ClassUsingIterator();
		iteratorClass.add("david");
	}
	@Test
	public void firstCallToNextShouldReturnFirstItemInList(){
		createIterator();
		assertEquals("david",iterator.next());
	}
	@Test
	public void secondCallToNextShouldReturnSecondItemInList(){
		iteratorClass.add("chris");
		createIterator();
		iterator.next();
		assertEquals("chris",iterator.next());
	}
	@Test
	public void hasNextShouldReturnTrueWhenItemsLeftInList(){
		iteratorClass.add("chris");
		createIterator();
		iterator.next();
		assertTrue(iterator.hasNext());
	}
	@Test
	public void hasNextShouldReturnFalseWhenNoItemsLeftInList(){
		createIterator();
		iterator.next();
		assertFalse(iterator.hasNext());
	}
	public void createIterator() {
		iterator = iteratorClass.getIterator();
	}
}
