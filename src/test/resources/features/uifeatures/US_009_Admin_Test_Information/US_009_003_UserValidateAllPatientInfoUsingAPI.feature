Feature: US_009_UserValidationPatientInfoAPI
  Scenario: 003_ValidationPatientInfoAPI
    Given User sets the expected data for patient info
    And user navitages to Medunna url
    And user signs in as Staff
    And user clicks on My Pageas
    And user clicks Search Patient Icon
    And user enters SSN from config prop
    And User validates Patient Info using API
    Then close the application