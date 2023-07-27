package com.fdmgroup.homepage.ticketingsystem.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/HomePage/TicketingSystem/Sprint_12/",
        glue = "com.fdmgroup.homepage",
        tags = "",
        plugin = {"pretty", 
        		"junit:Reports/TicketingSystem_Sprint12.junit",
        		"json:Reports/TicketingSystem_Sprint12.json",
        		"html:Reports/TicketingSystem_Sprint12.html"}, 
        monochrome = true,
        dryRun = false,
        publish = false)
public class Runner_Sprint12 {

}
