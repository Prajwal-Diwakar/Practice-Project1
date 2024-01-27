#Author: prajwal@gmail.com
Feature: Testing the medicare web application API.
  	 User is testing the API of the web appication to add the products.

  Scenario: Add the product
    Given user wants to add the products
    When User executes the endpoint url of the adding product page
    Then user adds the products.
    Then validate the outcomes of status code is 200
