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
<<<<<<< HEAD



        //tags = "@PatientInfoVisible",
        tags="  @SmokeTest",






=======
        tags = "@US_010_database_connectivity",
>>>>>>> master
        dryRun = false
)
public class Runner {
}