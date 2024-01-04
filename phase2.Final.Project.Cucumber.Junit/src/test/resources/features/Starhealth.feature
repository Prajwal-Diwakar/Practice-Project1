#Author: prajwal@gmail.com
Feature: Starhealth Application

  @starhealth
  Scenario Outline: Validate the Star Health Buy Now flow
    Given User launches the Star Health application with "<URL>"
    Then User waits for the Welcome to Star Health pop-up and closes it
    Then User validates the Star Health home page title using a JUnit assertion
    When User clicks on the Buy Now button
    Then User types Name as "<FullName>"
    Then User types Phone as "<PhNo>"
    Then user types the email address as "<Email>"
    Then User types the PIN as "<PIN>"

    Examples: 
      | URL                        | FullName | Email              | PhNo       | PIN    | optionPlan |
      | https://www.starhealth.in/ | demouser | demouser@gmail.com | 9111111111 | 224001 | My Family  |

  @starhealth
  Scenario: Validate the dropdown plans
    Given User is again launches the Star Health application with "<siteURL>"
    Then User clicks on I need health insurance from the dropdown menu
    When User selects the option
    Then User sees the Plan for My Family page
    Then User clicks on the Star Health logo
    Then The Application should redirect to the home page
    When User closes the child tab
    Then User navigates back to the parent tab
    
     Examples: 
      | siteURL                    |
      | https://www.starhealth.in/ |
