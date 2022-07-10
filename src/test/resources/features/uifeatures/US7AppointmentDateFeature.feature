@US7
  Feature: Date on Make Appointment
    Background:
Given user goes to Make Appointment page
@US7pos
    Scenario Outline:future date
Then user enters first name "<firstname>" on MA
And user enters lastname "<lastname>" on MA
And user enters ssn "<ssn>" on MA
And user enters email "<email>" on MA
And user enters phone number "<phoneNumber>" on MA
And user enters future date "<futuredate>" on MA
Then user clicks Send Request on MA
Then user verifies the saved message on MA
And close the application
  Examples:
  |phoneNumber|
  |432-345-3245|

    Scenario:past date
      Then user enters first name "<firstname>" on MA
      And user enters lastname "<lastname>" on MA
      And user enters ssn "<ssn>" on MA
      And user enters email "<email>" on MA
      And user enters phone number "<phoneNumber>" on MA
      And user enters past date "<past date>" on MA
      Then user gets an error for past date on MA
      And close the application

    Scenario Outline:invalid date format
      Then user enters first name "<firstname>" on MA
      And user enters lastname "<lastname>" on MA
      And user enters ssn "<ssn>" on MA
      And user enters email "<email>" on MA
      And user enters phone number "<phoneNumber>" on MA
      And user enters invalid date "<invaliddate>" format on MA
      Then user verifies entered "<invaliddate>" does not appear
      And close the application
      Examples:
       |invaliddate|
       |14/34/2034|
      |00/00/0000|
