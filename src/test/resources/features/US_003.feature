Feature: Ramadan App Account Register Test

  @us03
  Scenario: The user successfully creates a new record in the app.

    * The User Starts Muslim_Ramadan App
    * The user clicks on the "Continue with Email" button
    * The user fills the "userName", "userMail", "userPass" and click on Register button
    * Successful login is verified
    * User closes the app
