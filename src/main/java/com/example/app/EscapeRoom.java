package com.example.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class EscapeRoom {
    public static void main(String[] args) {
        int x=codigo1();
        int y=codigo2();
        int z=codigo3();
        int w=codigo4();
        System.out.println("El código descubierto es: " +x+y+z+w);
    }

    public static int codigo1() {

        Query query = null;
        Session session = null;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        query = session.createQuery("SELECT COUNT(*) FROM  Modulo");

        return ((Long) query.uniqueResult()).intValue();

    }
    public static int codigo2() {
        Query query = null;
        Session session = null;
        Transaction transaction = null;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        query = session.createQuery("SELECT COUNT(DISTINCT idModul) FROM Examen");


        return ((Long) query.uniqueResult()).intValue();
    }
    public static int codigo3() {
        Query query = null;
        Session session = null;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        query = session.createQuery("SELECT CEILING(AVG(nota)) FROM Examen WHERE idModul = 1");

        return ((Double) query.uniqueResult()).intValue();
    }
    public static int codigo4() {
        Query query = null;
        Session session = null;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        query = session.createQuery("SELECT COUNT(apellidos) FROM Alumno WHERE apellidos LIKE '%z%'");

        return ((Long) query.uniqueResult()).intValue();
    }
}
