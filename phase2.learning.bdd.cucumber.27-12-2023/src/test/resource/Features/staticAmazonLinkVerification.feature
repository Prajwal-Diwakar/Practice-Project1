#Author: prajwal@gmailcom

@LinkTest
Feature: Amazon Link test
  User wants to test the amazon different category link pages

  @LinkTest
  Scenario: verification of the Amazon link page
    Given open the Firefox and launch the Amazon application
    
    When user on the home page of the amazon
    And navigate to the other category link
    
    Then validate the current page url
    
     @LinkTest
  Scenario: verification of the another Amazon link page
    Given open the Firefox and launch the Amazon application
    
    When user on the home page of the amazon
    And navigate to the another category link
    
    Then validate the current another page url
    
    

  
