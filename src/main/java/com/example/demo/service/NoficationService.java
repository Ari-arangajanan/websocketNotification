package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import com.example.demo.dto.ResponceMessage;

@Service
public class NoficationService {
 
	
	private final SimpMessagingTemplate messagingTemplate;

	@Autowired
	public NoficationService(SimpMessagingTemplate messagingTemplate) {
		this.messagingTemplate = messagingTemplate;
	}
	
	public void sendGlobalNotification() {
		ResponceMessage resMessage=new ResponceMessage("Global Notification");
		messagingTemplate.convertAndSend("/topic/global-notifications", resMessage);
		
	}

	

}
