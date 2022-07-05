@FLTAPS-1733
Feature: User should see the password in bullet signs by default
  @FLTAPS-1784
  Scenario: As a user, I see the password in bullet signs by default
    Given I am on the login page
    When I enter valid password "UserUser123"
    Then I can see password is in bullet sign