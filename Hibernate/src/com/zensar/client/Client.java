package com.zensar.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.zensar.entity.Student;

public class Client {

	public static void main(String[] args) {
		// Product product = new Product(1, "Laptop", 45000);

		Student student = new Student(1007, "Amit", 20);

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.save(student);

		System.out.println("product saved succcessfully");
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();

		System.out.println(student);

	}

}