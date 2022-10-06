	package com.dao;

	import java.util.List;

	import javax.persistence.TypedQuery;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

	import com.bean.User;

	@Repository
	public class UserDao {

		@Autowired
		SessionFactory sf;				// DI from spring configuration file with help of LocalSessionFactoryBean
		
		public int storeUser(User user) {
			try {
				//Configuration con = new Configuration();
				//con.configure("hibernate.cfg.xml");
				//SessionFactory sf = con.buildSessionFactory();
				Session session = sf.openSession();
				Transaction tran = session.getTransaction();
				tran.begin();
						session.save(user);
				tran.commit();
				return 1;
			} catch (Exception e) {
				System.out.println(e);
				return 0;
			}
		}
		
		public int updateUser(User user) {
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			User p = session.get(User.class, user.getId());
			if(p==null) {
				return 0;
			}else {
				tran.begin();
					p.setName(user.getName());
					p.setCourse(user.getCourse());
					p.setMarks(user.getMarks());
					session.update(p);
				tran.commit();
				return 1;
			}
		}
		
		public User searchUser(int id) {
			Session session = sf.openSession();
			User p = session.get(User.class, id);
			return p;
		}
		
	}


