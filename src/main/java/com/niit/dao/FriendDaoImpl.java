package com.niit.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Users;
@Repository
public class FriendDaoImpl implements FriendDao {
	@Autowired
	private SessionFactory sessionFactory;
	public List<Users> listOfSuggestedUsers(String username) {
		
		Session session=sessionFactory.openSession();
		SQLQuery sqlQuery=session.createSQLQuery("select * from users_batch19 where username in (slect username from users_batch19 where username=");
		sqlQuery.setString(0, username);
		sqlQuery.setString(1, username);
		sqlQuery.setString(3, username);
		sqlQuery.addEntity(Users.class);
		List<Users> suggestedUsersList=sqlQuery.list();
		return suggestedUsersList;
		
	}

}