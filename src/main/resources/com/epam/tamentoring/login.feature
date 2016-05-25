Feature: Sign in

  Background:
    Given I am on the sign in page
    And I am not signed in

  Scenario: Invalid login fails
    When I enter incorrect credentials
    And I try to sign in
    Then Invalid login message is displayed
    And I am not signed in

  Scenario: Correct login passes
    When I enter correct credentials
    And I try to sign in
    Then I am signed in