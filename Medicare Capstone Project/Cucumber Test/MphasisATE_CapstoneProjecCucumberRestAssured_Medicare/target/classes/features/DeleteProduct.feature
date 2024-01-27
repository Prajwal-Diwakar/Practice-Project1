#Author: prajwal@gmail.com
Feature: Testing the medicare web application API.
  	 User is testing the API of the web appication to delete the products.

  Scenario: Delete the product
    Given user wants to delete the products
    When User executes the endpoint url of the delete product page
    Then user deletes the products.
    Then user will validate the outcomes of status code is 200
