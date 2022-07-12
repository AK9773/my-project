package com.zensar.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.zensar.entity.Student;

public class Client {

	public static void main(String[] args) {
		// Product product = new Product(1, "Laptop", 45000);

		//Student student = new Student("Harry",29, new Date());
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
	
		Student student = (Student) session.get(Student.class,1);
		student.setStudentName("KL Rahul");
		session.update(student);
		
/*		
		Student student =new Student(5,"KL", 23);
		session.update(student);
		
		
		session.saveOrUpdate(new Student(3,"KL",23));
		
		
		
		Student student = (Student) session.get(Student.class,3);
		session.delete(student);
		
		
		session.save(student);
		
		
		
		
		//Student student=(Student) session.get(Student.class, 1001);
		//System.out.println("product saved successfully");
		//Student student=(Student) session.load(Student.class, 1004);
		 * 
		 * 
		 */
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();

		System.out.println(student);

	}

}