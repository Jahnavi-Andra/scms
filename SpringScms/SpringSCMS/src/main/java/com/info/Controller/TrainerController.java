package com.info.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.info.Model.Trainer;
import com.info.Service.TrainerService;
//@CrossOrigin(origins = "http://localhost:8580")
@RestController
@RequestMapping("/trainerapi")
public class TrainerController {
	
	@Autowired
	TrainerService service;
	
	@GetMapping("/trainer/{traUsername}/{traPassword}")
	public Trainer authentication(@PathVariable("traUsername")String traUsername,@PathVariable("traPassword")String traPassword)
	{
		Trainer s = service.authentication(traUsername, traPassword);
		return s;
	}
	
	@GetMapping("/trainer/auth/{traUsername}/{traPassword}")
	public int authCount(@PathVariable("traUsername")String traUsername,@PathVariable("traPassword")String traPassword)
	{
		int s = service.authCount(traUsername, traPassword);
		return s;
	}

}
