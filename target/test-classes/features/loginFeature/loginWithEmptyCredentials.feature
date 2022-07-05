@FLTAPS-1733
Feature: "Please fill out this field" message should be displayed if the password or username is empty

  @FLTAPS-1780
  Scenario: "Please fill out this field" message should be displayed if the password is empty
    Given  I am on the login page
    When I enter valid username "salesmanager265"
    And I click log in button
    Then I should see required field error message for empty password

  @FLTAPS-1781
  Scenario: "Please fill out this field" message should be displayed if the username is empty
    Given I am on the login page
    When I enter valid password "UserUser123"
    And I click log in button
    Then I should see required field error message for empty username