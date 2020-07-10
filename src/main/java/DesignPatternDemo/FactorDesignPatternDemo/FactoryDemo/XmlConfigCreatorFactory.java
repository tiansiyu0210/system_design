package DesignPatternDemo.FactorDesignPatternDemo.FactoryDemo;

import DesignPatternDemo.FactorDesignPatternDemo.SimpleFactoryDemo.FileConfig;
import DesignPatternDemo.FactorDesignPatternDemo.SimpleFactoryDemo.XmlFileConfig;

public class XmlConfigCreatorFactory implements FileConfigCreatorFactory {
    @Override
    public FileConfig createFactory() {
        //if we have to do lots of thing before return the FileConfig instance
        //, we could use this design
        return new XmlFileConfig();
    }
}
