package com.service.myapp.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestMyapp {

        MyappDelegate myappDelegate = new MyappDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = myappDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}