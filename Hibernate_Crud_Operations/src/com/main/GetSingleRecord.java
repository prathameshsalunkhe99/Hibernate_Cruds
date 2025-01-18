package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class GetSingleRecord {
public static void main(String[] args) {
	
	Configuration cfg= new Configuration();
     cfg.configure("hibernate.cfg.xml");
     cfg.addAnnotatedClass(Student.class);
     
     SessionFactory sf= cfg.buildSessionFactory();
     Session ss= sf.openSession();
     Transaction tr= ss.beginTransaction();
     
    int studid =1;
    Student s= ss.get(Student.class, studid);

     tr.commit();
     ss.close();
     System.out.println(s);
}
}
