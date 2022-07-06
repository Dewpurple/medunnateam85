//package stepdefinitions.uisteps;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.DoctorPage;
//import pages.HomePage;
//import utilities.ConfigurationReader;
//import utilities.Driver;
//
//import javax.print.Doc;
//
//public class DoctorTestSteps {
//    HomePage homePage = new HomePage();
//    DoctorPage doctorPage = new DoctorPage();
//
//
////    @Given("user navitages to Medunna url")
////    public void user_navitages_to_medunna_url() {
////        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("medunna_url"));
////    }
////    @When("Doctor logs in")
////    public void doctor_logs_in() {
////        homePage.loginDropDown.click();
////        homePage.loginSignInButton.click();
////        Driver.wait(1);
////        homePage.username.sendKeys(ConfigurationReader.getProperty("doctorusername"));
////        homePage.password.sendKeys(ConfigurationReader.getProperty("doctorpw"));
////        homePage.signInbutton.click();
//    }
//    @When("doctor clicks my pages")
//    public void doctor_clicks_my_pages() {
//        doctorPage.myPages.click();
//        doctorPage.myAppointments.click();
//    }
////    @When("doctor clicks my appointment")
////    public void doctor_clicks_my_appointment() {
////
////    }
////    @When("doctor clicks edit button from my appointments page")
////    public void doctor_clicks_edit_button_from_my_appointments_page() {
////
////    }
////    @When("doctor clicks a button to fill test")
////    public void doctor_clicks_a_button_to_fill_test() {
////
////    }
//    @When("doctor clicks save on test")
//    public void doctor_clicks_save_on_test() {
//
//    }
//    @When("verify new test created message appears")
//    public void verify_new_test_created_message_appears() {
//
//    }
//    @Then("close the application")
//    public void close_the_application() {
//    Driver.closeDriver();
//    }
//
//
//
//}
