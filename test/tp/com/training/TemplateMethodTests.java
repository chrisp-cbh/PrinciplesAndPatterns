package tp.com.training;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tp.training.patterns.templatemethod.CsvMaker;
import com.tp.training.patterns.templatemethod.PipeMaker;
import com.tp.training.patterns.templatemethod.TemplateMethodBase;


public class TemplateMethodTests {
	public void addDavidAndChris(TemplateMethodBase base) {
		base.add("david");
		base.add("chris");
	}
	@Test
	public void csvMakerReturnsResultInCsvFormat(){
		CsvMaker csvMaker= new CsvMaker();
		addDavidAndChris(csvMaker);
		csvMaker.iterateStrings();
		assertEquals("david,chris", csvMaker.getResult());
	}
	@Test
	public void pipeMakerReturnsPipeDelimitedResult(){
		PipeMaker pipeMaker= new PipeMaker();
		addDavidAndChris(pipeMaker);
		pipeMaker.iterateStrings();
		assertEquals("|david|chris|", pipeMaker.getResult());
	}
}
