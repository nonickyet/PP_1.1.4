package jm.task.core.jdbc.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.lang.module.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    private static final String url = "jdbc:mysql://localhost:3306/mytestbd";
    private static final String user = "root";
    private static final String password = "1290";

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(false);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

//    public static Session getSessionFactory() {
//        try {
//            Properties prop = new Properties();
//            prop.setProperty("hibernate.connection.url", url);
//            prop.setProperty("dialect", "org.hibernate.dialect.MySQL8Dialect");
//            prop.setProperty("hibernate.connection.username", user);
//            prop.setProperty("hibernate.connection.password", password);
//            prop.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
//            SessionFactory sessionFactory = new Configuration().addProperties(prop).buildSessionFactory();
//            return sessionFactory.openSession();
//        } catch (Exception x) {
//            throw x;
//        }
//    }
}
//Properties prop= new Properties();
//
//        prop.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/mytestbd);
//
//        //You can use any database you want, I had it configured for Postgres
//        prop.setProperty("dialect", "org.hibernate.dialect.");
//
//        prop.setProperty("hibernate.connection.username", "<your-user>");
//        prop.setProperty("hibernate.connection.password", "<your-password>");
//        prop.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
//        prop.setProperty("show_sql", true); //If you wish to see the generated sql query
//
//    SessionFactory sessionFactory = new Configuration().addProperties(prop).buildSessionFactory();
//       Session session = sessionFactory.openSession();
//    session.beginTransaction();
//            Customer user = new Customer(); //Note customer is a POJO maps to the customer table in the database.
//
//    user.setName("test");
//    user.setisActive(true);
//    session.save(user);
//    session.getTransaction().commit();
//    session.close();
