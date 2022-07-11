Feature: US012_DoctorTestsIncludeTheFollowingItems
  Scenario: US012_002
    Given user navitages to Medunna url US009
    Given Doctor logs in
    Given doctor clicks my pages
    Given doctor clicks my appointment
    Given doctor clicks edit button from my appointments page
    Given verify new test contains the expected information
    Then close the application