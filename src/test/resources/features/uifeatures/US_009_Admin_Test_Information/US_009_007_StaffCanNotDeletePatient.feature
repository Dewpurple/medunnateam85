Feature: US_009
  Scenario: US_009_007StaffCanNotDeletePatient
    Given user navitages to Medunna url
    And user signs in as Staff
    And user clicks items &And Titles Page
    And user clicks on Patient icon.
    And verify delete button does not exist
    Then close the application

