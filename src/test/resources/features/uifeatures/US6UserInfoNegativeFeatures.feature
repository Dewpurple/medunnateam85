@US6Neg
Feature: User info segment
  Background:
    Given user is on the home page
    Then user clicks menu
    And user clicks the signIn button

  Scenario Outline: user info segment
    And user types in username as "<username>"
    And user types in password as "<password>"
    Then user clicks Sign In Button
    And user verifies user is signed on

    Given user goes to user menu
    Then user clicks settings button
    And user verifies user is on settings page
    Then user verifies name matches name on account


    Then user leaves firstname blank
    Then user clicks save button
    And user gets error message under firstname
    Then user leaves lastname blank
    Then user clicks save button
    And user gets error message under lastname
    Then user clicks signout
    Then close the application

    Examples: test data6
      |username    |password  |
      |pepper      |pepper    |
#      |BernaAdmin  |team85      |
#      |BernaAdmin  |team85      |
#      |alphabeta   |1234        |
#      |alphabeta   |1234        |
#      |staff85     |team85hasta2|
#      |staff85     |team85hasta2|
