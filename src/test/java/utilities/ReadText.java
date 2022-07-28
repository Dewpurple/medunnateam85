package utilities;

import pojos.US001_T01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadText {


    public static List<String> readUserInformationList(String filePath){
        List <String> all = new ArrayList<>();
        try(
                BufferedReader br =new BufferedReader(new FileReader(filePath))){
            StringBuilder sb= new StringBuilder();
            String line=br.readLine();
            System.out.println(line);
            int i=0;
            while(line !=null){

                US001_T01 customer =new US001_T01();

                customer.setSsn(line.split(",")[0]);
                customer.setFirstName(line.split(",")[0]);
                customer.setLastName(line.split(",")[0]);
                customer.setEmail(line.split(",")[0]);

                sb.append(System.lineSeparator());
                line=br.readLine();

                all.add(customer.getSsn());
                all.add(customer.getFirstName());
                all.add(customer.getLastName());
                all.add(customer.getEmail());

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return all;
    }

}
