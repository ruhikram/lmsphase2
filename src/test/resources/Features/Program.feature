Feature: Manage Program 
	Scenario: Validating the Manage Program header
    #Background: Admin/user/staff logged on to LMS website 
	Given Admin/user/staff logged on to LMS website 
	When Admin/user/staff is on manage program page 
	Then Admin/user/staff see header text as "Manage Program"
  