#Author: prajwal@gmail.com

@SmokeTest
Feature: Facebook Login

Background: user on the facebook login page

user want to test the login functionality of the facebook web application

@SmokeTest
Scenario: verification of the unsuccessfull login of the facebook

 Given user should be on the facebook login page
    And user enters email adress
    And user enters password
    And user clicked on login button
    Then error message displayed with wrong credentials
    And user returns back on the facebook login page

