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
Feature: Automate Assignment Module

Background: Admin/User/staff successfully logged into LMS website
	Given The User Successfully logins into home page
 
  @tag1
  Scenario: checking the functionalty of Assignment module
    Given The user clicks on Assignment 
    When User tests the functionality of Assignment module
    Then User tests the functionality of Search Text Box
    And User tests the functionality of Ascending order
    And User tests the functionality of Descending order
    And User tests the functionality of New Assignment
    And User tests the functionality of Edit
    And User tests the functionality of Assignment Google Form
    And User tests the functionality of Delete Assignment
    And User tests the functionality of Delete Multiple Assignment
    And User tests the functionality ofheckbox