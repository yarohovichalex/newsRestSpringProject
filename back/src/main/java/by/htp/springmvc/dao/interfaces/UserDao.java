package by.htp.springmvc.dao.interfaces;

import java.sql.SQLException;
import java.util.Collection;

import by.htp.springmvc.component.User;

public interface UserDao {
	public void createUser(User user) throws SQLException, Exception;
	public void updateUser(User user) throws SQLException, Exception;
    public User getUserById(Long id) throws SQLException, Exception;
    public Collection<User> getAllUsers() throws SQLException, Exception;
    public void deleteUser(User user) throws SQLException, Exception;
    public boolean exist(User user) throws SQLException, Exception;
}
