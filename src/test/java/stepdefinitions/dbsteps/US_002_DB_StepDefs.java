package stepdefinitions.dbsteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigurationReader;
import utilities.DBUtils;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static utilities.WriteToTxt.readFile;

public class US_002_DB_StepDefs {
    @Given("user connects to the database US_002")
    public void user_connects_to_the_database_us() {
        DBUtils.createConnection();
    }
    @Then("user verifies that {string} table {string} column contains {string} US_002")
    public void user_verifies_that_table_column_contains_us(String table, String column, String string3) {
       List<Object> allColumnData = DBUtils.getColumnData("Select * From "+table+ " ",column);
        String string = readFile(ConfigurationReader.getProperty("ui_registrant_file"));
        String[] registrantData = string.split("'");
        String email = registrantData[13];
        List<Object> expectedData = new ArrayList<>();
        expectedData.add(email.toLowerCase());
        Assert.assertTrue(allColumnData.containsAll(expectedData));
    }
    @Then("user close the database connection US_002")
    public void user_close_the_database_connection_us() {
    DBUtils.closeConnection();
    }
}
