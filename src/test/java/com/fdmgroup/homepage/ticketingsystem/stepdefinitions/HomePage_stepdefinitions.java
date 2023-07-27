package com.fdmgroup.homepage.ticketingsystem.stepdefinitions;

import com.fdmgroup.homepage.ticketingsystem.pages.HomePage;
import com.fdmgroup.utilities.ConfigurationReader;
import com.fdmgroup.homepage.pages.IndexPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class HomePage_stepdefinitions {

	
	    IndexPage homePageObj = new IndexPage();
	    
		@Given("^user validate the \"([^\"]*)\" window$")
	    public void validate_home_window(String currentPage) throws Throwable {
			
	        String validUrl = ConfigurationReader.getProperty("project_url");
	        String currentUrl = "";
	        if (currentPage.equalsIgnoreCase("Home page")) {
	            currentUrl = homePageObj.getHomePageURL();
	        }
	        Assert.assertEquals(currentUrl, validUrl);
	        System.out.println("validate----------------" + currentUrl + "...." + validUrl);
	    }
		
		
		
	   @And("^User verify the \"([^\"]*)\"$")
	    public void verify_home_window(String currentPage) throws Throwable {
		   
		  		   
		   String validUrl="http://localhost:4200/";
	
		   String currentUrl="";
		   if(currentPage.equalsIgnoreCase("Home page"))
		   {
			  
			   currentUrl=homePageObj.getHomePageURL();
			  
		   }

	    	Assert.assertEquals(currentUrl, validUrl);
	    	 System.out.println("verify----------------"+currentUrl +"...."+validUrl);
	        
	    }
	   @And("^User verify the Home page for \"([^\"]*)\"$")
	    public void verify_home_trainee(String user) throws Throwable {
		   
		  
		  
		   String validUser;
		   if(user.equalsIgnoreCase("Trainee"))
		   {
			    validUser="Trainee";
		   }
		   else
			    validUser="SysAdmin";
	
		   String currentUser="";
		   currentUser=homePageObj.getUserType();
	    	Assert.assertEquals(currentUser, validUser);
	    	System.out.println("verify----------------"+currentUser +"...."+validUser);
	        
	    }

	   @Then("^user clicks  Ticketing  button$")
	    public void navigaet_to_Ticket_Menu() throws Throwable {
	    	
		   homePageObj.clickTicketing();
	    
	    }
	   
	   @And("^User able to view 3 features in home page$")
	    public void view_three_features() throws Throwable {
		   
		   Assert.assertEquals("Special Training", homePageObj.verifySpecialTrainingFeatures());
		   Assert.assertEquals("Ticketing", homePageObj.verifyTicketingFeatures());
		   Assert.assertEquals("Attendance", homePageObj.verifyAttendenceFeatures());
	    
	    }
	   
	   @Then("Click on Special Training drop down menu")
	   public void click_on_special_training_drop_down_menu() {
		   
		   homePageObj.clickSpecilTraning();
	   }
	   
	   @Then("Click on Training History")
	   public void click_on_training_history() {
		   homePageObj.clickTraningHistory();
	       
	   }
	   
	   @And("^Click on logout button$")
	    public void click_on_logout() throws Throwable {
	    	
		   homePageObj.clickLogout();
	    
	    }
	    


  
}
