package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MakeAppointmentPage;

public class MakeAppointmentStepDefs {

    MakeAppointmentPage makeAppointmentPage=new MakeAppointmentPage();

    @Given("User Go to Medunna home page")
    public void user_go_to_medunna_home_page() {

    }
    @Then("User verifies if the Make an appointment button exits.")
    public void user_verifies_if_the_make_an_appointment_button_exits() {

    }
    @When("User clicks on the Make an Appointment button.")
    public void user_clicks_on_the_make_an_appointment_button() {

    }
    @Then("User fill name with correct credential {string}")
    public void user_fill_name_with_correct_credential(String string) {

    }
    @Then("User fill lastname with correct credential  {string}")
    public void user_fill_lastname_with_correct_credential(String string) {

    }
    @Then("User fill email with correct credential {string}")
    public void user_fill_email_with_correct_credential(String string) {

    }
    @Then("User fill phone number with correct credential {string}")
    public void user_fill_phone_number_with_correct_credential(String string) {

    }
    @Then("User fill SSN Number with correct credential {string}")
    public void user_fill_ssn_number_with_correct_credential(String string) {

    }

}
