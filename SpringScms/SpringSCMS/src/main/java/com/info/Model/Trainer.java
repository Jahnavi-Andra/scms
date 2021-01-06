package com.info.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainer {

	public Trainer() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="trainer_id")
	public int trainerId;
	@Column(name="trainer_name")
	public String trainerName;
	@Column(name="trainer_phone")
	public double trainerPhNo;
	@Column(name="age")
	public int age;
	@Column(name="experience")
	public int experience;
	@Column(name="trainer_uname")
	public String traUsername;
	@Column(name="trainer_passwd")
	public String traPassword;
	@Column(name="sport_id")
	public String sportId;
	
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public double getTrainerPhNo() {
		return trainerPhNo;
	}
	public void setTrainerPhNo(double trainerPhNo) {
		this.trainerPhNo = trainerPhNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getTraUsername() {
		return traUsername;
	}
	public void setTraUsername(String traUsername) {
		this.traUsername = traUsername;
	}
	public String getTraPassword() {
		return traPassword;
	}
	public void setTraPassword(String traPassword) {
		this.traPassword = traPassword;
	}
	public String getSportId() {
		return sportId;
	}
	public void setSportId(String sportId) {
		this.sportId = sportId;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerPhNo=" + trainerPhNo
				+ ", age=" + age + ", experience=" + experience + ", traUsername=" + traUsername + ", traPassword="
				+ traPassword + ", sportId=" + sportId + "]";
	}
	public Trainer(int trainerId, String trainerName, double trainerPhNo, int age, int experience, String traUsername,
			String traPassword, String sportId) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.trainerPhNo = trainerPhNo;
		this.age = age;
		this.experience = experience;
		this.traUsername = traUsername;
		this.traPassword = traPassword;
		this.sportId = sportId;
	}
	
	

}
