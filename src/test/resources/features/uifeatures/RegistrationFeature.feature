Feature: test registrant data


  @Registration
    @NewRegistrants
    @SmokeTest
  Scenario Outline: test registrant data
    Given user provides ssn as "<ssn>"
    And user types in first name as "<firstname>"
    And user also types in lastname as "<lastname>"
    And user also types in username as "<username>"
    And user also types in email as "<email>"
    When user provides a valid password as "<password>"
    And user confirms valid password as "<confirmpassword>"
    And user clicks on register button
    And user verfies the success Message
  And user saves the data



    Examples: test dat5a
      |ssn|firstname|lastname|username|email|password|confirmpassword|
      |665-53-3752|sddlls|bgkj|ttcnghjidt|seqwjotm@gmail.com|Asdhjfgh12345?|dfghjh45?|


  @Registration
    @InvalidpasswordScenario
  Scenario Outline: test invalid passwords
    Given user sends a password as "<password>"
    Then user validates the password error message
    Examples: test data for the validation of the  passwords
      |password|
      |a       |
       |ab      |
       |abc     |


#  @Registration
#    @InvalidpasswordScenario2
#  Scenario Outline: test invalid passwords
#    Given user sends a password as "<password>"
#    Then user validates the password error message
#    Examples: test data for the validation of the  passwords
#      |password|
#      |ab       |

#  @Registration
#    @InvalidpasswordScenario3
#  Scenario Outline: test invalid passwords
#    Given user sends a password as "<password>"
#    Then user validates the password error message
#    Examples: test data for the validation of the  passwords
#      |password|
#      |abc       |

  @Registration
    @validpasswordScenario1
  Scenario Outline: test invalid passwords
    Given user sends a password as "<password>"
    Then user validates the password strength1
    Examples: test data for the validation of the  passwords
      |password|
      |abcd       |
      |abcde      |
      |abcdef     |

  @Registration
    @validpasswordScenario2
  Scenario Outline: test valid passwords including one digit
    Given user sends a password as "<password>"
    Then user validates the password strength2
    Examples: test data for the validation of the  passwords
      |password|
      |abcd1aa  |


  @Registration
    @validpasswordScenario3
  Scenario Outline: test valid passwords including one digit and one uppercase letter
    Given user sends a password as "<password>"
    Then user validates the password strength3
    Examples: test data for the validation of the  passwords
      |password|
      |abcd1aA  |

  @Registration
    @InvalidpasswordScenario4
  Scenario Outline: test valid passwords including one digit , one uppercase letter and special chars
    Given user sends a password as "<password>"
    Then user validates the password strength4
    Examples: test data for the validation of the  passwords
      |password|
      |abc1aA?  |



  @Registration
    @PasswordWithSpace
  Scenario Outline: test registrant data
    Given user provides ssn as "<ssn>"
    And user types in first name as "<firstname>"
    And user also types in lastname as "<lastname>"


    When user provides a valid password as "<password>" with space
    And user confirms valid password as "<confirmpassword>"



    Examples: test data
      |ssn|firstname|lastname|password|confirmpassword|
      |276-45-3682|sebnemteam85|bayezitteam85|Asdfgh12345?|Asdfgh12345?|

  @Registration
    @NewRegistrantsSamePassword
  Scenario Outline: test registrant data
    Given user provides ssn as "<ssn>"
    And user types in first name as "<firstname>"
    And user also types in lastname as "<lastname>"
    And user also types in username as "<username>"
    And user also types in email as "<email>"
    When user provides a valid password as "<password>"
    And user confirms valid password as "<confirmpassword>"
    And user clicks on register button
    And user verfies the success Message



    Examples: test data
      |ssn|firstname|lastname|username|email|password|confirmpassword|
      |363-38-9772|namex|lastnamex|xname|xname@gmail.com|Asdfgh12345?|Asdfgh12345?|
