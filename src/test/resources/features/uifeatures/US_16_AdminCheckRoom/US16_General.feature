

Feature: US16_Room creation by Admin and admin can View, Update or Delete the room creation.

  @SmokeTest_US16
    @General_US16
  Scenario Outline: US16 Admin
    Given US16-1 go to medunna URL and admin click sign in for OPEN MEDUNNA PAGE
    Then US16-2 write to username and password "<userName>" and "<password>" for FOR OPEN THE ADMIN PAGE
    And US16-3 click to Items&Titles and click Rooms for FOR REACH ROOMS PAGE
    And US16-4 click on create a new Room and Admin provides a Room Number with sign or letter and with blank "<INVALIDRoomNo>" for negative01
    And US16-5 Verify This field should be a number WITH INVALID ROOM INFORMATION
    And US16-6 Admin click Room Number box again and provide VALID ROOM NUMBER info in it "<VALIDRoomNo>"
    Then US16-7 Admin verify the room types can be selected "<TWIN>","<DELUXE>","<PREMIUM_DELUXE>","<SUITE>","<DAYCARE>" CheckTest
    And US16-8 Admin select Room Types box CheckTest
    Then US16-9 Admin click status for negative01
    Then US16-10 Admin provides Price information with blank or letters "<InvalidPrice>"
    And US16-11 Admin Verify This field should be at least 0.
    And US16-12 Admin provide room number and price, and Admin write valid price information in it "<VALIDPriceInfo>"
    And US16-13 Admin click again the description box and sets unknown data in it "<InvalidDescription>"
    And US16-14 Admin should not receive any information about and click again description box and clean it
    And US16-15 Admin try to save only with earlier dates and verify the bad request toastify information on the top of the page

    Examples:
      |userName|password|INVALIDRoomNo|VALIDRoomNo|TWIN|DELUXE|PREMIUM_DELUXE|SUITE|DAYCARE|InvalidPrice|VALIDPriceInfo|InvalidDescription|
      |BernaAdmin|team85|3  9         |999333999  |TWIN|DELUXE|PREMIUM_DELUXE|SUITE|DAYCARE|one dollar  |100           |????????          |
