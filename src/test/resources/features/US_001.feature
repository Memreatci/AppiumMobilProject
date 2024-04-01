
Feature: Muslim Ramadan App Account Login Test

  Background:
    * The User Starts Muslim_Ramadan App
    * The user clicks on the "login" button
  @positiveLogin
  Scenario: The user should be able to log in to their account in the app with valid email and password information.

    * Fills the user mail information as "userMail"
    * Fills the user password information as "userPass"
    * The User Clicks "loginLP" Button In Login Page
    * Successful login is verified
    * User closes the app

  @negativeLogin
  Scenario Outline: The user cannot log in to their account in the app with invalid email and password information.

    * Fills the user mail information as "<invalidMail>"
    * Fills the user password information as "<invalidPass>"
    * The User Clicks "login" Button In Login Page
    * It is verified that the account cannot be logged in
    * User closes the app
    Examples:
      | invalidMail  | invalidPass  |
      | invalidMail1 | invalidPass1 |
      | invalidMail2 | invalidPass2 |
      | invalidMail3 | invalidPass3 |
      | invalidMail4 | invalidPass4 |

