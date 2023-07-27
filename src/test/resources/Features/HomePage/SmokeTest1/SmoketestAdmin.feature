@CSPO_Smoke
Feature:  As a User,I want to make sure that all majour functionalities are working good

Background:
    Given User launches the CSPO portal page
    When Enters valid email_id and password for "Admin"
    And user clicks the Login button



@Smoke_Test1_Admin
Scenario: Test_1 Test that a TRAINEE can successfully log in to the application
		And User verify the Home page for "Admin"
		

@Smoke_Test1_Admin
Scenario: Test_2 Test that a TRAINEE can verify home page
    And User verify the "Home page"
    
@Smoke_Test1_Admin
Scenario: Test_3 Test that a TRAINEE can view 3 features in home page
    And User able to view 3 features in home page
    
@Smoke_Test1_Admin
Scenario: Test_4 Test that a TRAINEE can successfully log out
		And User verify the "Home page"
    And Click on logout button
















    
