@Attendance_previous_day_record
Feature: Checking previous day records feature of the Attendance system

  Background: User should be logged in to the system
    Given User launches the CSPO portal page
    When Enters valid email_id and password
    And user clicks the Login button
    Then Trainee Peter should navigate to the Home page

  @TC_CSPO527_Attendance_previous_day_record_leftArrowToPreviousMonth
  Scenario: TC_CSPO527_03 The left arrow besides the month title should take user to the previous month data
    Given User navigates to the calendar page using the calendar button in the side bar attendance dropdown
    And The left arrow besides month title is displayed
    When I click on the left arrow
    Then The calendar data with Previous month header should be displayed

  @TC_CSPO527_Attendance_previous_day_record_rightArrowToNextMonth
  Scenario: TC_CSPO527_04 The Right arrow besides the month title should take user to the next month data
    Given User navigates to the calendar page using the calendar button in the side bar attendance dropdown to check next month data
    And The Right arrow besides month title is displayed
    When I click on the Right arrow
    Then The calendar data with Next month header should be displayed

  @TC_CSPO527_Attendance_previous_day_record_attendanceOverviewTabVisible
  Scenario: TC_CSPO527_05 Attendance overview tab should be displayed for each day in the calendar
   	Given Attendace dropdown is displayed in the sidebar
   	When I click on the attendance dropdown
   	And Click on the calendar button
    Then Attendance overview tab should be displayed for sixteenth May in calendar

  @TC_CSPO527_Attendance_previous_day_record_attendanceOverviewPopupWindowVisible
  Scenario: TC_CSPO527_07 Pop up window should open up on clicking the attendance overview tab
    Given User navigates to the Calendar page by clicking on the calendar button in the side bar attendance dropdwon to view the overview tab
    When I click on the attendance overview tab for sixteenth May
    Then a pop up window with Title Attendance Overview should be displayed

  @TC_CSPO527_Attendance_previous_day_record_attendancePopupClockInTimeVisible
  Scenario: TC_CSPO527_08 The field for Clock In should have time displayed
    Given Calendar Page is displayed after clicking on the calendar button in the sidebar menu
    When I click on the attendance overview tab for 16th may to check the clock in time
    Then the field in front of the Clock In label should have a time value

  @TC_CSPO527_Attendance_previous_day_record_attendancePopupClockOutTimeVisible
  Scenario: TC_CSPO527_09 The field for Clock Out should have time displayed
    Given Calendar Page is displayed after clicking on the calendar button in the sidebar menu to check the clock out time
    When I click on the attendance overview tab for 16th May to check the clock out time
    Then the field in front of the Clock Out label should have a time value
