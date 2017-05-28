package com.apress.prospring3.ch11.service;

import com.apress.prospring3.ch11.domain.Contact;
import java.util.List;

/**
 * Created by User on 24.05.2017.
 */
public interface ContactService
{
    public List<Contact> findAll();
}
