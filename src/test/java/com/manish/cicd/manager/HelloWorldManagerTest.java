package com.manish.cicd.manager;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mpandit on 5/26/15.
 */
public class HelloWorldManagerTest extends TestCase {

    @Test
    public void testGetInstance() throws Exception {
        assertTrue(HelloWorldManager.getInstance()!=null);
    }

    @Test
    public void testSayHello() throws Exception {
        assertTrue(HelloWorldManager.getInstance().sayHello().equals("Hello World!"));
    }
}