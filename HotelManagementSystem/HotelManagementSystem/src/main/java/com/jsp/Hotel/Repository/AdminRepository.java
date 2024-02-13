package com.jsp.Hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Hotel.Entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
//Admin findByAdminEmailidAndAdminPassword(String emailid,String password);
	Admin findByAdminemailidAndAdminpassword(String email,String password);
}
