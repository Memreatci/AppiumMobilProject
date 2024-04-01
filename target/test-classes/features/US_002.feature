@us2
Feature: As a user I should be able to access the Qibla section and access the map.

  Scenario: The Qibla icon on the homepage should be clicked to access the map and Qibla section.

    * The User Starts Muslim_Ramadan App
    * The user clicks on the "login" button
    * Fills the user mail information as "userMail"
    * Fills the user password information as "userPass"
    * The User Clicks "loginLP" Button In Login Page
    * The user clicks on the back button
    * The user clicks on the "Continue" button
    * Allow automatic locate selection and click "Continue"
    * The user allows the notification to be sent and clicks "Continue" and warning button
    * The user clicks on the "Qibla" icon
    * On the page that opens the visibility of the map and qibla is verified