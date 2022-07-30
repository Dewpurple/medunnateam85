
@Api_CRUD
Feature: US16_Api

  @Api_US16_Crud01_get
  @Api
  Scenario: Validate rooms with API creating
  Given US016 admin set the url and generate token


  @Api_US16_Crud01_post
  @Api
  Scenario: Validate rooms with API creating
    Given US16 Admin sets the path params to create room and verify room information for inpatient



  @Api_US16_Crud01_put
  @Api
  Scenario: Validate rooms with API creating
    Given US16 Admin sets the path params to create room for put and verify room information for inpatient

