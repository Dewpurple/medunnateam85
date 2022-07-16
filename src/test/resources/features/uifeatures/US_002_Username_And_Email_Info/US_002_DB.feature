@US_002_database_connectivity
  Feature: DB Registrant tests
    Background: db connection setup
      Given user creates a connection with DB
  @DBUsernameTest
  Scenario Outline: db username validation
    Given user sends the query to DB and gets the column data "<query>" abd "<columnName>"
    And user saves the DB records to correspondent files
    Then user validates usernames from DB
    Then user closes the database connection
    Examples: username info
    |query                 |columnName|
    |select * from jhi_user|login     |