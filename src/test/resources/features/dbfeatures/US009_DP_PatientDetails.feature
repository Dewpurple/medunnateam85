Feature: US_009_DP_Patient_Details
  @api2
  Scenario: US_009patientdetails
    Given Make connection with DB US009
    And user gets the "*" from "jhi_user" table
    # select * from jhi_user
    And user gets the data
    And verify "jhi_user" table contains the expected data
