package utilities;


import pojos.Appointment;
import pojos.Appointment1;
import pojos.Registrant;
import pojos.TestItem;

import java.io.*;
import java.util.List;

import pojos.*;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class WriteToTxt {


    public static void saveRegistrantData(Registrant registrant) {


        try {

            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("ui_registrant_file"), true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.append(registrant.toString() + "\n");

            bufferedWriter.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void saveRegistrantApiData(Registrant registrant) {


        try {

            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("api_registrant_file"), true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.append(registrant.toString() + "\n");

            bufferedWriter.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void saveApptData(Appointment appointment) {


        try {

            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("appt_file"), true);

            BufferedWriter bw = new BufferedWriter(fw);

            bw.append(appointment + "\n");

            bw.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }




    public static void saveApptData(Appointment1 appointment1){

        try {

            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("appt_api_file"), true);

            BufferedWriter bw = new BufferedWriter(fw);

            bw.append(appointment1+"\n");

            bw.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

    public static void saveApptData(Appointment[] appointments){



        try {

            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("appointments_api_data"), false);

            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < appointments.length; i++) {
                bw.append(appointments[i].toString() + "\n");
            }

            bw.close();


        } catch (Exception e) {
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



    public static void robertSaveApplicationData(String filename, Robert_Apppointment_US028[] robert_apppointment_us028s) {


        try {
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointments_file_name_Robert"), false);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (int i = 0; i < robert_apppointment_us028s.length; i++) {
                if (robert_apppointment_us028s[i].getPatient() != null) {
                    writer.append(robert_apppointment_us028s[i].getPatient().getFirstName() + "," +
                            robert_apppointment_us028s[i].getPatient().getLastName() + ",");
                    if ((robert_apppointment_us028s[i].getPatient().getUser() != null)) {
                        writer.append(robert_apppointment_us028s[i].getPatient().getUser().getSsn() + ",\n");
                    } else {
                        writer.append("\n");
                    }
                }
            }
            writer.close();
            Registrant registrant1 = new Registrant();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public static void saveUS19_API_StaffData(US19_API_Staff_Pojo[] userRequest) {


        try {

            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("api_US19_medunna_url"), true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for(int i=0; i<userRequest.length; i++ ) {

                bufferedWriter.append(userRequest.toString() + "\n");
            }
            bufferedWriter.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void saveUserData(String fileName, US001_T01[] us001_t01){
        try{
            BufferedWriter writer =new BufferedWriter(new FileWriter(fileName,true));
            for (int i=0; i< us001_t01.length; i++){
                writer.append(us001_t01[i].getFirstName() + ",\n");
                writer.append(us001_t01[i].getLastName() + ",\n");
                writer.append(us001_t01[i].getSsn() + ",\n");
                writer.append(us001_t01[i].getEmail() + ",\n");
                writer.append("--------------------------" + ",\n");

            }
            writer.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
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
