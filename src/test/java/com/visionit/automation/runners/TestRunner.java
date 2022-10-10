package com.visionit.automation.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class )
@CucumberOptions (
		
		features={"src/test/resources/Com/login.feature"},//to tell cucumber where is ur feature file
        glue={"stepdefs","loginstepDefination" },// to tell cucumber where is ur step def code
       // tags="@SearchProd", // to tell which tagged feature file to execute
        plugin = {"pretty", // to generate reports
        		"html:target/html/htmlreport.html",
            "json:target/json/file.json",
            },
        publish=true,
        dryRun=false,
        monochrome=true
        
        // to tell whether to test run(true) or actual run(false)
        
        
        )
		


public class TestRunner {

}
