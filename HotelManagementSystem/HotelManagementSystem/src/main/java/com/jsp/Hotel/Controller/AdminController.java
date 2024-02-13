package com.jsp.Hotel.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.Hotel.Dao.AdminDao;
import com.jsp.Hotel.Entity.Admin;
import com.jsp.Hotel.Entity.UserInformation;

@Controller
public class AdminController {
	@Autowired
	private AdminDao adminDao;

	@RequestMapping("/adminlogin")
	public String getAdminInfo() {

		return "AdminLogin";
	}

	@RequestMapping("/admindetails")
	public String getAdminDetails(@RequestParam("adminemailid") String emailid,
			@RequestParam("adminpassword") String password, Model model) {
		System.out.println(emailid);
		System.out.println(password);
		Admin login = adminDao.adminLogin(emailid, password);
		if (login != null) {
			return "AdminList";
		} else {
			model.addAttribute("msg", "Invalid Data");
			return "AdminLogin";
		}

	}

	@RequestMapping("/showalluser")
	public String getAdminLoginPage(Model model) {
		List<UserInformation> allUser = adminDao.getAllUser();
		model.addAttribute("UserDetails", allUser);
		System.out.println(allUser);
		return "UsersList";
	}

	@RequestMapping("/getupdateid")
	public String getUserId(int id, Model model) {
		System.out.println(id);
		UserInformation userInformation = adminDao.getUserById(id);
		model.addAttribute("user", userInformation);
		System.out.println(userInformation);
		return "UpdateFile";
	}

	@RequestMapping("/getdeleteid")
	public String getDeleteId(int id, Model model) {
		System.out.println(id);
		UserInformation userInformation = adminDao.getUserById(id);
		model.addAttribute("user", userInformation);
		System.out.println(userInformation);
		return "DeleteFile";
	}

	@RequestMapping("/updated")
	public void getUpdatedData(UserInformation information) {
		UserInformation userInformation = adminDao.updateUserDetails(information);
		System.out.println(userInformation);
	}
}
