package com.fonowizja.egzamin_hiber;

import com.fonowizja.egzamin_hiber.connector.PostgreSQLConnector;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {


    public static void main(String[] args) {
        PostgreSQLConnector postgreSQLConnector = new PostgreSQLConnector();
        Session session = postgreSQLConnector.getSession();

        Transaction transaction = session.getTransaction();

        transaction.begin();

        Student student = new Student();
        session.persist(student);
        session.flush();
        transaction.commit();
        session.close();

    }
}
