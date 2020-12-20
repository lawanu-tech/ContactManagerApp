/**
 * 
 */
package com.antwebapp.cmapp.dao;

import java.util.List;

import com.antwebapp.cmapp.domain.Contact;



/**
 * @author Lawanu Borthakur
 *
 */
public interface ContactDAO {
	public void save(Contact c);

    public void update(Contact c);

    public void delete(Contact c);

    public void delete(Integer contactId);

    public Contact findById(Integer contactId);

    public List<Contact> findAll();

    public List<Contact> findByProperty(String propName, Object propValue);
}
