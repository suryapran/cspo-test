@CSPO
Feature: I want to login into the CSPO portal page


  @CSPO_login_System_Admin_valid_credential
  Scenario: User should be logged in with valid email_id and password
    Given User launches the CSPO portal page
    When Enters valid Trainee email_id and password
    And user clicks the Login button
    Then User should navigate to the Home page
    Then User should navigate to the Home page
