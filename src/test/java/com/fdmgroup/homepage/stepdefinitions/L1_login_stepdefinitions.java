package com.fdmgroup.homepage.stepdefinitions;

import com.fdmgroup.homepage.pages.IndexPage;
import com.fdmgroup.homepage.pages.LoginPage;
import com.fdmgroup.utilities.BrowserUtilities;
import com.fdmgroup.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class L1_login_stepdefinitions {

    LoginPage loginPage;
    IndexPage indexPage;

    @Given("User launches the CSPO portal page")
    public void user_launches_the_cspo_portal_page() {
        loginPage = new LoginPage();
        loginPage.driverGet(ConfigurationReader.getProperty("project_url"));
    }

    @When("Enters valid Trainee email_id and password")
    public void entersValidTraineeEmail_idAndPassword() {
        loginPage.setUsernameInput(ConfigurationReader.getProperty("traineeUsername"));
        loginPage.setPasswordInput(ConfigurationReader.getProperty("traineePassword"));
    }

    @When("Enters valid email_id and password for \"([^\"]*)\"$")
    public void enters_valid_email_id_and_password(String user) {
        System.out.println("user is --------------" + user);
        if (user.equals("Admin")) {
            loginPage.setUsernameInput(ConfigurationReader.getProperty("adminUsername"));
            loginPage.setPasswordInput(ConfigurationReader.getProperty("adminPassword"));
        } else if (user.equals("SystemAdmin")) {
            loginPage.setUsernameInput(ConfigurationReader.getProperty("systemAdminUsername"));
            loginPage.setPasswordInput(ConfigurationReader.getProperty("systemAdminPassword"));
        } else {
            loginPage.setUsernameInput(ConfigurationReader.getProperty("traineeUsername"));
            loginPage.setPasswordInput(ConfigurationReader.getProperty("traineePassword"));
        }
    }

    @When("Enters valid bruceLee Trainee email_id and password")
    public void entersValidBruceLeeTraineeEmail_idAndPassword() {
        loginPage.setUsernameInput(ConfigurationReader.getProperty("bruceLeeUsername"));
        loginPage.setPasswordInput(ConfigurationReader.getProperty("bruceLeePassword"));

    }

    @When("Enters valid email_id and password")
    public void enters_valid_email_id_and_password() {
        loginPage.setUsernameInput(ConfigurationReader.getProperty("traineePeterUsername"));
        loginPage.setPasswordInput(ConfigurationReader.getProperty("traineePeterPassword"));
    }

    @When("user clicks the Login button")
    public void user_clicks_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("User should navigate to the Home page")
    public void user_should_navigate_to_the_home_page() {
        indexPage = new IndexPage();
        Assert.assertEquals(ConfigurationReader.getProperty("traineeWelcomeMessage"), indexPage.getWelcomeUserText());
    }
    @Then("Trainee should navigate to the Home page")
    public void traineeShouldNavigateToTheHomePage() {
        indexPage = new IndexPage();
        Assert.assertEquals(ConfigurationReader.getProperty("traineeWelcomeMessage"), indexPage.getWelcomeUserText());
    }
    @Then("Admin should navigate to the Home page")
    public void adminShouldNavigateToTheHomePage() {
        indexPage = new IndexPage();
        Assert.assertEquals(ConfigurationReader.getProperty("adminWelcomeMessage"), indexPage.getWelcomeUserText());
    }

    @When("Enters valid System Admin email_id and password")
    public void entersValidSystemAdminEmail_idAndPassword() {
        loginPage.setUsernameInput(ConfigurationReader.getProperty("systemAdminUsername"));
        loginPage.setPasswordInput(ConfigurationReader.getProperty("systemAdminPassword"));
    }

    @Then("User BruceLee should navigate to the Home page")
    public void userBruceLeeShouldNavigateToTheHomePage() {
        indexPage = new IndexPage();
        Assert.assertEquals(ConfigurationReader.getProperty("bruceWelcomeMessage"), indexPage.getWelcomeUserText());
    }

    @Then("Trainee Peter should navigate to the Home page")
    public void traineePeterShouldNavigateToTheHomePage() {
        indexPage = new IndexPage();
        Assert.assertEquals(ConfigurationReader.getProperty("traineePeterWelcomeMessage"), indexPage.getWelcomeUserText());
    }
}
