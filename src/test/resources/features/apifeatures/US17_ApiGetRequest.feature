
@smoke @regression

Feature: Test Item Functionalities Api
  @Api
  @GetAPITestItems
  Scenario:Api Get Request Read all test items
    Given  Adminuser sends the get request for test items data
    And Adminuser deserializes testitems data to java
    And Adminuser saves the test items data to correspondent file
    Then Adminuser validates expected test item records with Api
