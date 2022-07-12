@UserStory_010
  @AppointmentsAreVisible
  Feature: Appointments and Patients
    Background: UserStory_010
      Given I am on the homepage
      And I click on menu icon
      And I select Sign in
      And I go to my pages
      And I select appointments
    Scenario Outline: Appointments
      When I select the dates as "<date1>" and as "<date2>"
      Then I validate that i see my appointments
    Examples: appointment info
      |date1     |date2     |
      |07-05-2022|07-18-2022|

  @AppointmentsNotVisible
    Scenario Outline: Appointments not visible
      When I select the dates as "<date1>" and as "<date2>"
      Then I validate that i do not see my appointments
      Examples: appointment info
        |date1     |date2     |
        |07-05-2022|07-18-2022|