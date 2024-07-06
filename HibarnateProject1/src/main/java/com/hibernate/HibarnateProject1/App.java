package com.hibernate.HibarnateProject1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	System.out.println("project started....");
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        
        //creating student object
        Student s1 = new Student(01,"Akash","Bengaluru");
        
        Session session=factory.openSession();
       
        Transaction tx=session.beginTransaction();
        session.save(s1);
        tx.commit();
        
        session.close();
        
        System.out.println("Done");
        
        
        
        
          
     
        
    
        
    }
}
