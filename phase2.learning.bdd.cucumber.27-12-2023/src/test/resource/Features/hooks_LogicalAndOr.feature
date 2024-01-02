#Author: prajwal@gmail.com

Feature: Search keyword and entering the dates

Background: 
    Given On the Homepage
    


@nonoptional @smoke @basicsearch
  Scenario: Keyword Search for the different users
    When I fill "search textbox" with "dress"
    Then I click "search button"
    Then I follow "TOP SELLERS" link
    Then She follow "TOP SELLERS" link
    Then He follow "TOP SELLERS" link
    Then User follow "TOP SELLERS" link
    
  @smoke @datetest @advancesearch 
  Scenario: Enter date in different format
  Given The date is 2012-03-01T06:54:12

