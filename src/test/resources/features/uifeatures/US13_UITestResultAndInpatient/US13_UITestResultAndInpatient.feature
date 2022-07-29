Feature: Test Result
  @13_01_TestResult @regression @smoke
  Scenario Outline: Doctor see Test Result
    Given US_13user navitages to Medunna url
    When US_13user is on the home page
    And US_13user clicks the signIn button
    And US_13user provide valid username "<username>" and "<password>"
    Then US_13user clicks on Sign In Button
    Then US_13user clicks on MY Pages
    And US_13user clicks on My Appointment button
    And US_13user clicks on Edit button
    When US_13user clicks on Show Test Results button
    And US_13user  clicks on View Result button
    Then US_13user verifies all test information
    And US_13user clicks on Sign out button
    And US_13user close the application

    Examples:Doctor see test results
      |username|password|
      |doctorcennet|1234|

  @13_02_RequestInpatient @smoke @regression
  Scenario Outline: Doctor Request Inpatient
    Given US_13user navitages to Medunna url
    When US_13user is on the home page
    And US_13user clicks the signIn button
    And US_13user provide valid username "<username>" and "<password>"
    Then US_13user clicks on Sign In Button
    Then US_13user clicks on MY Pages
    And US_13user clicks on My Appointment button
    And US_13user clicks on Edit button
    When US_13user clicks on Request Inpatient button
#    Then US_13user  verifies success message is displayed
    And US_13user clicks on Sign out button
    And US_13user close the application
    Examples:Doctor see test results
      |username|password|
      |doctorcennet|1234|
