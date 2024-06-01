package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class PaymentCard {
	@Column(name="card_no",length = 30,unique = true,nullable = false)
	private String cardNumber;
	@Column(name="exp_date")
	private LocalDate expDate;
	@Column(length = 10)
	private String cvv;
	public PaymentCard() {
		// TODO Auto-generated constructor stub
	}
	public PaymentCard(String cardNumber, LocalDate expDate, String cvv) {
		super();
		this.cardNumber = cardNumber;
		this.expDate = expDate;
		this.cvv = cvv;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public LocalDate getExpDate() {
		return expDate;
	}
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "PaymentCard [cardNumber=" + cardNumber + ", expDate=" + expDate + ", cvv=" + cvv + "]";
	}
		
}
