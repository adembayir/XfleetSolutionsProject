Feature: User can see "Remember Me" link exists and is clickable on the login page

  @FLTAPS-1783
  Scenario: As a user, i should be able to see "Remember Me" link exists and is clickable on the login page
    Given I am on the login page
    Then I can see Remember Me link exists and is clickable
