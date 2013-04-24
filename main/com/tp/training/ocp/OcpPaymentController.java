package com.tp.training.ocp;

public class OcpPaymentController {
	public void makePayment(PaymentType type, double amount){
		OcpPayment payment = new OcpPayment(amount);
		OcpPaymentProcessor processor = OcpPaymentProcessor.create(type);
		processor.process(payment);
	}
}
