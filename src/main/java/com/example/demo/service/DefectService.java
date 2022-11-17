package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Defect;
import com.example.demo.dto.Message;
import com.example.demo.repo.Repository;

@Service
public class DefectService {

	@Autowired private Repository repo;
//	@Autowired
//	private NoficationService notification;
	@Autowired private webSocketService WSService;

	
	public Defect defectSave(Defect defect) {
		return repo.save(defect);
	}
	public void showNotification(Message message) {
		WSService.notifyFrontend(message);
	}
	
	
}
