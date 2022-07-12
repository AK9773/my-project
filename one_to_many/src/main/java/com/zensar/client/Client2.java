package com.zensar.client;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.zensar.entity.Address;
import com.zensar.entity.Student;

public class Client2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Student student = new Student(123, "Aman", 25);
		Address address1 = new Address(10, "UP", "Kanpur", 111111);
		Address address2 = new Address(20, "MP", "Bhopal", 222111);
		
		List<Address> address = new ArrayList<Address>();
		address.add(address1);
		address.add(address2);

		student.setAddress(address);
		address1.setStudent(student);
		address2.setStudent(student);
		
		
		
		session.save(address1);
		session.save(address2);
		session.save(student);
		
		
		
		transaction.commit();
		session.close();
		factory.close();
		

	}
}
