package FactorDesignPatternDemo.SimpleFactoryDemo;

public class App {

    public static void main(String[] args) {
        System.out.println(FileConfigFactory.getConfig("xml").getConfig());
    }
}
