Feature: US_012DoctorTestRequest
  Scenario: doctor_verifies_test
  Given user navitages to Medunna url
  When Doctor logs in
  And doctor clicks my pages
  And doctor clicks my appointment
  And doctor clicks edit button from my appointments page
  And doctor clicks a button to fill test
  And doctor clicks save on test
  And verify new test created message appears
    Then close the application