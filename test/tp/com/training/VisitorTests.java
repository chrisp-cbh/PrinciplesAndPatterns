package tp.com.training;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import tp.com.training.patterns.visitor.PipeVisitor;

import com.tp.training.patterns.visitor.CsvVisitor;
import com.tp.training.patterns.visitor.VisitedCollection;
import com.tp.training.patterns.visitor.VisitedItem;

public class VisitorTests {
	private VisitedCollection visitedCollection;
	@Before
	public void before() {
		visitedCollection = new VisitedCollection();
		visitedCollection.add(new VisitedItem("david"));
		visitedCollection.add(new VisitedItem("chris"));
	}
	@Test
	public void csvVisitorReturnsResultInCsvFormat(){
		CsvVisitor csvVisitor = new CsvVisitor();
		visitedCollection.accept(csvVisitor);
		assertEquals("david,chris", csvVisitor.getResult());
	}
	@Test
	public void pipeVisitorReturnsPipeDelimitedResult(){
		PipeVisitor pipeVisitor= new PipeVisitor();
		visitedCollection.accept(pipeVisitor);
		assertEquals("|david|chris|", pipeVisitor.getResult());
	}
}
