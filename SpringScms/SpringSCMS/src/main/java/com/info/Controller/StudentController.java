package com.info.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.info.Model.Student;
import com.info.Service.StudentService;

@RestController
@RequestMapping("/studentapi")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/student")
	public String create(@RequestBody Student student) {
		service.insert(student);
		return "Student Data Inserted";
	}
	
//	@PostMapping("/studentinsert")
//	public String registerStudent(@RequestBody String studentName,@RequestBody double studentPhNo,@RequestBody String studUsername,
//			@RequestBody String studPassword,@RequestBody int studWallet) {
//		service.registerStudent(studentName, studentPhNo, studUsername, studPassword, studWallet);
//		return "Student Data Inserted";
//	}
	
	@GetMapping("/student/{studUsername}/{studPassword}")
	public Student authentication(@PathVariable("studUsername")String studUsername,@PathVariable("studPassword")String studPassword)
	{
		Student s = service.authentication(studUsername, studPassword);
		return s;
	}
	
	@GetMapping("/student/auth/{studUsername}/{studPassword}")
	public int authCount(@PathVariable("studUsername")String studUsername,@PathVariable("studPassword")String studPassword)
	{
		int s = service.authCount(studUsername, studPassword);
		return s;
	}
	
	@GetMapping("/student/{studentId}")
	public Student getstuById(@PathVariable("studentId")int studentId)
	{
		Student s = service.getstuById(studentId);
		return s;
	}
	
	@PutMapping("/studentpoints/{studPoints}/{studentId}")
	public void updatePoints(@PathVariable int studPoints,@PathVariable int studentId) 
	{ 
		service.updatePoints(studPoints, studentId);
		} 
	
	@PutMapping("/studentwallet/{fee}/{studentId}")
	public void updateWallet(@PathVariable int fee,@PathVariable int studentId) 
	{ 
		service.updateWallet(fee, studentId);
		} 
	
	
	
	

}
