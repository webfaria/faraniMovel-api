package com.farani.mobile.services;

import org.springframework.mail.SimpleMailMessage;

import com.farani.mobile.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}

