Feature: US_009
  Scenario: US_09_007
    Given user navitages to Medunna url
    And user signs in as Staff
    And user clicks items &And Titles Page
    And user clicks on Patient icon.
    And user clicks edit box
    And Admin performs edits to all patient information
    And Admin clicks on Save button
    And Verify edit is saved successfully
    Then close the application

