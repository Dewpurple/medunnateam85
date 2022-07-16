Feature: US_009
  Scenario: US_009_004_DBValidation
    Given Make connection with DB US009
    Given Run SQL query for expected data US009
    Given validate patient info from DB US009
    Then close the application US009