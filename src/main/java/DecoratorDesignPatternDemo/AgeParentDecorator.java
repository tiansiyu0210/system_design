package DecoratorDesignPatternDemo;

public class AgeParentDecorator extends Age {

    public Age age;

    public AgeParentDecorator(Age age) {
        this.age = age;
    }

    public AgeParentDecorator() {
    }

    int getAge() {
        System.out.println("we can add some logic in the AgeParentDecorator.getAge before calling Age.getAge");
        int a = age.getAge();
        System.out.println("we can add some logic in the AgeParentDecorator.getAge after calling Age.getAge");
        return a;
    }

    // we can add more method
    public int ageDifference(int compareAge) {
        int a = age.getAge();
        int diff = a - compareAge;
        System.out.println("age difference is : " + diff);
        return diff;
    }

}
