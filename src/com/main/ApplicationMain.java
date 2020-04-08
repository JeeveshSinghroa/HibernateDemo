package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.HibernateUtil;
import com.employee.Employee;

public class ApplicationMain {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Employee emp1 = new Employee(1,"Siddharth Singhroa");
		session.beginTransaction();
		session.save(emp1);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
