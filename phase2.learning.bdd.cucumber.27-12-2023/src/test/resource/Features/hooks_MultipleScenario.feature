#Author: prajwald@gmail.com
Feature: Registration, Login and MyAccount

Background: 
    Given user on the Homepage
    And user follows "Register"

  @regression @smoke
  Scenario: Verifying the  Login Functionality
    And user fills "email address" with "prajwal@gmail.com"
    And user fills "password" with "prajwal@123"
    And user click "sign in"
    Then user should see "MY ACCOUNT" heading line

 
  @regression
  Scenario: Creating the  New User
    When user fills "registration email text box" with "prajwal@gmail.com"
    Then user clicks "create an account" icon
    And user enter following details
      | First Name | Prajwal     |
      | Last Name  | Diwakar     |
      | Password   | prajwal123@ |
      | Date       |       29    |
      | Year       |     2023    |
    And user click "register button"

