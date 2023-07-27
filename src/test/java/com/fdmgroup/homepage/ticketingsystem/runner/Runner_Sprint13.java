package com.fdmgroup.homepage.ticketingsystem.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/HomePage/TicketingSystem/Sprint_13/",
        glue = "com.fdmgroup.homepage",
        tags = "@CSPO_423_sorting_ticket_Admin",
        plugin = {"pretty", 
        		"junit:Reports/TicketingSystem_Sprint13.junit",
        		"json:Reports/TicketingSystem_Sprint13.json",
        		"html:Reports/TicketingSystem_Sprint13.html"}, 
        monochrome = true,
        dryRun = false,
        publish = false)
public class Runner_Sprint13 {
}

