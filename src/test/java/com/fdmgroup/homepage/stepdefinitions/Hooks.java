package com.fdmgroup.homepage.stepdefinitions;

import com.fdmgroup.utilities.BrowserUtilities;
import com.fdmgroup.utilities.DriverUtilities;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

import org.checkerframework.checker.units.qual.Substance;
import org.openqa.selenium.WebDriver;

public class Hooks extends BrowserUtilities {

    @Before
    public void setup() {
        driverUtilities = getInstance();
        driver = driverUtilities.getDriver();
        maximizeWindow();
        implicitWait(20);
    }

    @After
    public void terminate(){
    	driver.quit();
    	resetDriver();
    }

}
