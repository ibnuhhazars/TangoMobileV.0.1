package com.test.utilities;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target//cucumber-pretty", "json:target//cucumber-parallel//json//Two.json" }, 
		features = { "src/test/resources" }, 
		tags = { "@deviceTwo" }, 
		glue = { "com.test.helper", "com.test.stepDef" })
public class RunnerDeviceTwo {
	
}
