Feature: User should experience the 'Enter' key of the keyboard is working correctly on the login page.
  @FLTAPS-1785
  Scenario: 'Enter' key should working correctly on login page.
    Given I am on the login page
    When I enter valid username "user1", press Enter, enter valid password "UserUser123", press Enter
    Then I should land on the Quick Launchpad page.