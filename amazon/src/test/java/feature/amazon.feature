#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Testing Amazon page

  
  Background: Test the amazonhome page
 
When I enter Amazon mypage URL
Then I capture the title of the page

  
  Scenario Outline: test amazon login is successful or not
   
    When I click on signin button 
    Then I enter email as '<Email>' on the page
    And click on continue button
    Then i enter password as '<Password>' on the page
    And click on continue button
    When i give the input to search box as '<SearchBox>' on the home page
    Then choose the product 
    And  Add to wishlist
    Then close the driver
    Examples: 
      |Email                      | Password    | SearchBox  |
      | shrryasingh1503@gmail.com |Bahubali@1503| iphone     |
      
