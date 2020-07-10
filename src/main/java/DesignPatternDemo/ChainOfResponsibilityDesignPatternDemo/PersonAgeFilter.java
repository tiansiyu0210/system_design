package DesignPatternDemo.ChainOfResponsibilityDesignPatternDemo;

import DesignPatternDemo.SharedObject.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonAgeFilter implements PersonFilter {
    private PersonFilter personFilter;

    @Override
    public void setPersonFilter(PersonFilter personFilter) {
        this.personFilter = personFilter;
    }

    @Override
    public boolean isValid(Person person) {
        boolean validated = true;
        if (personFilter != null) {
            validated = personFilter.isValid(person);
        }

        if (!validated) {
            return false;
        }

        if (person.age > 18) {
            System.out.println("greater than 18, Good");
            return true;
        }
        System.out.println("less than 18, Bad");
        return false;
    }

    @Override
    public List<Person> doFilter(List<Person> personList) {
        List<Person> results = new ArrayList<>();
        if (personFilter != null) {
            results = personFilter.doFilter(personList);
        } else {
            results = personList;
        }

        return results.stream().filter(person -> person.age > 18).collect(Collectors.toList());
    }
}
