@US14DoctorSeeAndUpdateInpatientInfo
Feature:Inpatient_Info_and_Update
  Background:
    Given user navitages to Medunna url
    When user is on the home page
    And user clicks the signIn button


  @US14_Doctor_See_Inpatient_Info
  Scenario Outline:Doctor_see_inpatient_info
    And user provide valid username "<username>" and "<password>"
    Then user clicks on Sign In Button
    Then user clicks on MY Pages
    And user clicks on My Inpatients
    And user verifies all inpatient info
    And user close the application

    Examples:Doctor see inpatient info
      | username | password |
      |doctorcennet|1234|

  @US14_Doctor_Update_Status_Staying_Inpatient_Giving_Room
  Scenario Outline:Doctor_update_inpatient_status
    And user provide valid username "<username>" and "<password>"
    Then user clicks on Sign In Button
    Then user clicks on MY Pages
    And user clicks on My Inpatients
    And user navigates fifthInpatientEdit button and clicks
    And user can update status staying and clicks save button  InPatient
    And user close the application

    Examples:Doctor see inpatient info
      | username | password |
      |doctorcennet|1234|

  @US14_Doctor_Updated_Inpatient_Room
  Scenario Outline:Doctor_update_inpatient_Room
    And user provide valid username "<username>" and "<password>"
    Then user clicks on Sign In Button
    Then user clicks on MY Pages
    And user clicks on My Inpatients
    And user navigates fifthInpatientEdit button and clicks
    And user can update status Room and save button InPatient
    And user close the application

    Examples:Doctor see inpatient info
      | username | password |
      |doctorcennet|1234|

  @US14_Doctor_Can_Not_Updating_Status_To_Staying_Without_Giving_Room
  Scenario Outline:Doctor_can_NOt update_inpatient_status
    And user provide valid username "<username>" and "<password>"
    Then user clicks on Sign In Button
    Then user clicks on MY Pages
    And user clicks on My Inpatients
    And user navigates sixthInpatientEdit button and clicks
    And user  update status staying and clicks save button  InPatient
#      And user verifies unapdated message
    And user close the application

    Examples:Doctor update inpatient Status
      | username | password |
      |doctorcennet|1234|

  @US14_Doctor_Canceled_Inpatient
  Scenario Outline:Doctor_update_inpatient_info
    And user provide valid username "<username>" and "<password>"
    Then user clicks on Sign In Button
    Then user clicks on MY Pages
    And user clicks on My Inpatients
    And user navigates sixthInpatientEdit button and clicks
    And user can update status Canceled and save button InPatient
    And user close the application

    Examples:Doctor see inpatient info
      | username | password |
      |doctorcennet|1234|
  @US14_Doctor_Discharged_Inpatient
  Scenario Outline:Doctor_update_inpatient_info
    And user provide valid username "<username>" and "<password>"
    Then user clicks on Sign In Button
    Then user clicks on MY Pages
    And user clicks on My Inpatients
    And user navigates fifthInpatientEdit button and clicks
    And user can update status Discharge and save button InPatient
    And user close the application

    Examples:Doctor see inpatient info
      | username | password |
      |doctorcennet|1234|