package DesignPatternDemo.ObserverDesignPatternDemo;

import DesignPatternDemo.SharedObject.Person;

public class UserService {

    public String registerNewUser(Person person) {
        System.out.println(person.getName() + " register successfully");
        return "SUCCESS";
    }
}
