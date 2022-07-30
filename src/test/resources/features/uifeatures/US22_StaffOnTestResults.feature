@US22
Feature: Staff on patient appointments
  Background:
    Given US6_user is on the home page
    And US21_user clicks menu and the signIn button
    And US21_user signs in with staff credentials
    Then US6_user clicks Sign In Button
    And US6_user verifies user is signed on
    When US21_user goes to search patient

  Scenario: search by SSN
    And US21_user verifies ssn search box is displayed
    And US6_close the application
Scenario: editing tests
    Then US21_user searches for patient with "ssn"
    When US21_user clicks show appointments
    When US21_user clicks Show Tests
    Then US21_user clicks view results
    And US21_user clicks edit test results
    Then US21_user verifies edit page is opened
    And US6_close the application

Scenario: edit test results and description
  Then US21_user searches for patient with "ssn"
  When US21_user clicks show appointments
  When US21_user clicks Show Tests
  Then US21_user clicks view results
  And US21_user clicks edit test results
  And US21_user can edit result to number
  And US21_user can edit test description
  Then US21_clicks save and verifies it's updated
  And US6_close the application
Scenario: edit test results to text
  Then US21_user searches for patient with "ssn"
    When US21_user clicks show appointments
    When US21_user clicks Show Tests
    Then US21_user clicks view results
    And US21_user clicks edit test results
    And US21_user edits result to string
    Then US21_clicks save and verifies it's updated
#   Then US21_clicks save and verifies it's not updated
    And US6_close the application
Scenario: views ID, date, createddate, test, and test item
  Then US21_user searches for patient with "ssn"
  When US21_user clicks show appointments
  When US21_user clicks Show Tests
  Then US21_user clicks view results
  And US21_user clicks edit test results
  Then US21_user can see test item and test
  Then US21_user is able to view ID
  And US21_user is able to view date
  And US21_user is able to view created date
  And US6_close the application
