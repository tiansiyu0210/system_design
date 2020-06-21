package FactorDesignPatternDemo.FactoryDemo;

import FactorDesignPatternDemo.SimpleFactoryDemo.FileConfig;
import FactorDesignPatternDemo.SimpleFactoryDemo.XmlFileConfig;

public class XmlConfigCreatorFactory implements FileConfigCreatorFactory {
    @Override
    public FileConfig createFactory() {
        //if we have to do lots of thing before return the FileConfig instance
        //, we could use this design
        return new XmlFileConfig();
    }
}
