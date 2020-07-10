package DesignPatternDemo.FactorDesignPatternDemo.FactoryDemo;

import DesignPatternDemo.FactorDesignPatternDemo.SimpleFactoryDemo.CsvFileConfig;
import DesignPatternDemo.FactorDesignPatternDemo.SimpleFactoryDemo.FileConfig;

//if we're adding a new FileConfig, then we just create a new FileConfigCreatorFactory
public class CsvConfigCreatorFactory implements FileConfigCreatorFactory {
    @Override
    public FileConfig createFactory() {
        return new CsvFileConfig();
    }
}
