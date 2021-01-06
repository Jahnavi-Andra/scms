package com.info.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.info.Model.Trainer;

public interface TrainerRepo extends JpaRepository<Trainer, Integer> {
	
	@Query("Select c from Trainer c where c.traUsername=:traUsername and c.traPassword=:traPassword")
	public Trainer authentication (@Param("traUsername")String traUsername, @Param("traPassword")String traPassword);
	
	@Query("Select count(c) from Trainer c where c.traUsername=:traUsername and c.traPassword=:traPassword")
	public int authCount(@Param("traUsername")String traUsername,@Param("traPassword")String traPassword);

<<<<<<< HEAD
//public interface TrainerRepo extends JpaRepository<T, ID> {
//
//}
=======

}
>>>>>>> a644a336e8e4fa661d8907a32313ce0273e3e26b
