package DesignPatternDemo.ChainOfResponsibilityDesignPatternDemo;

import DesignPatternDemo.SharedObject.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonHeightFilter implements PersonFilter {
    private PersonFilter personFilter;

    @Override
    public boolean isValid(Person person) {
        boolean validated = true;
        if (personFilter != null) {
            validated = personFilter.isValid(person);
        }

        if (!validated) {
            return false;
        }


        if (person.height > 160.0) {
            System.out.println("high enough, Good");
            return true;
        }

        System.out.println("too short, Bad");
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
        return results.stream().filter(person -> person.height > 160).collect(Collectors.toList());
    }

    @Override
    public void setPersonFilter(PersonFilter personFilter) {
        this.personFilter = personFilter;
    }
}
