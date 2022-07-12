Feature: US_010_DoctorsAppointment
  @Appointment
   @DoctorsAppointmentVisibility
    Scenario Outline: Doctors appointment visibility
    Given doctor navigates to medunna url
    And doctor clicks on account menu button
    And doctor clicks on "Sign in"
    And doctor provides username as "<username>"
    And doctor provides password as "<password>"
    And doctor clicks on "Sign in"
    And doctor clicks my pages
    When doctor clicks my appointment
    Then doctor validates that appointments page opens
   Examples: username and password
   |username|password|
   |doctor79|doctor  |
