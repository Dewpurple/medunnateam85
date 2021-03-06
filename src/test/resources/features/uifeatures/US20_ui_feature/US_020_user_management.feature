@US_020

Feature: user_registration
  @us20_seeing_user_info
  Scenario:  TC_01_seeing_a_new_user_info
    Given Admin20 navigates to medunna login page
    Then Admin20 clicks on menu button
    Then Admin20 clicks on sign in
    Then Admin20 signs in
    And Admin20 clicks on Administrations then clicks on User Management
    And Admin20 clicks on View button
    And Admin20 verifies user's information on the page
    Then Admin20 closes the application

  Scenario: TC_02_giving_role_to_a_new_user
    Given Admin20 navigates to medunna login page
    Then Admin20 signs in
    And Admin20 clicks on Administrations then clicks on User Management
    And Admin20 clicks on Edit button
    And Admin20 assigns role to the user
    And Admin20 clicks on Save button
    And Admin20 closes the application

  Scenario: TC_03_activating_a_user
    Given Admin20 navigates to medunna login page
    Then Admin20 signs in
    And Admin20 clicks on Administrations then clicks on User Management
    And Admin20 clicks on Edit button
    And Admin20 activates user's status
    Then Admin20 closes the application

  @delete_user
  Scenario: TC_04_deleting_a_user
    Given Admin20 navigates to medunna login page
    Then Admin20 signs in
    And Admin20 clicks on Administrations then clicks on User Management
    And Admin20 deletes the user
    Then Admin20 closes the application