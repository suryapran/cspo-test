package com.fdmgroup.smoketest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/HomePage/SmokeTest1/",
        glue = "com.fdmgroup.homepage",
        tags = "@Smoke_Test1_Trainee",
        plugin = {"pretty", 
        		"junit:Reports/SmokeTest/SmokeTest1.junit",
        		"json:Reports/SmokeTest/SmokeTest1.json",
        		"html:Reports/SmokeTest/SmokeTest1.html"}, 
        monochrome = true,
        dryRun = false,
        publish = false)
public class Runner_Smoke1 {
}

