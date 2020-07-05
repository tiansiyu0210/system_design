package ObserverDesignPatternDemo;

import SharedObject.Person;

public interface NewUserRegisterObserver {
    void handleNewUserRegistration(Person person);
}
