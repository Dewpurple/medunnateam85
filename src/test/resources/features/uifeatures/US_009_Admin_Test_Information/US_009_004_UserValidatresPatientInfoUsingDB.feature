Feature: US_009
  Scenario: US_009_004_DBValidation
    Given Make connection with DB
    Given Run SQL query for expected data
    Given validate patient info from DB
        Then close the application