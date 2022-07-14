package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"

        },
        features = "./src/test/resources/features",
        glue = {"stepdefinitions","Hooks"},
        tags = "@US_015_Read_All_Patient_Data",
        dryRun = false
)
public class Runner {
}