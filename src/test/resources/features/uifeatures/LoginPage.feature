Feature: strength level check
  @TC01 @SmokeTest
  Scenario Outline: login functionality
    Given user navigates to lending page "<url>"
    And user navigates to sign in portal
    And user clicks on sign in button
    When user provides the username as "<username>"
    And user provides the password as "<password>"
    Then user clicks on signin button
    And user verifies the page by  name
    When User provides the current "<password>"
    And User provides the "<newpassword>"
    When User provides the "<newpassword>" again as confirmation
    And User clicks on save button
    Then User verifies "Password changed" message is displayed
    Examples:
      |url|username|password|newpassword|
      |https://medunna.com|team85hasta|team85hasta|team85hasta|

  @TC02
  Scenario Outline: seven chars including one Uppercase

    Given user navigates to lending page "<url>"
    And user navigates to sign in portal
    And user clicks on sign in button
    When user provides the username as "<username>"
    And user provides the password as "<password>"
    Then user clicks on signin button
    And user verifies the page by  name
    And User provides the "<newpassword>"
    And User verifies the second_powerstrenght level
    And close the page

    Examples:
      |url|username|password|newpassword|
      |https://medunna.com|team85hasta|team85hasta|123456A|


  @TC03
  Scenario Outline: seven chars including one Uppercase and lowercase
    Given user navigates to lending page "<url>"
    And user navigates to sign in portal
    And user clicks on sign in button
    When user provides the username as "<username>"
    And user provides the password as "<password>"
    Then user clicks on signin button
    And user verifies the page by  name
    And User provides the "<newpassword>"
    And User verifies the fourth_powerstrenght level

    Examples:
      |url|username|password|newpassword|
      |https://medunna.com|team85hasta|team85hasta|12345Aa|
  @TC04
  Scenario Outline: seven chars including one Uppercase , lowercase and a special chars
    Given user navigates to lending page "<url>"
    And user navigates to sign in portal
    And user clicks on sign in button
    When user provides the username as "<username>"
    And user provides the password as "<password>"
    Then user clicks on signin button
    And user verifies the page by  name
    And User provides the "<newpassword>"
    And User verifies the fifth_powerstrenght level
    Examples:
      |url|username|password|newpassword|
      |https://medunna.com|team85hasta|team85hasta|123aaA?|


  @TC05


  Scenario Outline:  seven chars including space chars
    Given user navigates to lending page "<url>"
    And user navigates to sign in portal
    And user clicks on sign in button
    When user provides the username as "<username>"
    And user provides the password as "<password>"
    Then user clicks on signin button
    And user verifies the page by  name
    And User provides the "<newpassword>"  And User enters the newpassword with space character
    And User verifies the fifth_powerstrenght level


    Examples:
      |url|username|password|newpassword|
      |https://medunna.com|team85hasta|team85hasta|34aA/|



  @TC06

  Scenario Outline: need of at least seven chars to have a stronger password
    Given user navigates to lending page "<url>"
    And user navigates to sign in portal
    And user clicks on sign in button
    When user provides the username as "<username>"
    And user provides the password as "<password>"
    Then user clicks on signin button
    And user verifies the page by  name
    And User provides the "<newpassword>"
    And User verifies the powerstrenght level
    And User cleans the newpassword
    And user enters the seven character "<newpassword1>"



    Examples:
      |url|username|password|newpassword|newpassword1|
      |https://medunna.com|team85hasta|team85hasta|12Aa?3|123Aa?3|






