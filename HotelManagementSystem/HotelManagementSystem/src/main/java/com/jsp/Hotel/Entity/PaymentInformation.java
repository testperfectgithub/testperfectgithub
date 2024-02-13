package com.jsp.Hotel.Entity;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PaymentInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentid;
	@Column(name = "Card_Number", length = 16)
	private String cardnumber;
	@Column(name = "Card_Name")
	private String cardname;
	@Column(name = "Expire_Date")
	private LocalDate expiredate;
	@Column(name = "Price")
	private double price;
}
