#Author: prajwal@gmail.com
Feature: Testing the medicare web application API.
  	 User is testing the API of the web appication to update status of the products.

  Scenario: Update status of the product
    Given user wants to Update status of the product
    When User executes the endpoint url of the update product status
    Then user updates the product status.
    Then user validating the outcomes of status code is 200
