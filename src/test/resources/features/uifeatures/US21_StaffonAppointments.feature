@US21
  Feature: Staff on patient appointments
    Background:
      Given US6_user is on the home page
      And US21_user clicks menu and the signIn button
      And US21_user signs in with staff credentials
      Then US6_user clicks Sign In Button
      And US6_user verifies user is signed on
      And US21_user goes to search patient
      Then US21_user searches for patient with "ssn"
      And US21_user clicks show appointments


    Scenario: updating appt date
      When US21_user clicks edit
      And US21_user changes date to ten days later
      Then US21_clicks save and verifies it's updated
      And US6_user clicks signout
      And US6_close the application
@regression
    Scenario: clickable statuses
      When US21_user clicks edit
      Then US21_user verifies UNAPPROVED is selectable
      Then US21_user verifies PENDING is selectable
      Then US21_user verifies CANCELLED is selectable
      And US6_user clicks signout
      And US6_close the application
@regression
    Scenario: COMPLETED status
      When US21_user clicks edit
      Then US21_user verifies COMPLETED is not selectable
      And US6_user clicks signout
      And US6_close the application
@regression
    Scenario: blank fields - not required
      When US21_user clicks edit
      When US21_user leaves anamnesis blank
      And US21_user leaves treatment blank
      And US21_user leaves diagnosis blank
      Then US21_clicks save and verifies it's updated
      And US6_user clicks signout
      And US6_close the application
@US215
    Scenario: selecting dr
      When US21_user clicks edit
      When US21_user selects a doctor
      Then US21_clicks save and verifies it's updated
      And US6_user clicks signout
      And US6_close the application










