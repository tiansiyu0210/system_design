package DesignPatternDemo.ChainOfResponsibilityDesignPatternDemo;

import DesignPatternDemo.SharedObject.Person;

import java.util.ArrayList;
import java.util.List;

public class FilterHandler {
    private PersonFilter head = null;
    private PersonFilter tail = null;

    public void addHandler(PersonFilter personFilter) {
        personFilter.setPersonFilter(null);
        if (head == null) {
            head = personFilter;
            tail = personFilter;
            return;
        }
        tail.setPersonFilter(personFilter);
        tail = personFilter;
    }

    public boolean handleIsValid(Person person) {
        if (head != null) {
            return head.isValid(person);
        }
        System.out.println("no filter");
        return false;
    }

    public List<Person> handleDoFilter(List<Person> personList) {
        if (head != null) {
            return head.doFilter(personList);
        }
        System.out.println("no filter");
        return new ArrayList<>();
    }
}
