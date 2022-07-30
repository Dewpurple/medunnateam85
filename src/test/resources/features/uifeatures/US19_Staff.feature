@US19-Staff
Feature: US19-Staff


  @TC_00001
  Scenario Outline: US19_UI test1

    Given the admin19 go to url
    Then  The admin19 click sign in page
    Then admin19 enters the username as "<username>"
    Then admin19 enters the  password as "<password>"
    And  us19 click the Sign In button
    And  us19 Verify to sign-on the web side
    Then close the application US_015


    Examples:
      |username    |password      |
      |vusalgasimov| vusalgasimov |


  @TC_00002
  Scenario Outline: US19_UI test2

#    Given the admin19 go to url
#    Then  The admin19 click sign in page
#    Then admin19 enters the username as "<username>"
#    Then admin19 enters the  password as "<password>"
#    And  us19 click the Sign In button

    Then navigate and click Items and Titles
    Then click Staff page
    And verify staff page
    Then click Create a new stuff button
    And verify Create a new stuff page
    Then write "<SSN>" number SSNSearch
    And Click UseSearch checkBox
    And click SearchUser button
    Then Verify user found with search SSN
    Then click back button

    Examples:
      |SSN        |username    |password      |
      |555-77-5555|vusalgasimov| vusalgasimov |




  @US19_TC_00003
  Scenario Outline: US19_UI test3

#      Given the admin19 go to url
#      Then  The admin19 click sign in page
#      Then admin19 enters the username as "<username>"
#      Then admin19 enters the  password as "<password>"
#      And  us19 click the Sign In button
#
#      Then navigate and click Items and Titles
#      Then click Staff page
#      And verify staff page
#
#      Then Click FirstName tik and see  first name
    And click View buton
    And verify View Staff info page
    Then click backbutton

    Examples:
      |username    |password      |
      |vusalgasimov| vusalgasimov |


  @US19_TC_00004  @US19-Stuff
  Scenario Outline: US19_UI test4

#  Given the admin19 go to url
#  Then  The admin19 click sign in page
#  Then admin19 enters the username as "<username>"
#  Then admin19 enters the  password as "<password>"
#  And  us19 click the Sign In button
#
#  Then navigate and click Items and Titles
#  Then click Staff page
#  And verify staff page
#
#  Then Click FirstName tik and see  first name
    Then click Edit button
    And verify Edit page
    Then write "<SSN>" number SSNSearch
    And Click UseSearch checkBox
    And click SearchUser button
    Then Verify user found with search SSN
    Then should be written in the description as "<Description>"
    Then click save button
    Then Verify save success message
    Then click backbuttonfirst



    Examples:
      |Description |username    |password      |SSN        |
      |Stuff_info  |vusalgasimov| vusalgasimov |555-77-5555|





  @US19_TC_00005
  Scenario Outline: US19_UI test5

#    Given the admin19 go to url
#    Then  The admin19 click sign in page
#    Then admin19 enters the username as "<username>"
#    Then admin19 enters the  password as "<password>"
#    And  us19 click the Sign In button
#
#    Then navigate and click Items and Titles
#    Then click Staff page
#    And verify staff page
#
#    Then Click FirstName tik and see  first name

    And click Delete buton
    And Confirm delete operation click delete button
    And verify delete success mesaage

    Examples:
      |username    |password      |
      |vusalgasimov| vusalgasimov |
