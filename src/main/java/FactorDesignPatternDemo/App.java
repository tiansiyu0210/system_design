package FactorDesignPatternDemo;

import FactorDesignPatternDemo.SimpleFactoryDemo.FileConfigFactory;
import FactorDesignPatternDemo.SimpleFactoryIIDemo.FIleConfigFactoryII;

public class App {

    public static void main(String[] args) {
        System.out.println(FileConfigFactory.getConfig("xml").getConfig());

        //simple factory demo II
        System.out.println(FIleConfigFactoryII.getConfig("yaml").getConfig());
    }
}
