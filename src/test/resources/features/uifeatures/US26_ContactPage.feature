
Feature: Any_user_can_use_contact_portal
  Background:
    Given user goes to Medunna Url
    When user clicks Contact

  @US26_TC01
  Scenario: TC_001_verify_any_user_can_reach_contact_portal
    Then verify any user can reach contact portal
    Then close the application US_015

  @US26_TC02 @smoke @regression
  Scenario: TC_002_verify_any_user_can_send_a_request_with_valid_credentials
    When user enters valid name, email and subject
    Then user clicks Send button
    And verify any user can send a request with valid credentials
    Then close the application US_015

  @US26_TC03 @regression
  Scenario:TC_003_verify_user_can_not_send_a_request_without_filling_the_email_box
    When user enters valid name and valid subject but leaves the email box empty
    And user clicks Send button
    Then verify user can not send a request without filling the email box
    Then close the application US_015

  @US26_TC04 @regression
  Scenario:TC_004_verify_user_can_not_send_a_request_without_writing_a_valid_email
    When user enters valid name and valid subject
    Then user writes an invalid email in email box
    And user clicks Send button
    Then verify user can not send a request without writing a valid email
    Then close the application US_015

  @regression
  Scenario:TC_005_verify_user_can_not_send_a_request_without_filling_the_name_box
    When user enters valid email and valid subject
    Then user leaves the name box empty
    And user clicks Send button
    Then verify user can not send a request without filling the name box
    Then close the application US_015

  Scenario:TC_006_verify_user_can_not_send_a_request_without_filling_the_subject_box
    When user enters valid name and valid email
    Then user leaves the subject box empty
    And user clicks Send button
    Then verify user can not send a request without filling the subject box
    Then close the application US_015

  Scenario:TC_007_verify_user_can_send_a_request_without_filling_the_message_box
    When user enters valid name, email and subject
    Then user leaves the message box empty
    And user clicks Send button
    Then verify user can send a request without filling the message box
    Then close the application US_015





