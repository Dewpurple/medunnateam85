package stepdefinitions.dbsteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.List;

public class DB_US19_stepDefs {


    @Given("user connects  to database")
    public void userConnectsToDatabase() {
        DBUtils.createConnection();
    }

    @When("US19_user gets the {string} data from {string} table")
    public void us19_user_gets_the_data_from_table(String column, String table) {
        String query = "Select " + column + " from " + table + "";
        DBUtils.executeQuery(query);
    }

    @Then("validate {string} table {string} column contains {string} data")
    public void verifyTableColumnContainsData(String table, String data, String column) {
        List<Object> allColumnData = DBUtils.getColumnData("select * from " + table + "", column);
        System.out.println(allColumnData);
        Assert.assertTrue(allColumnData.contains(data));
    }

    @When("US19_close the database connection")
    public void us19_close_the_database_connection() {
        DBUtils.closeConnection();

    }

    @Given("US19_user reads all of the {string} column data")
    public void us19_user_reads_all_of_the_column_data(String lastname) throws SQLException {
        DBUtils.getResultset().next();
        Object columnsData1 = DBUtils.getResultset().getObject(lastname);
        System.out.println(columnsData1);

        // got to the row2
        DBUtils.getResultset().next();
        Object columnsData2 = DBUtils.getResultset().getObject(lastname);
        System.out.println(columnsData2);

//
        while (DBUtils.getResultset().next()) { // keep going to the next line if there is a data in next line
            Object nextColumnData = DBUtils.getResultset().getObject(lastname);
            System.out.println(nextColumnData);
        }
    }

    @Given("US19_user verifies {string} table that {string} column contains {string} data")
    public void us19_user_verifies_table_that_column_contains_data(String table, String column, String data1) {
//        List<Object> allColumnData = DBUtils.getColumnData("select * from " + table + "", column);
//        System.out.println(allColumnData);
//        Assert.assertTrue(allColumnData.contains(data1));
    }
}
































