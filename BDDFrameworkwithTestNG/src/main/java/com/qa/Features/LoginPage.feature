@AlliznzLoginTest
Feature: Allianz Application Login Test
 Description: To Test the Login Functionality of Allianz Application

#normal login - Using UserName and Password from the Property File
#smokeTest
Scenario: Allianz Application Login Test
Given User is already on the Login Page
When the title of the login page is Allianz Login
Then User enters "pktest001" and "test001" and click on login button
Then User is on the Home Page
