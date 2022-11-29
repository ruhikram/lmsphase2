Feature: Automate Attendance Module

  Background: Admin/User/staff successfully logged into LMS website

  Scenario: Checking the functionality of Attendance Module
    Given User logged on to the LMS page
    When User is on Attendance page
    Then User checks Attendance page Header Validation
    And User checks Attendance page Edit Functionality
    And User checks Attendance page Delete Functionality
    And User checks present Functionality
    And User checks Absent Functionality