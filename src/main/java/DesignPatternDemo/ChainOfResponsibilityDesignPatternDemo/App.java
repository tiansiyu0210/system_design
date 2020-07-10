package DesignPatternDemo.ChainOfResponsibilityDesignPatternDemo;

import DesignPatternDemo.SharedObject.Person;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        FilterHandler filterHandler = new FilterHandler();
        PersonFilter filter1 = new PersonAgeFilter();
        PersonFilter filter2 = new PersonHeightFilter();
        PersonFilter filter3 = new PersonLanguageFilter();

        filterHandler.addHandler(filter1);
        filterHandler.addHandler(filter2);
        filterHandler.addHandler(filter3);

        Person person1 = new Person("tian", 32, "chinese", 173.0);
        System.out.println(person1.name + " is " + filterHandler.handleIsValid(person1));

        System.out.println("=======================");
        Person person2 = new Person("siyu", 19, "english", 180.0);
        System.out.println(person2.name + " is " + filterHandler.handleIsValid(person2));

        System.out.println("=======================");
        Person person3 = new Person("mike", 40, "english", 180.0);
        System.out.println(person3.name + " is " + filterHandler.handleIsValid(person3));

        System.out.println("=======================");
        Person person4 = new Person("jean", 12, "english", 155);
        System.out.println(person4.name + " is " + filterHandler.handleIsValid(person4));

        System.out.println("**********************************");
        List<Person> peopleList = new ArrayList<Person>() {
            {
                add(person1);
                add(person2);
                add(person3);
                add(person4);
            }
        };

        List<Person> results = filterHandler.handleDoFilter(peopleList);
        System.out.println(results);
    }
}
