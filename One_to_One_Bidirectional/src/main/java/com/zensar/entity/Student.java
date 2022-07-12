package com.zensar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;

@Entity(name = "StudentInfo2")

public class Student {

	@Id
	@Column(name = "Id")
	private int studentId;
	@Column(name = "Name", length = 50)
	private String studentName;
	@Column(name = "Age")
	private int studentAge;

	@OneToOne
	@JoinColumn(name = "PassportNo")
	private Passport passport;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int studentAge, Passport passport) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.passport = passport;
	}

	public Student(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

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

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", passport=" + passport + "]";
	}

}
