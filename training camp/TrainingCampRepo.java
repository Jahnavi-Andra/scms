package com.info.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.Model.TrainingCamp;
@Repository
public interface TrainingCampRepo extends JpaRepository<TrainingCamp, Integer> {
//tcamp_id, sport_id, trainer_id, stud_id, doj, t_status
	
	//pendingStudentList  -accept/reject
	@Query("select stud_id , doj from TrainingCamp where trainer_id = :trainer_id and status = 'pending'")
	public List<TrainingCamp> pendingStudentList (int trainer_id); 
	
	//update updateStatus listOfStudents pendingStudentList selectStudNameId studentEnrollInfo EnrollDisplay EnrollInsert
	@Query("update TrainingCamp set status=:status where stud_id = :stud_id ")
	public void updateStatus(String status ,int stud_id );
	
	//list of students
	@Query("select stud_id,tcamp_id from TrainingCamp where trainer_id=:trainer_id and status!='rejected'")
	public List<TrainingCamp> listOfStudents(int trainer_id);
	
	//update points
	
//	@Query("select s.stud_name, t.stud_id from TrainingCamp t join Student s on t.stud_id = s.stud_id where trainer_id= :trainer_id and t_status='accepted'")
//	public List<TrainingCamp> selectStudNameId (int trainer_id);
	
	//student Enroll Info
	@Query("select t from TrainingCamp t where stud_id = :stud_id and status !='rejected' ")
	public TrainingCamp studentEnrollInfo(int stud_id);
	
	//Enroll-details form
//	@Query("select s.trainer_id , s.sport_id, s.fee, s.sport_name, t.trainer_name from sports s join trainer t on s.trainer_id = t.trainer_id" )
//	public List<TrainingCamp> EnrollDisplay();
	
	//Enroll-insert
//	@Query("insert into TrainingCamp(sport_id, trainer_id, stud_id, doj, t_status) values(:sport_id, :trainer_id, :stud_id, :doj, :t_status) ")
//	public void EnrollInsert(int sport_id,int  trainer_id,int stud_id,Date doj,String t_status);
	
}
