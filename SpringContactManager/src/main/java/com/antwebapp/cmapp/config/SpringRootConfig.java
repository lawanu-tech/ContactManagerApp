/**
 * 
 */
package com.antwebapp.cmapp.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lawanu Borthakur
 *
 */
@Configuration
@ComponentScan(basePackages ={"com.antwebapp.cmapp.dao","com.antwebapp.cmapp.service"})
public class SpringRootConfig {
//TODO: Services, DAO, DataSource, Email Sender or some other business layer beans.
// In production the datasource configuration is done in properties file but for simplicity purpose it is hardcoded here.	
	@Bean
	    public BasicDataSource getDataSource(){
	        BasicDataSource ds = new BasicDataSource();
	        ds.setDriverClassName("com.mysql.jdbc.Driver");
	        ds.setUrl("jdbc:mysql://localhost:3307/capp_db");
	        ds.setUsername("lawanu");
	        ds.setPassword("lawanu123");
	        ds.setMaxTotal(2);
	        ds.setInitialSize(1);
	        ds.setTestOnBorrow(true);
	        ds.setValidationQuery("SELECT 1");
	        ds.setDefaultAutoCommit(true);
	        return ds;
	    }
}
