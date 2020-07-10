package DesignPatternDemo.ChainOfResponsibilityDesignPatternDemo;

import DesignPatternDemo.SharedObject.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonLanguageFilter implements PersonFilter {
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

        if (person.language.equalsIgnoreCase("English")) {
            System.out.println("speak english, Good");
            return true;
        }
        System.out.println("no english, bad");
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

        return results.stream().filter(person -> person.language.equalsIgnoreCase("english")).collect(Collectors.toList());
    }
}
