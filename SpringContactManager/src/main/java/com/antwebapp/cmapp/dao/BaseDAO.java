/**
 * 
 */
package com.antwebapp.cmapp.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

/**
 * @author Lawanu Borthakur
 *
 */
//NOTE: do not use @Repository or @Service or @Component Annotation
abstract public class BaseDAO extends NamedParameterJdbcDaoSupport {
	@Autowired	
	public void setDataSource2(DataSource ds)
{

super.setDataSource(ds);
}
	
}
