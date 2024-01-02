#Author: prjwal@gmail.com

#Feature: Amazon Home Page

@AmazonHomePage @Regression
Feature: Amazon Home Page
  User want to test the amazon home page

  @AmazonHomePageTest 
  Scenario: Amazon Home Page Title verification
    Given open the Firefox and launch the amazon application
   
    When user on the home page
    
    Then verify the title of the amazon home page
    

  @AmazonHomePageTest
  Scenario: Should not be in the homepage
    Given open the Firefox and launch the Amazon application
    
    
    When User navigates to the another page of the amazon
    Then verify the title of the amazon current page


