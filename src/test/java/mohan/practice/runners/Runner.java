package mohan.practice.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"mohan.practice.base","mohan.practice.stepdefs"},
        plugin = {"mohan.practice.base.CustomHooks"}
)
public class Runner {
}