package com.careerhack.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//updated the spacing
		
         features = "Features",
         glue = "com.careerhack.steps"
    )     
public class Testrunner extends AbstractTestNGCucumberTests{
	
	
	

}
