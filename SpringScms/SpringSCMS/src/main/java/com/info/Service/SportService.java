package com.info.Service;

import java.util.List;
import java.util.Optional;

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
	public List<Sport> fetchSportTrainerId(int sid) {
		List<Sport> x=repo.trainerOfSport(sid);
		return x;
	}
	
	public Optional<Sport> getAllByTrainerId(int tid){
		return repo.findById(tid);
	}
	
	
	
}
