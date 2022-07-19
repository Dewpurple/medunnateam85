package utilities;

import pojos.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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


    public static void saveApptData(Appointment1[] appointments) {


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
}
