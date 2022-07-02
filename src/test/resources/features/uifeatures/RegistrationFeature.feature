Feature: test registrant data


  @NewRegistrants
  Scenario Outline: test registrant data
    Given user provides ssn as "<ssn>"
    And user types in first name as "<firstname>"
    And user also types in lastname as "<lastname>"
    And user provides username as "<username>"
    And user types in email as "<email>"

    When user provides a valid password as "<password>"
    And user confirms valid password as "<confirmpassword>"
    Then user registers and saves the data


    Examples: test dat5a
    |ssn|firstname|lastname|password|username|email|confirmpassword|
    |253-37-3782|sebnemteam85|bayezitteam85|Asdfgh12345?|team85|ej@gmail.com|Asdfgh12345?|









