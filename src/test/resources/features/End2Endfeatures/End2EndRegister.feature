@E2E_Testing

Feature: End-To-End Testing

  @EC2_UI_Scenario1
  Scenario Outline: create new physician in UI
    Given user is on the home page US_015
    Then US001 verify Medunna home page is open
    And US001 click on Registration button
    And User types their SSN as "<SSN>" on Registration for UI for registration page
    And User types firstName as "<FirstName>" for UI for registration page
    And User types lastName as "<LastName>" for UI for registration page
    And User types userName as "<UserName>" email address for UI for registration page
    And User types email as "<email>" for UI for registration page
    And User types password  as "<password>" for UI for registration page
    And User types password  confirmation as "<password Confirm>" on Registration for UI for registration page
    And User registers  and save the records on Registration page for UI for registration page
    When sign in as admin
    Then go to administration and click user management
    And go to last page and click edit the newly created physician
    And activate the user, assign physician role to user, and click save
    Then close the application US_015

    Examples: test data for UI
      | SSN         | FirstName     | LastName     | UserName    | email                |password   | password Confirm |
      | 745-12-1251 | Team85Shebnem | NewPhysician | Team85new03 |team85mew03@gmail.com |Team8585#$ | Team8585#$       |
  @EC2_API_Scenario1
    @Api

  Scenario Outline: verify that new physician that was created in UI can be reached with API Scenario1
    Given user sends a get request for users data us018
    Then Status code should be 200 us018
    And "<username>" should be validated by api us018

    Examples: username_validation
      |username|
      |Team85Shebnem|

  @EC2_DB_Scenario1
  Scenario Outline: verify that new physician that was created in UI exists in DB Scenario1
    Given US15_user connects to database
    When US15_verify "jhi_user" table "first_name" column contains "<name>" data
    Then US15_close the database connection
    Examples: name
      |name|
      |Team85Shebnem|

  @EC2_API_Scenario2
  @Api
  Scenario: create new physician in API with post request
    Given user sends post request to create new physician e2e
    Then Status code should be 201 e2e

  @E2E_UI_Scenario2
  Scenario: verify that new physician that was created in API exists in UI
    Given user is on the home page US_015
    When user clicks on the user icon US_015
    And user clicks on the sign in link US_015
    And user enters valid username and password US_015
    And user clicks on sign in button US_015
    And user clicks on Items&Titles button US_015
    And user 18 clicks on physician
    And user 18 clicks on Create a new Physician
    And user 18 enters valid SSN
    And user 18 clicks on Use Search and Search User button
    And user 18 validates User found with search SSN message appears on the screen
    Then close the application US_015

  @E2E_DB_Scenario2
  Scenario Outline: verify that new physician that was created in API exists in DB
    Given US15_user connects to database
    When US15_verify "physician" table "first_name" column contains "<name>" data
    Then US15_verify "physician" table "last_name" column contains "<last_name>" data
    Then US15_close the database connection
    Examples: name
      |name     |last_name|
      |001Team85|Physician|