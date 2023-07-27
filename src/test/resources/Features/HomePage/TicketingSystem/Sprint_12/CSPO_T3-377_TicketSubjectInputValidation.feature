#Author: Eldhose Issac
#Date : 06/24/2023

Feature: Ticket subject input field validation
  As a trainee, I want a defined ticket subject input field 
  so I have clear parameters for what can be entered into the subject line.

  Background: User should be logged in with valid email_id and password,
    Given User launches the CSPO portal page
    When Enters valid Trainee email_id and password
    And user clicks the Login button
    Then User should navigate to the Home page

  Scenario: TC_CSPO403_01 Test that trainee should be able to view the Ticket Subject input field
    Given the trainee is on the home page
    And click on Ticketing
    When the trainee is navigated to the Ticket Menu page
    And click on Create Ticket
    Then Ticket Subject input field should be displayed 

  Scenario: TC_CSPO403_02 Test that trainee should be able to view a placeholder text
  				 for the Ticket Subject input field
    Given the trainee is on the home page
    And click on Ticketing
    When the trainee is navigated to the Ticket Menu page
    And click on Create Ticket
    Then verify that a placeholder text Enter Subject is displayed for the Ticket Subject input field
    
    Scenario: TC_CSPO403_03 Test that trainee should be able to view the Ticket Subject text
    				 on the left side of the input field
    Given the trainee is on the home page
    And click on Ticketing
    When the trainee is navigated to the Ticket Menu page
    And click on Create Ticket
    Then verify that Ticket Subject  should be displayed on the left side of the input field
    
    Scenario: TC_CSPO403_04 Test that trainee should be able to view the tooltip for Ticket Subject input field 
     when the cursor is hovered over the Ticket Subject input field
     
    Given the trainee is on the home page
    And click on Ticketing
    When the trainee is navigated to the Ticket Menu page
    And click on Create Ticket
    And hover the curser over the Ticket Subject input field
    Then verify that a tooltip with length validation text exists
    
    Scenario: TC_CSPO403_05 verify that the  Ticket Subject input field tooltip showing the text
     "Enter the Name of the Issue - The subject line should be between 5-128 characters, Ex: Getting an error while submitting a timesheet in Kimble."
     when the cursor is hovered over the Ticket Subject input field
     
    Given the trainee is on the home page
    And click on Ticketing
    When the trainee is navigated to the Ticket Menu page
    And click on Create Ticket
    And hover the curser over the Ticket Subject input field
    Then verify the tooltip text content
    
    Scenario: TC_CSPO403_06 Verify that trainee should not  be able to view the tooltip showing the text
     "Enter the Name of the Issue - The subject line should be between 5-128 characters, Ex: Getting an error while submitting a timesheet in Kimble." 
     when the cursor is hovered anywhere other than the Ticket Subject input field
     
    Given the trainee is on the home page
    And click on Ticketing
    When the trainee is navigated to the Ticket Menu page
    And click on Create Ticket
    And Hover the cursor anywhere other than the Ticket Subject input field
    Then verify that a tooltip with length validation text do not exists
    
    Scenario: TC_CSPO403_07 Verify that trainee cannot submit 
    string of length  less than five as Ticket Subject
     
    Given the trainee is on the home page
    And click on Ticketing
    When the trainee is navigated to the Ticket Menu page
    And click on Create Ticket
    And populate all the required fields with Subject field less than length five 
    Then the Submit button should be disabled
    
     Scenario: TC_CSPO403_08 Verify that trainee can submit a valid string as Ticket Subject
     
    Given the trainee is on the home page
    And click on Ticketing
    When the trainee is navigated to the Ticket Menu page
    And click on Create Ticket
    And populate all the required fields with valid entries
    Then the Submit button should be enabled
    
    