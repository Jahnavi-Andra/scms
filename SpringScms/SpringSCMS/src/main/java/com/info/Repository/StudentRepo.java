package com.info.Repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.info.Model.Student;


public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	@Query("Select c from Student c where c.studUsername=:studUsername and c.studPassword=:studPassword")
	public Student authentication (@Param("studUsername")String studUsername, @Param("studPassword")String studPassword);
	
	@Query("Select count(c) from Student c where c.studUsername=:studUsername and c.studPassword=:studPassword")
	public int authCount(@Param("studUsername")String studUsername,@Param("studPassword")String studPassword);

    @Query("Select c from Student c where c.studentId=:studentId")
    public Student getstuById(@Param("studentId")int studentId);
    
    @Transactional
    @Modifying
    @Query("Update Student c set c.studPoints=c.studPoints+:studPoints where c.studentId=:studentId")
    public void updatePoints(@Param("studPoints")int studPoints, @Param("studentId")int studentId);
    
    
    @Transactional
    @Modifying
    @Query("Update Student c set c.studWallet=c.studWallet-:fee where c.studentId=:studentId")
    public void updateWallet(@Param("fee")double fee, @Param("studentId")int studentId);
//    
//    @Query("INSERT INTO Student values studentName=(:studentName)")
//    public void register(String studentName);
//    @Query("Insert into Student(studentName,studentPhNo,studUsername,studPassword)values(:studentName,:studentPhNo,:studUsername,:studPassword)")
//    public void registerStudent();
	
}

