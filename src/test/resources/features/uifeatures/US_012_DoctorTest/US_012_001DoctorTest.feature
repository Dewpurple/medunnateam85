Feature: US_012DoctorTestRequest
  @regression @smoke
  Scenario: doctor_verifies_test
  Given user navitages to Medunna url US009
  When Doctor logs in US009
  And doctor clicks my pages US009
  And doctor clicks my appointment US009
  And doctor clicks edit button from my appointments page US009
  And doctor clicks a button to fill test US009
  And doctor clicks save on test US009
  And verify new test created message appears US009
    Then close the application US009