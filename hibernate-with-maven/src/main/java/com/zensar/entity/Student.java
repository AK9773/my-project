package com.zensar.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity(name = "StudentInfo2")
//@Table(name = "StudentInfo")
@NamedQueries(value = { @NamedQuery(name = "abc", query = "from StudentInfo2 where studentAge=29"),
		@NamedQuery(name = "pqr", query = "from StudentInfo2 where age>25") })
public class Student {

	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	@Column(name = "Name", length = 50)
	private String studentName;
	@Column(name = "Age")
	private int studentAge;

	// @Transient
	// private String tempProperty;

	@OneToOne
	@JoinColumn(name = "DeptId")
	private Department department;

	@Temporal(value = TemporalType.DATE)
	private Date dateOfBirth;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public Student(int studentId, String studentName, int studentAge, Date dateOfBirth) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.dateOfBirth = dateOfBirth;
	}

	public Student(int studentId, String studentName, int studentAge, Department department, Date dateOfBirth) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.department = department;
		this.dateOfBirth = dateOfBirth;
	}

	public Student(String studentName, int studentAge, Date dateOfBirth) {
		super();
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.dateOfBirth = dateOfBirth;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", department=" + department + ", dateOfBirth=" + dateOfBirth + "]";
	}

}
