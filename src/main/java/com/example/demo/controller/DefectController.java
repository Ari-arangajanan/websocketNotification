package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Defect;
import com.example.demo.dto.ListOfNofification;
import com.example.demo.service.DefectService;



@RestController
public class DefectController {

	@Autowired private DefectService service;

	@PostMapping("/defect")
	public Defect saveDefect(@RequestBody Defect defect, ListOfNofification notification) {
		service.showNotification();
		service.saveNotification(notification);
		return service.defectSave(defect);
	}
}
