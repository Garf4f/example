package ru.garf.contact.bo;


import ru.garf.contact.model.Contact;

import java.util.List;

public interface ContactBo {

    void save(Contact contact);
    void update(Contact contact);
    void delete(Contact contact);
    Contact findByName(String name);
    List<Contact> findAllByName(String name);
    List<Contact> findAll();

}
