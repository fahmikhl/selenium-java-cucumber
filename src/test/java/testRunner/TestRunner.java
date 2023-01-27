package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Google2",
        features = {"classpath:features"},
        glue = {"testRunner", "stepDefinitions"},
        plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
)

public class TestRunner {

}
