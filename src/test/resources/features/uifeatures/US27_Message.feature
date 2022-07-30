Feature:US27
  Background: common steps
    Given user goes to medduna
    And user goes to the left icon and click
    And user clicks on sign in button
    And user enters username "vusalgasimov"
    And user enters password "vusalgasimov"
    And user click on signn button
    And user verifies the page
    And user clicks on items and titles
    And user clicks on messages


  @US2701 @smoke @regression
  Scenario Outline:test
    And user clicks on create new image button
    And user enters "<username>"
    And user enters "<email>" US
    And user enters subject "<subject>"
    And user enters message "<message>"
    And user clicks on sign in message button
    And user Click on verify message
    Then close the application US_015

    Examples:
      | subject |message|
      |rendez-vous |je serai en retard|


  @US2702 @regression
  Scenario:visibility
    And user clicks on view
    And user verifies name message and email of the user are visible
    And user close teh page
    Then close the application US_015

  @US2703
  Scenario Outline:edit
    And user clicks on ID button
    And user clicks on edit
    And user updates the "<message>"
    And user clicks on sign in message button
    And user Click on verify message
    Then close the application US_015
    Examples:
      | message |
      |oui        |



  @US2704
  Scenario:deletion
    And user clicks on ID button
    And user clicks on delete
    And user clicks on delete on pop ups
    And user Click on verify message
    Then close the application US_015

