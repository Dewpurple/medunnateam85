@makeAppointmentPage
Feature: Make_An_Appointment
  Scenario Outline:make_appoinment_page
    Given User Go to Medunna home page
    Then User verifies if the Make an appointment button exits.
    When User clicks on the Make an Appointment button.
    Then User fill name with correct credential "<firstName>"
    And User fill lastname with correct credential  "<lastName>"
    And User fill email with correct credential "<email>"
    And User fill phone number with correct credential "<phoneNumber>"
    And User fill SSN Number with correct credential "<ssnNumber>"
    Examples:
      |firstName|lastName|email|phoneNumber|ssnNumber|
      |Patient  |Patient |patient_patient@hotmail.com|324-345-5678|555-88-3234|