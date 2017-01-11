package fr.imie.ProjetPlateformeWeb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.imie.ProjetPlateformeWeb.entity.User;

@Stateless
public class UserDAO {
	
	@PersistenceContext(unitName="imiejpa_PU")
	private EntityManager em;
	
	
	public void create(User user) throws DAOException {
		em.persist(user);
		
	}
	
	public void delete(User person) throws DAOException {
		em.remove(person);
	}
	
	public User get(String email) throws DAOException {
String query= "SELECT pFROM Person p WHERE p.email:=email";
Query q =em.createNamedQuery(query);
q.setParameter("eamil", email);
User user=(User) q.getSingleResult();
		return user;

	}
	
	public User get(int id) throws DAOException {
		User user = em.find(User.class, id);
		return user;

	}
	
	public List<User> getAll() throws DAOException {
		String query = "SELECT pFROM Person p";
		Query q=em.createQuery(query);
		List<User> users = (List<User>) q.getResultList();
		return users;

	}
	
}
