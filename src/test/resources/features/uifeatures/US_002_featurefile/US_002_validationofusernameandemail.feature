@US002
@US002_UI
   Feature:US002_valid_username_email
      Background: user_navigates_to_register_page
         Given user navigates to url
         When user clicks on icon on top right corner
         And user clicks on register button US002
         Then user verifies registration page
         When user enters a valid SSN number
         And user enters valid first name and last name
      @smoke
      @valid_username_email
         Scenario: TC01_username_email_validation
         And user enters a valid username
         And user enters a valid email
         And user enters new password and password confirmation
         And user clicks on register button for registration
         Then user verifies that registration saved message is displayed
         And user saves the records into a file
         And user clicks on home button
         And user verifies to land to homepage successfully
         And user closes the browser

      @blank_username
      Scenario: TC02_blank_username
         And user enters a valid email
         And user enters new password and password confirmation
         Then user clicks Register button for registration US002
         And user verifies Your username is required message US002
         When user enters valid username US002
         And user clicks Register button for registration US002
         Then user verifies Registration Saved message is displayed US002
         And user clicks on Home button US002
         And user verifies that landed to home page successfully US002
         And user closes the browser US002

      @special_character_username
      Scenario Outline: TC03_special_character_username
         And user enters "<username>" that contains special character US002
         And user enters valid email US002
         And user enters new password and new password confirmation US002
         And user clicks Register button for registration US002
         Then user verifies Registration Saved message is displayed US002
         And user clicks on Home button US002
         And user verifies that landed to home page successfully US002
         And user closes the browser US002

         Examples:
            |username|
            |*alican#|

      @space_username
      Scenario Outline: TC04_space_username
         When user enters "<username>" that contains space US002
         Then user verifies username is invalid US002
         And user closes the browser US002

         Examples:
            |username|
            |ali can |

      @invalid_email
      Scenario Outline: TC05_invalid_email
         And user enters valid username US002
         And user enters invalid email "<email>" that not contains @ or . US002
         Then user verifies This field is invalid message is displayed US002
         And user closes the browser US002

         Examples: invalid_email
            |email  |
            |cselcuk.gmail.com|
            |cselcuk@gmail    |
            |c selcuk@gmail.com|
            |cselcuk.gmail@com |

      @blank_email
      Scenario: TC06_blank_email
         And user enters valid username US002
         And user enters new password and new password confirmation US002
         And user clicks Register button for registration US002
         Then user should see Your email is required message US002
         When user enters valid email US002
         And user clicks Register button for registration US002
         Then user verifies Registration Saved message is displayed US002
         And user closes the browser US002