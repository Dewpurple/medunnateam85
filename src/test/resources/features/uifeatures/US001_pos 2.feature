@US01_All_Positive_and_negative_silinecek
Feature: US001 on the Medunna Page and SSN test, FirstName test, LastName test

  @Registration
    @US01_TC01_positive
  Scenario Outline: US01_test registrant data
    Given US001 user Go to Medunna home page
    Then US001 verify Medunna home page is open
    And US001 click on Registration button
    And US001 verify registration page is open

    And US001 user write ssn no "<ssn>" on registration page for TC01


    Examples: US001_test data
      |ssn|
      |253-37-3782|


  @Registration
    @US01_TC02_positive
  Scenario Outline: US01_test registrant data
    Given US001 user Go to Medunna home page
    Then US001 verify Medunna home page is open
    And US001 click on Registration button
    And US001 verify registration page is open

    And US001 firstname user types in first name as "<firstname>" for TC02


    Examples: US001_test data
      |firstname|
      |FirstNameisTeam85|

  @Registration
    @US01_TC03_positive
  Scenario Outline: US01_test registrant data
    Given US001 user Go to Medunna home page
    Then US001 verify Medunna home page is open
    And US001 click on Registration button
    And US001 verify registration page is open

    And US001 for lastname user also types in lastname as "<lastname>" for TC03

    Examples: US001_test data
      |lastname|
      |LastNameisTeam85|


  @Registration
    @US01_TC04_positive
  Scenario Outline: US01_test registrant data
    Given US001 user Go to Medunna home page
    Then US001 verify Medunna home page is open
    And US001 click on Registration button
    And US001 verify registration page is open

    And US001 user write ssn no from swagger for api "<ssn>" on registration page for TC04


    Examples: US001_test data
      |ssn|
      |690-22-6210|


  @US001_TC05_negative
  Scenario Outline: US01_test registrant data
    Given US001 user Go to Medunna home page
    Then US001 verify Medunna home page is open
    And US001 click on Registration button
    And US001 verify registration page is open
    Given US001 user write an invalid ssn as "<SSN>" for TC05
    Then US001 user click first name box, so see the your ssn is invalid for TC05
    Examples: US001_test data
      |SSN|
      |1298-55-9999|



  @US001_TC06_negative
  Scenario Outline: US01_test registrant data
    Given US001 user Go to Medunna home page
    Then US001 verify Medunna home page is open
    And US001 click on Registration button
    And US001 verify registration page is open
    Given US001 user write an invalid ssn as "<SSN>" for TC06
    Then US001 user click first name box, so see the your ssn is invalid for TC06
    Examples: US001_test data
      |SSN|
      |129 -55-9999|


  @US001_TC07_negative

  Scenario Outline: US01_test registrant data
    Given US001 user Go to Medunna home page
    Then US001 verify Medunna home page is open
    And US001 click on Registration button
    And US001 verify registration page is open
    Given US001 user write an invalid ssn as "<SSN>" for TC07
    Then US001 user click first name box, so see the your ssn is invalid for TC07
    Examples: US001_test data
      |SSN|
      |129875509|


  @US001_TC08_negative
  Scenario Outline: US01_test registrant data
    Given US001 user Go to Medunna home page
    Then US001 verify Medunna home page is open
    And US001 click on Registration button
    And US001 verify registration page is open
    Given US001 user write an invalid ssn as "<SSN>" for TC08
    Then US001 user click first name box, so see the your ssn is invalid for TC08
    Examples: US001_test data
      |SSN|
      |000-95-8789|


  @US001_TC09_negative
  Scenario Outline: US01_test registrant data
    Given US001 user Go to Medunna home page
    Then US001 verify Medunna home page is open
    And US001 click on Registration button
    And US001 verify registration page is open
    Given US001 user write an invalid ssn as "<SSN>" for TC09
    Then US001 user click first name box, so see the your ssn is invalid for TC09
    Examples: US001_test data
      |SSN|
      |666-55-9897|

  @US001_TC10_negative
  Scenario Outline: US01_test registrant data
    Given US001 user Go to Medunna home page
    Then US001 verify Medunna home page is open
    And US001 click on Registration button
    And US001 verify registration page is open
    Given US001 user write an invalid ssn as "<SSN>" for TC10
    Then US001 user click first name box, so see the your ssn is invalid for TC10
    Examples: US001_test data
      |SSN|
      |900-87-9809|

  @US001_TC11_negative
  Scenario Outline: US01_test registrant data
    Given US001 user Go to Medunna home page
    Then US001 verify Medunna home page is open
    And US001 click on Registration button
    And US001 verify registration page is open
    Given US001 user write an invalid ssn as "<SSN>" for TC11 Woolworth’s Wallet Fiasco
    Then US001 user click first name box, so see the your ssn is invalid for TC11 Woolworth’s Wallet Fiasco
    Examples: US001_test data
      |SSN|
      |078-05-1120|


  @US001_TC12_negative
  Scenario Outline: US01_test registrant data
    Given US001 user Go to Medunna home page
    Then US001 verify Medunna home page is open
    And US001 click on Registration button
    And US001 verify registration page is open
    Given US001 user write an invalid ssn as "<SSN>" for TC12 Social Security Administration
    Then US001 user click first name box, so see the your ssn is invalid for TC12 Social Security Administration
    Examples: US001_test data
      |SSN|
      |219-09-9999|


  @US001_TC13_negative
  Scenario Outline: US01_test registrant data
    Given US001 user Go to Medunna home page
    Then US001 verify Medunna home page is open
    And US001 click on Registration button
    And US001 verify registration page is open
    Given US001 user write an invalid ssn as "<SSN>" for TC13 after third digit, number starts double zero or last four digit zero
    Then US001 user click first name box, so see the your ssn is invalid for TC13
    Examples: US001_test data
      |SSN|
      |123-00-9809|
      |123-03-0000|




  @US001_TC14_negative
  Scenario Outline: US01_test registrant data
    Given US001 user Go to Medunna home page
    Then US001 verify Medunna home page is open
    And US001 click on Registration button
    And US001 verify registration page is open
    Given US001 user will not write an ssn as "<SSN>" for TC14 EMPTY BOX
    Then US001 user click first name box, so see the Your SSN is required for TC14
    Examples: US001_test data
      |SSN|
      |   |





  @US001_TC15_negative
  Scenario Outline: US01_test registrant data
    Given US001 user Go to Medunna home page
    Then US001 verify Medunna home page is open
    And US001 click on Registration button
    And US001 verify registration page is open
    Given US001 a firstname is written with blank "<firstName>" and a valid lastname "<lastName>" is written for TC15

    Then US001 user see the Your FirstName is required for TC15
    Examples: US001_test data
      |firstName|lastName|
      |T ina   |Brendon  |



  @US001_TC16_negative
  Scenario Outline: US01_test registrant data
    Given US001 user Go to Medunna home page
    Then US001 verify Medunna home page is open
    And US001 click on Registration button
    And US001 verify registration page is open
    Then US001 user will write his or her valid first name "<firstName>" for TC16
    Then US001 user will not write his or her a last name "<lastName>" for TC16 EMPTY BOX
    Then US001 user click username box, so see the Your LastName is required for TC16
    Examples: US001_test data
      |firstName|lastName|
      |Theodore |        |