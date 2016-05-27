Feature: Sign in

  Background:
    Given I am on the sign in page
    And I am not signed in

  @login
  Scenario: Invalid login fails
    When I enter incorrect credentials
    And I try to sign in
    Then Invalid login message is displayed
    And I am not signed in

  @login
  Scenario Outline: Invalid logins fail
    When I enter <username> as username
    And I enter <password> as password
    And I try to sign in
    Then Invalid login message is displayed
    And I am not signed in

    Examples:
    | username  | password  |
    | username1 | passwrod1 |
    | username2 | password2 |


  Scenario: Correct login passes
    When I enter correct credentials
    And I try to sign in
    Then I am signed in