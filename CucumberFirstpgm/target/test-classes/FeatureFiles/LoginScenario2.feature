Feature: Validating different modules of Ecommerce application.

  Background: Login functionality
    Given User opens the web application
    And User will enter the username
    And User will enter the password
    When User will click on login button
    Then user will be navigated to home page of application

  Scenario: Validate Add to cart
    And the user will then go to add to cart section

  Scenario: update my favourites
    And the user will then go to  my favourite section

  Scenario: change user settings
    And the user will then go to user settings section
