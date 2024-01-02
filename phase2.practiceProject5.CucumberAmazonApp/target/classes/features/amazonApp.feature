#Author: prajwal@gmail.com
Feature: Amazon Application

  @amazon @signintest
  Scenario: Testing the sign in functionality of the amazon application
   Given open the browser and launch the amazon application
    When user click on signin button
    Then user will be on Signin Page
    And user entered email id as "<emailId>" 
    Then user clicked on Continue button
    And user enters the password as "<password>"
    And user click on submit button
    Then validate the current page url
    
    Examples: 
      | emailId               | password      |
      | demouser123@gmail.com | demouser@1234 |

   @amazon @searchtest
  Scenario Outline: Testing the product search functionality of the amazon application
    Given open the browser and launch the amazon application
    And Maximize the Chrome browser window
    When Enter Product Search input "<product_name>"
    Then Submit Product Search
    And Verify page title "<page_title>"
    
    Examples: 
      | product_name  | page_title                |
      | Boat Earphone | Amazon.in : Boat Earphone |
      | One Plus      | Amazon.in : One Plus      |
      | Rolex watch   | Amazon.in : Rolex watch   |

  @amazon @linktest
  Scenario: Testing the category link click functionality of the amazon application
    Given open the browser and launch the amazon application
    When user on the home page of the amazon
    And navigate to the category link
    Then validate the current page of link url
   