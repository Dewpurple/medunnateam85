@US21
  Feature: Staff on patient appointments
    Scenario:
      Given US6_user is on the home page
      And US21_user clicks menu and the signIn button
      And US21_user enters staff credentials
      Then US6_user clicks Sign In Button
      And US6_user verifies user is signed on

