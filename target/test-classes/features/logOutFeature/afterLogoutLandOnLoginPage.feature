@FLTAPS-1745
  Feature: The user can log out and ends up on the login page.

    Background:
      Given I am on the login page
      And I enter valid username "storemanager51"
      And I enter valid password "UserUser123"
      And I click log in button

    @wip
    Scenario:
      When I click username on the upper-right corner
      And I click log out button
      Then I should land on login page

