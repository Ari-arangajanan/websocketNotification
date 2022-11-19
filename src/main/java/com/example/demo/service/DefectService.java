package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Defect;
import com.example.demo.dto.Message;
import com.example.demo.repo.NotificationRepo;
import com.example.demo.repo.Repository;

@Service
public class DefectService {

	@Autowired private Repository repo;
	@Autowired private NotificationRepo notificationRepo;
	@Autowired private webSocketService WSService;
    
//	static ListOfNofification nt=new ListOfNofification(0,"New Notification");
//	static String notification="New Notification";
	
	static Message nt=new Message();
	String notification2=nt.getMessage().toString();
	
	public Defect defectSave(Defect defect) {
		return repo.save(defect);
	}
	
	public void showNotification() {
		notificationRepo.findAll();
		WSService.notifyFrontend(nt.getMessage().toString());
		//return "Created Defect";
	}
	
	
	
	
}
