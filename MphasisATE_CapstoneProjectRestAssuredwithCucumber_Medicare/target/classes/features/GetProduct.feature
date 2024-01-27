#Author: prajwal.diwakar@your.domain.com
Feature: Testing the medicare web application API.
  	 User is testing the API of the web appication to get the list of all the products.

  @Restfull @smoketest
  Scenario: Retrieve the list of all products in the store
    Given user wants to get the list of all products in the store
    When User executes the endpoint url of the get product page
    Then user gets the all the products in the store.
    Then the request response has a 200 response code
