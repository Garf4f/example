package ru.garf.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.garf.contact.bo.ContactBo;
import ru.garf.contact.model.Contact;

/**
 * Created by ACER on 11.10.2016.
 */
public class App {

    public static void main(String[] args){
        System.out.println("App Work");

        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

        ContactBo contactBo = (ContactBo) appContext.getBean("contactBo");

        for(Contact contact :contactBo.findAll()){
            System.out.println(contact);
        }

        System.out.println("end");

    }


}
