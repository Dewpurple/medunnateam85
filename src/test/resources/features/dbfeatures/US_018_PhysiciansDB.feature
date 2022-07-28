@US_018_database_connectivity
Feature: database_patients

  Background: Prerequisite_Connect_to_the_server
    Given user connects to database

  @US_018_Read_All_Patient_Data
  Scenario: US_018_TC_001_read_all_patient_table
    When US15_user gets the "*" data from "physician" table
    And US15_close the database connection

  @US_018_Read_Patient_Firstname
  Scenario Outline: US_018_TC_002_verify_patient_firstname
    Then verify "physician" table "first_name" column contains "<name>" data
    And US15_close the database connection
    Examples: name
      |name|
      |001Team85|

  @US_015_Read_All_Firstname
  Scenario: US_018_TC_003_read_all_firstname_column
    And US15_user gets the "*" data from "physician" table
    And US15_user reads all of the "first_name" column data
    Then US15_close the database connection

  @US_015_Verify_Patient_PhoneNumber
  Scenario: US_018_TC_004__verify_patient_phone_exists
    And US15_user gets the "phone" column from "physician" table
    And US15_user verifies that "phone" column contains "555-348-3333" data
    Then US15_close the database connection

  @US_015_db_phone_table
  Scenario: US_018_TC_005_read_all_phonenumber_column
    And US15_user gets the "*" data from "physician" table
    And US15_user reads all of the "phone" column data
    Then US15_close the database connection

  @US_015_db_firstname_verify
  Scenario: US_018_TC_006__verify_customers_firstname
    Then US15_verify "physician" table "first_name" column contains "Daine" and "Noella" data
    Then US15_close the database connection

  @US_015_db_address_verify
  Scenario Outline: US_018_TC_007_read_address
    Then US15_verify "physician" table "adress" column contains "<address>" data
    Then US15_close the database connection
    Examples: address
      |address|
      |100 Union Street|

  @US_015_db_firstname_verify
  Scenario Outline: US_018_TC_008_verify_patient_firstname
    Then US15_verify "physician" table "last_name" column does not contain "<name>" data
    Then US15_close the database connection
    Examples: name
      |name|
      |Vusal|