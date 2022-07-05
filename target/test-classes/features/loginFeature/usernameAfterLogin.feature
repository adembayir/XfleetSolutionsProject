@FLTAPS-1733
Feature: All users should see their own usernames in the profile menu, after successful login

  @FLTAPS-1786
  Scenario Outline: As a user, i should see my username in the profile menu, after successful login
    Given I am on the login page
    When I enter valid username "<username>"
    And I enter valid password "<password>"
    And I click log in button
    Then I should see my username "<username>" on the upper right corner of the page.

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | user2           | UserUser123 |
      | user3           | UserUser123 |
      | user4           | UserUser123 |
      | user5           | UserUser123 |
      | user6           | UserUser123 |
      | user7           | UserUser123 |
      | user8           | UserUser123 |
      | user9           | UserUser123 |
      | user10          | UserUser123 |
      | storemanager51  | UserUser123 |
      | storemanager52  | UserUser123 |
      | storemanager53  | UserUser123 |
      | storemanager54  | UserUser123 |
      | storemanager55  | UserUser123 |
      | storemanager56  | UserUser123 |
      | storemanager57  | UserUser123 |
      | storemanager58  | UserUser123 |
      | storemanager59  | UserUser123 |
      | storemanager60  | UserUser123 |
      | salesmanager101 | UserUser123 |
      | salesmanager102 | UserUser123 |
      | salesmanager103 | UserUser123 |
      | salesmanager104 | UserUser123 |
      | salesmanager105 | UserUser123 |
      | salesmanager106 | UserUser123 |
      | salesmanager107 | UserUser123 |
      | salesmanager108 | UserUser123 |
      | salesmanager109 | UserUser123 |
      | salesmanager110 | UserUser123 |