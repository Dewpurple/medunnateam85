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

    @Given("user gets the {string} from {string} table where {string} equals {string}")
    public void user_gets_the_from_table_where_equals(String column, String table, String key, String id) throws InterruptedException {
    String myDynamicQuery = "Select " +column + " from " + table + " where " + key+"="+id;
    DBUtils.executeQuery(myDynamicQuery);
        List <Object> allColumnData = DBUtils.getRowList("Select " +column + " from " + table + " where " + key+"="+id);
        System.out.println(allColumnData);
        List <Object> expectedData = new ArrayList<>();
        expectedData.add(id);
        expectedData.add("Vusal");
        System.out.println(expectedData);
        Thread.sleep(500);
        Assert.assertTrue(allColumnData.containsAll(expectedData));

    }

    @Given("user enters expected data and performs assertion")
    public void user_enters_expected_data_and_performs_assertion() {

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
