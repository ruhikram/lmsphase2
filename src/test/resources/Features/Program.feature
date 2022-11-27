Feature: Manage Program

  Scenario: Validating the Manage Program header
    #Background: Admin/user/staff logged on to LMS website
    Given Admin/user/staff logged on to LMS website
    When Admin/user/staff is on manage program page
    Then Admin/user/staff see header text as "Manage Program"

  Scenario: Validating the Manage Program Footer
    #Background: Admin/user/staff logged on to LMS website
    Given Admin/user/staff logged on to LMS website
    When Admin/user/staff is on manage program page
    Then Admin/User/Staff see  Footer text as "In total there are 9 programs."

  Scenario: Validating the Manage Program Paginator
    #Background: Admin/user/staff logged on to LMS website
    Given Admin/user/staff logged on to LMS website
    When Admin/user/staff is on manage program page
    Then Admin/User/Staff  see the text as "Showing 1 to 5 of 9 entries"
