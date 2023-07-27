package com.fdmgroup.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/HomePage",
        glue = "com.fdmgroup.homepage",
        tags = "@CSPO_423_sorting_ticket or @CSPO_511_preloaded_response",
        plugin = {"pretty", "junit:Reports/TicketingSystem_Sprint13.junit","html:Reports/TicketingSystem_Sprint13.html"}, monochrome = true,
        dryRun = false,
        publish = false)
public class Runner_Sprint13 {
}

