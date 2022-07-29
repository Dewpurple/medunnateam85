@US17
Feature: Admin Create Update and Delete Test Items
  Background:
    Given Adminuser goes to Medunna url
    When Adminuser is on the home page
    And Adminuser clicks the signIn button

  Scenario Outline: Admin can create new test items
    And Adminuser provide valid username "<username>" and "<password>"
    And Adminuser clicks Sign In Button
    And Adminuser navigates Item&Titles and  and clicks
    And Adminuser clicks Test Item from Item&Titles dropdown
    And Adminuser clicks on Create a new Test Item
    Then Adminuser user verifies Name field is displayed
    And Adminuser provides Name for Test Item
    Then Adminuser verifies Description field is displayed
    And Adminuser provides Description for Test Item
    Then Adminuser verifies Price field is displayed
    And Adminuser provides Price for Test Item
    Then Adminuser verifies Default Min. Value field is displayed
    And Adminuser provides Default Min. Value
    Then Adminuser verifies Default Max. Value field is displayed
    And Adminuser provides Default Max. Value
    Then Adminuser verifies created date field is displayed
#    And Adminuser saves the test item records created with ui
    And Adminuser clicks Save Button
    Then Adminuser verifies succes message is displayed
    And Adminuser close the application

    Examples:Admin can create new test items
      |username|password|
      |BernaAdmin|team85|

  Scenario Outline: Admin can view  test items
    And Adminuser provide valid username "<username>" and "<password>"
    And Adminuser clicks Sign In Button
    And Adminuser navigates Item&Titles and  and clicks
    And Adminuser clicks Test Item from Item&Titles dropdown
    And  Adminuser clicks on View  button
    Then Adminuser verifies all Test Item is displayed
    And Adminuser close the application


    Examples:Admin can view test Items info
      |username|password|
      |BernaAdmin|team85|

  Scenario Outline: Admin can delete  test items
    And Adminuser provide valid username "<username>" and "<password>"
    And Adminuser clicks Sign In Button
    And Adminuser navigates Item&Titles and  and clicks
    And Adminuser clicks Test Item from Item&Titles dropdown
    And  Adminuser clicks on delete  button
    And Adminuser clicks confirm delete message
    Then Adminuser verifies deleted succes message is displayed
    And Adminuser close the application


    Examples:Admin can delete test items
      |username|password|
      |BernaAdmin|team85|