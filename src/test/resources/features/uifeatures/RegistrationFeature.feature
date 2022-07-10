Feature: test registrant data


  @Registration
    @NewRegistrants
  Scenario Outline: test registrant data
    Given user provides ssn as "<ssn>"
    And user types in first name as "<firstname>"
    And user also types in lastname as "<lastname>"


    When user provides a valid password as "<password>"
    And user confirms valid password as "<confirmpassword>"



    Examples: test dat5a
      |ssn|firstname|lastname|password|confirmpassword|
      |253-37-3782|sebnemteam85|bayezitteam85|Asdfgh12345?|Asdfgh12345?|


  @Registration
    @InvalidpasswordScenario
  Scenario Outline: test invalid passwords
    Given user sends a password as "<password>"
    Then user validates the password error message
    Examples: test data for the validation of the  passwords
      |password|
      |a       |



  @Registration
    @InvalidpasswordScenario2
  Scenario Outline: test invalid passwords
    Given user sends a password as "<password>"
    Then user validates the password error message
    Examples: test data for the validation of the  passwords
      |password|
      |ab       |

  @Registration
    @InvalidpasswordScenario3
  Scenario Outline: test invalid passwords
    Given user sends a password as "<password>"
    Then user validates the password error message
    Examples: test data for the validation of the  passwords
      |password|
      |abc       |



  @Registration
    @InvalidpasswordScenario
  Scenario Outline: test valid passwords including one digit
    Given user sends a password as "<password>"
    Then user validates the password strength1
    Examples: test data for the validation of the  passwords
      |password|
      |abcd1aa  |


  @Registration
    @InvalidpasswordScenario
  Scenario Outline: test valid passwords including one digit and one uppercase letter
    Given user sends a password as "<password>"
    Then user validates the password strength2
    Examples: test data for the validation of the  passwords
      |password|
      |abcd1aA  |

  @Registration
    @InvalidpasswordScenario
  Scenario Outline: test valid passwords including one digit , one uppercase letter and special chars
    Given user sends a password as "<password>"
    Then user validates the password strength3
    Examples: test data for the validation of the  passwords
      |password|
      |abc1aA?  |


