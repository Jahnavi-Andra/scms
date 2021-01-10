package com.info.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.Model.Sport;
import com.info.Service.SportService;
@CrossOrigin(origins = "http://localhost:8580")
@RestController
@RequestMapping("/sportapi")
public class SportController {
	@Autowired
	SportService service;
	@RequestMapping("/sport")
	public List<Sport> getSportAll()
	{
		List<Sport> sport = service.getSportAll();
		return sport;
		
	}
	@GetMapping("/sport/{trainerId}") 
	public double getSport(@PathVariable("trainerId")int trainerId) 
	{ 
		double sport = service.sportbyTid(trainerId);
		return sport; 
		}
	@GetMapping("/sportbytrainerid/{trainerId}")
	public Optional<Sport> getAllByTrainerId(@PathVariable("trainerId")int trainerId){
		return service.getAllByTrainerId(trainerId);
	}
	@GetMapping("/trainerinfo/{sid}")
	public List<Sport> fetchSportTrainerId(@PathVariable("sid") int sid) {
		List<Sport> x=service.fetchSportTrainerId(sid);
		return x;
	}
	

}
