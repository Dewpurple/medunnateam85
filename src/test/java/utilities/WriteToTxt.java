package utilities;

import pojos.Appointment;
import pojos.Appointment1;
import pojos.Registrant;
import pojos.TestItem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class WriteToTxt {




    public static void saveRegistrantData(Registrant registrant){


        try {

            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("ui_registrant_file"), true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.append(registrant.toString()+"\n");

            bufferedWriter.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
    public static void saveRegistrantApiData(Registrant registrant){


        try {

            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("api_registrant_file"), true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.append(registrant.toString()+"\n");

            bufferedWriter.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

    public static void saveApptData(Appointment appointment){


        try {

            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("appt_file"), true);

            BufferedWriter bw = new BufferedWriter(fw);

            bw.append(appointment+"\n");

            bw.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }


    }


    public static void saveApptData(Appointment1[] appointments){


        try {

            FileWriter fw= new FileWriter(ConfigurationReader.getProperty("appointments_api_data"), false);

            BufferedWriter bw = new BufferedWriter(fw);

            for (int i=0; i<appointments.length ; i++){
                bw.append(appointments[i].toString()+"\n");
            }

            bw.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
    public static void saveAllTestItemsData(TestItem testItem){

        try{

            FileWriter fw= new FileWriter(ConfigurationReader.getProperty("testItems_records"), true);

            BufferedWriter bw=new BufferedWriter(fw);
            bw.append(testItem.toString()+"\n");
            bw.close();


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void saveAllTestItemsApiData(TestItem[] testItems){

        try{

            FileWriter fw= new FileWriter(ConfigurationReader.getProperty("testItems_api_records"), true);

//                BufferedWriter bw=new BufferedWriter(fw);
//                bw.append(testItem.toString()+",\n");
//                bw.close();

            BufferedWriter bw=new BufferedWriter(fw);
            for(int i=0;i<testItems.length; i++){
                bw.append(testItems[i].toString()+"\n");
            }

            bw.close();


        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void saveDBTestItemsData(List<Object> testItems) {
        try {
            //we make it FALSE to add updated data
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("DB_testItems_data"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (Object eachTestItem : testItems) {
                writer.append(eachTestItem + ",\n");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
