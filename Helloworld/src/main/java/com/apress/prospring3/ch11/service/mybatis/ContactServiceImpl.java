package com.apress.prospring3.ch11.service.mybatis;

import com.apress.prospring3.ch11.domain.Contact;
import com.apress.prospring3.ch11.persistence.ContactMapper;
import com.apress.prospring3.ch11.service.ContactService;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by User on 24.05.2017.
 */
@Service("contactService")
@Repository
@Transactional
public class ContactServiceImpl implements ContactService
{
    private Log log = LogFactory.getLog(ContactServiceImpl.class);

    @Autowired

    private ContactMapper contactMapper;

    @Transactional(readOnly = true)
    public List<Contact> findAll(){
        List<Contact> contacts = contactMapper.findAll();
        return contacts;
    }

}
