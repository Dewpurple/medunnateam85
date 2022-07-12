Feature: appt date api
  @Api
  @US7Api
  Scenario:
    Given user sends a get request for appointment data
    And user deserializes the appointment data to java
    Then user saves the user's data to correspondent files and validates
