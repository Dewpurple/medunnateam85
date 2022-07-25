@paymentinvoice
Feature: payment_invoice

  Background: user is on the home page US_015
    Given user is on the home page US_015
    When user clicks on the user icon US_015
    And user clicks on the sign in link US_015
    And user 23 enters valid username and password
    And user clicks on sign in button US_015
    Then user 23 clicks on My Pages and Search Patient

  @US_023_TC_001
  Scenario Outline: create new invoice US_023
    Given click on Patient SSN box and type patient's "<SSN>" "<lastdigit>" US_023
    When click on Show Appointments US_023
    Then click on PaymentInvoice Process US_023
    And verify Exam Fee "<examfee>", Test Item Fee "<itemfee>" and Total Cost "<totalcost>" is correct US_023
    And click on create invoice US_023
    And verify that Bill Name "<name>" total cost "<totalcost>" is correct
    And click on save US_023
    And verify A Bill is updated with identifier message appears on screen US_023
    Then close the application US_015
    Examples: fees and total cost
    |SSN       |lastdigit|examfee|itemfee|name         |totalcost|
    |555-34-834|0        |500    |55     |Lisette Booth|605      |

  @US_023_TC_002
  Scenario Outline: view patient 1 information US_023
    Given click on Patient SSN box and type patient's "<SSN>" "<lastdigit>" US_023
    When click on Show Appointments US_023
    Then click on PaymentInvoice Process US_023
    And click on show invoice US_023
    And verify invoice page is displayed
    And verify SSN "<ssn>", Name "<name>", Payment Method "<paymentmethod>" and total "<total>" is correct US_023
    Then close the application US_015
    Examples: customer info, fees
    |SSN       |lastdigit|ssn        |name       |paymentmethod|total|
    |555-34-834|0        |555-34-8340|Lily Abraha|CASH         |605  |


  @US_023_TC_003
  Scenario Outline: chane payment method to credit cart US_023
    Given click on Patient SSN box and type patient's "<SSN>" "<lastdigit>" US_023
    When click on Show Appointments US_023
    Then click on PaymentInvoice Process US_023
    And verify Exam Fee "<examfee>", Test Item Fee "<itemfee>" and Total Cost "<totalcost>" is correct US_023
    And click on create invoice US_023
    And verify that Bill Name "<name>" total cost "<totalcost>" is correct
    And change Payment Method to CREDIT_CARD US_023
    And click on save US_023
    And verify A Bill is updated with identifier message appears on screen US_023
    Then close the application US_015
    Examples: fees and total cost
      |SSN       |lastdigit|examfee|itemfee|name       |totalcost|
      |555-34-834|1        |500    |711     |liv cook|2121      |

  @US_023_TC_004
  Scenario Outline: view patient 2 information US_023
    Given click on Patient SSN box and type patient's "<SSN>" "<lastdigit>" US_023
    When click on Show Appointments US_023
    Then click on PaymentInvoice Process US_023
    And click on show invoice US_023
    And verify invoice page is displayed
    And verify SSN "<ssn>", Name "<name>", Payment Method "<paymentmethod>" and total "<total>" is correct US_023
    Then close the application US_015
    Examples: customer info, fees
      |SSN       |lastdigit|ssn        |name    |paymentmethod|total|
      |555-34-834|1        |555-34-8341|liv cook|CREDIT_CARD  |2121 |

  @US_023_TC_005
  Scenario Outline: chane payment method to check US_023
    Given click on Patient SSN box and type patient's "<SSN>" "<lastdigit>" US_023
    When click on Show Appointments US_023
    Then click on PaymentInvoice Process US_023
    And verify Exam Fee "<examfee>", Test Item Fee "<itemfee>" and Total Cost "<totalcost>" is correct US_023
    And click on create invoice US_023
    And verify that Bill Name "<name>" total cost "<totalcost>" is correct
    And change Payment Method to Cheque US_023
    And click on save US_023
    And verify A Bill is updated with identifier message appears on screen US_023
    Then close the application US_015
    Examples: fees and total cost
      |SSN       |lastdigit|examfee|itemfee|name       |totalcost|
      |555-34-833|2        |500    |711     |Alys Keys |1274     |

  @US_023_TC_006
  Scenario Outline: view patient 3 information US_023
    Given click on Patient SSN box and type patient's "<SSN>" "<lastdigit>" US_023
    When click on Show Appointments US_023
    Then click on PaymentInvoice Process US_023
    And click on show invoice US_023
    And verify invoice page is displayed
    And verify SSN "<ssn>", Name "<name>", Payment Method "<paymentmethod>" and total "<total>" is correct US_023
    Then close the application US_015
    Examples: customer info, fees
      |SSN       |lastdigit|ssn        |name     |paymentmethod|total|
      |555-34-833|2        |555-34-8332|Alys Keys|CHEQUE       |1274 |

  @US_023_TC_007
  Scenario Outline: view invoice of cancelled patient US_023
    Given click on Patient SSN box and type patient's "<SSN>" "<lastdigit>" US_023
    When click on Show Appointments US_023
    Then click on PaymentInvoice Process US_023
    And click on create invoice US_023
    And click on save US_023
    And verify A Bill is updated with identifier message appears on screen US_023
    Then close the application US_015
    Examples: fees and total cost
      |SSN       |lastdigit|
      |555-34-833|5        |

  @US_023_TC_008
  Scenario Outline: click back button after clicking create invoice US_023
    Given click on Patient SSN box and type patient's "<SSN>" "<lastdigit>" US_023
    When click on Show Appointments US_023
    Then click on PaymentInvoice Process US_023
    And click on create invoice US_023
    And  click on back button US_023
    Then user 23 clicks on My Pages and Search Patient
    Given click on Patient SSN box and type patient's "<SSN>" "<lastdigit>" US_023
    When click on Show Appointments US_023
    Then click on PaymentInvoice Process US_023
    And click on create invoice US_023
    Then close the application US_015
    Examples: fees and total cost
      |SSN       |lastdigit|
      |555-34-833|4|

  @US_023_TC_009
  Scenario Outline: unapproved patient
    Given click on Patient SSN box and type patient's "<SSN>" "<lastdigit>" US_023
    When click on Show Appointments US_023
    Then verify that status is unapproved US_023
    And verify that PaymentInvoice Process is not visible US_023
    Then close the application US_015
    Examples: SSN
    |SSN       |lastdigit|
    |555-34-833|6        |

  @US_023_TC_010
  Scenario Outline: pending patient US_023
    Given click on Patient SSN box and type patient's "<SSN>" "<lastdigit>" US_023
    When click on Show Appointments US_023
    Then verify that status is pending US_023
    And verify that PaymentInvoice Process is not visible US_023
    Then close the application US_015
    Examples: SSN
      |SSN       |lastdigit|
      |555-34-833|0        |
