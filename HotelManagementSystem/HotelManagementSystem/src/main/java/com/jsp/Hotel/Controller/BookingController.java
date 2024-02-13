package com.jsp.Hotel.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.Hotel.Dao.BookDao;
import com.jsp.Hotel.Dao.HotelDao;
import com.jsp.Hotel.Entity.BookInformation;
import com.jsp.Hotel.Entity.HotelInformationn;
import com.jsp.Hotel.Entity.UserInformation;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BookingController {
	@Autowired
	private BookDao bookDao;
	@RequestMapping("/bookinginfo")
	public String getBookingInfo(BookInformation information, Model model, HttpServletRequest request) {
		if (information.getBookingdate().isAfter(LocalDate.now())
				|| information.getBookingdate().isEqual(LocalDate.now())) {
			model.addAttribute("price", information.getPrice());
			request.getSession().setAttribute("bookinformation", information);
			System.out.println("Valid data");
			return "AfterHotelPayment";
		} else {
			UserInformation userInformation = (UserInformation) request.getSession().getAttribute("user");
			model.addAttribute("user", userInformation);
			HotelInformationn hotelInformationn = (HotelInformationn) request.getSession().getAttribute("balaramhotel");
			model.addAttribute("name", hotelInformationn.getHotelname());
			model.addAttribute("price", hotelInformationn.getPrice());
			model.addAttribute("msg", "InvalidDate");
			return "BookHotel";
		}
	}
	@RequestMapping("/showallbook")
	public String getAllBook(Model model) {
		List<BookInformation> allBook=bookDao.getAllBook();
		model.addAttribute("bookinginfo", allBook);
		System.out.println(allBook);
		return "BookingList";
	}
}
