@US21
  Feature: Staff on patient appointments
    Background:
      Given US6_user is on the home page
      And US21_user clicks menu and the signIn button
      And US21_user signs in with staff credentials
      Then US6_user clicks Sign In Button
      And US6_user verifies user is signed on
      Then US21_user searches for patient with "ssn"
      And US21_user clicks show appointments
      When US21_user clicks edit

      Scenario: updating appt date
      And US21_user changes date to ten days later
      Then US21_clicks save and verifies it's updated
      And US6_close the application







