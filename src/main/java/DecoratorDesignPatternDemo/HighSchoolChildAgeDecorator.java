package DecoratorDesignPatternDemo;

public class HighSchoolChildAgeDecorator extends AgeParentDecorator {
    private AgeParentDecorator ageParentDecorator;

    public HighSchoolChildAgeDecorator(AgeParentDecorator ageParentDecorator) {
        this.ageParentDecorator = ageParentDecorator;
    }

    public int getAge() {
        int a = ageParentDecorator.getAge();
        int b = a + 3;
        System.out.println("if you go to high school at age: " + a + ", you will graduate at age: " + b);
        return b;
    }
}
