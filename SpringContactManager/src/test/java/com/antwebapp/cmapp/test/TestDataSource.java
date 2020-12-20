/**
 * 
 */
package com.antwebapp.cmapp.test;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.antwebapp.cmapp.config.SpringRootConfig;



/**
 * @author Lawanu Borthakur
 *
 */
public class TestDataSource {
	public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        DataSource ds = ctx.getBean(DataSource.class);
        JdbcTemplate jt = new JdbcTemplate(ds);
        String sql="INSERT INTO user(`name`, `phone`, `email`, `address`, `loginName`, `password`) VALUES(?,?,?,?,?,?)";
        Object[] param = new Object[]{"Lawanu", "6360410772", "info@antwebapp.com.com", "Bangalore", "lawanu", "lawanu123"};
        jt.update(sql, param);
        System.out.println("------SQL executed-----");
    }    

}
