package com.swing.common;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.swing.hibernate.HibernateUtil;

public class BaseRepository {

	public void save(Object obj) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(obj);
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
