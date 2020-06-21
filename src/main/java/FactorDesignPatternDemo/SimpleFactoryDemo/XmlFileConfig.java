package FactorDesignPatternDemo.SimpleFactoryDemo;

public class XmlFileConfig implements FileConfig {
    @Override
    public String getConfig() {
        return "xml config";
    }
}
