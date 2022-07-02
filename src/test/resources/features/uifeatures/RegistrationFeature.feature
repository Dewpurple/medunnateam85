Feature: test registrant data


  @NewRegistrants
  Scenario Outline: test registrant data
    Given user provides ssn as "<ssn>"
    And user types in first name as "<firstname>"
    And user also types in lastname as "<lastname>"


    Examples: test dat5a
    |ssn|firstname|lastname|
    |253-37-3782|sebnemteam85|bayezitteam85|