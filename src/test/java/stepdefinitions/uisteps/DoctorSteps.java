package stepdefinitions.uisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DoctorPage;

public class DoctorSteps {

    DoctorPage doctorPage = new DoctorPage();

    @Given("The doctor go to URL")
    public void the_doctor_go_to_url() {

    }

    @Then("The doctor click Sign-in page")
    public void theDoctorClickSignInPage() {
    }


    @Then("verify to Sign-in page.")
    public void verify_to_sign_in_page() {

    }

    @Then("the doctor enters a username as {string}")
    public void the_doctor_enters_a_username_as(String string) {

    }

    @Then("the doctor enters a password as {string}")
    public void the_doctor_enters_a_password_as(String string) {

    }

    @Then("click the Sign-in button")
    public void click_the_sign_in_button() {

    }

    @Then("Verify to Sign-on the web side")
    public void verify_to_sign_on_the_web_side() {

    }


}
