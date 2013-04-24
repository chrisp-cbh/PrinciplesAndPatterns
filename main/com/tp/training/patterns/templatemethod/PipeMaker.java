package com.tp.training.patterns.templatemethod;


public class PipeMaker extends TemplateMethodBase {
	@Override
	protected void templateMethod(String string) {
		if("" == getResult()){
			setResult("|");
		}
		setResult(getResult()+string+"|");
	}
}
