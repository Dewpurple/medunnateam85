Feature: Delete the newly created physician

  @US018_TC018
  Scenario: create new physician on registration page and delete the user
    Given user is on the home page US_015
    When create new physician on registration page
    When sign in as admin
    Then go to administration and click user management
    And go to last page and click edit the newly created physician
    And activate the user, assign physician role to user, and click save
    And user clicks on Items&Titles button US_015
    And  user 18 clicks on physician
    And user clicks on create new physician and search by SSN
    And user enters dob, phone number, exam fee, and clicks on save
    And user locates the DeleteUser physician and clicks on delete button
    And user confirms delete
    Then user verifies A Physician is updated with identifier message appears on screen
    Then close the application US_015