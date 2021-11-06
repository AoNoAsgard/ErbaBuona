package it.aonoasgard.erbabuona.json;

import it.aonoasgard.erbabuona.model.ConfigItemJson;

import java.util.List;

public class ConfigInterface {

    private final static String FILE_NAME= "config.json";

    private JsonFileReader jfr;

    public ConfigInterface(){
        jfr = new JsonFileReader(FILE_NAME);
    }

    public List<ConfigItemJson> getConfigs() {
        return jfr.getConfItemJson();
    }



}
