package com.zensar.client;

import java.util.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



import com.zensar.entity.Passport;
import com.zensar.entity.Student;

public class Client2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Student student = new Student(123,"Aman",25);
		Passport passport = new Passport(1233, new Date());
		
		

		student.setPassport(passport);
		passport.setStudent(student);
		session.save(passport);
		session.save(student);
		
		
		
		
		transaction.commit();
		session.close();
		factory.close();
		

	}
}
