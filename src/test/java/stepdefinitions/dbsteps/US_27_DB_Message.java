package stepdefinitions.dbsteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

public class US_27_DB_Message {
    @Given("user gets {string} from {string} table")
    public void user_gets_from_table(String column, String table) {
        String query = "Select "+column+" from "+table+"";
        DBUtils.executeQuery(query);
    }


    @And("user close the database connection")
    public void userCloseTheDatabaseConnection() {
        DBUtils.closeConnection();
    }

    @Then("verify that {string} table {string} column contains  {string} data")
    public void verifyThatTableColumnContainsData(String table, String column, String data) {
        List<Object> allColumnData = DBUtils.getColumnData("select * from "+table+"",column);
        System.out.println(allColumnData);
        Assert.assertTrue(allColumnData.contains(data));


    }

    @Then("verify that {string} table {string} column does not  contain  {string} data")
    public void verifyThatTableColumnDoesNotContainData(String table, String column, String data) {
        List<Object> allColumnData = DBUtils.getColumnData("select * from "+table+"",column);
        System.out.println(allColumnData);
        Assert.assertFalse(allColumnData.contains(data));
    }
}
