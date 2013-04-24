package com.tp.training.ocp;

public class OcpNullPaymentProcessor extends OcpPaymentProcessor {
	protected OcpNullPaymentProcessor() {}

	@Override
	public void process(OcpPayment payment) {
		// nothing to see here, folks :)
	}
}
