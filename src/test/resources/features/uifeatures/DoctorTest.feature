Feature: US_012DoctorTestRequest
  Scenario: doctor_verifies_test
    Given Admin navitages to Medunna url
  When Admin navitages to Medunna url
  And Admin navigates to the sign in page
  And Admin signs in
  And Admin clicks on "MyPages"
  And Admin clicks on "Patient" icon.
  And Admin finds "edit" button and clicks it
  And Admin performs edits to all patient information
  And Admin clicks on Save button
  And Verify edit is saved successfully
