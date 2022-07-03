Feature: "Invalid username or password." should be displayed for invalid (valid username-invalid password and invalid username-valid password) credentials

  @FLTAPS-1777
  Scenario: Both invalid username and invalid password are entered.
    Given I am on the login page
    When I enter invalid username "1user1"
    And I enter invalid password "userUser123"
    And I click log in button
    Then "Invalid user name or password." message should be displayed.


  @FLTAPS-1778
  Scenario: Valid username and invalid password are entered.
    Given I am on the login page
    When I enter valid username "storemanager57"
    And I enter invalid password "Useruser123"
    And I click log in button
    Then "Invalid user name or password." message should be displayed.

  @FLTAPS-1779
  Scenario: Invalid username and valid password are entered.
    Given I am on the login page
    When I enter invalid username "salesmanager301"
    And I enter invalid password "UserUser123"
    And I click log in button
    Then "Invalid user name or password." message should be displayed.