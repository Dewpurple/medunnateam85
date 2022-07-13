#Feature: US_002_InvalidUsername_Test
#
#  @Registration
#    @InvalidUsernameTest
#  Scenario Outline: Invalid username test
#    Given user navigates to medunna url
#    And user clicks on account menu button
#    And user selects {string} in the dropdown
#    And user scrolls down to username textbox
#    When user provides username as "<username>"
#    Then user validates error message
#    Examples: username data
#    |username|
#    |c s     |
