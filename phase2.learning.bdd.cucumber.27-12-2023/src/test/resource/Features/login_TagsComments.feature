# Author: prajwal.xxxxx@gmail.com            #comments
#Keywords Summary;
#Features: List of the features
Feature: Login
  
  I want to verify the successful login with the valid user credentials.

  @regression @smoke @login                #Tags
  Scenario: Successfull Verification of Login functionally
    
    Given user on the login page

    And user inputs the email
     # And user inputs the password
    And user clicks the login button
    Then user navigate to My account

  Scenario Outline: Valid input credentials for login
    Given user want to enter input with the valid credentials
    When user check for the email and password fields
    And user enters the following the input details
      | email  password |         |
      | xyz@gmail.com   | abc@123 |
      | abc@gmail.com   | xyz@123 |
      | mno@gmail.com   | opq@123 |
    And user navigate to My account

  Scenario: UnSuccessfull Verification of Login functionally
    
    Given user on the login page

    And user inputs the email
    And user inputs the password
    And user clicks the login button
    Then error message with the wrong credentials.
    And user returns back on the login page
