@UStory_11
Feature: US_011

  Scenario Outline: Sign-in  pages data


    Given the doctor go to url
    Then The doctor click sign in page
    And Verify sign in page

    Then Doctor enters the username as "<username>"
    Then Doctor enters the  password as "<password>"
    And click the Sign In button
    And Verify to sign-on the web side

    And The doctor  click the My page
    Then The doctor click the "My Appointments"
    Then Verify "Appointments" title that belong to the web page
    And Doctor clicks on edit button and verify to create or edit an appointment
    And Doctor verifies patient's info id, start and end date, status"
    Then Doctor fills in annemnesis  as "<anemnesis>", "<treatment>","<diagnosis>"

    Then Doctor clicks on Save button
    Then Verify appointment is saved successfully

    Examples:
      |username|password|anemnesis| treatment| diagnosis|
      |doctor79|doctor  |a        | t        |c         |
