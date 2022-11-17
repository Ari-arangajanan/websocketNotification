package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.example.demo.dto.Message;
import com.example.demo.dto.ResponceMessage;
import com.example.demo.service.NoficationService;

@Controller
public class NotificationShowController {

	@Autowired private NoficationService notificationService;

	@MessageMapping("/message")
    @SendTo("/topic/messages")
	public ResponceMessage getMessage(final Message message) {
		notificationService.sendGlobalNotification();
		return new ResponceMessage(HtmlUtils.htmlEscape(message.getMessage()));
	}
	
	
}
