package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTxt {
    public static List<String> getTestItemNames(){
        List<String> list=new ArrayList<>();
        try {
            //We are just identifying file location to read
            FileReader fileReader=new FileReader(ConfigurationReader.getProperty("testItems_records"));
            // we are reading the records of the file in given location here
            BufferedReader br=new BufferedReader(fileReader);
            String line=br.readLine();

            while (line !=null){
                String name=line.split(",")[0];
                list.add(name);
                line=br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }


    public static List<String> getApiTestItemNames(){
        List<String> list=new ArrayList<>();
        try {
            //We are just identifying file location to read
            FileReader fileReader=new FileReader(ConfigurationReader.getProperty("testItems_api_records"));
            // we are reading the records of the file in given location here
            BufferedReader br=new BufferedReader(fileReader);
            String line=br.readLine();
            while (line !=null){
                String name=line.split(",")[0];
                list.add(name);
                line=br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }


    public static List<String> getDBTestItemNames(){
        List<String> list=new ArrayList<>();
        try {
            FileReader fileReader=new FileReader(ConfigurationReader.getProperty("DB_testItems_data"));
            BufferedReader br=new BufferedReader(fileReader);
            String line=br.readLine();
            while (line !=null){
                String name=line.split(",")[0];
                list.add(name);
                line=br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public static String readFile(String filepath)
    {
        String returnFileContent="";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            String st;
            while ((st = br.readLine()) != null){
                returnFileContent = returnFileContent +st +"\n";
                System.out.println(st);
            }
        } catch(Exception e){

        }

        return returnFileContent;
    }
}
