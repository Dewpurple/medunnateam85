Feature: US_009
  Scenario: US_09_006
    Given user navitages to Medunna url
    And user signs in as admin
    And user clicks items &And Titles Page
    And Admin clicks on Patient icon.
    And user verifies delete button is available
    Then close the application