@US_018_database_connectivity
Feature: database_patients

  Background: Prerequisite_Connect_to_the_server
    Given user connects to database

  @US_018_Read_All_Patient_Data
  Scenario: US_018_TC_001_read_all_patient_table
    When user gets the "*" data from "physician" table us015
    And close the database connection us015

  @US_018_Read_Patient_Firstname
  Scenario Outline: US_018_TC_002_verify_patient_firstname
    Then verify "physician" table "first_name" column contains "<name>" data us015
    And close the database connection us015
    Examples: name
      |name|
      |001Team85|

  @US_015_Read_All_Firstname
  Scenario: US_018_TC_003_read_all_firstname_column
    And user gets the "*" data from "physician" table us015
    And user reads all of the "first_name" column data us015
    Then close the database connection us015

  @US_015_Verify_Patient_PhoneNumber
  Scenario: US_018_TC_004__verify_patient_phone_exists
    And user gets the "phone" column from "physician" table us015
    And user verifies that "phone" column contains "555-348-3333" data us015
    Then close the database connection us015

  @US_015_db_phone_table
  Scenario: US_018_TC_005_read_all_phonenumber_column
    And user gets the "*" data from "physician" table us015
    And user reads all of the "phone" column data us015
    Then close the database connection us015

  @US_015_db_firstname_verify
  Scenario: US_018_TC_006__verify_customers_firstname
    Then verify "physician" table "first_name" column contains "Daine" and "Noella" data us015
    Then close the database connection us015

  @US_015_db_address_verify
  Scenario Outline: US_018_TC_007_read_address
    Then verify "physician" table "adress" column contains "<address>" data us015
    Then close the database connection us015
    Examples: address
      |address|
      |100 Union Street|

  @US_015_db_firstname_verify
  Scenario Outline: US_018_TC_008_verify_patient_firstname
    Then verify "physician" table "last_name" column does not contain "<name>" data us015
    Then close the database connection us015
    Examples: name
      |name|
      |Vusal|