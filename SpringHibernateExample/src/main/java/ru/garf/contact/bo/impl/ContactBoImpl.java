package ru.garf.contact.bo.impl;

import ru.garf.contact.bo.ContactBo;
import ru.garf.contact.dao.ContactDao;
import ru.garf.contact.model.Contact;

import java.util.List;


public class ContactBoImpl implements ContactBo {

    ContactDao contactDao;

    public void setContactDao(ContactDao contactDao){
        this.contactDao=contactDao;
    }

    public void save(Contact contact) {
        contactDao.save(contact);
    }

    public void update(Contact contact) {
        contactDao.update(contact);
    }

    public void delete(Contact contact) {
        contactDao.delete(contact);
    }

    public Contact findByName(String name) {
        return contactDao.findByName(name);
    }

    public List<Contact> findAllByName(String name){
        return contactDao.findAllByName(name);
    }

    public List<Contact> findAll() {
        return contactDao.findAll();
    }




}
