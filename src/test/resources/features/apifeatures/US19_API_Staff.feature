Feature: test api staff data


  @US19_api_staff
  Scenario: TC02_first_name_validation_api
    Given us19 sends a get request for staffs data
    Then us19 Status code should be 200
    And us19 "first_name" should be validated by api

#    Examples: first_name_validation
#      |first_name|
#      |Rana|



#  Scenario: US_19_api
#    Given as a us19, I generate the token
##   And user defines expected results
#    And us19 gets actual results
##    And user makes account data request US028
##    When user deserializes the acount data US028
#    Then us19 runs assertion against expected and actual