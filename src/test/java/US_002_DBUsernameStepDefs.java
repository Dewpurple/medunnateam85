import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pojos.Registrant;
import utilities.DBUtils;
import utilities.WriteToTxt;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class US_002_DBUsernameStepDefs {
    List<Object> allUsernames;
    @Given("user creates a connection with DB")
    public void user_creates_a_connection_with_db() {
        DBUtils.createConnection();
    }
    @Given("user sends the query to DB and gets the column data {string} abd {string}")
    public void user_sends_the_query_to_db_and_gets_the_column_data_abd(String query, String columnName) {
        allUsernames = DBUtils.getColumnData(query, columnName);
    }
    @Given("user saves the DB records to correspondent files")
    public void user_saves_the_db_records_to_correspondent_files() {
        WriteToTxt.saveRegistrantData((Registrant) allUsernames);
    }
    @Then("user validates usernames from DB")
    public void userValidatesUsernamesFromDB(String data,String login) throws SQLException {
       data = "select * from jhi_user";
       Object columndata = DBUtils.getResultset().getObject(login);
       String actualData = (String) columndata;
       Assert.assertEquals(columndata,actualData);

    }

    @Then("user closes the database connection")
    public void user_closes_the_database_connection() {
        DBUtils.closeConnection();
    }


}
