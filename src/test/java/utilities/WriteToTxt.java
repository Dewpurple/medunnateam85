package utilities;

import pojos.Registrant;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToTxt {




    public static void saveRegistrantData(Registrant registrant){


        try {

            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("ui_registrant_file"), true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.append(registrant+"\n");

            bufferedWriter.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }


    }



}
