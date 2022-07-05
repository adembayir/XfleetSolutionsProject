@FLTAPS-1733
Feature: User land on the ‘Forgot Password’ page after clicking on the "Forgot your password?" link
  @FLTAPS-1782
  Scenario: As a user, i should land on the ‘Forgot Password’ page after clicking on the "Forgot your password?" link.
    Given I am on the login page
    When I click Forgot your password? link.
    Then I should land on the Forgot Password page