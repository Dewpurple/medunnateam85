

Feature:Api Test Item Functionalities
  @Api
    @PostAPITestItems
  Scenario Outline: Api post request to create test item
    Given Adminuser sets the path params to create test item
    And Adminuser sets expected data
    And Adminuser send Post request for test item and gets response
    And Adminuser saves the test item records
    Then Adminuser validates test item record with Api

    Examples: api test data
      |createdBy|createdDate|defaultValMax|defaultValMin|description|id|name|price|
      |BernaAdmin|27/07/22 17:22 AM|120    |50          |mg/dl      |299929|Urea|39|