package DesignPatternDemo.FactorDesignPatternDemo.SimpleFactoryIIDemo;

import DesignPatternDemo.FactorDesignPatternDemo.SimpleFactoryDemo.*;

import java.util.HashMap;
import java.util.Map;

public class FIleConfigFactoryII {
    private static final Map<String, FileConfig> cashedConfigMap = new HashMap<>();

    static {
        cashedConfigMap.put("json", new JsonFileConfig());
        cashedConfigMap.put("xml", new XmlFileConfig());
        cashedConfigMap.put("yaml", new YamlFileConfig());
        // if we add a new fileConfig, we have to update here
        //violated open-close principal a little bit
        cashedConfigMap.put("csv", new CsvFileConfig());
    }

    public static FileConfig getConfig(String fileType) {
        if (fileType == null || fileType.length() == 0) {
            throw new RuntimeException();//or return null
        }
        return cashedConfigMap.get(fileType.toLowerCase());
    }
}
