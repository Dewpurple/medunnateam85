Feature: US_009
  Scenario: US_009_007StaffCanNotDeletePatient
    Given user navitages to Medunna url US009
    And user signs in as Staff US009
    And user clicks items &And Titles Page US009
    And user clicks on Patient icon. US009
    And verify delete button does not exist US009
    Then close the application US009

