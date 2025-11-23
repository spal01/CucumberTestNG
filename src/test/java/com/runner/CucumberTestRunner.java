package com.runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



@CucumberOptions(features="src/test/resources/features", glue="com.test",plugin={"pretty","html:target/cucumber-reports/cucumbr-report.html","json:target/cucumber-reports/cucumber-report.json"})
public class CucumberTestRunner extends AbstractTestNGCucumberTests{
	/*
	@Test
	public void test(){
	System.out.println("Test Started");		
	}*/
	/*
	 @Override
     @DataProvider(parallel = true)
     public Object[][] scenarios() {
         return super.scenarios();
     }
	*/
	

}
