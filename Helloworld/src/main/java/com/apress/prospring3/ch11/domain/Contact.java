package com.apress.prospring3.ch11.domain;

import java.io.Serializable;
/**
 * Created by User on 24.05.2017.
 */
public class Contact implements Serializable
{
    private String hello;

    public void setHello(String hello)
    {
        this.hello = hello;
    }

    public String getHello()
    {
        return hello;
    }

    public String toString()
    {
        return hello;
    }
}
