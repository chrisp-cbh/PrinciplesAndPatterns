package tp.com.training;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.tp.training.main.ClassWithCollection;


public class CollectionTests {
	private ClassWithCollection classWithCollection;
	@Before
	public void before(){
		classWithCollection = new ClassWithCollection();
	}
	@Test
	public void countShouldBeZeroOnConstruction(){
		assertEquals(0,classWithCollection .getCount());
	}
	@Test
	public void addShouldIncrementCount(){
		classWithCollection.add("a string");
		assertEquals(1,classWithCollection.getCount());
	}

}
