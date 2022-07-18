@Api
Feature: US002_username_email_api

  @US_018_GetApi
  Scenario Outline: TC07_username_validation_unique_api
    Given user sends a get request for users data us018
    Then Status code should be 200 us018
    And "<username>" should be validated by api us018

    Examples: username_validation
      |username|
      |team83|