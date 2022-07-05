@FLTAPS-1745
  Feature: The user can log out and ends up on the login page.

    Background:
      Given I am on the login page
      And I enter valid username
      And I enter valid password
      And I click log in button

    @FLTAPS-1823
    Scenario:
      When I click username on the upper-right corner
      And I click log out button
      Then I should land on login page

