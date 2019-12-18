package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\PDC3B-Training.PDC3B\\eclipse-ashlesha\\cucumber\\myfeatures\\test.feature", glue= {"runnerstepdefn"},tags={"@Sanity,@Regression"})
public class Runnerzzz {
	

}
