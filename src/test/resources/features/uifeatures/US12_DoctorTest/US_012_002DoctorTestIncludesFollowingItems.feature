Feature: US012_DoctorTestsIncludeTheFollowingItems
  @regression @smoke
  Scenario: US012_002
    Given user navitages to Medunna url US009
    Given Doctor logs in US009
    Given doctor clicks my pages US009
    Given doctor clicks my appointment US009
    Given doctor clicks edit button from my appointments page US009
    Given verify new test contains the expected information US009
    Then close the application US009

    # Glucose, Urea, Creatinine, Sodium
    # Potassium, Total protein, Albumin, Hemoglobin