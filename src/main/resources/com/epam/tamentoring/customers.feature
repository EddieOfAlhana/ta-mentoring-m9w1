Feature: List, search, and update customers

  Background:
    Given I am on the customers page

  Scenario: Search for customer
    When I search for 'Around the Horn'
    Then The 'Around the Horn' is in the search result list

  Scenario: Edit customer
    When I choose to edit customer
    Then The edit customer form appears