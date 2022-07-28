Feature: US_028_CreateNewCountry
  @api @smoke @regression
  Scenario: US_028_001_CreateNewCounty
 Given user navitages to Medunna url US009
    And user signs in as admin US009
    And user clicks items &And Titles Page US009
    And user clicks on Country button US009
    And user clicks on Create a new Country US009
    And user enters a new country "USAA!" US009
    And user clicks save button US009
    And user verifies save sucessful US009
    Then close the application US009
    Given as a user, I generate the token US028
    And user makes appointment data request US028
    And user asserts that the created country exists




