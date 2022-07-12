@UserStory_010
  Feature: Appointments and Patients
    Background: UserStory_010
      Given I am on the homepage us10
      And I click on menu icon us10
      And I click on sign in button us10
      And I provide username and password
      |username|password|
      |doctor79|doctor  |
      And I click on  Sign in
      And I go to my pages
      And I select appointments
    @AppointmentsAreVisible
    Scenario Outline: Appointments
      When I type in the date in from as "<from>"
      And I type in the date in to as "<to>"
      Then I validate that i see my appointments
    Examples: appointment info
      |from      |to        |
      |07-05-2022|07-18-2022|

  @AppointmentsNotVisible
    Scenario Outline: Appointments not visible
       When I type in the date in from as "<from>"
       And I type in the date in to as "<to>"
      Then I validate that i do not see my appointments
      Examples: appointment info
        |from      |to        |
        |07/21/2022|07/28/2022|

  @PatientInfoVisible
    Scenario Outline : Visible patient info
       When I type in the date in from as "<from>"
       And I type in the date in to as "<to>"
       Then I validate that patients info are visible
    Examples: appointment info
      |from      |to        |
      |07-05-2022|07-18-2022|