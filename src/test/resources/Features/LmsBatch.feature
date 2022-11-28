Feature: Automate Batch Module

  Background: Admin/User/staff successfully logged into LMS website

  Scenario: Checking the functionality of Batch Module
    Given User logged on to LMS website
    When User navigates program page
    Then User checks  Header Validation in Batch MOdule
    And User Checks   Footer Validation in Batch Module
    And User checks  Paginator validation in Batch Module
    And User checks  Search box Functionality in Batch Module
    And User checks  Ascending order Functionality in Batch Module
    And User checks  Descending order Functionality in Batch Module
    And User checks a new program Functionality in Batch module
    And User checks Number of rows in a table Functionality in Batch Module
    And User checks Edit Functionality in Batch Module
    And User checks Delete Functionality in Batch Module
    And User checks Checkbox Functionality in Batch Module