 package com.info.Model;

 import javax.persistence.Column;
import javax.persistence.Entity;
 import javax.persistence.Id;

 @Entity
public class Sport {  
	
	
	@Column(name="sport_id")
	private int sportId;
	@Column(name="sport_name")
	private String sportName;
	@Id
	@Column(name="trainer_id")
	private int trainerId;
	@Column(name="fee")
	private double fee;
	
	
	
	public Sport(int sportId, String sportName, int trainerId, double fee) {
		super();
		this.sportId = sportId;
		this.sportName = sportName;
		this.trainerId = trainerId;
		this.fee = fee;
	}




	@Override
	public String toString() {
		return "Sport [sportId=" + sportId + ", sportName=" + sportName + ", trainerId=" + trainerId + ", fee=" + fee
				+ "]";
	}




	public int getSportId() {
		return sportId;
	}




	public void setSportId(int sportId) {
		this.sportId = sportId;
	}




	public String getSportName() {
		return sportName;
	}




	public void setSportName(String sportName) {
		this.sportName = sportName;
	}




	public int getTrainerId() {
		return trainerId;
	}




	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}




	public double getFee() {
		return fee;
	}




	public void setFee(double fee) {
		this.fee = fee;
	}




	
	
	

	
	public Sport() {
		// TODO Auto-generated constructor stub
	}

}
