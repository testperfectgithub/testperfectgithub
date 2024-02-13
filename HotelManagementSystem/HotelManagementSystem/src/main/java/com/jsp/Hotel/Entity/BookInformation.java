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
public class BookInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookingid;
	@Column(name = "First_Name")
private String firstname;
	@Column(name = "Last_Name")
private String lastname;
	@Column(name = "Email")
private String emailid;
	@Column(name = "Mobile_Number",length = 10)
private String mobilenumber;
	@Column(name = "Booking_Date" ,length = 10)
private LocalDate Bookingdate;
	@Column(name = "Hotel_Name")
private String hotelname;
	@Column(name = "No_Of_Days",length = 10)
private String noofdays;
	@Column(name = "No_Of_Persions",length = 10)
private String noofpersons;
	@Column(name = "No_Of_Rooms",length = 10)
private String noofrooms;
	@Column(name = "Price",length = 10)
private double price;
}
