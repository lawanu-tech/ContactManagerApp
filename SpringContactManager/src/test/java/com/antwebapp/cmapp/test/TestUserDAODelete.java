/**
 * 
 */
package com.antwebapp.cmapp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.antwebapp.cmapp.config.SpringRootConfig;
import com.antwebapp.cmapp.dao.UserDAO;

/**
 * @author Lawanu Borthakur
 *
 */
public class TestUserDAODelete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringRootConfig.class);
UserDAO userDAO=ctx.getBean(UserDAO.class);
userDAO.delete(9);
System.out.println("--------Data Deleted------");
	}

}
