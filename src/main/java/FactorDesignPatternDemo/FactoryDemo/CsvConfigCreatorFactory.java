package FactorDesignPatternDemo.FactoryDemo;

import FactorDesignPatternDemo.SimpleFactoryDemo.CsvFileConfig;
import FactorDesignPatternDemo.SimpleFactoryDemo.FileConfig;

//if we're adding a new FileConfig, then we just create a new FileConfigCreatorFactory
public class CsvConfigCreatorFactory implements FileConfigCreatorFactory {
    @Override
    public FileConfig createFactory() {
        return new CsvFileConfig();
    }
}
