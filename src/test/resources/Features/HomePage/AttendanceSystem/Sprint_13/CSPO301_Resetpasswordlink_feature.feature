

Feature: As a user, I want to be able to click on the unique reset password link 
         through my email, so that I can reset my password
 

  Scenario:TC_CSPO301_01 Verify forgot password link is clickable on the CSPO page
    
    Given User is on CSPO page
    When  User clicks on the forget your password link
    Then  User should be navigated to find your account page
   
   Scenario:TC_CSPO_02 Verify user is able to enter email id in find your 
             account page email field to receive reset passowrd link
    Given User is on CSPO page
    When  User clicks on the forget your password link
    Given  User should be navigated to find your account page
    And  User enters the valid email id
    Then  User clicks submit button
    Then  User should be navigated to find your account page
     
     