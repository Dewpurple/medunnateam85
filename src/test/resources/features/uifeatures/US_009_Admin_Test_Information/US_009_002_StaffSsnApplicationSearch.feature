Feature:
  Scenario: US_009_002_StaffApplicationSearch

    Given user navitages to Medunna url US009
    And Admin navigates to the sign in page US009
    And user signs in as Staff US009
    And user clicks on My Pageas US009
    And user clicks on Patient icon. US009
    And user verifies Patient SSN Search box is avalible US009
    And user clicks Search Patient Icon US009
    And user enters patient ssn number
    And user verifies all registration information is populated US009
    Then close the application US009