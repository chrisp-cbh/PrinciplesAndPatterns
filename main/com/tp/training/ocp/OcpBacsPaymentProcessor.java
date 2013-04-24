package com.tp.training.ocp;

public class OcpBacsPaymentProcessor extends OcpPaymentProcessor {
	protected OcpBacsPaymentProcessor() {}

	@Override
	public void process(OcpPayment payment) {
		// do BACS payment processing here
	}
}
