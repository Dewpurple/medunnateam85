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
       //tags = "@Sign_In",
     tags = " @TC_002",

     //tags = "@makeAppointmentPage",
=======
        //tags = "@makeAppointmentPage",
        //  tags = "  @InvalidpasswordScenario",



        //tags = "@makeAppointmentPage",
        //  tags = "  @InvalidpasswordScenario",



 //       tags = "  @US6",
//        tags = " @UserSignIn",


//       tags = "@US6",
  //      tags = "@13UITestResultAndInpatient",
 //       tags = "@US14DoctorSeeAndUpdateInpatientInfo",


        tags = "  @Api",
//        tags = " @UserSignIn",



//        tags = "@UsernameTest",

>>>>>>> master

        dryRun = false
)
public class Runner {
}