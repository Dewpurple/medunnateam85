@US21Neg
Feature: US21 negative test
  Scenario: negative
    Given US6_user is on the home page
    And US21_user clicks menu and the signIn button
    And US21_user signs in with patient credentials
    When US6_user clicks Sign In Button
    And US6_user verifies user is signed on
    Then US21_user verifies Search Patient is not visible
    And US6_user clicks signout
    And US6_close the application
@US216
  Scenario: staff can view test results
    Given US6_user is on the home page
    And US21_user clicks menu and the signIn button
    And US21_user signs in with staff credentials
    Then US6_user clicks Sign In Button
    And US6_user verifies user is signed on
    And US21_user goes to search patient
    And US21_user clicks show appointments
    When US21_user clicks Show Tests
    Then US21_user clicks view results
    And US21_user verifies test results are available
    And US6_close the application
