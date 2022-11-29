Feature: Automate Program Module

  Background: Admin/User/staff successfully logged into LMS website

  Scenario: Checking the functionality of user Module
    Given User logged on to LMS page
    When User is on program page
    Then User checks Header Validation
    And User Checks Footer Validation
    And User checks Paginator validation
    And User checks Search box Functionality
    And User checks Ascending order Functionality
    And User checks Descending order Functionality
    And User checks add a new program Functionality
    And User checks Number of rows in a table Functionality
    And User checks Edit Functionality
    And User checks Delete Functionality
    And User checks Checkbox Functionality