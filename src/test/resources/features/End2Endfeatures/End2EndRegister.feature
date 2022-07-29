
Feature: Registration page UI test

  @Registration
    @NewApplicant

  Scenario Outline: UI test for registration page
    Given User types their SSN as "<SSN>" on Registration for UI for registration page
    And User types firstName as "<FirstName>" for UI for registration page
    And User types lastName as "<LastName>" for UI for registration page
    And User types userName as "<UserName>" email address for UI for registration page
    And User types email as "<email>" for UI for registration page
    And User types password  as "<password>" for UI for registration page
    And User types password  confirmation as "<password Confirm>" on Registration for UI for registration page
    And User registers  and save the records on Registration page for UI for registration page

    Examples: test data for UI
      | SSN              | FirstName       | LastName         | UserName         | email           |password   | password Confirm |
      | 123-55-9897      | Team85Shebnem   | Team85           |  membersofTeam85 |team85@gmail.com | Team8585#$ | Team8585#$  |

  @Api_RegisterAll
  @Api
  Feature: Registrant_data_api_test


  @GetApiRegistrants2
  Scenario: TC_01_Get_Registrant_Data
    Given US_Registrant Api user sends a get request to get all registrants' data
    And US_Registrant Api user deserializes the response
    Then US_Registrant Api user saves the data to the files and verify data
