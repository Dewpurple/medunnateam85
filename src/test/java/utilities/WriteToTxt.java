package utilities;

import pojos.Appointment;
import pojos.Appointment1;
import pojos.Registrant;

import java.io.BufferedWriter;
import java.io.FileWriter;

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


}
