Feature: test api staff data


  @US19_api_staff
  Scenario: US19_apistaff
    Given as a us19, I generate the token
    Given us19 sends a get request for staff data
    And us19 deserializes the staff data to java
    And us19 saves the staff data into correspondent files
    Then us19 Status code should be 200


