@UserStory_002
  Feature: Username and Email
    Background: UserStory_002
      Given  I am on the homepage US002
      And  I click on menu icon US002
      And I select register button US002
    @ValidUsername
  Scenario Outline: Username Test
      When I provide username as "<username>" US002
      Then I move on to "email" textbox US002
      And I close the application US002
    Examples: username info
    |username|
    |cselcuk |

 @InvalidUsername
    Scenario Outline: invalid username test
      When I provide invalid username as "<invalid username>" US002
      And I click on email textbox US002
      Then I validate the error message US002
    Examples: invalid username info US002
    |invalid username|
    |c selcuk        |

 @ValidEmail
   Scenario Outline: valid email test
      When I provide email as "<email>" US002
      Then I validate that "<email>" contains "@gmail.com"
      And I close the application US002
   Examples:valid email info
   |email|my email|
   |cselcuk@gmail.com|@gmail.com|

 @InvalidEmail
 Scenario Outline: invalid email test
      When I provide  invalid email as "<invalid email>" US002
      Then I validate the error message US002
 Examples: invalid email info
   |invalid email|
   |             |