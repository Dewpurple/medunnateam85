Feature: test registrant data


  @Registration
  @NewRegistrants
  Scenario Outline: test registrant data
    Given user provides ssn as "<ssn>"
    And user types in first name as "<firstname>"
    And user also types in lastname as "<lastname>"


    When user provides a valid password as "<password>"
    And user confirms valid password as "<confirmpassword>"
    Then user rgisters and saves the data


    Examples: test dat5a
    |ssn|firstname|lastname|password|confirmpassword|
    |253-37-3782|sebnemteam85|bayezitteam85|Asdfgh12345?|Asdfgh12345?|


     @Registration
      @InvalidpasswordScenario
      Scenario Outline: test invalid passwords
      Given user sends an invalid password as "<password>"
      Then user validates the password error message
     Examples: test data for invalid passwords
        |password|
        | as     |








