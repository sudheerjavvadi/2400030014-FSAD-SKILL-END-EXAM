package com.klef.fsadexam;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.Date;

public class ClientDao {

public static void main(String[] args){

Session session=HibernateUtil.getSessionFactory().openSession();
Transaction tx=session.beginTransaction();

Service s=new Service("priya","Active",new Date());


session.save(s);

tx.commit();
session.close();

updateService(1,"Active");

}

public static void updateService(int id,String status){

Session session=HibernateUtil.getSessionFactory().openSession();
Transaction tx=session.beginTransaction();

Query q=session.createQuery("update Service set status=:st where id=:i");

q.setParameter("st",status);
q.setParameter("i",id);

q.executeUpdate();

tx.commit();
session.close();

}

}