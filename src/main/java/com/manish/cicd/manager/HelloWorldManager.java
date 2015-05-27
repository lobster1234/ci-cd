package com.manish.cicd.manager;

/**
 * Created by mpandit on 5/26/15.
 */
public class HelloWorldManager {

    private static HelloWorldManager manager = new HelloWorldManager();

    private HelloWorldManager(){

    }

    public static HelloWorldManager getInstance(){
        return manager;
    }

    public String sayHello(){
        return "Hello World!";
    }
}
