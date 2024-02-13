package com.jsp.Hotel.Dao;

import java.util.List;

import com.jsp.Hotel.Entity.PaymentInformation;

public interface PaymentDao {

// getPaymentDetails(PaymentInformation paymentInformation);

PaymentInformation getPaymentDetails(PaymentInformation paymentInformation);
List<PaymentInformation> getAllPayment();
}
