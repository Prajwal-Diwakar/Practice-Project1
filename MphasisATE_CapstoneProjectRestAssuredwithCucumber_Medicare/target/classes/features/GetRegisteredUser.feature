#Author: prajwal@gmail.com
Feature: Testing the medicare web application API.
  	 User is testing the API of the web appication to get the list of all the registered users.

  
  Scenario: Retrieve the list of all registered users
    Given user wants to get the list of all regsitered users
    When User executes the endpoint url of the get user page
    Then user gets the all the registered users.
    Then validate the outcomes status code is 200
