package stepdefinitions.dbsteps;

import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.util.List;

public class US_009_PatientInformationStepDefs {
    DBUtils dbUtils = new DBUtils();
    @Given("Make connection with DB US009")
    public void make_connection_with_db_us009() {
        DBUtils.createConnection();
    }
    @Given("user gets the {string} from {string} table")
    public void user_gets_the_from_table(String column, String table) {
    String myDynamicQuery = "Select " + column + " from " + table;
    DBUtils.executeQuery(myDynamicQuery);
    List <Object> allColumnData = DBUtils.getColumnData("Select " + column + " from " + table, "id");
        System.out.println(allColumnData);
    }
    @Given("user gets the data")
    public void user_gets_the_data() {

    }
    @Given("verify {string} table contains the expected data")
    public void verify_table_contains_the_expected_data(String string) {

    }
}
