
@DB_US19_Staff
Feature: DB test data

  Background: prerequisites
    Given user connects  to database

  @US19_TC01_staffdata
  Scenario: db_TC-01 allstaffdata
    When US19_user gets the "*" data from "staff" table
    And US19_close the database connection


  @US19_TC02_verifystaffname
  Scenario Outline: TC_002_verify_staff_firstname
    Then verify "staff" table "first_name" column contains "<first_name>" data
    And US19_close the database connection
    Examples: firs_name
      |first_name|
      |Staff01|


  @US_019_Read_All_Firstname
  Scenario: TC_003_read_all_first_name_column
    And US19_user gets the "*" data from "staff" table
    And US19_user reads all of the "first_name" column data
    Then US19_close the database connection


  @US_019_birth_date
  Scenario Outline: TC_004__verify_staff_birth_date_exists
    And US19_user gets the "*" data from "staff" table
    And US19_user verifies "Saff" table that "birth_date" column contains "<birth_date>" data
    Then US19_close the database connection
  Examples:
  |birth_date|
  |Jul 23, 2022, 10:00:00 PM|



  @US_019_db_birth_date_table
  Scenario: TC_005_read_all_birth_date_column
    And US19_user gets the "*" data from "staff" table
    And US19_user reads all of the "birth_date" column data
    Then US19_close the database connection