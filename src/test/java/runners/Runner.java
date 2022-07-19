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

        //tags = "@PatientInfoVisible",
        tags=" @TC01",





       // tags="  @US6",


        dryRun = false
)
public class Runner {
}