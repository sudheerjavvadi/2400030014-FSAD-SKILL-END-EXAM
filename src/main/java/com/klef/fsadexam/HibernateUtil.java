package com.klef.fsadexam;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

private static SessionFactory factory;

static{
factory=new Configuration()
.configure("hibernate.cfg.xml")
.addAnnotatedClass(Service.class)
.buildSessionFactory();
}



public static SessionFactory getSessionFactory() {
	// TODO Auto-generated method stub
	return factory;
}



}