#Author: prajwal.xxx@your.domain.com

@FeatureTest
Feature: Add to the cart

This feature will test functionality of adding the different products to the user cart

Background: User is Loginned to the account of the online shopping website


  @AddToCart
  Scenario: Searching a product and add the first product to the user cart
    Given User search the product the "Redmi Mobile"
    When Add the Redmi Mobile product to the cart as it displays
    And user clicks on the carts icon
   
    Then user cart should display the added Redmi Mobile item
   

  
