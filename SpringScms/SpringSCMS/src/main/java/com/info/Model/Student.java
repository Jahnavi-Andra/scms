package com.info.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="stud_id")
	public int studentId;
	@Column(name="stud_name")
	public String studentName;
	@Column(name="stud_phone")
	public double studentPhNo;
	@Column(name="stud_uname")
	public String studUsername;
	@Column(name="stud_passwd")
	public String studPassword;
	@Column(name="wallet")
	public double studWallet;
	@Column(name="points")
	public int studPoints;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudentPhNo() {
		return studentPhNo;
	}
	public void setStudentPhNo(double studentPhNo) {
		this.studentPhNo = studentPhNo;
	}
	public String getStudUsername() {
		return studUsername;
	}
	public void setStudUsername(String studUsername) {
		this.studUsername = studUsername;
	}
	public String getStudPassword() {
		return studPassword;
	}
	public void setStudPassword(String studPassword) {
		this.studPassword = studPassword;
	}
	public double getStudWallet() {
		return studWallet;
	}
	public void setStudWallet(double studWallet) {
		this.studWallet = studWallet;
	}
	public int getStudPoints() {
		return studPoints;
	}
	public void setStudPoints(int studPoints) {
		this.studPoints = studPoints;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhNo=" + studentPhNo
				+ ", StudUsername=" + studUsername + ", studPassword=" + studPassword + ", studWallet=" + studWallet
				+ ", studPoints=" + studPoints + "]";
	}
	
	public Student(int studentId, String studentName, double studentPhNo, String studUsername, String studPassword,
			double studWallet, int studPoints) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhNo = studentPhNo;
		this.studUsername = studUsername;
		this.studPassword = studPassword;
		this.studWallet = studWallet;
		this.studPoints = studPoints;
	}


}
