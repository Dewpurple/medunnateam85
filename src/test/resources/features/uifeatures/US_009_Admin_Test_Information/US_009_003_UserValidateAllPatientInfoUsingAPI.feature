Feature: US_009_UserValidationPatientInfoAPI
  Scenario: 003_ValidationPatientInfoAPI
    And user navitages to Medunna url US009
    And user signs in as Staff US009
    And user clicks on My Pageas US009
    And user clicks Search Patient Icon US009
    And user enters SSN from config prop US009
    And user clicks edit box US009
    And  User sets the expected data for patient info and Validates US009
    Then close the application US009