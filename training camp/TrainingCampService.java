package com.info.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.Model.TrainingCamp;
import com.info.Repository.TrainingCampRepo;

@Service
public class TrainingCampService {
	@Autowired
	TrainingCampRepo repo;
	
//fetch all	
	public List<TrainingCamp> getAll() {
		return repo.findAll();
		
	}
	
//fetch by id
	public Optional<TrainingCamp> getById(int id){
		return repo.findById(id);
	}

//accept/reject
	public  String updateStatus(String status , int stud_id) {
		repo.updateStatus(status, stud_id);
		return "Updated";
	}
	
//listOfStudents
	
	public List<TrainingCamp> listOfStudents(int trainer_id) {
		return repo.listOfStudents(trainer_id);
	}
	
//	pendingStudentList
	public List<TrainingCamp> pendingStudentList(int trainer_id) {
		return repo.pendingStudentList(trainer_id);
	}
//selectStudNameId for update points display
	
//	public List<TrainingCamp> selectStudNameId(int trainer_id ) {
//		return repo.selectStudNameId(trainer_id);
//	}
//	
//studentEnrollInfo 
	
	public TrainingCamp studentEnrollInfo(int stud_id) {
		return repo.studentEnrollInfo(stud_id);
	}
	
//EnrollDisplay
//	public List<TrainingCamp> EnrollDisplay(){
//		return repo.EnrollDisplay();
//	}
//EnrollInsert
//	public String EnrollInsert(int sport_id,int  trainer_id,int stud_id,Date doj,String t_status) {
//		repo.EnrollInsert(sport_id, trainer_id, stud_id, doj, t_status);
//		return "Enrolled Succesfully";
//	}
	public String EnrollInsert(TrainingCamp tc) {
		repo.save(tc);
		return "Enrolled Succesfully";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
