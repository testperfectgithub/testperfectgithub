package com.jsp.Hotel.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.Hotel.Dao.BookDao;
import com.jsp.Hotel.Dao.PaymentDao;
import com.jsp.Hotel.Entity.BookInformation;
import com.jsp.Hotel.Entity.PaymentInformation;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class PaymentController {
	@Autowired
	private PaymentDao paymentDao;
	@Autowired
	private BookDao bookDao;

	@RequestMapping("/payment")
	public void paymentDetails(PaymentInformation paymentInformation, HttpServletRequest request) {
		PaymentInformation payment = paymentDao.getPaymentDetails(paymentInformation);
		BookInformation information = (BookInformation) request.getSession().getAttribute("bookinformation");
		System.out.println(information);
		bookDao.getBookDetails(information);
	}
	@RequestMapping("/showallPayment")
	public String allPaymentDetails(Model model) {
		List<PaymentInformation> allPayment=paymentDao.getAllPayment();
		model.addAttribute("payment", allPayment);
		System.out.println(allPayment);
		return "PaymentList";
	}
}
