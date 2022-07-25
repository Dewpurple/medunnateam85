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