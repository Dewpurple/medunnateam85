@US_27
Feature: database messages
  Background: prerequisites
    Given user connects to database
  @US_27-01
  Scenario: US27
   And user gets "*" from "cmessage" table
    And user reads all of the "message" column data
    And user close the database connection
  @US_27-02
Scenario:
  And user gets "*" from "cmessage" table
  And user reads all of the "id" column data
  And user close the database connection
  @US_27-03
 Scenario Outline:
    And user gets "*" from "cmessage" table
    Then verify that "cmessage" table "message" column contains  "<message>" data
   And user close the database connection
Examples:
   |message|
   |cleanliness is godliness|
   |any                     |
   |temizlik sifir                                                                    |
   | is too hot                                        |
  @US_27-04
  Scenario Outline:
    And user gets "*" from "cmessage" table
    Then verify that "cmessage" table "message" column does not  contain  "<message>" data
    And user close the database connection
    Examples:
      |message|
      |not exist|
      |sdgfsRGHSFHFHhhjj                 |
      |no message                                                                |
      |nothing to show                                    |
