#Author: prajwal@gmail.com
Feature: Testing the medicare web application API.
  	 User is testing the API of the web appication to update the products.

  Scenario: update the product
    Given user wants to update the products
    When User executes the endpoint url of the update product page
    Then user updates the products.
    Then user validates the outcomes of status code is 200
