package DecoratorDesignPatternDemo;

public class CollegeChildAgeDecorator extends AgeParentDecorator {

    private AgeParentDecorator ageParentDecorator;

    public CollegeChildAgeDecorator(AgeParentDecorator ageParentDecorator) {
        this.ageParentDecorator = ageParentDecorator;
    }

    public int getAge() {
        int a = ageParentDecorator.getAge();
        int b = a + 4;
        System.out.println("if you go to college at age: " + a + ", you will graduate at age: " + b);
        return b;
    }
}
