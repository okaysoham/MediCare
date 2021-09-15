package com.med.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.med.model.User;
import com.med.repository.MedicalRepository;

@RestController
@RequestMapping("/home/")
public class MedicalController {
	
	@Autowired
	private MedicalRepository medicalRepository;
	
	// Method to get all users present in the Medical Database
	@GetMapping("users")
	public List<User> getAllUser() {
		return this.medicalRepository.findAll();
	}
}
