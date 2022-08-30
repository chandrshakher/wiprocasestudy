package Myrunner;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
	features= "//Users//c.s.yadav//Documents//Seleniumlaeringproject//casestudy2//src//test//java//Features//BookFlight.feature",
			
glue={"StepDefinitions"},

dryRun = false

)


public class TestRunner {
	private TestNGCucumberRunner testngrunner;
	
	@BeforeClass(alwaysRun=true)
	public void setupClass() throws Exception{
		testngrunner=new TestNGCucumberRunner(this.getClass());
	}
	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) throws IOException{
		testngrunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider(name="features")
	public Object[][] features() {
	return testngrunner.provideFeatures();
	}


	@AfterClass(alwaysRun=true)
	public void tearDownClass() throws Exception {
	//endExtentReport();
		testngrunner.finish();
	}
	}