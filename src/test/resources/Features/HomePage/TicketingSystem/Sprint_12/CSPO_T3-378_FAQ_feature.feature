#Tester: Munindra Zinzuvadia
# Date: 2023/06/22

Feature: FAQ

  Background: Trainee should be logged in with valid email_id and password
    Given User launches the CSPO portal page
    When Enters valid Trainee email_id and password
    And user clicks the Login button
    Then Trainee should navigate to the Home page

  @Trainee_Opens_FAQ_Page
  Scenario: TC_CSPO398_01 Test that the system redirects Users to FAQ page
    Given Trainee navigate to the ticketing system page
    When Trainee clicks on FAQ button

  @Trainee_Opens_FAQ_SeeMore_Page
  Scenario: TC_CSPO398_02 Test that clicking "see more" link redirects Users to detailed FAQ page
    Given Trainee navigate to the ticketing system page
    When Trainee clicks on FAQ button
    And Trainee clicks on See More button

  @Trainee_Opens_CreateTicket_Page_In_FAQ_SeeMore
  Scenario: TC_CSPO398_03 Test that clicking "Create a ticket" link redirects Users to Create Ticket Page
    Given Trainee navigate to the ticketing system page
    When Trainee clicks on FAQ button
    And Trainee clicks on See More button
    When Trainee clicks on Create a Ticket button
    Then Trainee should be redirected to the Create Ticket page

  @Trainee_Opens_FAQ_Page_From_Sidebar
  Scenario: TC_CSPO398_04 Test that FAQ side bar button redirects Trainee to the FAQ page
    Given Trainee navigate to the ticketing system page
    When Trainee clicks sidebar ticketing system menu and clicks FAQs from the options

  @Trainee_Opens_CreateTicket_Page_In_Server_Error_FAQ_SeeMore
  Scenario: TC_CSPO398_05 Test that "See More" link redirects to Create Tickets Page in "Couldn't Connect to server"
    Given Trainee navigate to the ticketing system page
    When Trainee clicks on FAQ button
    And Trainee clicks See More button under Couldn't connect to server
    Then Trainee should be redirected to the Create Ticket page