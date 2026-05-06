@table
Feature: Validate data table

  Scenario: Validate login functionality with correct User ID and Password
    Given User opens the HRM web application
    When User will enter the credentials
      | sreeshmakhj | sk123@gma | sreeshmaS |
    Then User will be submitting the form.
