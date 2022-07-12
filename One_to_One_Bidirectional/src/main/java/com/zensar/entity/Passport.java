package com.zensar.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Passport {
	@Id
	private int passportNo;
	private Date expirationDate;
	
	@OneToOne
	@JoinColumn(name = "StudentId")
	private Student student;
	
	
	public Passport() {
		super();
	}
	
	
	public Passport(int passportNo, Date expirationDate) {
		super();
		this.passportNo = passportNo;
		this.expirationDate = expirationDate;
	}
	
	
	public int getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	
	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", expirationDate=" + expirationDate + ", student=" + student
				+ "]";
	}


	
	
	
}
