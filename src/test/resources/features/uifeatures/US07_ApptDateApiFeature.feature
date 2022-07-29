@US7Api
Feature: appt date api
  @appointments
  Scenario: api
    Given US7_user generates token
    Then US7_user deserializes the appointment data to java
    And US7_user enters the expected data
    And US7_user sends a post request for appointment data
    Then US7_user saves the user's data to correspondent files
    Then US7_user makes assertions

