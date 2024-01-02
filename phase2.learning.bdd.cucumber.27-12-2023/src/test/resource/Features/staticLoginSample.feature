#Author: prajwal@your.domain.com
#Feature: Login Feature
@LoginTest @Regression
Feature: Login feature
  User want to verify the login functionality

  @LoginTest
  Scenario: Successfull login verification
    Given Open the chrome browser and launch the test application
    And Maximize the chrome browser page
    When Enter the username and password
    Then click on the submit button
    And user navigated back to login page succesfully
