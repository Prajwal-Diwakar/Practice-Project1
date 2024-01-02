#Author: prajwal@gmail.com

 @FbTest
Feature: Facebook Login Verification
  user want to verify successfull or unsuccessfullogin

   @FbTest
  Scenario Outline: Unsuccessful Verification of Login functionality
    Given user should be on facebook login page
    And user enters the email adress "<username>"
    And user enters the password "<password>"
    And user clicked on the login button
    Then error message displayed with the wrong credentials
    And user returns back on facebook login page

    Examples: 
      | username         | password |
      | abc123@gmail.com | abc@123  |
      | abc123@gmail.com | abc@7869 |
      | abc123@gmail.com | xyz@987  |

