@FLTAPS-1733
Feature: As a user, I should be able to log in

  @FLTAPS-1774
  Scenario Outline: As a truck driver, I should be log in with valid credentials and land on the "Quick Launchpad" page.
    Given I am on the login page
    When I enter valid username "<username>"
    And I enter valid password "<password>"
    And I click log in button
    Then I should land on the Quick Launchpad page.

    Examples:
      | username | password    |
      | user1    | UserUser123 |
      | user2    | UserUser123 |
      | user3    | UserUser123 |
      | user4    | UserUser123 |
      | user5    | UserUser123 |
      | user196  | UserUser123 |
      | user197  | UserUser123 |
      | user198  | UserUser123 |
      | user199  | UserUser123 |
      | user200  | UserUser123 |


  Scenario Outline: As a sales manager or store manager, I should be log in with valid credentials and land on the "Dashboard" page.
    Given I am on the login page
    When I enter valid username "<username>"
    And I enter valid password "<password>"
    And I click log in button
    Then I should land on the Dashboard page.

    @FLTAPS-1775
    Examples:
      | username        | password    |
      | storemanager51  | UserUser123 |
      | storemanager52  | UserUser123 |
      | storemanager53  | UserUser123 |
      | storemanager54  | UserUser123 |
      | storemanager55  | UserUser123 |
      | storemanager246 | UserUser123 |
      | storemanager247 | UserUser123 |
      | storemanager248 | UserUser123 |
      | storemanager249 | UserUser123 |
      | storemanager250 | UserUser123 |

    @FLTAPS-1776
    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | salesmanager102 | UserUser123 |
      | salesmanager103 | UserUser123 |
      | salesmanager104 | UserUser123 |
      | salesmanager105 | UserUser123 |
      | salesmanager296 | UserUser123 |
      | salesmanager297 | UserUser123 |
      | salesmanager298 | UserUser123 |
      | salesmanager299 | UserUser123 |
      | salesmanager300 | UserUser123 |


