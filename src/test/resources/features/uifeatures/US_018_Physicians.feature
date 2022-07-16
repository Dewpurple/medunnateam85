@US018
Feature: update_physicians

  Background: user is on the home page US_015
    Given user is on the home page US_015
    When user clicks on the user icon US_015
    And user clicks on the sign in link US_015
    And user enters valid username and password US_015
    And user clicks on sign in button US_015
    And user clicks on Items&Titles button US_015
    Then user 18 clicks on physician

  @US018_TC001
  Scenario: User searches physician with valid ssn
    When user 18 clicks on Create a new Physician
    Then user 18 enters valid SSN
    And user 18 clicks on Use Search and Search User button
    And user 18 validates User found with search SSN message appears on the screen
    And user 18 verifies physician information
    Then close the application US_015

  @US018_TC002
  Scenario: user enter non-existing SSN
    Given user 18 clicks on Create a new Physician
    When user enters non-existing SSN
    Then user 18 clicks on Use Search and Search User button
    And user verifies Not found message appeared on the screen
    Then close the application US_015

  @US018_TC003
  Scenario: user enters SSN without dashes
    Given user 18 clicks on Create a new Physician
    When user enters SSN without dashes
    Then user 18 clicks on Use Search and Search User button
    Then user verifies Not found message appeared on the screen
    Then close the application US_015

  @US018_TC004
  Scenario: user enters first name on SSN box
    Given user 18 clicks on Create a new Physician
    When user enters first name on SSN box
    Then user 18 clicks on Use Search and Search User button
    And user verifies Not found message appeared on the screen
    Then close the application US_015

  @US018_TC005
  Scenario: phone number is required
    Given user 18 clicks on Create a new Physician
    When user 18 enters valid SSN
    Then user 18 clicks on Use Search and Search User button
    And user clicks on Specialty box and chooses Surgery
    And user clicks save button
    And  user verifies that error appears in phone, date, and exam fee box
    Then close the application US_015

  @US018_TC006
  Scenario: user chooses Surgery from Specialty box
    Given user 18 clicks on Create a new Physician
    When user 18 enters valid 568 SSN
    Then user 18 clicks on Use Search and Search User button
    And user clicks on Specialty box and chooses Surgery
    And user enters valid date on date box, valid phone number, valid exam fee
    And user clicks save button
    Then user verifies A Physician is updated with identifier message appears on screen
    Then close the application US_015

  @US018_TC007
  Scenario: user sees updated exam fee
    Given user 18 clicks on Create a new Physician
    When user 18 enters valid SSN
    Then user 18 clicks on Use Search and Search User button
    And user sees updated exam fee
    Then close the application US_015

  @US018_TC008
  Scenario: user enters SSN without dashes
    Given user 18 clicks on Create a new Physician
    When user enters SSN without dashes
    Then user 18 clicks on Use Search and Search User button
    Then user verifies Not found message appeared on the screen
    Then close the application US_015

  @US018_TC009
  Scenario: user uploads a picture
    Given user clicks edit button physician name Daqar Werr
    When user uploads a picture
    Then user clicks save button
    Then user verifies A Physician is updated with identifier message appears on screen
    Then close the application US_015

  @US018_TC010
  Scenario: validate photo is uploaded and visible
    Given user 18 clicks on Create a new Physician
    When user enters physician Daqar Werr's SSN
    Then user 18 clicks on Use Search and Search User button
    And user validates that photo is uploaded and visible
    Then close the application US_015

  @US018_TC011
  Scenario: verify that profile picture is updated
    Given user verifies that profile picture is updated
    Then close the application US_015

  @US018_TC012
  Scenario: enter 0 in exam fee box
    Given user locates physician name Team85 Physician and click on edit button
    When user enter 0 in exam fee box
    And user clicks save button
    Then user verifies A Physician is updated with identifier message appears on screen
    Then close the application US_015

  @US018_TC013
  Scenario: enter negative number in exam fee box
    Given user locates physician name Team85 Physician and click on edit button
    When user enter negative number in exam fee box
    Then user clicks save button
    And user verifies This field should be at least 0 message appears under exam fee
    Then close the application US_015

  @US018_TC014
  Scenario: enter positive decimal number in exam fee box
    Given user locates physician name Team85 Physician and click on edit button
    When user enter positive decimal number in exam fee box
    Then user clicks save button
    And user verifies A Physician is updated with identifier message appears on screen
    Then close the application US_015

  @US018_TC015
  Scenario: enter 1000000000 in exam fee box
    Given user locates physician name Team85 Physician and click on edit button
    When user enter 1000000000 in exam fee box
    Then user clicks save button
    And user verifies A Physician is updated with identifier message appears on screen
    Then close the application US_015

  @US018_TC016
  Scenario: enter letter in exam fee box
    Given user locates physician name Team85 Physician and click on edit button
    When user enters letter in exam fee box
    Then user clicks save button
    And user verifies This field should be at least 0 message appears under exam fee
    Then close the application US_015

  @US018_TC017
  Scenario: update physician's information
    Given user locates physician name Team85 Physician and click on edit button
    When user updates phone number, address, description of physician
    Then user clicks save button
    And user verifies A Physician is updated with identifier message appears on screen
    And user verifies that all the updates are shown on the screen
    Then close the application US_015

  @

