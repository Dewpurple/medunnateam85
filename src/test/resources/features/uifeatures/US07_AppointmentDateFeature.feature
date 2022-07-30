@US7
  Feature: Date on Make Appointment
    Background:
Given US7_user goes to Make Appointment page
@smoke
    Scenario Outline:future date
Then user enters first name "<firstname>" on MA
And user enters lastname "<lastname>" on MA
And user enters ssn "<ssn>" on MA
And user enters email "<email>" on MA
And user enters phone number "<phoneNumber>" on MA
And user enters future date "<futuredate>" on MA
Then user clicks Send Request on MA
Then user verifies the saved message on MA
And US6_close the application
  Examples:
  |phoneNumber|
  |432-345-3245|
@regression
    Scenario Outline:past date
      Then user enters first name "<firstname>" on MA
      And user enters lastname "<lastname>" on MA
      And user enters ssn "<ssn>" on MA
      And user enters email "<email>" on MA
      And user enters phone number "<phoneNumber>" on MA
      And user enters past date "<past date>" on MA
      Then user gets an error for past date on MA
      And US6_close the application
      Examples:
        |phoneNumber|
        |432-345-3245|
@regression
    Scenario Outline:invalid date format
      Then user enters first name "<firstname>" on MA
      And user enters lastname "<lastname>" on MA
      And user enters ssn "<ssn>" on MA
      And user enters email "<email>" on MA
      And user enters phone number "<phoneNumber>" on MA
      And user enters invalid date "<invaliddate>" format on MA
      Then US7_user verifies entered "<invaliddate>" does not appear
      And US6_close the application
      Examples:
        |phoneNumber |invaliddate|
        |432-345-3245|14/34/2034|
        |432-345-3245|00/00/0000|
