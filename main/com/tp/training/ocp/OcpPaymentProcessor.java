package com.tp.training.ocp;

public class OcpPaymentProcessor {
	protected OcpPaymentProcessor() {}
	public void process(OcpPayment payment){}
	
	public static OcpPaymentProcessor create(PaymentType type){
		switch(type){
		case CARD:
			return new OcpCardPaymentProcessor();
		case CASH:
			return new OcpCashPaymentProcessor();
		case CHEQUE:
			return new OcpChequePaymentProcessor();
		case BACS:
			return new OcpBacsPaymentProcessor();
		default:
			return new OcpNullPaymentProcessor();
		}
	}
}
