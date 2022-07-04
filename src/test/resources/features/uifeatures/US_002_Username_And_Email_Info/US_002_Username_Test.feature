Feature: US_002_Username_Test

  @Registration
    @UsernameTest
 Scenario Outline: User name info
    Given user navigates to medunna url
    Then user hovers over to "register" button
    And user selects "register" in the dropdown
    When user types in  valid username as "<string>"
    Then user continues to next "email" textbox
    Examples: username data
    |valid username|
    |cselcuk|

   @Registration
     @InvalidUsernameTest
    Scenario Outline: Invalid username test
     Given user navitages to Medunna url
     Then user hovers over to "register" button
     And user selects "register" in the dropdown
     When user types in invalid username as "<invalid username>"
     Then user validates "Your username is invalid." message
     Examples: invalid username data
     |invalid username|
     |c s             |


