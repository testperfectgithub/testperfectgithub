package com.jsp.Hotel.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.Hotel.Entity.PaymentInformation;
import com.jsp.Hotel.Repository.PaymentRepository;

@Component
public class PaymentDaoImpl implements PaymentDao {
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public PaymentInformation getPaymentDetails(PaymentInformation paymentInformation) {
		// TODO Auto-generated method stub
		return paymentRepository.save(paymentInformation);
	}

	@Override
	public List<PaymentInformation> getAllPayment() {
		// TODO Auto-generated method stub
		return paymentRepository.findAll();
	}

}
