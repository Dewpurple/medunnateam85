Feature: appointments test with api
  @api2
  Scenario: appointments test for get request

    Given as a user, I generate the token US028
    And user makes appointment data request US028
    When user deserializes the appointments data US028
    Then user savves the appointments data into correspondent files US028

