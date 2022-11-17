//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.dto.Defect;
//import com.example.demo.service.webSocketService;
//
//@RestController
//public class webSocketController {
//
//	@Autowired
//	private webSocketService service;
//	
//	
//	@PostMapping("/send-Message")
//	public void sendMessage(@RequestBody Defect defect) {
//		service.notifyFrontend(defect.getName());
//	}
//}
