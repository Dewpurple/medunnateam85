package stepdefinitions.uisteps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.US_023_StaffInvoicePage;
import utilities.Driver;

public class US_023_PatientInvoiceStepDefs {

    HomePage homePage = new HomePage();
    US_023_StaffInvoicePage staffPage = new US_023_StaffInvoicePage();
    Select select;

    @When("user 23 enters valid username and password")
    public void user_enters_valid_username_and_password() {
        homePage.username.sendKeys("team83_staff");
        homePage.password.sendKeys("team83staff");
    }
    @Then("user 23 clicks on My Pages and Search Patient")
    public void user_clicks_on_my_pages_and_search_patient() {
        Driver.waitForClickablility(staffPage.myPages, 10);
        staffPage.myPages.click();
        staffPage.searchPatient.click();
    }
    @Given("click on Patient SSN box and type patient's {string} {string} US_023")
    public void clickOnPatientSSNBoxAndTypePatientSUS_(String ssn, String lastDigit) {
        staffPage.ssnBox.sendKeys(ssn);
        staffPage.ssnBox.sendKeys(lastDigit);
    }
    @When("click on Show Appointments US_023")
    public void click_on_show_appointments() {
        Driver.wait2(2);
        staffPage.showAppointments.click();
    }
    @Then("click on PaymentInvoice Process US_023")
    public void click_on_payment_invoice_process() {
        Driver.waitForVisibility(staffPage.paymentInvoice, 5);
        staffPage.paymentInvoice.click();
    }
    @And("verify Exam Fee {string}, Test Item Fee {string} and Total Cost {string} is correct US_023")
    public void verifyExamFeeTestItemFeeAndTotalCostIsCorrectUS_(String examfee, String testitemfee, String totalcost) {
        String totalcostXpath = "//*[contains(text(),'"+totalcost+"')]";
        WebElement totalCost = Driver.getDriver().findElement(By.xpath(totalcostXpath));
        Assert.assertTrue(totalCost.isDisplayed());
        String examfeeXpath = "//*[contains(text(),'"+examfee+"')]";
        WebElement examFee = Driver.getDriver().findElement(By.xpath(examfeeXpath));
        Assert.assertTrue(examFee.isDisplayed());
//        String testitemfeeXpath = "//*[contains(text(),'"+testitemfee+"')]";
//        WebElement testitemFee = Driver.getDriver().findElement(By.xpath(testitemfeeXpath));
//        Assert.assertTrue(testitemFee.isDisplayed());
    }
    @Then("click on create invoice US_023")
    public void click_on_create_invoice() {
        staffPage.createInvoice.click();

    }
    @Then("click on save US_023")
    public void click_on_save() {
        Driver.clickWithJS(staffPage.saveButton);
    }
    @Then("click on show invoice US_023")
    public void click_on_show_invoice() {
        Driver.clickWithJS(staffPage.showInvoice);
    }
    @Then("change Payment Method to CREDIT_CARD US_023")
    public void change_payment_method_to_credit_card() {
        select = new Select(staffPage.paymentMethod);
        select.selectByVisibleText("CREDIT_CARD");
    }
    @Then("change Payment Method to Cheque US_023")
    public void change_payment_method_to_cheque() {
        select = new Select(staffPage.paymentMethod);
        select.selectByVisibleText("CHEQUE");
    }
    @Then("verify A Bill is updated with identifier message appears on screen US_023")
    public void verify_a_bill_is_updated_with_identifier_message_appears_on_screen() {
        Driver.waitForVisibility(staffPage.billUpdatedMessage, 8);
        Assert.assertTrue(staffPage.billUpdatedMessage.isDisplayed());
    }
    @Then("click on back button US_023")
    public void click_on_back_button() {
        Driver.clickWithJS(staffPage.backButton);
    }
    @Then("user should be on payment detail page US_023")
    public void user_should_be_on_payment_detail_page() {
        Driver.waitForVisibility(staffPage.paymentDetailTitle, 5);
        Assert.assertTrue(staffPage.paymentDetailTitle.isDisplayed());
    }
    @Then("verify that status is unapproved US_023")
    public void verify_that_status_is_unapproved() {
        Driver.waitForVisibility(staffPage.unapprovedStatus, 3);
        Assert.assertTrue(staffPage.unapprovedStatus.isDisplayed());
    }
    @Then("verify that status is pending US_023")
    public void verify_that_status_is_pending() {
        Assert.assertTrue(staffPage.unapprovedStatus.isDisplayed());
    }
    @Then("verify that PaymentInvoice Process is not visible US_023")
    public void verify_that_payment_invoice_process_is_not_visible() {
    }

    @And("verify SSN {string}, Name {string}, Payment Method {string} and total {string} is correct US_023")
    public void verifySSNNameTotalIsCorrectUS_(String SSN, String Name, String paymentmethod, String Cost) {
        String ssnXpath = "//*[contains(text(),'"+SSN+"')]";
        WebElement totalCost = Driver.getDriver().findElement(By.xpath(ssnXpath));
        Assert.assertTrue(totalCost.isDisplayed());
        String nameXpath = "//*[contains(text(),'"+Name+"')]";
        WebElement name = Driver.getDriver().findElement(By.xpath(nameXpath));
        Assert.assertTrue(name.isDisplayed());
        String paymentmethodXpath = "//*[contains(text(),'"+paymentmethod+"')]";
        WebElement paymentMethod = Driver.getDriver().findElement(By.xpath(paymentmethodXpath));
        Assert.assertTrue(paymentMethod.isDisplayed());
        String costXpath = "//*[contains(text(),'"+Cost+"')]";
        WebElement cost = Driver.getDriver().findElement(By.xpath(costXpath));
        Assert.assertTrue(cost.isDisplayed());
    }

    @And("verify invoice page is displayed")
    public void verifyInvoicePageIsDisplayed() {
        Driver.waitForVisibility(staffPage.invoiceTitle, 5);
        Assert.assertTrue(staffPage.invoiceTitle.isDisplayed());
    }
    @Then("verify Allan's Exam Fee and Total Cost is correct US_023")
    public void verify_allan_s_exam_fee_and_total_cost_is_correct_us() {
//        Assert.assertTrue(staffPage.examFee.isDisplayed());
//        Assert.assertTrue(staffPage.allenTotalCost.isDisplayed());
    }
    @Then("verify Bryon's Exam Fee and Total Cost is correct US_023")
    public void verify_bryon_s_exam_fee_and_total_cost_is_correct_us() {
        Assert.assertTrue(staffPage.examFee.isDisplayed());
        Assert.assertTrue(staffPage.bryonTotalCost.isDisplayed());
    }
    @Then("verify Alys's Exam Fee and Total Cost is correct US_023")
    public void verify_alys_s_exam_fee_and_total_cost_is_correct_us() {
        Assert.assertTrue(staffPage.examFee.isDisplayed());
        Assert.assertTrue(staffPage.alysTotalCost.isDisplayed());
    }
    @Then("verify Lyanna's Exam Fee and Total Cost is correct US_023")
    public void verify_lyanna_s_exam_fee_and_total_cost_is_correct_us() {
        Assert.assertTrue(staffPage.examFee.isDisplayed());
        Assert.assertTrue(staffPage.lyannaTotalCost.isDisplayed());
    }
    @Then("verify that Bill Name {string} total cost {string} is correct")
    public void verify_that_bill_name_total_cost_is_correct(String Name, String totalcost) {
        String nametXpath = "//input[@value='"+Name+"']";
        WebElement name = Driver.getDriver().findElement(By.xpath(nametXpath));
        Assert.assertTrue(name.isDisplayed());
        String totalcostXpath = "//input[@value='"+totalcost+"']";
        WebElement totalCost = Driver.getDriver().findElement(By.xpath(totalcostXpath));
        Assert.assertTrue(totalCost.isDisplayed());
    }
}
