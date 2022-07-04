@US6
Feature: User info segment

  @UserSignIn
  Scenario Outline: user info segment
Given user is on the home page
And user clicks the signIn button
And user types in username as "<username>"
And user types in password as "<password>"
Then user clicks Sign In Button
And user verifies user is signed on

    Examples: user login data
    |username   |password |
    |team85hasta|team85hasta |


@UserSettings
 Scenario Outline: user settings
  Given user is on user page
  Then user clicks settings button
  And user verifies user is on settings page
  Then user verifies first name matches "<firstname>"
  And user verifies last name matches "<lastname>"
  And user verifies email matches "<email>"

  Examples: user information
  |firstname|lastname|email|
  |         |        |     |



@UserEdits
  Scenario Outline: user updates
  Then user edits first name to "<firstname1>"
  And user updates last name to "<lastname1>"
  Then user clicks save button
  And settings saved message appears
  Then user verifies updated first name "<firstname1>" is displayed
  Then user verifies updated last name "<lastname1>" is displayed


    Examples: test data6
    |firstname|lastname|
