/**
 * 
 */
package com.antwebapp.cmapp.dao;

import java.util.List;

import com.antwebapp.cmapp.domain.User;



/**
 * @author Lawanu Borthakur
 *
 */
public interface UserDAO {
	public void save(User u);

    public void update(User u);

    public void delete(User u);

    public void delete(Integer userId);

    public User findById(Integer userId);

    public List<User> findAll();

    public List<User> findByProperty(String propName, Object propValue);
}
