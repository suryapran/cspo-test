#Tester: Munindra Zinzuvadia
  # Date: 2023/06/22

@ReopenTicket
Feature: Reopen ticket

  @Trainee_Reopen_Resolved_Ticket
  Scenario: TC-T3318_001 Test that a trainee is able to reopen a ticket with resolved status.
    Given User launches the CSPO portal page
    When Enters valid Trainee email_id and password
    And user clicks the Login button
    Then Trainee should navigate to the Home page
    Given Trainee navigate to the ticketing system page
    And Trainee navigates to the Tickets Page
    When Trainee apply status filter to Resolved
    And Trainee clicks on the First Ticket Title
    Then Trainee should be redirected to the Ticket details page
    When Trainee clicked on the Reopen button
    Then Trainee clicks Yes on the confirmation dialog box
    And Trainee click on the tickets page under Ticketing System from the side bar


  @Trainee_Reopen_Closed_Ticket
  Scenario: TC-T3318_002 Test that a trainee is able to reopen a ticket with closed status
    Given User launches the CSPO portal page
    When Enters valid Trainee email_id and password
    And user clicks the Login button
    Then Trainee should navigate to the Home page
    Given Trainee navigate to the ticketing system page
    And Trainee navigates to the Tickets Page
    When Trainee apply status filter to Closed
    And Trainee clicks on the First Ticket Title
    Then Trainee should be redirected to the Ticket details page
    When Trainee clicked on the Reopen button
    Then Trainee clicks Yes on the confirmation dialog box
    And Trainee click on the tickets page under Ticketing System from the side bar

  @Trainee_Cancel_Reopen_Resolved_Ticket
  Scenario: TC-T3318_003 Test that a trainee is able to cancel the reopen ticket process while in resolved status.
    Given User launches the CSPO portal page
    When Enters valid Trainee email_id and password
    And user clicks the Login button
    Then Trainee should navigate to the Home page
    Given Trainee navigate to the ticketing system page
    And Trainee navigates to the Tickets Page
    When Trainee apply status filter to Resolved
    And Trainee clicks on the First Ticket Title
    Then Trainee should be redirected to the Ticket details page
    When Trainee clicked on the Reopen button
    Then Trainee clicks No on the confirmation dialog box
    And Trainee can view Resolved status on the Ticket
    And Trainee click on the tickets page under Ticketing System from the side bar
    And the Ticket status should be Resolved for the ticket

  @Trainee_Cancel_Reopen_Closed_Ticket
  Scenario: TC-T3318_004 Test that a trainee is able to cancel the reopen ticket process while in closed status.
    Given User launches the CSPO portal page
    When Enters valid Trainee email_id and password
    And user clicks the Login button
    Then Trainee should navigate to the Home page
    Given Trainee navigate to the ticketing system page
    And Trainee navigates to the Tickets Page
    When Trainee apply status filter to Closed
    And Trainee clicks on the First Ticket Title
    Then Trainee should be redirected to the Ticket details page
    When Trainee clicked on the Reopen button
    Then Trainee clicks No on the confirmation dialog box
    And Trainee can view Closed status on the Ticket
    And Trainee click on the tickets page under Ticketing System from the side bar
    And the Ticket status should be Closed for the ticket

  @Trainee_Cannot_Reopen_New_Ticket
  Scenario: TC-T3318_004 Test that a trainee is not able to reopen a ticket with new status.
    Given User launches the CSPO portal page
    When Enters valid Trainee email_id and password
    And user clicks the Login button
    Then Trainee should navigate to the Home page
    Given Trainee navigate to the ticketing system page
    And Trainee navigates to the Tickets Page
    When Trainee apply status filter to New
    And Trainee clicks on the First Ticket Title
    Then Trainee should be redirected to the Ticket details page with status New
    And The Ticket details page should open and should not display reopen button

  @Trainee_Cannot_Reopen_InProgress_Ticket
  Scenario: TC-T3318_005 Test that a trainee is not able to reopen a ticket with In Progress status.
    Given User launches the CSPO portal page
    When Enters valid Trainee email_id and password
    And user clicks the Login button
    Then Trainee should navigate to the Home page
    Given Trainee navigate to the ticketing system page
    And Trainee navigates to the Tickets Page
    When Trainee apply status filter to In Progress
    And Trainee clicks on the First Ticket Title
    Then Trainee should be redirected to the Ticket details page with status In Progress
    And The Ticket details page should open and should not display reopen button

  @Trainee_Cannot_Reopen_Pending_Ticket
  Scenario: TC-T3318_006 Test that a trainee is not able to reopen a ticket with Pending status.
    Given User launches the CSPO portal page
    When Enters valid Trainee email_id and password
    And user clicks the Login button
    Then Trainee should navigate to the Home page
    Given Trainee navigate to the ticketing system page
    And Trainee navigates to the Tickets Page
    When Trainee apply status filter to Pending
    And Trainee clicks on the First Ticket Title
    Then Trainee should be redirected to the Ticket details page with status Pending
    And The Ticket details page should open and should not display reopen button

  @Admin_Cannot_Reopen_New_Ticket
  Scenario: TC-T3318_007 Test that a admin is not able to reopen a ticket with new status.
    Given User launches the CSPO portal page
    When Enters valid System Admin email_id and password
    And user clicks the Login button
    Then Admin should navigate to the Home page
    Given Admin navigate to the ticketing system page
    And Admin navigates to the Tickets Page
    When Admin apply status filter to New
    And Admin clicks on the First Ticket Title
    Then Admin should be redirected to the Ticket details page with status New
    And The Ticket details page should open and should not display reopen button

  @Admin_Cannot_Reopen_InProgress_Ticket
  Scenario: TC-T3318_008 Test that a admin is not able to reopen a ticket with In Progress status.
    Given User launches the CSPO portal page
    When Enters valid System Admin email_id and password
    And user clicks the Login button
    Then Admin should navigate to the Home page
    Given Admin navigate to the ticketing system page
    And Admin navigates to the Tickets Page
    When Admin apply status filter to In Progress
    And Admin clicks on the First Ticket Title
    Then Admin should be redirected to the Ticket details page with status In Progress
    And The Ticket details page should open and should not display reopen button

  @Admin_Cannot_Reopen_Pending_Ticket
  Scenario: TC-T3318_009 Test that a admin is not able to reopen a ticket with Pending status.
    Given User launches the CSPO portal page
    When Enters valid System Admin email_id and password
    And user clicks the Login button
    Then Admin should navigate to the Home page
    Given Admin navigate to the ticketing system page
    And Admin navigates to the Tickets Page
    When Admin apply status filter to Pending
    And Admin clicks on the First Ticket Title
    Then Admin should be redirected to the Ticket details page with status Pending
    And The Ticket details page should open and should not display reopen button

  @Admin_Cannot_Reopen_Resolved_Ticket
  Scenario: TC-T3318_010 Test that a admin is not able to reopen a ticket with Resolved status.
    Given User launches the CSPO portal page
    When Enters valid System Admin email_id and password
    And user clicks the Login button
    Then Admin should navigate to the Home page
    Given Admin navigate to the ticketing system page
    And Admin navigates to the Tickets Page
    When Admin apply status filter to Resolved
    And Admin clicks on the First Ticket Title
    Then Admin should be redirected to the Ticket details page with status Resolved
    And The Ticket details page should open and should not display reopen button

  @Admin_Cannot_Reopen_Closed_Ticket
  Scenario: TC-T3318_012 Test that a admin is not able to reopen a ticket with Closed status.
    Given User launches the CSPO portal page
    When Enters valid System Admin email_id and password
    And user clicks the Login button
    Then Admin should navigate to the Home page
    Given Admin navigate to the ticketing system page
    And Admin navigates to the Tickets Page
    When Admin apply status filter to Closed
    And Admin clicks on the First Ticket Title
    Then Admin should be redirected to the Ticket details page with status Closed
    And The Ticket details page should open and should not display reopen button