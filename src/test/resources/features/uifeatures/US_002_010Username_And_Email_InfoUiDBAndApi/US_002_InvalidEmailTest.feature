#Feature: US_002_InvalidEmail_Test
#  @Registration
#   @InvalidEmailTest
#    Scenario Outline: Invalid email
#     Given user navigates to medunna url
#     And user clicks on account menu button
#     And user clicks on {string} in the dropdown
#     And user scrolls down to email textbox
#     When user provides valid email as "<email>"
#     Then user validates "Your email is required." message
#    Examples: email data
#    |email|
#    |      |