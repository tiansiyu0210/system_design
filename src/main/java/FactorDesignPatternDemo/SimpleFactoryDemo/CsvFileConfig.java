package FactorDesignPatternDemo.SimpleFactoryDemo;

public class CsvFileConfig implements FileConfig {
    @Override
    public String getConfig() {
        return "csv file config";
    }
}
