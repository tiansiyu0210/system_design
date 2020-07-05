package ObserverDesignPatternDemo;

import SharedObject.Person;

public class UserService {

    public String registerNewUser(Person person) {
        System.out.println(person.getName() + " register successfully");
        return "SUCCESS";
    }
}
