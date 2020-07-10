package DesignPatternDemo.ObserverDesignPatternDemo;

import DesignPatternDemo.SharedObject.Person;

public interface NewUserRegisterObserver {
    void handleNewUserRegistration(Person person);
}
