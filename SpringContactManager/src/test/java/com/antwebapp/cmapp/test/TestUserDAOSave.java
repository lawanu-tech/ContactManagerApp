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
public class TestUserDAOSave {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO=ctx.getBean(UserDAO.class);
        //TODO: the user details will be taken from User-Reg-Form
        User u=new User();
        u.setName("Mike");
        u.setPhone("7619614457");
        u.setEmail("mike@gmail.com");
        u.setAddress("Panaji");
        u.setLoginName("M");
        u.setPassword("MIKE@123");
        u.setRole(1);//Admin Role 
        u.setLoginStatus(1); //Active
        userDAO.save(u);
        System.out.println("--------Data Saved------");
    }    
	}


