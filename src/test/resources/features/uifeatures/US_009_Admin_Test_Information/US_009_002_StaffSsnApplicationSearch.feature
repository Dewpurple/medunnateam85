Feature:
  Scenario: US_009_002_StaffApplicationSearch

    Given user navitages to Medunna url
    And user signs in as Staff
    And user clicks on My Pageas
    And user clicks on Patient icon.
    And user verifies Patient SSN Search box is avalible
    And user clicks Search Patient Icon
    And user verifies all registration information is populated
    Then close the application