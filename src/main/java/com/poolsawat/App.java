package com.poolsawat;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.poolsawat.model.Profile;
import com.poolsawat.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		App app = new App();
		app.saveProfile();
	}
	
	public void readProfile(){
		SessionFactory sessionFactory = new HibernateUtil().getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();		
		Criteria criteria = session.createCriteria(Profile.class,"profile");
		criteria.createAlias("profile.friends", "friend");
		criteria.createAlias("profile.contact", "contact");
		List<Profile> profiles = criteria.list();
		for (Profile profile : profiles) {
			System.out.println("profile ::=="+profile.toString());
		}
		session.getTransaction();
	}
	
	public void saveProfile(){
		try {
			SessionFactory sessionFactory = new HibernateUtil().getSessionFactory();
			Session session = sessionFactory.getCurrentSession();			
			session.beginTransaction();
			Profile profile = new Profile();
			profile.setAge(33);
			profile.setName("22222222222");
			profile.setId(7);
			//profile.setFriendId(1);
			//profile.setContactId(1);
			//profile.setModifiedDtm(new Date());
			session.saveOrUpdate(profile);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
	
}
