@Api
Feature: appt date api
  @appointments
  Scenario:
    Given US7_user generates token
    And US7_user sends a get request for appointment data
    When US7_user deserializes the appointment data to java
    Then US7_user saves the user's data to correspondent files
    Then US7_user makes assertions