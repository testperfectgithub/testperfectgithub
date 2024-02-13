package com.jsp.Hotel.Entity;

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
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminid;
	@Column(name = "Admin_Name")
	private String adminname;
	@Column(name = "Admin_emailid")
	private String adminemailid;
	@Column(name = "Admin_password")
	private String adminpassword;
}

