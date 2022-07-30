package stepdefinitions.dbsteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

public class US010_DB_StepDefs {
    List<Object> dbAppointment;
    @Given("Doctor connects to database")
    public void doctor_connects_to_database() {
        DBUtils.createConnection();
    }
    @Then("Doctor gets appointment {string}")
    public void doctor_gets_appointment(String status) {
        String query = "SELECT * FROM appointment";
        dbAppointment = DBUtils.getColumnData(query,status);
    }
    @Then("Doctor verifies the {string} by DB")
    public void doctor_verifies_the_by_db(String string) {
    Assert.assertTrue(dbAppointment.contains("PENDING"));
    }
    @Then("close the database connection 010")
    public void close_the_database_connection() {
    DBUtils.closeConnection();
    }

}
