package runners;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={
                "pretty",
                "html:target/html-reports/cucumber.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },

        features = "./src/test/resources/features/grid_test_case.feature",
        glue = {"stepDefinitions"},
        tags = "@grid_chrome",
        dryRun = false

)
public class RunnerGrid {}
