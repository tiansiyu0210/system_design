package DesignPatternDemo.FactorDesignPatternDemo.FactoryDemo;

import java.util.HashMap;
import java.util.Map;

//因为工厂类只包含方法，不包含成员变量，完全可以复用，
//不需要每次都创建新的工厂类对象，所以，简单工厂模式的第二种实现思路更加合适。
public class FileConfigFactoryFactory {
    private static final Map<String, FileConfigCreatorFactory> map = new HashMap<String, FileConfigCreatorFactory>();

    static {
        map.put("json", new JsonConfigCreatorFactory());
        map.put("xml", new XmlConfigCreatorFactory());
        map.put("yaml", new YamlConfigCreatorFactory());
        map.put("csv", new CsvConfigCreatorFactory());
    }

    public static FileConfigCreatorFactory getCreatorFactory(String fileType) {
        if (fileType == null || fileType.length() == 0) {
            throw new RuntimeException();//or return null
        }
        return map.get(fileType.toLowerCase());
    }
}
