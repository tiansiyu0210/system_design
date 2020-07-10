package DesignPatternDemo.ChainOfResponsibilityDesignPatternDemo;

import DesignPatternDemo.SharedObject.Person;

import java.util.List;

public interface PersonFilter {
    boolean isValid(Person person);

    List<Person> doFilter(List<Person> personList);

    void setPersonFilter(PersonFilter personFilter);
}
