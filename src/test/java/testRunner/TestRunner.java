package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Google2",
        features = {"classpath:features"},
        glue = {"testRunner", "stepDefinitions"},
        plugin = {"pretty","html:target/report/cucumber-report.html","json:target/report/cucumber-report.json"}
)

public class TestRunner {

}
