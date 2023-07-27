package com.fdmgroup.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/HomePage",
        glue = "com.fdmgroup.homepage",
//        tags = "@CSPO_login_valid_credential","@Attendance_previous_day_record_calendarSubMenu",
        plugin = {"pretty", "junit:Reports/cucumber.junit"}, monochrome = true,
      
        publish = false)
public class Runner {
	
}