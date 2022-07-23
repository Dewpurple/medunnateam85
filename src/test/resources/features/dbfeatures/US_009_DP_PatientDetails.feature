Feature: US_009_DP_Patient_Details
  @Api
  Scenario: US_009patientdetails
    Given Make connection with DB US009
    And user gets the "*" from "jhi_user" table where "id" equals "99802"
    And user enters expected data and performs assertion

#    And user reads all of the "id" column data US009
#    And verify "jhi_user" table  "id" column contains the "2224"
    Then close the database connection 007
