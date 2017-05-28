package com.apress.prospring3.ch11;

import java.util.List;

import com.apress.prospring3.ch11.service.mybatis.ContactServiceImpl;
import org.springframework.context.support.GenericXmlApplicationContext;
import com.apress.prospring3.ch11.service.ContactService;
import com.apress.prospring3.ch11.domain.Contact;
/**
 * Created by User on 24.05.2017.
 */
public class MyBatisSample
{
    public static String GetMessage()
    {
        GenericXmlApplicationContext gx = new GenericXmlApplicationContext("classpath:app-context.xml");
        //gx.load("classpath:app-context.xml");
        //gx.refresh();

        ContactService contactS = (ContactService) gx.getBean("contactService");

        List<Contact> list = contactS.findAll();

        return list.get(0).toString();
    }
}
