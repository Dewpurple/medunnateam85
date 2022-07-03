Feature: User info segment

  @UserInfo
  Scenario Outline: user info segment
Given user is on the home page
And user clicks the signIn button
And user types in username as "<username>"
And user types in password as "<password>"
Then user clicks Sign In Button

    Examples: user login data
    |username   |password |
    |team85hasta|team85hasta |

