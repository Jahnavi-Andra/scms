package com.info.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.Model.Trainer;

import com.info.Repository.TrainerRepo;
@Service
public class TrainerService {
	
	@Autowired
	TrainerRepo repo;
	
	public Trainer authentication(String traUsername,String traPassword) 
	{
		Trainer s = repo.authentication(traUsername, traPassword);
		return s;
	}
	
	public int authCount(String traUsername,String traPassword)
	{
		int s = repo.authCount(traUsername, traPassword);
		return s;
	}
	

}
