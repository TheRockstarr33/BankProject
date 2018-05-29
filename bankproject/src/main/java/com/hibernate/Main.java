//Tutorials:
//
//https://www.mkyong.com/hibernate/quick-start-maven-hibernate-mysql-example/
//https://www.tutorialspoint.com/hibernate/hibernate_examples.htm

package com.hibernate;

import com.hibernate.entity.User;
import com.hibernate.gui.LoginWindow;
import com.hibernate.gui.MainWindow;
import com.hibernate.io.LoginInput;
import com.hibernate.persistence.HibernateUtil;
import org.hibernate.*;

public class Main {

    public static User currentSession = null;
//    public static User currentSession = new User();

    public static void performTransaction() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        //Have code dealing with user input here, get the request and act accordingly
        //Set info for our classes and use session.save(CLASSNAME); to save them

        session.getTransaction().commit();
    }

    public static void main(String[] args) {
        LoginWindow.loginWindow();
//        LoginInput.iLoginPage();
    }
}
