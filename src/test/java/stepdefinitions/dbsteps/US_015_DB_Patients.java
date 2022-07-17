package stepdefinitions.dbsteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.List;

public class US_015_DB_Patients {

    @Given("user connects to database")
    public void user_connects_to_database() {
        DBUtils.createConnection();
    }
    @Given("user gets the {string} data from {string} table us015")
    public void user_gets_the_from_table(String column, String table) {
        String query = "Select "+column+" from "+table+"";
        DBUtils.executeQuery(query);
    }
    @Then("verify {string} table {string} column contains {string} data us015")
    public void verifyTableColumnContainsData(String table, String column, String data) {
        List<Object> allColumnData = DBUtils.getColumnData("select * from "+table+"",column);
        System.out.println(allColumnData);
        Assert.assertTrue(allColumnData.contains(data));
    }
    @Then("close the database connection us015")
    public void close_the_database_connection() {
        // Write code here that turns the phrase above into concrete actions
        DBUtils.closeConnection();
    }
    @Given("user reads all of the {string} column data us015")
    public void user_reads_all_of_the_column_data(String lastname) throws SQLException {
        DBUtils.getResultset().next();
        Object columnsData1 = DBUtils.getResultset().getObject(lastname);
        System.out.println(columnsData1);
        // got to the row2
        DBUtils.getResultset().next();
        Object columnsData2 = DBUtils.getResultset().getObject(lastname);
        System.out.println(columnsData2);

//        Iterate the ssn rows
        while(DBUtils.getResultset().next()){ // keep going to the next line if there is a data in next line
            Object nextColumnData = DBUtils.getResultset().getObject(lastname);
            System.out.println(nextColumnData);
        }
    }
    @Then("verify {string} table {string} column does not contain {string} data us015")
    public void verifyTableColumnDoesNotContainData(String table, String column, String data) {
        List<Object> allColumnData = DBUtils.getColumnData("select * from "+table+"",column);
        System.out.println(allColumnData);
        Assert.assertFalse(allColumnData.contains(data));
    }
    @Then("verify {string} table {string} column contains {string} and {string} data us015")
    public void verify_table_column_contains_and_data(String table, String column, String data1, String data2) {
        List<Object> allColumnData = DBUtils.getColumnData("select * from "+table+"",column);
        System.out.println(allColumnData);
        Assert.assertTrue(allColumnData.contains(data1));
        Assert.assertTrue(allColumnData.contains(data2));
    }
    @Given("user gets the {string} column from {string} table us015")
    public void user_gets_the_column_from_table(String column, String table) {
        String query = "Select "+column+" from "+table+"";
        DBUtils.executeQuery(query);
    }
    @Given("user verifies that {string} column contains {string} data us015")
    public void user_verifies_that_column_contains_data(String column, String data) {
        List<Object> allColumnData = DBUtils.getColumnData("select * from "+"",column);
        System.out.println(allColumnData);
        Assert.assertTrue(allColumnData.contains(data));

    }
}
