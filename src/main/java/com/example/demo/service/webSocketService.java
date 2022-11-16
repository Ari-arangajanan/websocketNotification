package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ResponceMessage;

/**
 * @author Admin
 *
 */
@Service
public class webSocketService {

	private final SimpMessagingTemplate messageTemplete;
	private final NoficationService notification;

	@Autowired
	public webSocketService(SimpMessagingTemplate messageTemplete, NoficationService notification) {
		this.messageTemplete = messageTemplete;
		this.notification = notification;
	}
	
	public void notifyFrontend(final String message) {
		ResponceMessage response=new ResponceMessage(message);
		notification.sendGlobalNotification();
		messageTemplete.convertAndSend("/topic/messages", response);
	}
	
	
}
