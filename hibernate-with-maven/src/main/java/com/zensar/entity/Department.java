package com.zensar.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Department {
	@Id
	private int departmentId;
	private String departmentNAme;
	
	@OneToOne(mappedBy = "department")
	@JoinColumn(name = "studentId")
	private Student student;
	

	public Department() {
		super();
	}

	public Department(int departmentId, String departmentNAme) {
		super();
		this.departmentId = departmentId;
		this.departmentNAme = departmentNAme;
	}
	
	
	
	public Department(int departmentId, String departmentNAme, Student student) {
		super();
		this.departmentId = departmentId;
		this.departmentNAme = departmentNAme;
		this.student = student;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentNAme() {
		return departmentNAme;
	}

	public void setDepartmentNAme(String departmentNAme) {
		this.departmentNAme = departmentNAme;
	}
	
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentNAme=" + departmentNAme + ", student="
				+ student + "]";
	}



}
