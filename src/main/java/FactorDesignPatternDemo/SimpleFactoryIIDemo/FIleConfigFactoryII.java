package FactorDesignPatternDemo.SimpleFactoryIIDemo;

import FactorDesignPatternDemo.SimpleFactoryDemo.FileConfig;
import FactorDesignPatternDemo.SimpleFactoryDemo.JsonFileConfig;
import FactorDesignPatternDemo.SimpleFactoryDemo.XmlFileConfig;
import FactorDesignPatternDemo.SimpleFactoryDemo.YamlFileConfig;

import java.util.HashMap;
import java.util.Map;

public class FIleConfigFactoryII {
    private static final Map<String, FileConfig> cashedConfigMap = new HashMap<>();

    static {
        cashedConfigMap.put("json", new JsonFileConfig());
        cashedConfigMap.put("xml", new XmlFileConfig());
        cashedConfigMap.put("yaml", new YamlFileConfig());
    }

    public static FileConfig getConfig(String fileType) {
        if (fileType == null || fileType.length() == 0) {
            throw new RuntimeException();//or return null
        }
        return cashedConfigMap.get(fileType.toLowerCase());
    }
}
