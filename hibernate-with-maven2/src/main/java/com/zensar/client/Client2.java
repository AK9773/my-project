package com.zensar.client;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.hibernate.loader.custom.sql.SQLCustomQuery;

import com.zensar.entity.Department;
import com.zensar.entity.Student;

public class Client2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Student student = new Student(123,"Aman", 25, new Date());
		Department department= new Department(1, "CSE");
		student.setDepartment(department);
		department.setStudent(student);
	
		session.save(student);
		session.save(department);
/*	
		//String query= "from StudentInfo2";
		//String query= "from StudentInfo2 s";
 		
		//String query= "from StudentInfo2 where studentAge>25";
		String query= "update StudentInfo2 s set s.studentAge=27 where s.studentName='Sam'";   //Not working		
		Query query2 = session.createQuery(query);
		query2.executeUpdate();
		
		
		
		//List<Student> list = query2.list();
		
*/
		

		
		
/*				
		Query query=session.getNamedQuery("abc");
		//Query query=session.getNamedQuery("pqr");
		List<Student> list = query.list();
*/

		
		
		
		
		
/*		
		Scanner s = new Scanner(System.in);
		//Query query= session.createQuery("Select s.studentName  from StudentInfo2 s where studentAge>25");
		Query query= session.createQuery("update StudentInfo2 s set  s.studentAge=:age where s.studentName= :name");
		System.out.println("Enter Age: ");
		int age = s.nextInt();
		System.out.println("Enter Name: ");
		String name = s.next();
		
		query.setParameter("age", age);
		query.setParameter("name", name);
		query.executeUpdate();
*/				
	
	
		
		
		
		
			
/*		
		SQLQuery sqlQuery=session.createSQLQuery("select * from studentinfo2");
		sqlQuery.addEntity(Student.class);
		List list= sqlQuery.list();
*/
		

		
		
		
		
/*		
		Criteria criteria = session.createCriteria(Student.class);		
		//criteria.add(Restrictions.gt("studentAge", 30));		
		//criteria.addOrder(Order.asc("studentName"));
		//criteria.addOrder(Order.desc("studentName"));
		//criteria.add(Restrictions.lt("studentAge", 30));
		criteria.add(Restrictions.between("studentAge", 25, 30));
		List list = criteria.list();
*/

		
	
		
		
		
		
/*				
		for(Object object: list) {
			System.out.println(object);		
		}
*/		

		
		
		
		transaction.commit();
		session.close();
		factory.close();

	}

}
