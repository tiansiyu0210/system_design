package DesignPatternDemo.FactorDesignPatternDemo.SimpleFactoryDemo;

public class YamlFileConfig implements FileConfig{
    @Override
    public String getConfig() {
        return "yaml File Config";
    }
}
