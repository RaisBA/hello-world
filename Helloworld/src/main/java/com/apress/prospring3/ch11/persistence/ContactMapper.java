package com.apress.prospring3.ch11.persistence;

import java.util.List;
import com.apress.prospring3.ch11.domain.Contact;

/**
 * Created by User on 24.05.2017.
 */
public interface ContactMapper
{
    public List<Contact> findAll();
}
