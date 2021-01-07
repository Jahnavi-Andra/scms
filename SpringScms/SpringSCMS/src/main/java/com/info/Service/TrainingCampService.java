package com.info.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.Model.Sport;
import com.info.Model.Student;
import com.info.Model.TrainingCamp;
import com.info.Repository.TrainingCampRepo;

@Service
public class TrainingCampService {
	@Autowired
	TrainingCampRepo repo;

	@Autowired
	StudentService studService;
	@Autowired
	SportService sportService;


	//fetch all	
	public List<TrainingCamp> getAll() {
		return repo.findAll();

	}

	//fetch by id
	public Optional<TrainingCamp> getById(int id){
		return repo.findById(id);
	}

	//accept/reject
	public  String updateStatus(String status , int stud_id, int trainerId) {
		List<String> status1 = repo.rejectedStudent(stud_id);
		
		   int length = status1.size();
		   if(status1.get(length-1).equals("pending")) {
		if(status.equals("accepted")) {
			repo.updateStatus(status, stud_id);
			double fee = sportService.sportbyTid(trainerId);
			studService.updateWallet(fee, stud_id);
			return "Accepted and amount debited ";
		} else {
			repo.updateStatus(status, stud_id);
			return "Rejected";
		}

	}return " ";
		   }

	//listOfStudents

	public Optional<TrainingCamp> listOfStudents(int trainer_id) {
		return repo.listOfStudents(trainer_id);
	}

	//	pendingStudentList
	public Optional<TrainingCamp> pendingStudentList(int trainer_id) {
		return repo.pendingStudentList(trainer_id);
	}
	//selectStudNameId for update points display

	public Optional<Integer> selectStudNameId(int trainer_id )
	{
		return repo.selectStudNameId(trainer_id);
	}
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
		Student stud = studService.getstuById(tc.getStud_id());
		double fee = sportService.sportbyTid(tc.getTrainer_id());
		int count = repo.oldOrNew(tc.getStud_id());

		if(count != 0 ) {
		List<String> status = repo.rejectedStudent(tc.getStud_id());
		
	   int length = status.size();
			if(status.get(length-1).equals("rejected")) {
				
				if(stud.getStudWallet() < fee ) {
					return "you have no sufficient balance";
				} else {
					tc.setT_status("pending");
					repo.save(tc);

					return "Enrolled Succesfully";
				}

			}
			else {
				return "You are already Enrolled";
			}
		}else {
			
			if(stud.getStudWallet() < fee ) {
				return "you have no sufficient balance";
			} else {
				tc.setT_status("pending");
				repo.save(tc);

				return "Enrolled Succesfully";
			}

		} 



	}






}

