#Author: prajwal@gmail.com



@ProductSearch
Feature: Searching Products in Amazon
  user wants to test the searching of the multiple products.

  @ProductSearch
  Scenario: Verification of the search button to search the multiple products
    Given open the firefox and launch the amazon application
    
    When Enter the Product search
      | name                            | title                                |
      | Samsung Galaxy S23 Ultra        | Amazon.in : Samsung Galaxy S23 Ultra |
      | Dell Laptop                     | Amazon.in : Dell Laptop              |
      | Lenovo Laptop                   | Amazon.in : Lenovo Laptop            |
    Then Submit Search for the product
    And Clear search