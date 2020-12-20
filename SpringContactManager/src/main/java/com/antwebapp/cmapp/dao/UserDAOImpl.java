/**
 * 
 */
package com.antwebapp.cmapp.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.antwebapp.cmapp.domain.User;
import com.antwebapp.cmapp.rm.UserRowMapper;



/**
 * @author Lawanu Borthakur
 *
 */
@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO {

	@Override
	public void save(User u) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO user(name, phone, email, address, loginName, password, role, loginStatus)"
                + " VALUES(:name, :phone, :email, :address, :loginName, :password, :role, :loginStatus)";
        Map m = new HashMap();
        m.put("name", u.getName());
        m.put("phone", u.getPhone());
        m.put("email", u.getEmail());
        m.put("address", u.getAddress());
        m.put("loginName", u.getLoginName());
        m.put("password", u.getPassword());
        m.put("role", u.getRole());
        m.put("loginStatus", u.getLoginStatus());

        KeyHolder kh = new GeneratedKeyHolder();
        SqlParameterSource ps = new MapSqlParameterSource(m);
        super.getNamedParameterJdbcTemplate().update(sql, ps, kh);
        Integer userId = kh.getKey().intValue();
        u.setUserId(userId);
	}

	@Override
	public void update(User u) {
		// TODO Auto-generated method stub
		
		 String sql = "UPDATE user "
	                + " SET name=:name,"
	                + " phone=:phone, "
	                + " email=:email,"
	                + " address=:address,"
	                + " role=:role,"
	                + " loginStatus=:loginStatus "
	                + " WHERE userId=:userId";
	        Map m = new HashMap();
	        m.put("name", u.getName());
	        m.put("phone", u.getPhone());
	        m.put("email", u.getEmail());
	        m.put("address", u.getAddress());       
	        m.put("role", u.getRole());
	        m.put("loginStatus", u.getLoginStatus());
	        m.put("userId", u.getUserId());
	        getNamedParameterJdbcTemplate().update(sql, m);
		
	}

	@Override
	public void delete(User u) {
		// TODO Auto-generated method stub
		this.delete(u.getUserId());
	}

	@Override
	public void delete(Integer userId) {
		// TODO Auto-generated method stub
		String sql="DELETE FROM user WHERE userId=?";
        getJdbcTemplate().update(sql, userId);
	}

	@Override
	public User findById(Integer userId) {
		// TODO Auto-generated method stub
		 String sql = "SELECT userId, name, phone, email, address, loginName, role, loginStatus"
	                + " FROM user WHERE userId=?";
	        User u = getJdbcTemplate().queryForObject(sql, new UserRowMapper(),userId);
	        return u;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		 String sql = "SELECT userId, name, phone, email, address, loginName, role, loginStatus"
	                + " FROM user";
	           /*
	           List<User> users = getJdbcTemplate().query(sql, new UserRowMapper());
	           return users;
	           */
	           return getJdbcTemplate().query(sql, new UserRowMapper());
	}

	@Override
	public List<User> findByProperty(String propName, Object propValue) {
		// TODO Auto-generated method stub
		  String sql = "SELECT userId, name, phone, email, address, loginName, role, loginStatus"
	                + " FROM user WHERE "+propName+"=?";
	         return getJdbcTemplate().query(sql, new UserRowMapper(), propValue);
	}

}
