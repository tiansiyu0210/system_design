package DesignPatternDemo.ObserverDesignPatternDemo;

import DesignPatternDemo.SharedObject.Person;

public class FreeGiftService {

    public void sendFreeGift(Person person) {
        System.out.println("send free gist to new user: " + person.name);
    }
}
