#Author: prajwal@gmail.com
Feature: Testing the Tagged Hooks
 
@FirstTag
Scenario: This is First Scenario

Given Open the chrome browser
When user on the home page of the amazonPage
Then validating the current page url
 
@SecondTag
Scenario: This is Second Scenario

Given Open the chrome browser
When user on the home page of the flipkart
Then validating the current page url
 
@ThirdTag
Scenario: This is Third Scenario

Given Open the chrome browser
When user on the home page of the facebook
Then validating the current page url

@FourthTag
Scenario: This is Fourth Scenario

Given Open the chrome browser
When user on the home page of the simplilearn
Then validating the current page url


