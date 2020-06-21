package FactorDesignPatternDemo.FactoryDemo;

import FactorDesignPatternDemo.SimpleFactoryDemo.FileConfig;
import FactorDesignPatternDemo.SimpleFactoryDemo.JsonFileConfig;

public class JsonConfigCreatorFactory implements FileConfigCreatorFactory {
    @Override
    public FileConfig createFactory() {
        //if we have to do lots of thing before return the FileConfig instance
        //, we could use this design
        return new JsonFileConfig();
    }
}
