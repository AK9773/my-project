package com.zensar.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity(name = "StudentInfo2")
@NamedQueries(value = { @NamedQuery(name = "abc", query = "from StudentInfo2 where studentAge=29"),
		@NamedQuery(name = "pqr", query = "from StudentInfo2 where age>25") })
public class Student {

	@Id
	@Column(name = "Id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	@Column(name = "Name", length = 50)
	private String studentName;
	@Column(name = "Age")
	private int studentAge;

	

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
	//@JoinColumn(name = "Address")
	private List<Address> address;


	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int studentAge, List<Address> address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.address = address;
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



	public List<Address> getAddress() {
		return address;
	}



	public void setAddress(List<Address> address) {
		this.address = address;
	}



	


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", address=" + address + "]";
	}

	

}
