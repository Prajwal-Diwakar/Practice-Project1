Feature: Registration

Background:
Given user on the homepage
And user follows "register" button

@regression  @smoke @login
 Scenario: successfully creates the account
    
Given user should be on the registration page
    
 When user fills the email with .@gmail.com
    
    And user fills the email
    
    And user fills the first and last name
    
    And user enters the password.
    
    And user enters the confirm password.
    
    And user clicks the register button.
    
    Then user is created the successfully.
    
    And user return back on the registration page
    
  Scenario: Unsuccessful creation of the account
  
  Given user should be on the registration page
  
  When user inputs the invalid credentials
  
  Then user got the error message
  
  And user went back to the register page
  
 
    

