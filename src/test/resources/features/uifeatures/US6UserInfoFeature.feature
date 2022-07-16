@US6Pos
Feature: User info segment
Background:
  Given US6_user is on the home page
  Then US6_user clicks menu
  And US6_user clicks the signIn button on user settings

  Scenario Outline: user info segment
  And US6_user types in username as "<username>"
  And US6_user types in password as "<password>"
  Then US6_user clicks Sign In Button
  And US6_user verifies user is signed on

  Given US6_user goes to user menu
  Then US6_user clicks settings button
  And US6_user verifies user is on settings page
  Then US6_user verifies name matches name on account
  And US6_user verifies email is populated


  Then US6_user edits first name to "<firstname>"
  And US6_user updates last name to "<lastname>"
  Then US6_user clicks save button
  And US6_settings saved message appears
  Then user verifies updated first name "<firstname>" is displayed
  Then US6_user verifies updated last name "<lastname>" is displayed
  Then US6_user clicks signout
   Then US6_close the application

    Examples: test data6
      |username    |password    |firstname|lastname |
      |pepper      |pepper      |tokyo    |lecasa   |
#      |BernaAdmin  |team85      |admin    |1234     |
#      |BernaAdmin  |team85      |Berna    |Team85   |
#      |alphabeta   |1234        |takim85  |doktor   |
#      |alphabeta   |1234        |Alpha    |B        |
#      |staff85     |team85hasta2|Amin     |Amen     |
#      |staff85     |team85hasta2|Amine    |Amineee  |







