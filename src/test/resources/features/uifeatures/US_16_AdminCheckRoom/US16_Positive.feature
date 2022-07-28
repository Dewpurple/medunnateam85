
@US16
Feature: US16_Room creation by Admin and admin can View, Update or Delete the room creation.

  @smoke
  @RoomPage_positive_empty_descriptionTC01
  Scenario Outline: US16 Admin
    Given US16-1 go to medunna URL and admin click sign in and register and verify TC01
    Then US16-2 click on password box and write to username and password "<userName>" and "<password>" TC01
    And US16-3 click to Items&Titles and click Rooms TC01
    And US16-4 verify admin on the Rooms page click on create a new Room and Admin provides a Room Number "<roomNo>" TC01
    Then US16-5 Admin click status TC01
    Then US16-6 Admin provides a Price "<price>" TC01
    And US16-7 Admin skip description and sets date as "<dates>" TC01
    And US16-8 Admin clicks on the Save button and verify toasted information on top of the page TC01
    And US16-9 Admin click Created Date and room numbers on the page TC01
    Examples:
      |userName|password|roomNo|price|dates|
      |BernaAdmin|team85|309   |6  |08/20/2022|


@regression
  @RoomPage_positive_empty_description_DeleteTC02
  Scenario Outline: US16 Admin
    Given US16-1 go to medunna URL and admin click sign in and register and verify TC02
    Then US16-2 click on password box and write to username and password "<userName>" and "<password>" TC02
    And US16-3 click to Items&Titles and click Rooms TC02
    And US16-4 verify admin on the Rooms page and Admin provides a Room Number "<roomNo>" TC02
    Then US16-5 Admin click status TC02
    Then US16-6 Admin provides a Price "<price>" TC02
    And US16-7 Admin skip description and sets date as "<dates>" TC02
    And US16-8 Admin clicks on the Save button and verify toasted information on top of the page TC02
    And US16-9 Admin click Created Date and click delete button TC02
    Examples:
      |userName|password|roomNo|price|dates|
      |BernaAdmin|team85|309   |9  |08/20/2022|


  @regression
  @RoomType_verify_withDescriptionTC03
  Scenario Outline: US16 Admin
    Given US16-1 go to medunna URL and admin click sign in and register and verify TC03
    Then US16-2 click on password box and write to username and password "<userName>" and "<password>" TC03
    And US16-3 click to Items&Titles and click Rooms TC03
    And US16-4 Verify create or edit a room page and admin provides a room number in the room number box  "<RoomNumber>" TC03
    And US16-5 Admin verify the room types can be selected "<TWIN>","<DELUXE>","<PREMIUM_DELUXE>","<SUITE>","<DAYCARE>" TC03
    And US16-6 Admin select Room Types box TC03
    And US16-7 Admin click status TC03 and verify it
    And US16-8 Admin provide price information in the price box TC03 and verify it
    And US16-9 Admin provide description information in the Description box TC03 and verify it
    And US16-10 Admin select date and save reservation TC03


    Examples:
      |userName|password|password|TWIN|DELUXE|PREMIUM_DELUXE|SUITE|DAYCARE|
      |BernaAdmin|team85|111111111|TWIN|DELUXE|PREMIUM_DELUXE|SUITE|DAYCARE|

  @regression
  @RoomPage_positive_empty_description_Edit
  Scenario Outline: US16 Admin
    Given US16-1 go to medunna URL and admin click sign in and register and verify for Edit test
    Then US16-2 click on password box and write to username and password "<userName>" and "<password>" for Edit test
    And US16-3 click to Items&Titles and click Rooms for Edit test
    And US16-4 verify admin on the Rooms page and Admin provides a Room Number "<roomNo>" for Edit test
    Then US16-5 Admin click status for Edit test
    Then US16-6 Admin provides a Price "<price>" for Edit test
    And US16-7 Admin skip description and sets date as "<dates>" for Edit test
    And US16-8 Admin clicks on the Save button and verify toasted information on top of the page for Edit test
    And US16-9 Admin click Created Date and click edit button for Edit test
    And US16-10 Admin change the old room number for edit test "<UpdateRoomNumber>"
    And US16-11 Admin save the reservation with a new room number for edit test
    Examples:
      |userName|password|roomNo|price|dates|UpdateRoomNumber|
      |BernaAdmin|team85|909999900   |9  |09/20/2022|909900999|
