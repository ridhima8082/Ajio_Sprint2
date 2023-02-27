package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features="src/test/resources/feature",
        glue="steps",publish = true,
        plugin={"pretty","html:target/cucumber-reports.html"},monochrome = true,tags="@smoke")


public class TestRunner extends AbstractTestNGCucumberTests {
    //using Testng--important to write this
    @DataProvider(parallel = true) //parallelism- for all the scenarios to run parallely.
    public Object[][] scenarios() {
        return super.scenarios();

    }
}
