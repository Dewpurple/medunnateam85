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
    And user gets error message under firstname
    Then user leaves lastname blank
    And user gets error message under lastname
    Then user verifies settings saved message does not appear
    Then user clicks signout

    Examples: test data6
      |username    |password    |firstname|lastname |
      |pepper      |pepper      |tokyo    |lecasa   |
#      |BernaAdmin  |team85      |admin    |1234     |
#      |BernaAdmin  |team85      |Berna    |Team85   |
#      |alphabeta   |1234        |takim85  |doktor   |
#      |alphabeta   |1234        |Alpha    |B        |
#      |staff85     |team85hasta2|Amin     |Amen     |
#      |staff85     |team85hasta2|Amine    |Amineee  |

