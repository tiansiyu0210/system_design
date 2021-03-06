package DesignPatternDemo.FactorDesignPatternDemo;

import DesignPatternDemo.FactorDesignPatternDemo.FactoryDemo.FileConfigFactoryFactory;
import DesignPatternDemo.FactorDesignPatternDemo.SimpleFactoryDemo.FileConfigFactory;
import DesignPatternDemo.FactorDesignPatternDemo.SimpleFactoryIIDemo.FIleConfigFactoryII;

public class App {

    public static void main(String[] args) {
        System.out.println(FileConfigFactory.getConfig("xml").getConfig());

        //simple factory demo II
        System.out.println(FIleConfigFactoryII.getConfig("yaml").getConfig());

        //add a new fileConfig
        System.out.println(FileConfigFactory.getConfig("csv").getConfig());
        System.out.println(FIleConfigFactoryII.getConfig("csv").getConfig());

        //factory pattern demo
        System.out.println(FileConfigFactoryFactory
                .getCreatorFactory("json")
                .createFactory()
                .getConfig()
        );

        //add a new fileConfig
        System.out.println(FileConfigFactoryFactory
                .getCreatorFactory("csv")
                .createFactory()
                .getConfig()
        );
    }
}
