@Login
Feature: Login

  @User
  Scenario: User login scenario
    Given User is on the login page
    When User logs in as user with valid credentials
    Then User should see Account summary page


  @UsersOutline
  Scenario Outline: Users login scenario
    Given User is on the login page
    When User input wrong username  "<username>" the login page
    When User input wrong password "<password>" in the login page
    Then User should see error message

    Examples: example test data for wikipedia search
      | username     | password |
      | qwerty       | qwerty   |
      | qwerty       | password |
      | username     | qwerty   |
      |              | password |
      | username     |          |

