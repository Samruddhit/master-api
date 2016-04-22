package com.reposit;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

import com.example.model.User;
@Repository
public class UserRepo implements IUserRepo {
	@PersistenceContext
 private EntityManager em;
	@Override
	public List<User> findAllUsers() {
		CriteriaQuery<User> query =  (CriteriaQuery<User>) em.createQuery("Select * from User orderby Id asc ");
		List<User> user = ((Query) em).getResultList();
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserById(String id) {
		User user = em.find(User.class, id);
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public User findUserByEmail(String email) {
		/*User user=em.find(User.class, email);
		// TODO Auto-generated method stub
		return user;*/
		
		TypedQuery<User> query = em.createNamedQuery("User.findByEmail", User.class);
    	query.setParameter("pEmail", email);
    	List<User> users = query.getResultList();
    	if(users != null && users.size() == 1) {
    		return users.get(0);
    	}
    	else {
    		return null;
    	}
	}
	@Override
	public User createUser(User user) {
		em.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		em.merge(user);// TODO Auto-generated method stub
		return user;
	}

	@Override
	public void deleteUser(User user) {
		em.remove(user);// TODO Auto-generated method stub
		
	}

	@Override
	public User updateContact(User user) {
		em.merge(user);// TODO Auto-generated method stub
		return user;
	}

}
