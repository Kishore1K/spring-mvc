package com.spring.DAO;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.model.User;


@Repository
public class userDAO {
	
	@Autowired
	private HibernateTemplate  hibernateTemplate;
	
	@Transactional
	public int saveUser(User user) {
		return (Integer)this.hibernateTemplate.save(user);
		
	}
	

}
