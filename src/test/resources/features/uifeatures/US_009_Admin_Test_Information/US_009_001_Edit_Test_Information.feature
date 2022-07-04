Feature: US_009_001EditTest
  Scenario: Edit test information
    Given user navitages to Medunna url
  When Admin navigates to the sign in page
  And Admin signs in
  And Admin clicks on Items and Ti
  And Admin clicks on "Patient" icon.
  And Admin finds "edit" button and clicks it
  And Admin performs edits to all patient information
  And Admin clicks on Save button
  And Verify edit is saved successfully
    Then close application