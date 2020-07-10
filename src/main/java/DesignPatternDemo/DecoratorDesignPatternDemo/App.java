package DesignPatternDemo.DecoratorDesignPatternDemo;

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

        System.out.println("**********************");
        System.out.println("**********************");

        //嵌套
        HighSchoolChildAgeDecorator highSchoolChildAgeDecorator = new HighSchoolChildAgeDecorator(ageParentDecorator);
        CollegeChildAgeDecorator collegeChildAgeDecorator = new CollegeChildAgeDecorator(highSchoolChildAgeDecorator);
        collegeChildAgeDecorator.getAge();
    }
}
