package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//cardNo , date , loc
@Embeddable //mandatory cls level annotation : for composite value types(elements)
public class AdhaarCard {
	@Column(name="card_no",unique = true,length = 20)
	private String cardNumber;
	@Column(name="creation_date")
	private LocalDate creationDate;
	@Column(length = 40)
	private String location;
	
	public AdhaarCard(String cardNumber, LocalDate creationDate, String location) {
		super();
		this.cardNumber = cardNumber;
		this.creationDate = creationDate;
		this.location = location;
	}
	
	public AdhaarCard() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AdhaarCard [cardNumber=" + cardNumber + ", creationDate=" + creationDate + ", location=" + location
				+ "]";
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
