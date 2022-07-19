Feature: US_009_API_PatientInformation
  @api2
  Scenario: US_009_api
    Given as a user, I generate the token US009
#    And user defines expected results
    And user gets actual results
    And user makes account data request US028
    When user deserializes the acount data US028
    Then user runs assertion against expected and actual

