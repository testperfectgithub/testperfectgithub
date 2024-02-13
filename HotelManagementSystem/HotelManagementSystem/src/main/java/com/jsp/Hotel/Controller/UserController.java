package com.jsp.Hotel.Controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.Hotel.Dao.HotelDao;
import com.jsp.Hotel.Dao.UserDao;
import com.jsp.Hotel.Entity.HotelInformationn;
import com.jsp.Hotel.Entity.UserInformation;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	@Autowired
	private UserDao userDao;
	@Autowired
	private HotelDao hotelDao;

	@RequestMapping("/registration")
	public String UserRegistration(Model model) {
		UserInformation info = new UserInformation();
		model.addAttribute("userinformation", info);
		System.out.println(info);
		return "AddUsers";

	}

	@RequestMapping("/userDetails")

	public String userDetails(UserInformation userinformation) {

		userDao.userRegistration(userinformation);
		System.out.println(userinformation);

		return "Login";

	}

	@RequestMapping("/userlogin")

	public String userLoginDetails(String emailid, String password, Model m, HttpServletRequest request) {
		UserInformation userInformation = userDao.userLogin(emailid, password);
		HttpSession session = request.getSession();
		session.setAttribute("user", userInformation);
		if (userInformation != null) {
			System.out.println("login sucess");
			java.util.List<HotelInformationn> gethoteldetails = hotelDao.getAllHoteldetails();
			System.out.println(gethoteldetails);
			m.addAttribute("hotelinfo", gethoteldetails);

			return "HotelList";
		} else {

			m.addAttribute("msg", "invalid data");
			return "Login";

		}

	}

	@RequestMapping("/searchBycity")
	public String getCity(String city, Model m) {
		System.out.println(city);
		java.util.List<HotelInformationn> byCity = hotelDao.getHotelDetailsByCity(city);
		System.out.println(byCity);
		m.addAttribute("hotelinfo", byCity);
		return "HotelList";

	}

}
