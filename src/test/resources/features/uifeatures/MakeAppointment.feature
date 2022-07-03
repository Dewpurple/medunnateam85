@makeAppointmentPage
Feature: Make_An_Appointment



  @Appointment
  Scenario Outline:make_appoinment_page
    Given User Go to Medunna home page
    Then User verifies if the Make an appointment button exits.
    When User clicks on the Make an Appointment button.
    Then User fill name with correct credential "<firstName>"
    And User fill lastname with correct credential  "<lastName>"
    And User fill email with correct credential "<email>"
    And User fill phone number with correct credential "<phoneNumber>"
    And User fill SSN Number with correct credential "<ssnNumber>"
    And user fills in the date as "<date>"
    Then user validates the appointment
    Examples:
      |firstName|lastName|email|phoneNumber|ssnNumber|date|
      |Patient1  |Patient21 |patient_patient1@hotmail.com|324-345-3564|555-88-362|05-11-2025|


    Scenario: navigation scenario
      Given user navigates to registration page


  Scenario Outline: test registrant data
    Given user provides ssn as "<ssn>"
    And user types in first name as "<firstname>"
    And user also types in lastname as "<lastname>"


    When user provides a valid password as "<password>"
    And user confirms valid password as "<confirmpassword>"
    Then user rgisters and saves the data


    Examples: test dat5a
      |ssn|firstname|lastname|password|confirmpassword|
      |324-345-3564|Patient1 |Patient21|Asdfgh12345?|Asdfgh12345?|

