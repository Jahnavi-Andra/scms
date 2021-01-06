package com.info.Model;


import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.*;
@Entity
@Table(name = "training_camp")
public class TrainingCamp  {
	@Id
	private int tcamp_id;
	private int stud_id;
	private int sport_id;
	private int trainer_id;
	private Date doj;
	private String t_status;
	


	
	public int getTcamp_id() {
		return tcamp_id;
	}



	public void setTcamp_id(int tcamp_id) {
		this.tcamp_id = tcamp_id;
	}



	public int getSport_id() {
		return sport_id;
	}



	public void setSport_id(int sport_id) {
		this.sport_id = sport_id;
	}



	public int getTrainer_id() {
		return trainer_id;
	}



	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}



	public int getStud_id() {
		return stud_id;
	}



	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}



	public Date getDoj() {
		return doj;
	}



	public void setDoj(Date doj) {
		this.doj = doj;
	}



	public String getT_status() {
		return t_status;
	}



	public void setT_status(String t_status) {
		this.t_status = t_status;
	}

//to String

	@Override
	public String toString() {
		return "TrainingCamp [tcamp_id=" + tcamp_id + ", stud_id=" + stud_id + ", sport_id=" + sport_id
				+ ", trainer_id=" + trainer_id + ", doj=" + doj + ", t_status=" + t_status + "]";
	}


//constructor
	public TrainingCamp(int tcamp_id,int sport_id, int trainer_id, int stud_id,Date doj,String t_status) {
		super();
		this.tcamp_id = tcamp_id;
		this.stud_id = stud_id;
		this.sport_id = sport_id;
		this.trainer_id = trainer_id;
		this.doj = doj;
		this.t_status = t_status;
	}


//default Constructor
	public TrainingCamp() {
		// TODO Auto-generated constructor stub
	}

}
