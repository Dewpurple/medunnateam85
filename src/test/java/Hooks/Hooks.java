package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hooks {
    public  static RequestSpecification spec;

    @Before(value = "@Registration")
    public void setUp(){

        Driver.getDriver().get(ConfigurationReader.getProperty("registration_url"));

    }

    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png","screenshots");
        }

    }
    @Before(value="@Api")
    public void baseUrlSetup(){
        spec= new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("medunna_login_url")).build();
    }



//    @Before(value="@appointments")
//    public void beforeApi(){
//        medunnaSetup();
//    }





}
