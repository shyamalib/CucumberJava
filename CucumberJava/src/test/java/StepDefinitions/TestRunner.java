package StepDefinitions;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Execute.feature",
    glue = {"StepDefinitions"},
    monochrome=true,
    plugin={"pretty","json:target/JSONReport/report.json"}
		)
@SpringBootTest
public class TestRunner {
	
	public String run() {
		return "cucumber tests executed";
		
	}

}
