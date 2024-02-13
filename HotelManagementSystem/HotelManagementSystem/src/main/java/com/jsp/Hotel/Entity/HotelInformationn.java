package com.jsp.Hotel.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data annotation in this annotion having @setters,@getters,@tostring Annotations are present in @Data Annotion
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HotelInformationn {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hotelid;
	@Column(name="Hotel_Name")
	private String hotelname;
	@Column(name = "Contact_Number",length  = 10)
	private String contactnumber;
	@Column(name = "Price",length  = 10)
	private double price;
	@Column(name = "City")
	private String city;
	@Column(name = "Address")
	private String address;
	
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
