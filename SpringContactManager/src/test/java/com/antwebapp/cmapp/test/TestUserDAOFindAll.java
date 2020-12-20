/**
 * 
 */
package com.antwebapp.cmapp.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.antwebapp.cmapp.config.SpringRootConfig;
import com.antwebapp.cmapp.dao.UserDAO;
import com.antwebapp.cmapp.domain.User;



/**
 * @author Lawanu Borthakur
 *
 */
public class TestUserDAOFindAll {
	 public static void main(String[] args) {
	        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
	        UserDAO userDAO=ctx.getBean(UserDAO.class);   
	        
	        List<User> users = userDAO.findAll();
	        for (User u : users) {
	             System.out.println(u.getUserId()+" "+u.getName()+" "+u.getRole());
	             //TODO: access other columns
	        }
}}
