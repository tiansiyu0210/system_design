package DesignPatternDemo.ObserverDesignPatternDemo;

import DesignPatternDemo.SharedObject.Person;

public class FreeShippingService {

    public void freeShipping(Person person) {
        System.out.println("shipping fee is free for new user: " + person.name);
    }
}
