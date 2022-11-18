package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ListOfNofification;
import com.example.demo.dto.Message;
import com.example.demo.dto.ResponceMessage;

/**
 * @author Admin
 *
 */
@Service
public class webSocketService {

	private final SimpMessagingTemplate messageTemplete;
	private final NoficationService notificationService;

	@Autowired
	public webSocketService(SimpMessagingTemplate messageTemplete, NoficationService notification) {
		this.messageTemplete = messageTemplete;
		this.notificationService = notification;
	}
	
	public void notifyFrontend(final String message) {
		ResponceMessage response=new ResponceMessage(message);
		notificationService.sendGlobalNotification();
		messageTemplete.convertAndSend("/topic/messages", response);
	}
	
	
}
