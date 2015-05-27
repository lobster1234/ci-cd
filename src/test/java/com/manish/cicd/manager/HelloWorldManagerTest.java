package com.manish.cicd.manager;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mpandit on 5/26/15.
 */
public class HelloWorldManagerTest extends TestCase {

    @Before
    public void setup(){

    }

    @Test
    public void testGetInstance() throws Exception {
        assertTrue(HelloWorldManager.getInstance()!=null);
    }

    @Test
    public void testSayHello( ){
        assertTrue(HelloWorldManager.getInstance().sayHello().equals("Hello World!")) ;
    }
}