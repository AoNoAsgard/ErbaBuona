package it.aonoasgard.erbabuona.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;
import it.aonoasgard.erbabuona.model.ConfigItemJson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonFileReader {

    private Gson gson;

    private File file;

    private JsonReader jsonReader;

    private BufferedReader bufferedReader;




    JsonFileReader(){
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    JsonFileReader( String fileName ) {
        this.gson = new GsonBuilder().setPrettyPrinting().create();

        setFile(fileName);

    }

    public void setFile(String fileName){

        file = new File(fileName);
        try {
            jsonReader = new JsonReader(new FileReader(file));
        } catch (FileNotFoundException e){
            try {
                List<ConfigItemJson> list  =new ArrayList<ConfigItemJson>();
                list.add( new ConfigItemJson("GRASS",1));
                jsonWriter( list,fileName );
                jsonReader = new JsonReader(new FileReader(file));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public List<ConfigItemJson> getConfItemJson(){
        return gson.fromJson(jsonReader,ConfigItemJson[].class);
    }


    public void jsonWriter(List<ConfigItemJson> items, String filePath)
    {
        try{
            FileWriter writer = new FileWriter(filePath);
            gson.toJson(items,writer);
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    private String getJson() throws IOException {
        StringBuilder serializedConfigs = new StringBuilder();
        String line;
        while ((line = this.bufferedReader.readLine()) != null) {
            serializedConfigs.append(line);
        }
        this.bufferedReader.close();
        return serializedConfigs.toString();
    }
}
