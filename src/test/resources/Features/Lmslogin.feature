Feature: Automate Login Module

  Background: Admin/User/staff successfully opens the LMS website

  Scenario: Checking the functionality of Login Module
    Given Admin/user/staff are on home page
    When User clicks login link
    Then USer checks functionality of login button
    And User Checks Login feature with Valid Credentials
    And User Checks Login feature with invalid Credentials
    And User Checks Login feature when user forgot password
     And User Checks Reset password functionality of Login feature