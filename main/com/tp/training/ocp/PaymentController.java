package com.tp.training.ocp;

public class PaymentController {
	public void makePayment(PaymentType type, double amount){
		Payment payment = new Payment(amount);
		processPayment(type,payment );
	}
	private void processPayment(PaymentType type,Payment payment){
		switch(type){
		case CASH:
			processCashPayment(payment);
			break;
		case CARD:
			processCardPayment(payment);
			break;
		case CHEQUE:
			processChequePayment(payment);
			break;
		case BACS:
			processBacsPayment(payment);
			break;
		}
	}
	private void processCardPayment(Payment payment) {
		// do card payment processing here
	}
	private void processCashPayment(Payment payment) {
		// do cash payment processing here
	}
	private void processBacsPayment(Payment payment) {
		// do BACS payment processing here
	}
	private void processChequePayment(Payment payment) {
		// do cheque payment processing here
	}
}
