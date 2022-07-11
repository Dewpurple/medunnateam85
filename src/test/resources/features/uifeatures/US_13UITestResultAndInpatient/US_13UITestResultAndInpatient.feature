@13UITestResultAndInpatient
Feature:
  @13_01_TestResult
  Scenario Outline: Doctor see Test Result
    Given user navitages to Medunna url
    When user is on the home page
    And user clicks the signIn button
    And user provide valid username "<username>" and "<password>"
    Then user clicks Sign In Button
    Then user clicks on MY Pages
    And user clicks on My Appointment button
    And user clicks on Edit button
    When user clicks on Show Test Results button
    And user  clicks on View Result button
    Then user verifies all test information
    And user clicks on Sign out button
    And user close the application

    Examples:Doctor see test results
      |username|password|
      |doctorcennet|1234|

  @13_02_RequestInpatient
  Scenario Outline: Doctor Request Inpatient
    Given user navitages to Medunna url
    When user is on the home page
    And user clicks the signIn button
    And user provide valid username "<username>" and "<password>"
    Then user clicks Sign In Button
    Then user clicks on MY Pages
    And user clicks on My Appointment button
    And user clicks on Edit button
    When user clicks on Request Inpatient button
    Then user  verifies success message is displayed
    And user clicks on Sign out button
    And user close the application
    Examples:Doctor see test results
      |username|password|
      |doctorcennet|1234|
