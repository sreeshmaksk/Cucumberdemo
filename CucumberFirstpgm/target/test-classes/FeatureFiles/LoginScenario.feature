@smoke
Feature: Login Validation

@testspecial
  Scenario Outline: Validate login functionality with correct User ID and Password
    Given User opens the web application
    And User will enter the "<username>"
    And User will enter the "<password>"
    When User will click on login button
    Then user will be navigated to home page of application
    #Then user will be navigated to home page and format of application 
    

    Examples: 
      | username   | password    |
      | sreeshma   | sree@2389   |
      | sreeshma34 | sre45e@2389 |

  Scenario: Validate login functionality with incorrect User ID and Password
    Given User opens the web application
    And User will enter the username
    And User will enter the password
    When User will click on login button
    Then user will be getting the appropriate error message
    
    
    

    Scenario: Validate login functionality with blank User ID and Password
    Given User opens the web application
    And User will enter the " "
    And User will enter the " "
    When User will click on login button
    Then user will be getting the appropriate error message
    
