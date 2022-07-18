package utilities;

import pojos.*;

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


//    public static void robertSaveApplicationData (String filename, Robert_Apppointment_US028 [] robert_apppointment_us028s){
//
//
//        try {
//
//            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("api_registrant_file"), true);
//
//            BufferedWriter writer = new BufferedWriter(fileWriter);
//
//            writer.append(Robert_User_US028.getSsn() + ","+registrant.getFirstName()+","+ registrant.getLastName()+","
//                    +registrant.getUsername()+","+ registrant.getEmail()+","+registrant.getPassword()+ ",\n");
//            writer.close();
//
//
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//
//
//    }

}
