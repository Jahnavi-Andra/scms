package com.info.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.Model.TrainingCamp;
@Repository
public interface TrainingCampRepo extends JpaRepository<TrainingCamp, Integer> {
//tcamp_id, sport_id, trainer_id, stud_id, doj, t_status
	
	//pendingStudentList  -accept/reject
	@Query("select stud_id , doj from TrainingCamp where trainer_id = :trainerid and t_status = 'pending'")
	public Optional<TrainingCamp> pendingStudentList (int trainerid); 
	
	//update updateStatus listOfStudents pendingStudentList selectStudNameId studentEnrollInfo EnrollDisplay EnrollInsert
	 @Transactional
	  @Modifying
	@Query("update TrainingCamp t set t.t_status=:status where t.stud_id = :stud_id and t_status = 'pending' ")
	public void updateStatus(String status ,int stud_id );
	
	//list of students
	@Query("select t from TrainingCamp t where t.trainer_id=:trainerid and t.t_status!='rejected'")
	public Optional<TrainingCamp> listOfStudents(int trainerid);
	
	//update points selectStudNameIds
	
	@Query("select  t.stud_id from TrainingCamp t where t.trainer_id= :trainer_id and t.t_status='accepted'")
	public Optional<Integer> selectStudNameId (int trainer_id);
	
	//student Enroll Info
	@Query("select t from TrainingCamp t where stud_id = :stud_id and t_status !='rejected' ")
	public TrainingCamp studentEnrollInfo(int stud_id);
	
	//Enroll validation for new user
	@Query("select count(t)  from TrainingCamp t where stud_id = :stud_id")
	public int oldOrNew(int stud_id);
	//Enroll validation for rejected user
	@Query("select t_status  from TrainingCamp t where stud_id = :stud_id")
	public List< String> rejectedStudent(int stud_id);
	
	
	//Enroll-details form
//	@Query("select s.trainer_id , s.sport_id, s.fee, s.sport_name, t.trainer_name from sports s join trainer t on s.trainer_id = t.trainer_id" )
//	public List<TrainingCamp> EnrollDisplay();
	
	
	
	
	
	
	
	//Enroll-insert
//	@Query("insert into TrainingCamp(sport_id, trainer_id, stud_id, doj, t_status) values(:sport_id, :trainer_id, :stud_id, :doj, :t_status) ")
//	public void EnrollInsert(int sport_id,int  trainer_id,int stud_id,Date doj,String t_status);
	
}
