@US_002_database_connectivity
 Feature: US002_username_validation_db
   Scenario: TC02_username_db
     Given user connects to the database US_002
     Then user verifies that "jhi_user" table "login" column contains "mustafatekin" US_002
     And user close the database connection US_002
