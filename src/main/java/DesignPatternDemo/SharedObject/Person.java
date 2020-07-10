package DesignPatternDemo.SharedObject;

public class Person {
    public String name;
    public int age;
    public String language;
    public double height;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, String language, double height) {
        this.name = name;
        this.age = age;
        this.language = language;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", language='" + language + '\'' +
                ", height=" + height +
                '}';
    }
}
