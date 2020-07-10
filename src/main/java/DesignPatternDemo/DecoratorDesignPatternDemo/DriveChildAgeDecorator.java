package DesignPatternDemo.DecoratorDesignPatternDemo;

public class DriveChildAgeDecorator extends AgeParentDecorator {

    private final static int driverLicenceAge = 16;

    private AgeParentDecorator ageParentDecorator;

    public DriveChildAgeDecorator(AgeParentDecorator ageParentDecorator) {
        this.ageParentDecorator = ageParentDecorator;
    }

    public int getAge() {
        System.out.println("we can add some logic in the DriveChildAgeDecorator.getAge before calling AgeParentDecorator.getAge");
        int a = ageParentDecorator.getAge();
        System.out.println("we can add some logic in the DriveChildAgeDecorator.getAge after calling AgeParentDecorator.getAge");
        return a;
    }

    public int ageDifference(int compareAge) {
        if (compareAge > 300 || compareAge <= 0) {
            System.out.println("compare age is wrong");
            return -1;
        }
        return ageParentDecorator.ageDifference(compareAge);
    }

    public void canDrive() {
        int diff = ageParentDecorator.ageDifference(driverLicenceAge);
        if (diff >= 0) {
            System.out.println("you can drive");
        } else {
            System.out.println("you cannot drive");
        }
    }
}
