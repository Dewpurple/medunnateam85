Feature: US_009_DP_Patient_Details
  @Api
  Scenario: US_009patientdetails
    Given Make connection with DB US009
    And user gets the "*" from "jhi_user" table where "id" equals "99802" for id
    And user gets the "*" from "jhi_user" table where "id" equals "99802" for firstname
    And user gets the "*" from "jhi_user" table where "id" equals "99802" for last name
    And user gets the "*" from "jhi_user" table where "id" equals "99802" for email
    And user gets the "*" from "jhi_user" table where "id" equals "99802" for lang_key
    And user gets the "*" from "jhi_user" table where "id" equals "99802" for ssn
    Then close the database connection 007
