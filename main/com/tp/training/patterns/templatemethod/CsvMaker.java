package com.tp.training.patterns.templatemethod;

public class CsvMaker extends TemplateMethodBase {
	@Override
	protected void templateMethod(String string) {
		if("" != getResult()){
			setResult(getResult() + ",");
		}
		setResult(getResult() + string);
	}
}
