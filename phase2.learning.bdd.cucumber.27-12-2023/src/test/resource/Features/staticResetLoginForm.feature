#Author: prajwal@gmail.domain.com

@ResetLoginForm

Feature: Reset Login form inputs
 
  User wants to test the reset login form for the multiple inputs

  @ResetLoginForm
  
  Scenario: Verification of reset button with numbers of credential
    Given Open the Chrome and launch the application
    And Maximize the Chrome browser window
    When Enter the Username and Password
      | username               | password   |
      | raja@outlook.com       | raja@123   |
      | raju@simplilearn.com   | raju@123   |
      | mani@netsol.com        | mani@123   |
      | ajaaz@gmail.com        | ajaaz@123  |
    Then Reset the credentials