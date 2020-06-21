package FactorDesignPatternDemo.SimpleFactoryDemo;

public class FileConfigFactory {
    public static FileConfig getConfig(String fileType){
        FileConfig config = null;

        if(fileType == null || fileType.length() == 0){
            throw new RuntimeException();//or return null
        }
        if("json".equalsIgnoreCase(fileType)) {
            // if the process for creating a new instance is complicated,
            // not just "config = new JsonFileConfig();"
            // we could use factory method (factory's factory)
            config = new JsonFileConfig();
        }
        else if("xml".equalsIgnoreCase(fileType)){
            config = new XmlFileConfig();
        }
        else if("yaml".equalsIgnoreCase(fileType)){
            config = new YamlFileConfig();
        }

        return config;
    }

}
