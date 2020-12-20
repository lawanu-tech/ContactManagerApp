/**
 * 
 */
package com.antwebapp.cmapp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.antwebapp.cmapp.config.SpringRootConfig;
import com.antwebapp.cmapp.dao.UserDAO;
import com.antwebapp.cmapp.domain.User;


/**
 * @author Lawanu Borthakur
 *
 */
public class TestUserDAOUpdate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
	        UserDAO userDAO=ctx.getBean(UserDAO.class);
	        //TODO: the user details will be taken from Update User Profile Page
	        User u=new User();
	        u.setUserId(1);
	        u.setName("Mario");
	        u.setPhone("9476530563");
	        u.setEmail("lawanu1@gmail.com");
	        u.setAddress("Bangalore");        
	        u.setRole(1);//Admin Role 
	        u.setLoginStatus(1); //Active
	        
	        userDAO.update(u);
	        System.out.println("--------Data Updated------");

	}

}
