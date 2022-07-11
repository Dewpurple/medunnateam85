@US04webpage
Feature: Login for common users


  @TC_00111111
  Scenario Outline: Happy scen1

    Given the doctor go to url
    Then The doctor click sign in page
    And Verify sign in page
    Then Doctor enters the username as "<username>"
    Then Doctor enters the  password as "<password>"
    And click checkbox Remember me
    And click the Sign In button
    And Verify to sign-on the web side


    Examples: all data
      |username|password|
      |doctor79|doctor  |





  @TC_0022222
  Scenario Outline:  happy scen2

    Given the doctor go to url
    Then The doctor click sign in page
    And Verify sign in page
    Then Doctor enters the username as "<username>"
    Then Doctor enters the invalid password as "<invalid_password>"
    And click the Sign In button
    And Verify failed to sign in
    Then If the user forgets password, click Did you forget your password button.
    Then Verify Reset your password
    And  enter the email adress as "<email_address>"
    And Click reset password
    And Verify success message

    Examples: happy scen data
      |email_address     |invalid_password|
      |doctor79@gmail.com|doctor4|


  @TC_0033333
  Scenario Outline:  negative scen1

    Given the doctor go to url
    Then The doctor click sign in page
    And Verify sign in page
    Then Doctor enters the invalit username as "<invalid_username>"
    Then Doctor enters the invalid password as "<invalid_password>"
    And click the Sign In button
    And Verify failed to sign in
    Then click cancel button

    Examples: neg scen data
      |invalid_username|invalid_password|
      |doctor55        |doctor4         |



  @TC_00444444
  Scenario Outline: :  negative scen2

    Given the doctor go to url
    Then The doctor click sign in page
    And Verify sign in page
    Then Doctor enters the invalit username as "<invalid_username>"
    Then Doctor enters the invalid password as "<invalid_password>"
    And click the Sign In button
    And Verify failed to sign in
    Then click cancel button

    Examples: neg scen data
      |invalid_username|invalid_password|
      |doctor55        |doctor4         |
