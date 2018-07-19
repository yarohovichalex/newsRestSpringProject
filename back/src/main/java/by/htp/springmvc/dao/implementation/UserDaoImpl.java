package by.htp.springmvc.dao.implementation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.htp.springmvc.component.User;
import by.htp.springmvc.dao.interfaces.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private EntityManager entityManager;
	private Session session;

	@Override
	public void createUser(User user) throws SQLException, Exception {
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}

	@Override
	public void updateUser(User user) throws SQLException, Exception {
		session.beginTransaction();
		session.update(user);
		session.getTransaction().commit();
	}

	@Override
	public User getUserById(Long id) throws SQLException, Exception {
		User user = null;
		user = (User) session.load(User.class, id);
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<User> getAllUsers() throws SQLException, Exception {
		List<User> users = new ArrayList<User>();
		users = session.createCriteria(User.class).list();
		return users;
	}

	@Override
	public void deleteUser(User user) throws SQLException, Exception {
		session.beginTransaction();
		session.delete(user);
		session.getTransaction().commit();
	}

	@Override
	public boolean exist(User user) throws SQLException, Exception {
		User userExist = null;
		userExist = (User) session.load(User.class, user.getId());
		return userExist.equals(user);
	}
}
