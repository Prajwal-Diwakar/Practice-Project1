# Author: prajwal.xxxxx@gmail.com
#Keywords Summary;
#Features: List of the features
Feature: Reset password
  
  I want to verify the successful Reset password for the existing user.

  @regression @smoke @login
  Scenario: Successfull Verification of Reset password
    
    Given: user should be the loginned to the page
		And user navigate to reset password page "/reset-password"
		
		When user asks to reset the password
		Then user should receive the email with
		 """ Dear user,
				Please click this link to reset your password
		"""	  # docstring	


  Scenario Outline: Valid input credentials for login
    Given I want to enter input with the valid credentials
    When I check for the email and password fields
    And user enters the following the input details
    
    #Datatables
    
      | email  password |         |
      | xyz@gmail.com   | abc@123 |
      | abc@gmail.com   | xyz@123 |
      | mno@gmail.com   | opq@123 |
    And user navigate to "My account"

  Scenario: UnSuccessfull Verification of Login functionally
    
    Given: user on the login page

    And user inputs the email
    And user inputs the password
    And user clicks the login button
    Then error message with the wrong credentials.
    And user returns back on the login page