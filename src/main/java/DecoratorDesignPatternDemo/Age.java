package DecoratorDesignPatternDemo;

import java.time.LocalDate;

public class Age {

    private static int bornYear;

    public Age(int bornYear) {
        this.bornYear = bornYear;
    }

    public Age() {
    }

    int getAge() {
        int age = LocalDate.now().getYear() - bornYear;
        System.out.println("current age is: " + age);
        return age;
    }

    ;
}
