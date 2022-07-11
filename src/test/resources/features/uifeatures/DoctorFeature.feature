Feature: Test doctor data

@SignIn_page
Scenario Outline:  test doctor data

  Given The doctor go to URL
  Then The doctor click Sign-in page
  And verify to Sign-in page.

  And the doctor enters a username as "<username>"
  And the doctor enters a password as "<password>"
  Then click the Sign-in button
  Then Verify to Sign-on the web side


  Examples: doctor data
    |username|password|
    |doctor79|doctor  |







