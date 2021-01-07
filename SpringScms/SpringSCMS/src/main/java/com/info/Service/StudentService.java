package com.info.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.Model.Student;
import com.info.Repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo repo;
	
	public Student authentication(String studUsername,String studPassword) 
	{
		Student s = repo.authentication(studUsername, studPassword);
		return s;
	}
	
	public int authCount(String studUsername,String studPassword)
	{
		int s = repo.authCount(studUsername, studPassword);
		return s;
	}
	
	public Student getstuById(int studentId)
	{
		Student s = repo.getstuById(studentId);
		return s;
	}
	
	public void updatePoints(int studPoints,int studentId)
	{
		repo.updatePoints(studPoints, studentId);
	}
	
	public void updateWallet(double fee,int studentId)
	{
		repo.updateWallet(fee, studentId);
	}
//	
//	public void registerStudent(String studentName,double studentPhNo,String studUsername,String studPassword,int studWallet)
//	{
//		repo.registerStudent(studentName, studentPhNo, studUsername, studPassword, studWallet);
//	}
//	
	public void insert(Student student) 
	{
		repo.save(student); 
		}
	

}
