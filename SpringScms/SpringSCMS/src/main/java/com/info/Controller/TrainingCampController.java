package com.info.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.Model.TrainingCamp;
import com.info.Service.TrainingCampService;
//@CrossOrigin(origins = "http://localhost:8580")
@RestController
@RequestMapping("/camp")
public class TrainingCampController {

	@Autowired
	TrainingCampService tcs;
	
	//fetch all	
	@GetMapping("/getAll")
		public List<TrainingCamp> getAll() {
			return tcs.getAll();
		}
		
	//fetch by id
	@GetMapping("/getAll/{id}")
		public Optional<TrainingCamp> getById(@PathVariable int id){
			return tcs.getById(id);
		}

	//accept/reject
	@PutMapping("/updateStatus/{status}/{stud_id}/{trainerId}")
		public  String updateStatus(@PathVariable String status , @PathVariable int stud_id,@PathVariable int trainerId) {
			return tcs.updateStatus(status, stud_id, trainerId);
		
		}
		
		//listOfStudents
	     @GetMapping("/listOfStudents/{trainer_id}")
		public Optional<TrainingCamp> listOfStudents( @PathVariable  int trainer_id) {
			return tcs.listOfStudents(trainer_id);
		}
		
//		pendingStudentList
	     @GetMapping("/pendingStudentList/{trainer_id}")
		public Optional<TrainingCamp> pendingStudentList(@PathVariable int trainer_id) {
			return tcs.pendingStudentList(trainer_id);
		}
	//selectStudId for update points display
	     @GetMapping("/selectStudId/{trainer_id}")
		public Optional<Integer> selectStudNameId(@PathVariable int trainer_id ) {
			return tcs.selectStudNameId(trainer_id);
		}
		
	//studentEnrollInfo 
	     @GetMapping("/studentEnrollInfo/{stud_id}")
		public TrainingCamp studentEnrollInfo(@PathVariable int stud_id) {
			return tcs.studentEnrollInfo(stud_id);
		}
		
	//EnrollDisplay
//	     @GetMapping("/EnrollDisplay/{stud_id}")
//		public List<TrainingCamp> EnrollDisplay(){
//			return tcs.EnrollDisplay();
//		}
	//EnrollInsert
//	     @PostMapping("EnrollInsert/")
//		public String EnrollInsert(int sport_id,int  trainer_id,int stud_id,Date doj,String t_status) {
//			tcs.EnrollInsert(sport_id, trainer_id, stud_id, doj, t_status);
//			return "Enrolled Succesfully";
//		}
	     @PostMapping("/EnrollInsert")
			public String EnrollInsert(@RequestBody TrainingCamp tc) {	
	    	 
				return tcs.EnrollInsert(tc);	
		}
	
}
