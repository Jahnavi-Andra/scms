package com.info.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.Model.Sport;
import com.info.Repository.SportRepo;


@Service
public class SportService {

	@Autowired
	SportRepo repo;


	public double sportbyTid (int trainerId){
		return repo.sportbyTid(trainerId);
	}

	public List<Sport> getSportAll (){
		return repo.findAll();
	}



}
