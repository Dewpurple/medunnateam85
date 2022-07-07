@US6Pos
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
  And user verifies email is populated


  Then user edits first name to "<firstname>"
  And user updates last name to "<lastname>"
  Then user clicks save button
  And settings saved message appears
#  Then user verifies updated first name "<firstname>" is displayed
#  Then user verifies updated last name "<lastname>" is displayed
  Then user clicks signout
   Then close the application

    Examples: test data6
      |username    |password    |firstname|lastname |
      |pepper      |pepper      |tokyo    |lecasa   |
      |BernaAdmin  |team85      |admin    |1234     |
#      |BernaAdmin  |team85      |Berna    |Team85   |
#      |alphabeta   |1234        |takim85  |doktor   |
#      |alphabeta   |1234        |Alpha    |B        |
#      |staff85     |team85hasta2|Amin     |Amen     |
#      |staff85     |team85hasta2|Amine    |Amineee  |







