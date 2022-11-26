#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Aoutomate user module


	Background: Admin/User/staff successfully logged into LMS website
	Given The User Successfully logins into home page

	  @tag1
	  Scenario: Checking the functionality of User module
	    Given User is on manage page
	    When User tests the functionality of User module
	    Then User test add new funtionality
	    And User checks table header functionality
	    And User checks the functionality of delete button
	    And User checks the functionality of Edit button
	    And User checks the functionality of Search button
	    And User checks the functionality of ID
	    And User checks the functionality of User Details Window
	    And User checks the functionality of Cancel button
	    And User checks the functionality of Sbmit button
	    And User checks the functionality of  input feild in Label Text
	    And User checks the functionality of Drop down menu
	    And User checks the functionality of Submit button
	   