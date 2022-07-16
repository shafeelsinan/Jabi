package com.swing.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.swing.entity.Student;
import com.swing.hibernate.HibernateUtil;

public class StudentService {
	
	
	public void saveStudent(Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(student);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

}
