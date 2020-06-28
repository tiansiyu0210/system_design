package DecoratorDesignPatternDemo;

public class App {
    public static void main(String[] args) {
        Age age = new Age(1988);
        AgeParentDecorator ageParentDecorator = new AgeParentDecorator(age);
        DriveChildAgeDecorator driveAge = new DriveChildAgeDecorator(ageParentDecorator);
        driveAge.getAge();
        System.out.println("===============");
        driveAge.ageDifference(800);
        System.out.println("===============");
        driveAge.canDrive();
    }
}
