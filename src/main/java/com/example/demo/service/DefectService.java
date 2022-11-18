package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Defect;
import com.example.demo.dto.ListOfNofification;
import com.example.demo.repo.NotificationRepo;
import com.example.demo.repo.Repository;

@Service
public class DefectService {

	@Autowired private Repository repo;
	@Autowired private NotificationRepo notificationRepo;
	@Autowired private webSocketService WSService;
    
	static ListOfNofification nt=new ListOfNofification(0,"New Notification");
	static String notification="New Notification";
	
	public Defect defectSave(Defect defect) {
		return repo.save(defect);
	}
	public void saveNotification(ListOfNofification notification) {
		
		notificationRepo.save(nt);
		
	}
	public void showNotification() {
		notificationRepo.findAll();
		WSService.notifyFrontend(nt.getMessage().toString());
		//return "Created Defect";
	}
	
	
	
	
}
