package FactorDesignPatternDemo.SimpleFactoryDemo;

public class FileConfigFactory {
    public static FileConfig getConfig(String fileType){
        FileConfig config = null;

        if(fileType == null || fileType.length() == 0){
            throw new RuntimeException();//or return
        }
        if("json".equalsIgnoreCase(fileType)){
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
