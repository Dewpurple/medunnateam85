package stepdefinitions.dbsteps;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US_009_PatientInformationStepDefs {
    DBUtils dbUtils = new DBUtils();
    @Given("Make connection with DB US009")
    public void make_connection_with_db_us009() {
        DBUtils.createConnection();
    }

    @Given("user gets the {string} from {string} table where {string} equals {string} for id")
    public void user_gets_the_from_table_where_equals_for_id(String column, String table, String key, String id) throws InterruptedException, SQLException {
        List <Object> allColumnData = DBUtils.getColumnData("Select * from " + table + " where " + key+"="+id, "first_name" );
        System.out.println(allColumnData);
        System.out.println("======");
        List <Object> expecteddata = new ArrayList<>();
        expecteddata.add("Vusal");
        System.out.println(expecteddata);
        Assert.assertEquals(allColumnData,expecteddata);

    }

    @Given("user gets the {string} from {string} table where {string} equals {string} for firstname")
    public void user_gets_the_from_table_where_equals_for_firstname(String column, String table, String key, String id) {
        List <Object> allColumnData = DBUtils.getColumnData("Select * from " + table + " where " + key+"="+id, "first_name" );
        System.out.println(allColumnData);
        System.out.println("======");
        List <Object> expecteddata = new ArrayList<>();
        expecteddata.add("Vusal");
        System.out.println(expecteddata);
        Assert.assertEquals(allColumnData,expecteddata);

    }
    @Given("user gets the {string} from {string} table where {string} equals {string} for last name")
    public void user_gets_the_from_table_where_equals_for_last_name(String column, String table, String key, String id) {
        List <Object> allColumnData = DBUtils.getColumnData("Select * from " + table + " where " + key+"="+id, "last_name" );
        System.out.println(allColumnData);
        System.out.println("======");
        List <Object> expecteddata = new ArrayList<>();
        expecteddata.add("Gasimov");
        System.out.println(expecteddata);
        Assert.assertEquals(allColumnData,expecteddata);

    }
    @Given("user gets the {string} from {string} table where {string} equals {string} for email")
    public void user_gets_the_from_table_where_equals_for_email(String column, String table, String key, String id) {
        List <Object> allColumnData = DBUtils.getColumnData("Select * from " + table + " where " + key+"="+id, "email" );
        System.out.println(allColumnData);
        System.out.println("======");
        List <Object> expecteddata = new ArrayList<>();
        expecteddata.add("vusal@gmail.com");
        System.out.println(expecteddata);
        Assert.assertEquals(allColumnData,expecteddata);

    }
    @Given("user gets the {string} from {string} table where {string} equals {string} for lang_key")
    public void user_gets_the_from_table_where_equals_for_lang_key(String column, String table, String key, String id) {
        List <Object> allColumnData = DBUtils.getColumnData("Select * from " + table + " where " + key+"="+id, "lang_key" );
        System.out.println(allColumnData);
        System.out.println("======");
        List <Object> expecteddata = new ArrayList<>();
        expecteddata.add("en");
        System.out.println(expecteddata);
        Assert.assertEquals(allColumnData,expecteddata);

    }
    @Given("user gets the {string} from {string} table where {string} equals {string} for ssn")
    public void user_gets_the_from_table_where_equals_for_ssn(String column, String table, String key, String id) {
        List <Object> allColumnData = DBUtils.getColumnData("Select * from " + table + " where " + key+"="+id, "ssn" );
        System.out.println(allColumnData);
        System.out.println("======");
        List <Object> expecteddata = new ArrayList<>();
        expecteddata.add("123-43-2343");
        System.out.println(expecteddata);
        Assert.assertEquals(allColumnData,expecteddata);

    }


//    @Given("user gets the {string} from {string} table")
//    public void user_gets_the_from_table(String column, String table) {
//    String myDynamicQuery = "Select " + column + " from " + table;
//    DBUtils.executeQuery(myDynamicQuery);
//    }
    @Given("user reads all of the {string} column data US009")
    public void user_reads_all_of_the_column_data_us009(String column) throws SQLException {
//        DBUtils.getResultset().next();
//        Object columndata = DBUtils.getResultset().getObject(column);
//        System.out.println(columndata);
//        DBUtils.getResultset().next();
//        Object columndata2 = DBUtils.getResultset().getObject(column);
//        DBUtils.getResultset().next();
//        Object columndata3 = DBUtils.getResultset().getObject(column);

//        while (DBUtils.getResultset().next()){
//            Object eachColumnData = DBUtils.getResultset().getObject(column);
//            System.out.println(eachColumnData);
//        }
//        List <Object> allColumnData = DBUtils.getColumnData("Select * from " + table, "id");
//        System.out.println(allColumnData);

    }
    @Given("verify {string} table  {string} column contains the {string}")
    public void verify_table_column_contains_the(String table, String column, String data) {
//   List <Object> allColumnData = DBUtils.getColumnData("Select * from  jhi_user where", "id");
//        System.out.println(allColumnData);
//        List <Object> expectedData = new ArrayList<>();
//        expectedData.add(data);
//        Assert.assertTrue(allColumnData.containsAll(expectedData));
    }
    @Given("verify {string} table contains the expected data")
    public void verify_table_contains_the_expected_data(String string) {

    }
}
