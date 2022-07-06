@US6
Feature: User info segment

  @UserSignIn
  Scenario Outline: user info segment
Given user is on the home page
Then user clicks menu
And user clicks the signIn button
And user types in username as "<username>"
And user types in password as "<password>"
Then user clicks Sign In Button
And user verifies user is signed on

    Examples: user login data
    |username   |password |
    |pepper |pepper |


@UserSettings
 Scenario: user settings
  Given user goes to user menu
  Then user clicks settings button
  And user verifies user is on settings page
  Then user verifies name matches name on account
  And user verifies email is populated




@UserEdits
  Scenario Outline: user updates
  Then user edits first name to "<firstname>"
  And user updates last name to "<lastname>"
  Then user clicks save button
  And settings saved message appears
  Then user verifies updated first name "<firstname>" is displayed
  Then user verifies updated last name "<lastname>" is displayed


    Examples: test data6
    |firstname|lastname|
    |name1    |lastname1|

