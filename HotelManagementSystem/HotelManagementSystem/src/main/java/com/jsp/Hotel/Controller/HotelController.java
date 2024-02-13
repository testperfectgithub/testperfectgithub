package com.jsp.Hotel.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.Hotel.Dao.HotelDao;
import com.jsp.Hotel.Entity.HotelInformationn;
import com.jsp.Hotel.Entity.UserInformation;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HotelController {
	@Autowired
	private HotelDao hotelDao;

	
	@RequestMapping("/addhotel")

	public String addHotel(Model model) {
		HotelInformationn info = new HotelInformationn();
		model.addAttribute("hotelinformation", info);
		System.out.println(info);
		return "AddHotel";
	}

	@RequestMapping("/hotelDetails")
	public String hotelDetails(HotelInformationn hotelInformationn) {
	hotelDao.getAllHoteldetails();
	 hotelDao.hotelRegistration(hotelInformationn);
		System.out.println(hotelInformationn);
		return "HotelDetails";
	

	}
	@RequestMapping("/gethotelbyid")
public String getHotelById(int hotelid,HttpServletRequest request,Model model) {
	System.out.println(hotelid);
	HotelInformationn information=hotelDao.getHotelById(hotelid);
	HttpSession session=request.getSession();
	UserInformation information2=(UserInformation)session.getAttribute("user");
	session.setAttribute("balaramhotel", information);
	
	model.addAttribute("user", information2);
	model.addAttribute("name",information.getHotelname());
	model.addAttribute("price",information.getPrice());
	System.out.println(information2);
	System.out.println(information);
	return "BookHotel";
}
	@RequestMapping("/showallhotel")
	public String allHotelDetails(Model model) {
		List<HotelInformationn> allhotel=hotelDao.getAllHotel();
		model.addAttribute("HotelDetails", allhotel);
		System.out.println(allhotel);
		return "HotelList";
	}

}
