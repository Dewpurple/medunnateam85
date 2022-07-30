Feature: US_009_001EditTest

  Scenario: Edit test information
    Given user navitages to Medunna url US009
    When Admin navigates to the sign in page US009
    And Admin signs in US009
    And Admin clicks on Items and Titles US009
    And Admin clicks on Patient icon. US009
    And Admin finds edit button and clicks it US009
    And Admin performs edits to all patient information US009
    And Admin clicks on Save button US009
    And Verify edit is saved successfully US009
    Then close application US009