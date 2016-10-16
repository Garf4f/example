package ru.garf.contact.dao.impl;


import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import ru.garf.contact.dao.ContactDao;
import ru.garf.contact.model.Contact;

import java.util.List;

public class ContactDaoImpl extends HibernateDaoSupport implements ContactDao{


    public void save(Contact contact) {
        getHibernateTemplate().save(contact);

    }

    public void update(Contact contact) {
        getHibernateTemplate().update(contact);

    }

    public void delete(Contact contact) {
        getHibernateTemplate().delete(contact);

    }

    public Contact findByName(String name) {
        List list = getHibernateTemplate().find(
                "from Contact where name=?", name
        );

        return (Contact)list.get(0);
    }

    public List<Contact> findAllByName(String name){
        List list = getHibernateTemplate().find(
                "from Contact where name=?", name
        );

        return (List<Contact>)list;
    }

    public List<Contact> findAll(){
        List list = getHibernateTemplate().find(
                "from Contact"
        );

        return (List<Contact>)list;
    }

}
