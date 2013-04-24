package com.tp.training.ocp;
public class Payment {
	private PaymentType _paymentType;
	private double _amount;
	public Payment(PaymentType paymentType,double amount) {
		_paymentType = paymentType;
		_amount = amount;
	}
	PaymentType getPaymentType(){
		return _paymentType;
	}
	public double getAmount() {
		return _amount;
	}
}
