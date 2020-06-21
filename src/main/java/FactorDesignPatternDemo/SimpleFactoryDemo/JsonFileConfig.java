package FactorDesignPatternDemo.SimpleFactoryDemo;

public class JsonFileConfig implements FileConfig{
    @Override
    public String getConfig() {
        return "Json config";
    }
}
